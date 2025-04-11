package avaliacao_11_04_25;

import java.util.Arrays;
import java.util.Scanner;

public class Questao_03 {

	public static void main(String[] args) {

		/*
		 * Crie um programa Java para encontrar a primeira sequência de números seguidos
		 * em um vetor. Por exemplo, o vetor {6, 0, 1, 2, 1, 2, 3, 4, 5, 1, 6} tem a
		 * primeira sequência sendo {0, 1, 2}. Exiba essa sequência. Peça para o usuário
		 * inserir os valores em um vetor de 8 posições.
		 * 
		 */
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Descobrindo a sequencia dentro dos vetores.");
		
		int vetor[] = new int[8];
		int sequencia[] = new int[3];
		boolean haSequencia = false;
		
		for (int i = 0; i < vetor.length; i++) {
			System.out.printf("Digite o %dº valor ->", i +1);
			vetor[i] = scanner.nextInt();
		}
		
		while(!haSequencia) {
			for (int j = 0; j < vetor.length; j++) {
				for (int i = 0; i < sequencia.length; i++) {
					sequencia[i] = vetor[i];	
				}
			}

			int primeiroValor = sequencia[0];
			int segundoValor = sequencia[1];
			int terceiroValor = sequencia[2];

			if (terceiroValor == segundoValor + 1 && segundoValor == primeiroValor + 1) {
				System.out.println(Arrays.toString(sequencia));
				haSequencia = true;
			} else {
				//TODO tá ficando no loop aqui, socorro!!!
				
				System.out.println("aqui");
				continue;
				
			}
			
		}
		
		
		
		
		
		
		scanner.close();
		

	}

}
