package loops_while_for.aula_26_03_25;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {

		/**
		 * Descreva um algoritmo que vá lendo a altura de pessoas até o usuário entrar
		 * com o número 0 Calcule a média de altura delas.
		 */

		Scanner scanner = new Scanner(System.in);
		
		int quantidadeDePessoas = 0;
		double altura = 1;
		double somaAlturas = 0;
		double mediaAlturas;
		
		while(altura != 0) {
			
			System.out.println("Digite a altura: ");
			altura = scanner.nextDouble();
			
			if (altura > 0 && altura <= 2.60) {
				somaAlturas += altura;
				quantidadeDePessoas++;
			} else {
				System.out.println("Medida inválida.");
			}
			
		}
		
		mediaAlturas = somaAlturas / quantidadeDePessoas;
		
		System.out.printf("A média entre as %d pessoas é: %.2f m", 
				quantidadeDePessoas, mediaAlturas);
		
	}

}
