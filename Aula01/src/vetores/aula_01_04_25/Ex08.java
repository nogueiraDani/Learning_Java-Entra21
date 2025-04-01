package vetores.aula_01_04_25;

import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {

		/**
		 * Descreva um algoritmo que leia 5 valores e os coloque em um vetor de 5
		 * posições Imprima quais valores desses informados são maiores que a média dos
		 * valores.
		 * 
		 */
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite quantos números queres digitar:");
		int tamanhoArray = scanner.nextInt();
		
		double valores[] = new double[tamanhoArray];
		double soma = 0;
		
		for (int i = 0; i < tamanhoArray; i++) {
			System.out.println("Digite o valor:");
			valores[i] = scanner.nextDouble();
			soma += valores[i];
		}
		
		double media = soma / tamanhoArray;
		
		System.out.printf("A média é %.2f\n", media);
		
		for (double d : valores) {
			if (d > media) {
				System.out.printf("%.2f é maior que a média %.2f\n", d, media);
			}
		}
		
		scanner.close();

	}

}
