package estruturas_de_selecao.aula_18_03_25;

import java.util.Scanner;

public class Ex09 {

	public static void main(String[] args) {

		/**
		 * Escreva um algoritmo que obtém do usuário 3 valores inteiros representando as
		 * três cartas deste usuário em uma mão de jogo de truco (1= AS; 2=2; 3=3;
		 * 7=7;11=Valete; 12= Dama; 13= Rei). O algoritmo deve imprimir na tela a
		 * palavra “TRUCO” (se APENAS UMA das três cartas for AS, 2 ou 3), “SEIS” (se
		 * APENAS DUAS das três cartas for AS, 2 ou 3) ou “NOVE” (se AS TRÊS cartas
		 * forem AS, 2 ou 3). Se não houver AS, 2 ou 3 nas três cartas, não é impresso
		 * nada.
		 */

		Scanner scanner = new Scanner(System.in);
		int carta1, carta2, carta3;

		System.out.println("Digite o valor da 1º carta:");
		carta1 = scanner.nextInt();

		System.out.println("Digite o valor da 2º carta:");
		carta2 = scanner.nextInt();

		System.out.println("Digite o valor da 3º carta:");
		carta3 = scanner.nextInt();

		int contador = 0;

		if (carta1 > 0 && carta1 <= 3 || carta2 > 0 && carta2 <= 3 || carta3 > 0 && carta3 <= 3) {

			if (carta1 <= 3) {
				contador++;
			}

			if (carta2 <= 3) {
				contador++;
			}

			if (carta3 <= 3) {
				contador++;
			}

		} else {
			System.out.println("Cartas ruins");
		}

		if (contador == 1) {
			System.out.println("TRUCOOO!");
		} else if (contador == 2) {
			System.out.println("SEEEIS!");
		} else if (contador == 3) {
			System.out.println("NOOOOOVEEEEEE!");
		}
	}

}
