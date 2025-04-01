package loops_while_for.aula_26_03_25;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {

		/**
		 * Descreva um algoritmo que calcule e escreva a soma dos números pares e a soma
		 * dos números ímpares entre 1 e 100.
		 */

		Scanner scanner = new Scanner(System.in);
		int valorInicial, valorFinal;
		int somaPares = 0;
		int somaImpares = 0;

		System.out.println("Digite o valor para iniciar a conta:");
		valorInicial = scanner.nextInt();

		System.out.println("Digite o valor para finalizar a conta:");
		valorFinal = scanner.nextInt();

		for (int i = valorInicial; i <= valorFinal; i++) {
			
			if (i % 2 == 0) {
				somaPares += i;
			} else {
				somaImpares += i;
			}
			
		}

		System.out.printf("A soma dos numeros pares entre %d e %d é %d.\n", 
				valorInicial, valorFinal, somaPares);
		System.out.printf("A soma dos numeros ímpares entre %d e %d é %d.\n", 
				valorInicial, valorFinal, somaImpares);
	}

}
