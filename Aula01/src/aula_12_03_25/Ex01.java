package aula_12_03_25;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		/**
		 * Leia 2 valores inteiros e imprima sua soma e produto
		 */
		
		Scanner scanner = new Scanner(System.in);
		
		int num1, num2, soma, produto;
		
		System.out.println("Digite o primeiro numero:");
		num1 = scanner.nextInt();

		System.out.println("Digite o segundo numero:");
		num2 = scanner.nextInt();
		
		soma = num1 + num2;
		produto = num1 * num2;
		
		System.out.println(String.format("A soma entre %d e %d é: %d", num1, num2, soma));
		System.out.println(String.format("O produto entre %d e %d é: %d", num1, num2, produto));
		
		scanner.close();
	
	}

}
