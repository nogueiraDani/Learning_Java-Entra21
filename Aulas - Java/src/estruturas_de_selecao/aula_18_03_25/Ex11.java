package estruturas_de_selecao.aula_18_03_25;

import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {

		/**
		 * Escreva um algoritmo em que o usuário entra com um número. 
		 * Depois ele escolhe a operação que vai ser feita com esse número.
		 * Caso ele escolha a operação 1 modifique a variável do número entrado e some 10 ao número original
		 * Caso ele escolha a operação 2 modifique a variável do número entrado e subtraia 10 do número original 
		 * Caso ele escolha a operação 3 modifique a variável do número entrado e multiplique 10 ao número original 
		 * Caso ele escolha a operação 4 modifique a variável do número entrado e divida 10 do número original
		 */
		
		Scanner scanner = new Scanner(System.in);
		
		double valor;
		int operacao;
		
		System.out.println("Digite o valor a modificar: ");
		valor = scanner.nextDouble();
		
		System.out.println("-----------------------");
		System.out.println("Digite a operação desejada:");
		System.out.println("1 - Adicionar 10");
		System.out.println("2 - Subtrair 10");
		System.out.println("3 - Multiplicar por 10");
		System.out.println("4 - Dividir por 10");
		operacao = scanner.nextInt();
		
		System.out.println("-----------------------");
		
		if(operacao == 1) {
			System.out.println(valor + 10);
		} else if (operacao == 2) {
			System.err.println(valor - 10);
		} else if (operacao == 3) {
			System.out.println(valor * 10);
		} else if (operacao == 4) {
			System.out.println(valor / 10);
		} else {
			System.out.println("Operação inválida");
		}

		scanner.close();
				
	}

}
