package aula_31_03_25;

import java.util.Arrays;
import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {

		/**
		 * Descreva um algoritmo que leia 10 valores e os coloque em um vetor de 10
		 * posições Em seguida, modifique o vetor de modo que os valores das posições
		 * ímpares sejam aumentados em 5% e os das posições pares sejam aumentados em
		 * 2%. Imprima o vetor resultante
		 * 
		 */
		
		Scanner scanner = new Scanner(System.in);
		
		double valores[] = new double[10];
		
		for (int i = 0; i < valores.length; i++) {
			System.out.printf("Digite o %d° valor:\n", i + 1);
			valores[i] = scanner.nextDouble();
		}
		
		System.out.printf("Array original: %s\n", Arrays.toString(valores));
		
		//ajustando o valor das posições pares
		for (int i = 0; i < valores.length; i+=2) {
			valores[i] += valores[i] * 0.02;
		}
		
		//ajustando o valor das posições impares
		for (int i = 1; i < valores.length; i+=2) {
			valores[i] += valores[i] * 0.05;
		}
		
		System.out.printf("Array ajustado: %s\n", Arrays.toString(valores));
			
		scanner.close();

	}

}
