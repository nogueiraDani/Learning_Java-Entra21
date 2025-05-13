package metodos.aula_14_04_25;

import java.util.Scanner;

public class Ex01 {

	/**
	 * Faça um programa em que o usuário entre com um número de 1 a 4 Com o número 1
	 * sendo verão, 2 sendo outono... Dependendo de o que o usuário informa,
	 * imprima: É verão E o tempo está quente Ou É inverno E está frio Faça um
	 * método para cada estação do ano
	 */

	public static void mostrarTelaInicial() {
		System.out.println("-------------------");
		System.out.println("Descubra a estação:");
		System.out.println("-------------------");

	}

	public static void perguntarEstacao() {
		System.out.println("Digite um número:");
	}

	public static void mostrarVerao() {
		System.out.println("É verão, o tempo está quente.");
	}

	public static void mostrarOutono() {
		System.out.println("É outono, as folhas caem no quintal.");
	}
	
	public static void mostrarInverno() {
		System.out.println("É inverno, está frio.");		
	}
	
	public static void mostrarPrimavera() {
		System.out.println("É primavera, vejo flores em você.");				
	}
	
	public static void mostrarRespostaInvalida() {
		System.out.println("Número inválido, digite entre 1 e 4.");
	}
	
	public static void mostrarFim() {
		System.out.println("-------------------");
		System.out.println("Fim do programa...");
	}
	
	
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		mostrarTelaInicial();
		perguntarEstacao();
		int resposta = scanner.nextInt();

		if (resposta >= 1 && resposta <= 4) {
			if (resposta == 1) {
				mostrarVerao();
			} else if (resposta == 2) {
				mostrarOutono();
			} else if (resposta == 3) {
				mostrarInverno();
			} else {
				mostrarPrimavera();
			}

		} else {
			mostrarRespostaInvalida();
		}
		
		mostrarFim();
		
		scanner.close();

	}

}
