package metodos.aula_14_04_25;

import java.util.Scanner;

public class Ex02 {
	
	public static void iniciarApp() {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite um nome para mostrar:");
		String nome = scanner.next();
		
		if(nome.equalsIgnoreCase("daniela")) {
			mostrarDaniela();
		} else if (nome.equalsIgnoreCase("gabrielli")) {
			mostrarGabrielli();
		} else if (nome.equalsIgnoreCase("jackson")) {
			mostrarJackson();
		} else {
			mostrarNomeInválido();
		}
		mostrarFimDoApp();
		
		scanner.close();
		
	}

	public static void mostrarNomeInválido() {
		System.out.println("Nome inválido.");
		
	}

	public static void mostrarDaniela() {
		System.out.println("Nome: Daniela");
		System.out.println("Idade: 35 anos");
		System.out.println("Curso: Entra21");
		
	}

	public static void mostrarGabrielli() {
		System.out.println("Nome: Gabrielli");
		System.out.println("Idade: 23 anos");
		System.out.println("Curso: Entra21");
	}

	public static void mostrarJackson() {
		System.out.println("Nome: Jackson");
		System.out.println("Idade: 23 anos");
		System.out.println("Curso: Entra21");
	}
	
	public static void mostrarFimDoApp() {
		System.out.println("Fim do app...");
		
	}


	public static void main(String[] args) {

		/*
		 * Faça um método para seus colegas mais próximos O método deve imprimir: O nome
		 * dele(a) é [nome] Ele(a) tem [idade] anos Ele(a) é estudante do Entra21 (Em
		 * prints separados) Faça com que o método seja o nome do seu colega. O usuário
		 * deve entrar com o nome da pessoa para escolher um dos métodos a ser
		 * executado.
		 */
		
		iniciarApp();		

	}


}
