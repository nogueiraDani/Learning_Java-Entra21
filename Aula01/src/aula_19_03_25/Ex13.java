package aula_19_03_25;

import java.util.Scanner;

public class Ex13 {

	public static void main(String[] args) {

		/**
		 * Escreva um algoritmo que leia a idade de 2 homens e 2 mulheres (considere que
		 * a idade entre homens e mulheres sempre serão diferentes). Calcule e escreva a
		 * soma das idades do homem mais velho com a mulher mais nova, e o produto das
		 * idades do homem mais novo com a mulher mais velha.
		 * 
		 */

		Scanner scanner = new Scanner(System.in);

		int idadeHomem1, idadeHomem2, idadeMulher1, idadeMulher2;
		int idadeMaiorHomem, idadeMenorHomem, idadeMaiorMulher, idadeMenorMulher;

		double soma, produto;

		System.out.println("Digite a idade do 1º homem:");
		idadeHomem1 = scanner.nextInt();

		System.out.println("Digite a idade do 2º homem:");
		idadeHomem2 = scanner.nextInt();

		System.out.println("Digite a idade da 1º mulher:");
		idadeMulher1 = scanner.nextInt();

		System.out.println("Digite a idade da 2º mulher:");
		idadeMulher2 = scanner.nextInt();

		if (idadeHomem1 > 0 && idadeHomem2 > 0 && idadeMulher1 > 0 && idadeMulher2 > 0) {

			if (idadeHomem1 != idadeHomem2 && idadeMulher1 != idadeMulher2) {

				idadeMaiorHomem = Math.max(idadeHomem1, idadeHomem2);
				idadeMenorHomem = Math.min(idadeHomem1, idadeHomem2);

				idadeMaiorMulher = Math.max(idadeMulher1, idadeMulher2);
				idadeMenorMulher = Math.min(idadeMulher1, idadeMulher2);

				soma = idadeMaiorHomem + idadeMenorMulher;
				produto = idadeMenorHomem * idadeMaiorMulher;

				System.out.println("Soma das idades = " + soma);
				System.out.println("Soma das idades = " + produto);

			} else if (idadeHomem1 == idadeHomem2) {
				System.out.println("As idades dos homens são iguais.");
			} else if (idadeMulher1 == idadeMulher2) {
				System.out.println("As idades das mulheres são iguais.");
			}
		} else {
			System.out.println("Idade inválida.");
		}

	}

}
