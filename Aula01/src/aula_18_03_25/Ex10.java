package aula_18_03_25;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {

		/**
		 * Faça uma calculadora. O usuário entra com dois números e depois com a
		 * operação desejada. Caso o número da operação seja 1: some os dois números.
		 * Caso seja 2: subtraia os dois números. Caso seja 3: multiplique os dois
		 * números. Caso seja 4: divida os dois números.
		 */
		
		Scanner scanner = new Scanner(System.in);
		
		double numero1, numero2, soma, subtracao, multiplicacao, divisao;
		int operacao;
		
		System.out.println("Digite o 1º numero");
		numero1 = scanner.nextDouble();
		
		System.out.println("Digite o 2º numero");
		numero2 = scanner.nextDouble();

		System.out.println("Digite o numero da operação desejada:");
		System.out.println("1 - Soma");
		System.out.println("2 - Subtração");
		System.out.println("3 - Multiplicação");
		System.out.println("4 - Divisão");
		operacao = scanner.nextInt();
		
		soma = numero1 + numero2;
		subtracao = numero1 - numero2;
		multiplicacao = numero1 * numero2;
		divisao = numero1 / numero2;
		
		if(operacao == 1) {
			System.out.println(numero1 + " + " + numero2 + " = " + soma);
		} else if (operacao == 2) {
			System.out.println(numero1 + " - " + numero2 + " = " + subtracao);
		} else if (operacao == 3) {
			System.out.println(numero1 + " * " + numero2 + " = " + multiplicacao);
		} else if (operacao == 4) {
			System.out.println(numero1 + " / " + numero2 + " = " + divisao);
		} else {
			System.err.println("Operação inválida.");
		}
	}

}
