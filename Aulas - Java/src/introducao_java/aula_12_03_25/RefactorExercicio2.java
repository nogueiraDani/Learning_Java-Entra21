package introducao_java.aula_12_03_25;

import java.util.Scanner;

public class RefactorExercicio2 {

	public static void main(String[] args) {		
		
		/**
		 * escrever um código que mostra a altura da pessoa em metros.
		 * -- refatorar usando Scanner --
		 */
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite a altura desejada: ");
		Double altura = scanner.nextDouble();
		
		System.out.println(String.format("a altura em metros é %.2f metros.", altura));
		System.out.println("a altura em metros é " +  altura + " metros.");
		
		scanner.close();
	}

}