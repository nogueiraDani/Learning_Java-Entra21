package aula_31_03_25;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {

		/**
		 * Crie uma array de 5 elementos e imprima os últimos elementos por primeiro
		 */

		Scanner scanner = new Scanner(System.in);
		int quantidadeElementos;

		System.out.println("Digite a quantidade de nomes:");
		quantidadeElementos = scanner.nextInt();

		String nomes[] = new String[quantidadeElementos];

		for (int i = 0; i < nomes.length; i++) {
			System.out.printf("Digite o %d° nome:\n", i + 1);
			nomes[i] = scanner.next();
		}
		
		System.out.println("Os nomes, em ordem inversa a que foi lançada, são:");
		
		// fazendo for ao contrario, colocar o tamanho -1.
		for (int i = nomes.length - 1; i >= 0; i--) {
			System.out.println(nomes[i]);
		}
		
		scanner.close();
	}

}
