package matrizes.aula_09_04_25;

import java.util.Scanner;

public class Ex_externo01 {

	public static void main(String[] args) {

		/*
		 * Desafio 1: Verificação de Palíndromo
		 * 
		 * Escreva um programa que verifique se uma palavra ou frase é um palíndromo
		 * (lê-se da mesma forma de trás para frente).
		 */
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("""
				---- Verificação de palindromo ----
				-----------------------------------
				---------Digite uma palavra--------""");
		String palavra = scanner.next();
		String novaPalavra = "";
		
		for (int i = palavra.length() - 1; i >= 0; i--) {
			novaPalavra += String.valueOf(palavra.charAt(i));
		}
		
		if(palavra.equalsIgnoreCase(novaPalavra)) {
			System.out.printf("%s é um palindromo.\n", palavra);
		} else {
			System.out.printf("%s não é um palindromo.\n", palavra);
		}
		
		scanner.close();
	}

}
