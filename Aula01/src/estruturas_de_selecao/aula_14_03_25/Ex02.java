package estruturas_de_selecao.aula_14_03_25;

public class Ex02 {

	public static void main(String[] args) {

		/**
		 * Dados dois valores inteiros, escreva um algoritmo que informe se o primeiro
		 * número é múltiplo do segundo
		 */

		PedirNumero pedirNumero = new PedirNumero();

		int num1 = pedirNumero.perguntar();
		int num2 = pedirNumero.perguntar();

		/*
		 * if (num1 % num2 == 0) { System.out.println("Verdadeiro"); } else {
		 * System.out.println("False"); }
		 */

		System.out.println(num1 % num2 == 0);
	}

}
