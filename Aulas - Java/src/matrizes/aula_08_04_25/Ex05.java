package matrizes.aula_08_04_25;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {

		// Um cinema pretende fazer uma pesquisa para avaliar o grau de satisfação de
		// seus clientes.
		// Trinta deles foram ouvidos e para cada um perguntou-se o sexo (1=feminino
		// 2=masculino), uma
		// nota para o cinema (zero até dez, valor inteiro) e a idade.
		// Baseado nisto faça um programa que informe:
		// - qual a nota média recebida pelo cinema;
		// - qual a nota média atribuída pelos homens;
		// - qual a nota atribuída pela mulher mais jovem;
		// - quantas das mulheres com mais de 50 anos deram nota superior à média
		// recebida pelo
		// cinema.
		// Não utilize vetores!

		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite quantas avaliacoes deseja fazer:");
		int quantidadeEntrevistas = scanner.nextInt();

		String perguntas[] = { """
				Digite o seu gênero:
				1- feminino
				2- masculino""", "Digite a sua nota de 0 a 10:", "Digite a sua idade: " };

		int avaliacoes[][] = new int[quantidadeEntrevistas][3];

		int somaNotaHomens = 0;
		int quantidadeDeHomens = 0;
		double notaMediaHomens = 0;
		int somaNotaGeraisCinema = 0;
		double notaMediaGeralCinema = 0;
		int idadeMulherJovem = Integer.MAX_VALUE;
		int notaMulherJovem = 0;
		int quantidadeMulheresAcima50NotaMaiorQueMedia = 0;

		boolean respostaEstaCorreta = false;

		// fazendo as entrevistas de acordo com as quantidades informadas e populando a
		// matriz
		for (int i = 0; i < avaliacoes.length; i++) {
			System.out.printf("%d° entrevista:\n", i + 1);
			for (int j = 0; j < avaliacoes[i].length; j++) {

				while (!respostaEstaCorreta) {
					System.out.println("-------------------------------");
					System.out.println(perguntas[j]);
					int resposta = scanner.nextInt();

					// validando as respostas
					if ((j == 0 && (resposta == 1 || resposta == 2)) || (j == 1 && (resposta >= 0 && resposta <= 10))
							|| (j == 2 && (resposta > 0))) {
						avaliacoes[i][j] = resposta;

						if (j == 1) {
							somaNotaGeraisCinema += avaliacoes[i][j];
						}

						break;
					} else {
						System.out.println("Resposta incorreta, tente novamente.");
						respostaEstaCorreta = false;
					}

				}

			}

		}

		notaMediaGeralCinema = somaNotaGeraisCinema / quantidadeEntrevistas;

		for (int i = 0; i < avaliacoes.length; i++) {

			int genero = avaliacoes[i][0];
			int nota = avaliacoes[i][1];
			int idade = avaliacoes[i][2];

			somaNotaGeraisCinema += avaliacoes[i][1];

			// verifica se é homem
			if (genero == 2) {
				somaNotaHomens += nota;
				quantidadeDeHomens++;
			}

			// verifica se é mulher
			if (genero == 1) {
				// verfiica se é mais jovem
				if (idade < idadeMulherJovem) {
					idadeMulherJovem = idade;
					notaMulherJovem = nota;
				}

				// verifica idade acima de 50 e nota maior q média
				if (idade > 50) {
					if (nota > notaMediaGeralCinema) {
						quantidadeMulheresAcima50NotaMaiorQueMedia++;
					}
				}
			}

		}

		notaMediaHomens = somaNotaHomens / quantidadeDeHomens;

		System.out.println("-------------------------------");
		System.out.printf("A nota média do cinema é %.2f.\n", notaMediaGeralCinema);
		System.out.printf("A nota média dada pelos %d homens é %.2f.\n", quantidadeDeHomens, notaMediaHomens);
		System.out.printf("A nota da mulher mais jovem (%d anos) é %d\n", idadeMulherJovem, notaMulherJovem);
		System.out.printf("%d mulher(es) responderam com nota maior que a média %.2f", quantidadeMulheresAcima50NotaMaiorQueMedia,
				notaMediaGeralCinema);

		scanner.close();

	}

}
