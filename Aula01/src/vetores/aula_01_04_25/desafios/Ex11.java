package vetores.aula_01_04_25.desafios;

import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {

		/*
		 * Um cinema pretende fazer uma pesquisa para avaliar o grau de satisfação de
		 * seus clientes. Trinta deles foram ouvidos e para cada um perguntou-se o sexo
		 * (1=feminino 2=masculino), uma nota para o cinema (zero até dez, valor
		 * inteiro) e a idade. Baseado nisto faça um programa que informe: - qual a nota
		 * média recebida pelo cinema; - qual a nota média atribuída pelos homens; -
		 * qual a nota atribuída pela mulher mais jovem; - quantas das mulheres com mais
		 * de 50 anos deram nota superior à média recebida pelo cinema.
		 */

		Scanner scanner = new Scanner(System.in);

		double somaNotaCinema = 0;
		double mediaNotaCinema = 0;
		double somaNotasHomens = 0;
		int quantidadeHomens = 0;
		double mediaNotasHomens = 0;
		double notaMulherJovem = 0;
		int idadeMulherJovem = Integer.MAX_VALUE;
		int quantidadeMulheresAcimaDe50 = 0;
		int quantidadeDeEntrevistados = 0;

		System.out.println("Quantas pessoas deseja entrevistar?");
		quantidadeDeEntrevistados = scanner.nextInt();

		int idadeMulheres[] = new int[quantidadeDeEntrevistados];
		double notasMulheres[] = new double[quantidadeDeEntrevistados];

		System.out.println("Notas do cinema:");
		System.out.println("----------------");

		// loop para fazer as entrevistas
		for (int i = 0; i < quantidadeDeEntrevistados; i++) {

			double nota;
			int idade;

			System.out.println("Olá, qual é o seu genero:");
			System.out.println("1- feminino");
			System.out.println("2- masculino");
			int genero = scanner.nextInt();
			
			//valida o genero
			while(genero != 1 && genero != 2) {
				System.out.println("Opção inválida, digite entre 1- feminino e 2- masculino");
				genero = scanner.nextInt();
			}
			
			// questiona a nota
			if (genero == 1 || genero == 2) {
				System.out.println("De 0 a 10, qual a nota quer dar para o cinema?");
				nota = scanner.nextDouble();
				
				// valida a nota
				if (nota >= 0 && nota <= 10) {
					System.out.println("Qual é a sua idade?");
					idade = scanner.nextInt();

					// regra para as notas e medias
					if (idade > 0) {
						somaNotaCinema += nota;
						if (genero == 2) {
							somaNotasHomens += nota;
							quantidadeHomens++;
						}

						// alimenta o vetor da idade das mulheres e notas das mulheres
						if (genero == 1) {
							idadeMulheres[i] = idade;
							notasMulheres[i] = nota;
						}

					}
				}

			}

		}
		
		// calculando as medias
		mediaNotaCinema = somaNotaCinema / quantidadeDeEntrevistados;
		mediaNotasHomens = somaNotasHomens / quantidadeHomens;
		
		// loop para achar mulher mais jovem e quantas mulheres acima de 50 deram nota acima da media
		for (int i = 0; i < notasMulheres.length; i++) {
			if (idadeMulheres[i] > 0 && idadeMulheres[i] < idadeMulherJovem) {
				idadeMulherJovem = idadeMulheres[i];
				notaMulherJovem = notasMulheres[i];
			}

			if (idadeMulheres[i] > 50 && notasMulheres[i] > mediaNotaCinema) {
				quantidadeMulheresAcimaDe50++;
			}

		}

		// mostrando os resultados.
		System.out.printf("A nota média do cinema é %.2f\n", mediaNotaCinema);
		System.out.printf("A média das notas masculinas é %.2f\n", mediaNotasHomens);
		System.out.printf("A nota da mulher mais jovem (que possui %d anos) é %.2f\n", idadeMulherJovem,
				notaMulherJovem);
		System.out.printf("%d mulheres acima de 50 anos deram nota maior que a média %.2f\n", quantidadeMulheresAcimaDe50,
				mediaNotaCinema);

		
		scanner.close();
	}

}
