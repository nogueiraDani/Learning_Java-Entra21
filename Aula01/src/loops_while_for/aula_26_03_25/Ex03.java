package loops_while_for.aula_26_03_25;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {

		/**
		 * Escreva um algoritmo que escreva o número 0, 3, 6, 9, 12 ... até o número 30
		 */
		
		Scanner scanner = new Scanner(System.in);
		int valorInicial, valorFinal;
		int resultado = 0;
		
		System.out.println("Digite o valor para iniciar a conta:");
		valorInicial = scanner.nextInt();

		System.out.println("Digite o valor para finalizar a conta:");
		valorFinal = scanner.nextInt();
		
		for (int i = valorInicial; i <= valorFinal; i++) {
			
			if(i % 3 == 0) {
				resultado += i;
			}
		}
		
		System.out.printf("A soma dos números multiplos de 3 de %d a %d é %d.\n", 
				valorInicial, valorFinal, resultado);

	}

}
