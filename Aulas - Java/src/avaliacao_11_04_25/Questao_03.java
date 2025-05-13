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

		for (int i = 0; i < vetor.length; i++) {
			System.out.printf("Digite o %dº valor ->", i + 1);
			vetor[i] = scanner.nextInt();
		}

		System.out.println("Vetor digitado: " + Arrays.toString(vetor));

		int inicioSequencia = -1;
        int tamanhoSequencia = 1;
        boolean sequenciaEncontrada = false;
        
        // Procura pela primeira sequência de tamanho >= 2
        for (int i = 1; i < vetor.length; i++) {
            if (vetor[i] == vetor[i - 1] + 1) {
                if (tamanhoSequencia == 1) {
                    inicioSequencia = i - 1;
                }
                tamanhoSequencia++;
                
                // Se encontrou uma sequência de tamanho >= 2, para a busca
                if (tamanhoSequencia >= 2) {
                    sequenciaEncontrada = true;
                    break;
                }
            } else {
                tamanhoSequencia = 1;
            }
        }
        
        // Exibe o resultado
        if (sequenciaEncontrada) {
            int[] sequencia = new int[tamanhoSequencia];
            System.arraycopy(vetor, inicioSequencia, sequencia, 0, tamanhoSequencia);
            System.out.println("Primeira sequência encontrada: " + Arrays.toString(sequencia));
        } else {
            System.out.println("Nenhuma sequência com 2 ou mais números consecutivos encontrada.");
        }

		scanner.close();

	}

}
