package aula_31_03_25;

import java.util.Scanner;

public class Vetores_Arrays {
	
	/**
	 * Vetores e arrays
	 * Crie um vetor de n elementos que contêm a idade dos seus familiares
	 */
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int quantidadePessoas;
		
		System.out.println("Digite a quantidade de pessoas da sua família.");
		quantidadePessoas = scanner.nextInt();
		
		int idades[] = new int[quantidadePessoas];
		
		for (int i = 0; i < idades.length; i++) {
			System.out.printf("Digite a idade da %d° pessoa:\n", i + 1);
			idades[i] = scanner.nextInt();
		}
		
		System.out.println("------------------------------------------------");
		System.out.printf("As idades das %d pessoas são:\n", quantidadePessoas);
		
		for (int i = 0; i < idades.length; i++) {
			System.out.printf("%d anos.\n", idades[i]);
		}
		System.out.println("------------------------------------------------");
		
		scanner.close();
		
	}
	

}
