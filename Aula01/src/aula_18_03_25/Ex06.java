package aula_18_03_25;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {

		/**
		 * Dada a idade de um nadador descreva um algoritmo que o classifique em uma das
		 * seguintes categorias: pré-mirim 5 - 7 anos mirim 8 - 10 anos infantil 11 - 13
		 * anos infanto-juvenil 14 - 17 anos juvenil 18 - 20 anos adulto maiores de 21
		 * anos
		 * 
		 */

		Scanner scanner = new Scanner(System.in);
		int idade;

		System.out.println("Digite a idade:");
		idade = scanner.nextInt();

		if (idade >= 5 && idade <= 7) {
			System.out.println("Pré-mirim");
		} else if (idade >= 8 && idade <= 10) {
			System.out.println("Mirim");

		} else if (idade >= 11 && idade <= 13) {
			System.out.println("Infantil");

		} else if (idade >= 14 && idade <= 17) {
			System.out.println("Infanto juvenil");

		} else if (idade >= 18 && idade <= 20) {
			System.out.println("Juvenil");
		} else if (idade >= 21) {
			System.out.println("Adulto");
		} else {
			System.out.println("Idade não possui classificação");
		}

	}

}
