package vetores.aula_31_03_25;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {

		/**
		 * Crie uma array de 5 elementos e descubra: a) Qual o maior elemento b) Qual o
		 * menor elemento c) A média dos elementos
		 */
		
		Scanner scanner = new Scanner(System.in);
		int quantidadeElementos;
		
		System.out.println("Digite a quantidade de numeros para verificar:");
		quantidadeElementos = scanner.nextInt();
		
		double numeros[] = new double[quantidadeElementos];
		double numMax = Double.MIN_VALUE;
		double numMin = Double.MAX_VALUE;
		double soma = 0;
		double media;
		
		for (int i = 0; i < numeros.length; i++) {
			System.out.printf("Digite o %d° numero:\n", i + 1);
			double num = scanner.nextDouble();
			numeros[i] = num;
			soma += num;
		}
		
		
		for (int i = 0; i < numeros.length; i++) {
			if(numeros[i] > numMax) {
				numMax = numeros[i];
			}
			
			if(numeros[i] < numMin) {
				numMin = numeros[i];
			}
		}
		
		media = soma / quantidadeElementos;
		
		System.out.printf("O maior número digitado é %.2f.\n", numMax);
		System.out.printf("O menor número digitado é %.2f.\n", numMin);
		System.out.printf("A média entre os número digitados é %.2f", media);
		
		scanner.close();

	}

}
