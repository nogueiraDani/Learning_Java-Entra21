package vetores.aula_31_03_25;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {

		/**
		 * Faça um algoritmo em que o usuário insere um número em um índice específico
		 * que ele mesmo informou
		 * 
		 */

		Scanner scanner = new Scanner(System.in);

		int numeros[] = new int[5];
		int numero;
		int posicao;
		
		//variaveis para validar se foi digitado 0 para alguma posição
		boolean espacosVazios[] = { true, true, true, true, true};
		boolean temEspacoVazio = true;
		int numerosVazios = 0;
		

		System.out.println("Tenho um vetor de 5 posições, me ajude a preenche-lo:");

		while (temEspacoVazio) {
			System.out.println("Digite um valor:");
			numero = scanner.nextInt();

			System.out.println("Digite a posição no vetor:");
			posicao = scanner.nextInt();
			numerosVazios = 0;
			
			if (posicao >= 0 && posicao <= numeros.length - 1) {
				numeros[posicao] = numero;
				espacosVazios[posicao] = false;
				
				// contador para validar espaços com 0 que não foram digitados pelo usuário, 
				// nasceram como default no vetor
				for (int i = 0; i < espacosVazios.length; i++) {
					if (espacosVazios[i] == true) {
						numerosVazios++;
					}
				}
				
				if (numerosVazios == 0) {
					temEspacoVazio = false;
				}
			} else {
				System.out.println("Posição inválida, digite um número entre 0 e 4.");
				continue;
			}

		}
		
		for (int i = 0; i < numeros.length; i++) {
			System.out.printf("%d, ", numeros[i]);
		}
		
		scanner.close();

	}

}
