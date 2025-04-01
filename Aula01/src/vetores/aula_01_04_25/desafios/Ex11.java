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
		int notasAcimaDaMedia = 0;
		int quantidadeMulheresAcimaDe50 = 0;
		int idadeMulheres[] = new int[30];
		double notasMulheres[] = new double[30];

		System.out.println("Notas do cinema:");
		System.out.println("----------------");

		for (int i = 0; i < 30; i++) {
			double nota;
			int idade;

			System.out.println("Olá, qual é o seu genero:");
			System.out.println("1- feminino");
			System.out.println("2- masculino");
			int genero = scanner.nextInt();

			if (genero != 1 && genero != 2) {
				System.out.println("Opção inválida, digite entre 1- feminino e 2- masculino");
				i--;
			} else {
				System.out.println("De 0 a 10, qual a nota quer dar para o cinema?");
				nota = scanner.nextDouble();

				if (nota >= 0 && nota <= 10) {
					System.out.println("Qual é a sua idade?");
					idade = scanner.nextInt();

					if (idade > 0) {
						somaNotaCinema += nota;
						if (genero == 2) {
							somaNotasHomens += nota;
							quantidadeHomens++;
						}

						if (genero == 1) {
							idadeMulheres[i] = idade;
							notasMulheres[i] = nota;
						}

					}

				}

			}

		}

		mediaNotaCinema = somaNotaCinema / 30;
		mediaNotasHomens = somaNotasHomens / quantidadeHomens;

		// TODO parei aqui

	}

}
