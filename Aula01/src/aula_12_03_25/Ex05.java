package aula_12_03_25;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {

		/**
		 * Leia dois valores decimais (double) e calcule a média ponderada sabendo que a
		 * nota A tem peso 3.5 e nota B 6.5.
		 */
		
		double notaA, notaB, media, pesoA, pesoB;
		
		pesoA = 3.5;
		pesoB = 6.5;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite a primeira nota:");
		notaA = scanner.nextDouble();
		
		System.out.println("Digite a segunda nota:");
		notaB = scanner.nextDouble();
		
		media = ((notaA * pesoA) + (notaB * pesoB)) / 10;
		
		System.out.println(String.format("A media é %.2f", media));
		
		scanner.close();
	}

}
