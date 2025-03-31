package aula_25_03_25;

import java.util.Scanner;

public class aula_for {

	public static void main(String[] args) {

		/**
		 * faça um algoritmo que mostre de 20 a 10
		 */

		Scanner scanner = new Scanner(System.in);

		int valorInicial, valorFinal;

		System.out.println("Digite o valor inicial:");
		valorInicial = scanner.nextInt();

		System.out.printf("Digite o valor final diferente de %d:\n", valorInicial);
		valorFinal = scanner.nextInt();

		if (valorInicial > valorFinal) {
			for (int i = valorInicial; i >= valorFinal; i--) {
				System.out.println(i);
			}
		} else {
			for (int i = valorInicial; i <= valorFinal; i++) {
				System.out.println(i);
			}
		}
	}
}