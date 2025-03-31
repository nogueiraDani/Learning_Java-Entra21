package aula_18_03_25;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {

		/**
		 * Faça um algoritmo que o usuário entre com um char. Determine se esse char é
		 * uma consoante ou vogal.
		 */

		Scanner scanner = new Scanner(System.in);
		char resposta;

		System.out.println("Digite o seu caracter:");
		resposta = scanner.next().charAt(0);

		if (Character.isLetter(resposta)) {
			// precisaria validar ainda as vogais com acento.
			if (resposta == 'a' || resposta == 'e' || resposta == 'i' || resposta == 'o' || resposta == 'u') {
				System.out.println("Vogal minuscula");
			} else if (resposta == 'A' || resposta == 'E' || resposta == 'I' || resposta == 'O' || resposta == 'U') {
				System.out.println("Vogal maiuscula");
			} else {
				System.out.println("Consoante");
			}
		} else {
			System.out.println("Não é letra.");
		}
	}

}
