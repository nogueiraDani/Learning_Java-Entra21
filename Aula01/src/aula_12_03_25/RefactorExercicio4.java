
package aula_12_03_25;

import java.util.Scanner;

public class RefactorExercicio4 {
	
	public static void main(String[] args) {
		
		/**
		 * escreva um codigo que mostre nome e sobrenome, considerando cada uma, uma variavel
		 *  -- refatorar com Scanner -- 
		 */
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite o nome:");
		String nome = scanner.nextLine();
		
		System.out.println("Digite o sobrenome:");
		String sobrenome = scanner.nextLine(); // para pegar o nome e sobrenome deve usar nextLine nos dois
		
		System.out.println("Seu nome é: " + nome + " " + sobrenome);
		
		scanner.close();
		
	}
	
	


}
