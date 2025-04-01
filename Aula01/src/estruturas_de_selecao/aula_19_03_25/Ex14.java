package estruturas_de_selecao.aula_19_03_25;

import java.util.Scanner;

public class Ex14 {

	public static void main(String[] args) {

		/**
		 * Um casal possui três filhos: Marquinhos, Zezinho e Luluzinha. Faça um
		 * algoritmo para ler as idades dos filhos e exibir quem é o mais velho, o irmão
		 * do meio e o caçula da família. Suponha que não haja empates.
		 */

		Scanner scanner = new Scanner(System.in);

		int idadeMarquinhos, idadeZezinho, idadeLuluzinha, idadeMaisVelho, idadeMeio, idadeCacula;

		System.out.println("Digite a idade do Marquinhos:");
		idadeMarquinhos = scanner.nextInt();

		System.out.println("Digite a idade do Zezinho:");
		idadeZezinho = scanner.nextInt();

		System.out.println("Digite a idade da Luluzinha:");
		idadeLuluzinha = scanner.nextInt();

		if (idadeMarquinhos > 0 && idadeZezinho > 0 && idadeLuluzinha > 0) {

			if (idadeMarquinhos != idadeZezinho && idadeMarquinhos != idadeLuluzinha) {

				idadeMaisVelho = Math.max(idadeMarquinhos, Math.max(idadeZezinho, idadeLuluzinha));
				idadeCacula = Math.min(idadeMarquinhos, Math.min(idadeZezinho, idadeLuluzinha));

				if (idadeMaisVelho == idadeMarquinhos) {
					System.out.println("o irmão mais velho é o Marquinhos.");

					if (idadeCacula == idadeZezinho) {
						System.out.println("o irmão do meio é a Luluzinha");
						System.out.println("o caçula é o Zezinho");
					} else {
						System.out.println("o irmão do meio é o Zezinho");
						System.out.println("a caçula é a Luluzinha");
					}
				} else if (idadeMaisVelho == idadeZezinho) {
					System.out.println("o irmão mais velho é o Zezinho.");

					if (idadeCacula == idadeMarquinhos) {
						System.out.println("o irmão do meio é a Luluzinha");
						System.out.println("o caçula é o Marquinhos");
					} else {
						System.out.println("o irmão do meio é o Marquinhos");
						System.out.println("a caçula é a Luluzinha");
					}
				} else {
					System.out.println("a irmã mais velho é a Luluzinha.");
					
					if (idadeCacula == idadeMarquinhos) {
						System.out.println("o irmão do meio é o Zezinho");
						System.out.println("o caçula é o Marquinhos");
					} else {
						System.out.println("o irmão do meio é o Marquinhos");
						System.out.println("o cacula é o Zezinho");
					}
				}

			} else {
				System.err.println("Existem idades iguais.");
				return;
			}

		} else {
			System.err.println("Alguma idade é inválida.");
			return;
		}

	}

}
