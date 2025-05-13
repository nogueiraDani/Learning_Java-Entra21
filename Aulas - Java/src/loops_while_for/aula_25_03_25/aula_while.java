package loops_while_for.aula_25_03_25;

import java.util.Scanner;

public class aula_while {

	public static void main(String[] args) {

		/**
		 * Faça um algoritmo que escreve do 20 ao 10
		 */

		Scanner scanner = new Scanner(System.in);

		int valorInicial, valorFinal;

		System.out.println("Digite o valor inicial:");
		valorInicial = scanner.nextInt();

		System.out.printf("Digite o valor final diferente de %d:\n", valorInicial);
		valorFinal = scanner.nextInt();

		if (valorInicial > valorFinal) {
			while (valorInicial >= valorFinal) {
				System.out.println(valorInicial);
				valorInicial--;
			}
		} else {
			while (valorInicial <= valorFinal) {
				System.out.println(valorInicial);
				valorInicial++;
			}
		}
		scanner.close();
	}

}
