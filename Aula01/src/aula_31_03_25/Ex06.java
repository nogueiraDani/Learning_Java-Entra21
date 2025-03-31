package aula_31_03_25;

import java.util.Arrays;

public class Ex06 {

	public static void main(String[] args) {

		/**
		 * Faça um algoritmo que inverta a ordem de uma array (o primeiro elemento vai
		 * se tornar o último elemento)
		 */

		int numerosOriginais[] = { 2, 3, 5, 8, 9, 62, 0 };
		int numerosInvertidos[] = new int[numerosOriginais.length];
		
		for (int i = 0; i < numerosInvertidos.length; i++) {
			numerosInvertidos[i] = numerosOriginais[numerosOriginais.length - (i + 1)];
		}
		
		System.out.printf("Array original = %s\n", Arrays.toString(numerosOriginais));
		System.out.printf("Array invertido = %s\n", Arrays.toString(numerosInvertidos));

	}

}
