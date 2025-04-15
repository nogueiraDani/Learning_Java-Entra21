package estruturas_de_selecao.aula_18_03_25;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {

		/**
		 * Dadas as coordenadas (X e Y) de um Ponto, você deve informar em qual
		 * quadrante ele está localizado no plano cartesiano
		 */

		Scanner scanner = new Scanner(System.in);
		Double x, y;

		System.out.println("Digite a coordenada X");
		x = scanner.nextDouble();

		System.out.println("Digite a coordenada Y");
		y = scanner.nextDouble();

		if (x > 0 && y > 0) {
			System.out.println("1º quadrante");
		} else if (x < 0 && y > 0) {
			System.out.println("2º quadrante");
		} else if ( x < 0 && y < 0) {			
			System.out.println("3º quadrante");
		} else if (x > 0 && y < 0) {
			System.out.println("4º quadrante");
		} else if ( x == 0 && y > 0) {
			System.out.println("Está sobre o eixo X");
		} else if (y == 0 && x > 0) {
			System.out.println("Está sobre o eixo Y");
		} else {
			System.out.println("Centro");
		}
		
		scanner.close();

	}

}
