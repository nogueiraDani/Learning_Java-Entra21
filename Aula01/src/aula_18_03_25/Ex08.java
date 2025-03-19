package aula_18_03_25;

import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {

		/**
		 * Escreva um algoritmo para ler o ano de nascimento de 3 irmãos, escrever uma
		 * mensagem que indique se eles são TRIGÊMEOS, GÊMEOS, APENAS IRMÃOS. Considere
		 * que eles são GÊMEOS se dois deles possuem a mesma idade e o outro diferente
		 * dos demais, e apenas irmãos se todas as idades forem diferentes.
		 */
		
		Scanner scanner = new Scanner(System.in);
		int idadeIrmao1, idadeIrmao2, idadeIrmao3;
		
		System.out.println("Digite a idade do 1º irmão");
		idadeIrmao1 = scanner.nextInt();
		
		System.out.println("Digite a idade do 1º irmão");
		idadeIrmao2 = scanner.nextInt();

		System.out.println("Digite a idade do 1º irmão");
		idadeIrmao3 = scanner.nextInt();
		
		
		if(idadeIrmao1 == idadeIrmao2 && idadeIrmao2 == idadeIrmao3) {
			System.out.println("Trigemeos");
		} else if(idadeIrmao1 == idadeIrmao3 || idadeIrmao1 == idadeIrmao2 || idadeIrmao2 == idadeIrmao3) {
			System.out.println("Gêmeos");			
		} else {
			System.out.println("Irmãos");
		}
	}

}
