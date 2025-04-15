package loops_while_for.aula_26_03_25;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {

		/**
		 * Descreva um algoritmo que leia a altura de 5 pessoas e calcule a média de
		 * altura delas.
		 */

		Scanner scanner = new Scanner(System.in);
		int quantidadeDePessoas;
		double somaAlturas = 0;
		double mediaAlturas;

		System.out.println("Digite entre quantas pessoas queres a média de altura:");
		quantidadeDePessoas = scanner.nextInt();

		for (int i = 0; i < quantidadeDePessoas; i++) {

			System.out.printf("Digite a altura da %d° pessoa:\n", (i + 1));
			double altura = scanner.nextDouble();

			if (altura >= 0 && altura <= 2.60) {
				somaAlturas += altura;
			} else {
				System.out.println("Medida inválida.");
			}
		}

		mediaAlturas = somaAlturas / quantidadeDePessoas;

		System.out.printf("A média entre as %d pessoas é: %.2f m",
				quantidadeDePessoas, mediaAlturas);
		scanner.close();
	}

}
