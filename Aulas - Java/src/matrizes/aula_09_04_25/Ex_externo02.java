package matrizes.aula_09_04_25;

import java.util.Scanner;

public class Ex_externo02 {

	public static void main(String[] args) {

		/*
		 * Dia da Semana
		 * 
		 * Receba um número de 1 a 7
		 * 
		 * Retorne o dia da semana correspondente
		 * 
		 * Valide se o número está no intervalo correto
		 */

		Scanner scanner = new Scanner(System.in);
		String diasDaSemana[] = { "Domingo", "Segunda-feira", "Terça-feira", "Quarta-feira", "Quinta-feira",
				"Sexta-feira", "Sábado" };

		System.out.println("""
				--- Conversor de dias da semana ---
				-----------------------------------""");

		int opcao = 1;

		while (opcao == 1) {
			System.out.println("""
					----------Digite uma opçao---------
					--1.Converter----------------------
					--2.Sair---------------------------""");
			opcao = scanner.nextInt();

			if (opcao == 1) {
				boolean numeroEhValido = false;

				while (!numeroEhValido) {
					System.out.println("--------- Digite um número --------");
					int numero = scanner.nextInt();
					if (numero >= 1 && numero <= 7) {
						numeroEhValido = true;
						System.out.printf("%d = %s.\n", numero, diasDaSemana[numero - 1]);
					} else {
						System.out.println("Número invalido, digite entre o intervalo de 1 a 7.");
					}
				}

			} else if (opcao == 2) {
				System.out.println("Fim.");
			} else {
				System.out.println("Opção inválida.");
				opcao = 1;

			}
		}

		scanner.close();

	}
}
