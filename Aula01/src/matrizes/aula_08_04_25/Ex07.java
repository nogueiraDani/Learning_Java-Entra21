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
				
				// resolução B
				if (valor % 2 == 0) {
					quantidadeNumerosPares++;
				}
			}
		}
		
		mediaDosElementos = somaDosElementos / (quantidadeDeElementos);
		
		System.out.println("-------------------------");
		System.out.println("--------Resultado--------");
		
        boolean encontrou = false;
        
        for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				int valor = matriz[i][j];
				
				// resolução C
				if (valor > mediaDosElementos && valor % 2 != 0) {
					quantidadeNumerosImparesMaioresQueMedia++;
				}
				
				// resolução da A
				for (int k = 0; k < matriz.length; k++) {
					for (int l = 0; l < matriz[k].length; l++) {
						
						if ((i != k || j != l) && matriz[k][l] == valor) {
							System.out.printf("O elemento %d da posição [%d][%d], se repete na posição [%d][%d].\n", valor, i, j, k, l);
							encontrou = true;
						}
					}
				}
			}
		}

        if (!encontrou) {
            System.out.println("Não há elementos repetidos na matriz.");
        }
		
						
		System.out.printf("Existem %d números pares na matriz.\n", quantidadeNumerosPares);
		System.out.printf("Existem %d números impares maiores que a média dos elementos(%.2f).\n", quantidadeNumerosImparesMaioresQueMedia, mediaDosElementos);

		scanner.close();

	}

}
