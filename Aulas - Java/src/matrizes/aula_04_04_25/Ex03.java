package matrizes.aula_04_04_25;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {

		/*
		 * Faça um código que some duas matrizes de inteiros de tamanhos iguais
		 */

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite o tamanho para as duas matrizes:");
		int tamanhoMatriz = scanner.nextInt();
		
		int matriz1[][] = new int[tamanhoMatriz][tamanhoMatriz];
		int matriz2[][] = new int[tamanhoMatriz][tamanhoMatriz];
		int matrizResultado[][] = new int[matriz1.length][matriz1[0].length];

		System.out.println("---------------------------------");
		System.out.println("Vamos preencher a primeira matriz:");
		for (int i = 0; i < matriz1.length; i++) {
			for (int j = 0; j < matriz1[i].length; j++) {
				System.out.printf("Digite um valor para a posição [%d][%d]\n", i, j);
				int valor = scanner.nextInt();
				matriz1[i][j] = valor;
			}
		}

		System.out.println("---------------------------------");
		System.out.println("Agora vamos preencher a segunda matriz:");
		for (int i = 0; i < matriz2.length; i++) {
			for (int j = 0; j < matriz2[i].length; j++) {
				System.out.printf("Digite um valor para a posição [%d][%d]\n", i, j);
				int valor = scanner.nextInt();
				matriz2[i][j] = valor;
			}
		}
		
		System.out.println("---------------------------------");
		for (int i = 0; i < matrizResultado.length; i++) {
			for (int j = 0; j < matrizResultado[i].length; j++) {
				matrizResultado[i][j] = matriz1[i][j] + matriz2[i][j];
				System.out.print(matrizResultado[i][j] + " ");
			}
			System.out.println();
		}
		
		scanner.close();

	}

}
