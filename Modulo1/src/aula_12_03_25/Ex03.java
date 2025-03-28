package aula_12_03_25;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {

		/**
		 * Leia quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a
		 * diferença do produto de A e B pelo produto de C e D
		 * 
		 */

		int num1, num2, num3, num4, produto1, produto2, diferenca;

		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite o primeiro numero:");
		num1 = scanner.nextInt();

		System.out.println("Digite o segundo numero:");
		num2 = scanner.nextInt();

		System.out.println("Digite o terceiro numero:");
		num3 = scanner.nextInt();

		System.out.println("Digite o quarto numero:");
		num4 = scanner.nextInt();

		produto1 = num1 * num2;
		produto2 = num3 * num4;

		diferenca = produto1 - produto2;

		System.out.println(
				String.format("A diferenca entre (%d * %d) e (%d * %d) é %d", num1, num2, num3, num4, diferenca));

	}
}
