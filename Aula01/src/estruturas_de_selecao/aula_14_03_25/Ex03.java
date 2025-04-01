package estruturas_de_selecao.aula_14_03_25;

import java.util.Scanner;

public class Ex03 {
	
	public static void main(String[] args) {
		
		/**
		 * Faça um algoritmo que imprima "nome correto" caso o nome inserido seja o seu
		 */
		
		Scanner scanner = new Scanner(System.in);
		String nome = "Daniela Nogueira Rampim";
		String nomeAVerificar;
		
		System.out.println("Digite o nome a verificar:");
		nomeAVerificar = scanner.nextLine();
		
		String nome2 = nomeAVerificar.replaceAll("\\s+", " ").replaceFirst(" ", "");
		//String nome2 = nomeAVerificar.replaceAll("\\s+", " ").trim();  --> outra forma de fazer
		
		if(nome2.equalsIgnoreCase(nome)) {
			System.out.println("nome correto");
		} else {
			System.out.println("nome incorreto");
		}
		
	}

}
