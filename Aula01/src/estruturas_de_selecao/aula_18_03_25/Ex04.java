package estruturas_de_selecao.aula_18_03_25;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {

		/**
		 * Faça um algoritmo que leia um caractere. Caso seja digitada a letra 'M'
		 * escreva “Masculino”. Se for digitada a letra 'F' escreva “Feminino”. Se for
		 * informado 'I' escreva “Não Informado”. Qualquer outra letra digitada escreva
		 * “Entrada Incorreta”.
		 * 
		 */
		
		Scanner scanner = new Scanner(System.in);
		char resposta;
		
		//atenção ao Char, se digitar palavra "mulher" ele mostra resposta errada. Corrigir
		
		System.out.println("Digite a sua opção:");
		resposta = scanner.next().charAt(0);
		
		if(resposta == 'M' || resposta == 'm') {
			System.out.println("Masculino");
		} else if (resposta == 'F' || resposta == 'f') {
			System.out.println("Feminino");
		} else if (resposta == 'I' || resposta == 'i') {
			System.out.println("Não Informado");
		} else {
			System.out.println("Entrada Incorreta");
		}

	}

}
