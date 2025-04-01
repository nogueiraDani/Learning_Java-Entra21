package vetores.aula_01_04_25;

import java.util.Arrays;

public class Ex09 {

	public static void main(String[] args) {

		/**
		 * Faça um programa para ler os valores de dois vetores de inteiros, cada um
		 * contendo 10 elementos. Crie um terceiro vetor em que cada elemento é a soma
		 * dos valores contidos nas posições respectivas dos vetores originais. Por
		 * exemplo, vetor1 = [1,2,3] vetor2 = [1,5,6] vetor3 = [2,7,9]. Exiba, ao final,
		 * os três vetores na tela.
		 */
		
		double vetor1[] = { 1.2, 25.9, 3.56, 102.96, 5, 8, 99, 105, 65, 1236.56 };
		double vetor2[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		double vetor3[] = new double[10];
		
		for (int i = 0; i < vetor3.length; i++) {
			vetor3[i] = vetor1[i] + vetor2[i];
		}
		
		System.out.printf("Vetor 1 = %s\n", Arrays.toString(vetor1));
		System.out.printf("Vetor 2 = %s\n", Arrays.toString(vetor2));
		System.out.printf("Vetor 3 = %s\n", Arrays.toString(vetor3));

	}

}
