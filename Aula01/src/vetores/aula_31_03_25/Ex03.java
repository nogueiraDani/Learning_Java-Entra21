package vetores.aula_31_03_25;

import java.util.Random;
import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {

		/**
		 * Faça um algoritmo que descubra se uma array de 5 elementos possui o número
		 * que o usuário entrou. Imprima também o seu índice
		 * 
		 */
		
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		
		int numeros[] = {random.nextInt(0, 20), random.nextInt(0, 20), random.nextInt(0, 20), random.nextInt(0, 20), random.nextInt(0, 20)};
		int numeroDigitado;
		boolean acertou = false;
		
		System.out.println("Digite um numero inteiro entre 0 e 20 e descubra se está na minha lista:");
		numeroDigitado = scanner.nextInt();
		
		for (int i = 0; i < numeros.length; i++) {
			if (numeroDigitado == numeros[i]) {
				System.out.println("Acertou, na minha array existe o número " + numeroDigitado);
				acertou = true;
				break;
			}
		}
		
		if(!acertou) {
			System.out.printf("Errou, o número %d não está na minha lista", numeroDigitado);
		}
		
		scanner.close();

	}

}
