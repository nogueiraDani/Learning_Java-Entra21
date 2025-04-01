package loops_while_for.aula_26_03_25;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {

		/**
		 * Escreva um algoritmo em que o usuário entre 5 valores de 0 a 1000 Começando
		 * com o laço (while ou for) em 0 Escreva os números que o usuário entrou
		 * 
		 */

		Scanner scanner = new Scanner(System.in);

		for (int i = 0; i < 5; i++) {

			System.out.println("Digite um valor entre 0 e 1000:");
			int num = scanner.nextInt();

			if (num >= 0 && num <= 1000) {
				System.out.printf("Valor digitado: %d\n", num);
			} else {
				System.out.println("Valor digitado inválido.");
			}

		}

	}

}
