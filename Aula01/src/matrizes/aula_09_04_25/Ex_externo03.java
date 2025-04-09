package matrizes.aula_09_04_25;

import java.util.Scanner;

public class Ex_externo03 {

	public static void main(String[] args) {

		/*
		 * Matriz e Vizinhança Crie uma matriz M x N com números inteiros digitados pelo
		 * usuário. Depois: Solicite uma posição (linha, coluna) Mostre os vizinhos
		 * diretos (esquerda, direita, cima, baixo)
		 */

		Scanner scanner = new Scanner(System.in);
		int opcao = 1;
		int numeroLinhas = 0;
		int numeroColunas = 0;
		int numeroLinhaDesejada = 0;
		int numeroColunaDesejada = 0;
		boolean linhaDesejadaEhValida = false;
		boolean colunaDesejadaEhValida = false;

		System.out.println("""
				----------- Vizinhança ------------
				-----------------------------------""");
		System.out.println("Digite a quantidade de linhas que deseja na matriz:");
		numeroLinhas = scanner.nextInt();
		
		System.out.println("Digite a quantidade de colunas que deseja na matriz:");
		numeroColunas = scanner.nextInt();
		
		int matriz[][] = new int[numeroLinhas][numeroColunas];
		
		while (opcao == 1 || opcao == 2) {
			System.out.println("""
					----------Digite uma opçao---------
					--1.Preencher matriz --------------
					--2.Descobrir vizinhos ------------
					--3.Sair---------------------------""");
			opcao = scanner.nextInt();

			if (opcao == 1) {


				for (int i = 0; i < matriz.length; i++) {
					for (int j = 0; j < matriz[i].length; j++) {
						System.out.printf("Digite um valor para incluir.\n");
						matriz[i][j] = scanner.nextInt();
					}
				}

			} else if (opcao == 2) {

				while (!linhaDesejadaEhValida || !colunaDesejadaEhValida) {
					System.out.println("Digite a posição que deseja descobrir os vizinhos:");
					for (int i = 0; i < matriz.length; i++) {
						for (int j = 0; j < matriz[i].length; j++) {
							System.out.printf("[%d][%d] ", i, j);
						}
						System.out.println();
					}
					System.out.println("Primeiro digite a linha:");
					numeroLinhaDesejada = scanner.nextInt();

					if (numeroColunaDesejada > numeroColunas - 1) {
						System.out.println("Numero da coluna incorreta. Tente novamente.");
						colunaDesejadaEhValida = false;
					} else {
						colunaDesejadaEhValida = true;
					}

					System.out.println("Agora digite a coluna:");
					numeroColunaDesejada = scanner.nextInt();

					if (numeroLinhaDesejada > numeroLinhas - 1) {
						System.out.println("Numero da coluna incorreta. Tente novamente.");
						linhaDesejadaEhValida = false;
					} else {
						linhaDesejadaEhValida = true;
					}
					
					// fazer a logica para descobrir os vizinhos
				}
				
			} else if( opcao == 3 ) {
				System.out.println("Fim.");
				
			} else {			
				System.out.println("Opção inválida. Tente novamente.");
			}
		}

	}

}
