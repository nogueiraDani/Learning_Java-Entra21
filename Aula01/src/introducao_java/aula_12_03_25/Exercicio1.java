package introducao_java.aula_12_03_25;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		
		/**
		 *  exercicio1: somar os 2 primeiros numeros 
		 *  e multiplicar pelo terceiro numero.
		 *  -- refatorar usando Scanner -- 
		 */
		
		Scanner scanner = new Scanner(System.in);
		
		int number1, number2, number3;
		
		System.out.println("Digite o primeiro número: ");
		number1 = scanner.nextInt();
		
		System.out.println("Digite o segundo número: ");
		number2 = scanner.nextInt();
		
		System.out.println("Digite o terceiro número: ");
		number3 = scanner.nextInt();
		
		
		double sum = number1 + number2;
		double result = sum * number3;
		
		System.out.println("(" + number1 + "+" + number2 +") * " + number3 + " = " + result);
		
		scanner.close();

	}

}
