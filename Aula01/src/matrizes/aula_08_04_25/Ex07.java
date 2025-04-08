package matrizes.aula_08_04_25;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {

		/*
		 * Crie uma matriz 3x5 de inteiros, preencha a matriz e depois: a) Informe se a
		 * matriz possui elementos repetidos, informe também o elemento e os índices
		 * repetidos; b) A quantidade de números pares; c) A quantidade de números
		 * ímpares maiores do que a média dos elementos da matriz.
		 */

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite a quantidade de linhas que deseja na sua matriz:");
		int quantidadeLinhas = scanner.nextInt();
		
		System.out.println("Digite a quantidade de colunas que deseja na sua matriz:");
		int quantidadeColunas = scanner.nextInt();
		
		
		int matriz[][] = new int[quantidadeLinhas][quantidadeColunas];
		int quantidadeDeElementos = quantidadeLinhas * quantidadeColunas;
		int quantidadeNumerosPares = 0;
		int quantidadeNumerosImparesMaioresQueMedia = 0;
		double mediaDosElementos = 0;
		int somaDosElementos = 0;
		

		System.out.println("-------------------------");
		System.out.println("----Preencha a matriz----");

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.printf("Digite o valor para a posicao [%d][%d]\n", i, j);
				int valor = scanner.nextInt();
				matriz[i][j] = valor;
				
				somaDosElementos += valor;

				if (valor % 2 == 0) {
					quantidadeNumerosPares++;
				}
			}
		}
		
		mediaDosElementos = somaDosElementos / (quantidadeDeElementos);
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				int valor = matriz[i][j];
				if (valor > mediaDosElementos && valor % 2 != 0) {
					quantidadeNumerosImparesMaioresQueMedia++;
				}
			}
		}
		
		// parei na letra A
			
		
		
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.print(matriz[i][j] + " ");
			}
			System.out.println();
		}
		
				
		
		
		System.out.printf("Existem %d números pares na matriz.\n", quantidadeNumerosPares);
		System.out.printf("Existem %d números impares maiores que a média dos elementos(%.2f).\n", quantidadeNumerosImparesMaioresQueMedia, mediaDosElementos);

		scanner.close();

	}

}
