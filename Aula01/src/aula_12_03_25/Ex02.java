package aula_12_03_25;

import java.util.Scanner;

public class Ex02 {
	
	/**
	 * Calcule a área de um círculo a partir do valor do raio
	 */

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		double raio, area;

		System.out.println("Digite o raio do circulo:");
		raio = scanner.nextDouble();
		
		area = Math.PI * Math.pow(raio, 2);
		
		System.out.println(String.format("A area do circulo de raio %.2f é %.2f", raio, area));
	}

}
