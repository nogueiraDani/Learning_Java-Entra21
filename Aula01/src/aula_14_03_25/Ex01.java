package aula_14_03_25;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {

		/**
		 * Dados dois números inteiros distintos descreva um algoritmo para informar
		 * qual deles tem o maior valor
		 * 
		 */
		
		PedirNumero pedirNumero = new PedirNumero();
		
		int num1 = pedirNumero.perguntar();
		int num2 = pedirNumero.perguntar();
		
		if(num1 == num2) {
			System.out.println("Os numeros sao iguais.");
		} else if (num1 > num2) {
			System.out.printf("O numero %d é maior que %d.", num1, num2);
		} else {
			System.out.printf("O numero %d é maior que %d.", num2, num1);			
		}		
		
	}

}
