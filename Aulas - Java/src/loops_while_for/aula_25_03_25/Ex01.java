package loops_while_for.aula_25_03_25;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {

		/**
		 * Descreva um algoritmo que leia 5 números inteiros e escreva, para cada número
		 * lido, se ele é par ou ímpar.
		 */

		Scanner scanner = new Scanner(System.in);
		int valor;

		for (int i = 1; i <= 5; i++) {
			System.out.println("Digite um valor:");
			valor = scanner.nextInt();

			if (valor % 2 == 0) {
				System.out.printf("o número %d é par\n", valor);
			} else {
				System.out.printf("o número %d é ímpar\n", valor);
			}
		}
		System.out.println("Fim!");

		scanner.close();
	}

}
