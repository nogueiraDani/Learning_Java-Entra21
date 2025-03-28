package aula_18_03_25;

import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {

		/**
		 * Faça um programa que funciona como um conversor universal. Primeiro o usuário
		 * escolhe se ele quer converter: temperatura, peso, comprimento ou volume.
		 * Depois, ele escolhe qual a unidade do valor que ele deseja converter Após
		 * isso, o usuário entra com o valor desejado Depois, ele escolhe para qual ele
		 * quer converter. As opções de temperatura, são: celsius, fahrenheit e kelvin.
		 * As opções de peso são: quilos, libras e onças As opções de comprimento são:
		 * metros, pés e polegadas As opções de volume são: litros, galão líquido e
		 * onças líquidas
		 */

		Scanner scanner = new Scanner(System.in);

		int conversor, unidadeAtual, unidadeDesejada;
		boolean opcaoConversorValida = true;
		
		int[] opcoes = {0,0,0,0}; // pensei num array para organizar os valores digitados.

		System.out.println("Calculadora universal");
		System.out.println("--------------------------");
		System.out.println("O que deseja converter:");
		System.out.println("1 - temperatura");
		System.out.println("2 - peso");
		System.out.println("3 - comprimento");
		System.out.println("4 - volume");
		opcoes[0] = scanner.nextInt();

		if (opcoes[0] < 1 || opcoes[0] > 4) {
			opcaoConversorValida = false;
			System.out.println("Opção inválida");
		}

		if (opcaoConversorValida) {
			System.out.println("--------------------------");
			System.out.print("Informe a unidade de medida atual");

			if (opcoes[0] == 1) {
				System.out.println(" da temperatura: ");
				System.out.println("1 - celsius");
				System.out.println("2 - fahrenheit");
				System.out.println("3 - kelvin");
			} else if (opcoes[0] == 2) {
				System.out.println(" do peso: ");
				System.out.println("1 - quilos");
				System.out.println("2 - libras");
				System.out.println("3 - onças");
			} else if (opcoes[0] == 3) {
				System.out.println(" do comprimento: ");
				System.out.println("1 - metros");
				System.out.println("2 - pés");
				System.out.println("3 - polegadas");
			} else {
				System.out.println(" do volume: ");
				System.out.println("1 - litros");
				System.out.println("2 - galão líquido");
				System.out.println("3 - onças líquidas");
			}

		}

	}

}
