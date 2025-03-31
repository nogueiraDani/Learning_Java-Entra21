package aula_12_03_25;

import java.util.Scanner;

public class RefactorExercicio3 {
	
	public static void main(String[] args) {
		
		/**
		 *  calcule a area e o perimetro do retangula
		 *  -- refatorar usando Scanner
		 */
		
		Scanner scanner = new Scanner(System.in);
		
		double base, altura;
		
		System.out.println("Digite a medida da base do retangulo: ");
		base = scanner.nextDouble();
		
		System.out.println("Digite a medida da altura do retangulo: ");
		altura = scanner.nextDouble();
		
		double area = base * altura;	
		double perimetro = 2*(base + altura);
		
		System.out.println(String.format("a area do retangulo é %.2f metros quadrados", area));
		System.out.println(String.format("o perimetro do retangulo é %.2f metros", perimetro));
		
		scanner.close();
		
		
	}

}
