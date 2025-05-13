package introducao_java.aula_12_03_25;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {

		/**
		 * Uma pessoa foi até uma casa de câmbio trocar dólares por reais. Para isto ela
		 * entregou um valor em dólares para o atendente. Calcule quantos reais o
		 * atendente deve devolver para a pessoa.
		 */

		Scanner scanner = new Scanner(System.in);
		DecimalFormat decimalFormat = new DecimalFormat("0.00");

		double valorEmDolares, cotacaoDolar;

		System.out.println("Digite o valor em dolares:");
		valorEmDolares = scanner.nextDouble();

		System.out.println("Digite a cotacao do dolar:");
		cotacaoDolar = scanner.nextDouble();

		// usando decimal no lugar do .2f
		System.out.println("R$ " + decimalFormat.format(valorEmDolares * cotacaoDolar));
		//System.out.println(String.format("O valor em reais é R$ %.2f", (valorEmDolares * cotacaoDolar)));
		
		scanner.close();
		
	}

}
