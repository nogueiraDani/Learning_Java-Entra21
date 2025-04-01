package introducao_java.aula_11_03_25;

import java.util.Scanner;

public class Exercicio5 {
	
	public static void main(String[] args) {
		
		/**
		 * aula sobre o Scanner
		 */
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite a idade: ");
		int idade = scanner.nextInt();
		
		System.out.println("A idade é: " + idade + " anos.");
		
		scanner.close();

	}
	

}
