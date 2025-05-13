package loops_while_for.aula_28_03_25;

import java.math.BigInteger;
import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {

		/**
		 * Escreva um programa para calcular o fatorial de um número 5! = 5 · 4 · 3 · 2
		 * · 1 = 120
		 */

		Scanner scanner = new Scanner(System.in);
		int valorACalcular;
		BigInteger resultado = BigInteger.ONE;

		System.out.println("Digite o valor que deseja calcular o fatorial:");
		valorACalcular = scanner.nextInt();

		if (valorACalcular > 0) {
			
			for (int i = valorACalcular; i >= 1; i--) {
				resultado = resultado.multiply(BigInteger.valueOf(i));
			}

			System.out.println(resultado);

		} else {
			System.out.println("Valor inválido, fatorial só é permitido para numeros inteiros maiores que 0.");
		}
		scanner.close();

	}

}
