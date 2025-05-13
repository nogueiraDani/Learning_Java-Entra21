package matrizes.aula_04_04_25;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {

		/**
		 * Crie uma matriz com 12 linhas e 2 colunas A primeira coluna corresponde aos
		 * meses do ano. A segunda corresponde ao lucro que a loja teve no mês. Imprima
		 * o seu resultado no formato: No mês 1 a loja teve 2000 de lucro No mês 2 a
		 * loja teve 1500 de lucro...
		 */

		Scanner scanner = new Scanner(System.in);

		double lucro[][] = new double[12][2];

		for (int i = 0; i < lucro.length; i++) {
			System.out.printf("Digite o faturamento para o %d mês:\n", i + 1);
			double faturamento = scanner.nextDouble();
			lucro[i][1] = faturamento;
		}
		
		System.out.println("--Mês--|--Faturamento--");
		for (int i = 0; i < lucro.length; i++) {
			System.out.printf("Mês: %d | Faturamento: R$%.2f\n", i + 1, lucro[i][1]);	
		}
		
		scanner.close();

	}

}
