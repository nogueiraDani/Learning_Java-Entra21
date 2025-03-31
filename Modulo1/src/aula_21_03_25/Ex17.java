package aula_21_03_25;

import java.util.Scanner;

public class Ex17 {

	public static void main(String[] args) {

		/**
		 * Leia uma data (dia, mês e ano) e determine se ela é válida. Lembre dos anos
		 * bissextos! Faça com que o programe informe que a data é inválida assim que o
		 * usuário informar um valor inexistente. Por exemplo, assim que o usuário
		 * informar o dia 50 o programa já deve parar e não deve receber o mês e ano.
		 */

		Scanner scanner = new Scanner(System.in);
		int dia, mes, ano, ultimosDigitosAno;
		String stringMes;
		String stringDia;

		// pergunta o dia
		System.out.println("Digite o dia:");
		dia = scanner.nextInt();

		// pergunta o mes
		if (dia >= 1 && dia <= 31) {

			// formata o dia menor que 10 com 0 na frente
			if (dia < 10) {
				stringDia = "0" + Integer.toString(dia);
			} else {
				stringDia = Integer.toString(dia);
			}

			// pergunta o mês
			System.out.println("Digite o mês:");
			mes = scanner.nextInt();

			// formata o mês menor que 10 com 0 na frente
			if (mes < 10) {
				stringMes = "0" + Integer.toString(mes);
			} else {
				stringMes = Integer.toString(mes);
			}

			// pergunta o ano
			if (mes >= 1 && mes <= 12) {
				if ((mes == 4 || mes == 6 || mes == 9 || mes == 11) && (dia == 31)) {
					System.out.printf("Dia inválido, no mês %s o dia não pode ser maior que 30", stringMes);
				} else {
					System.out.println("Digite o ano:");
					ano = scanner.nextInt();

					// guarda os ultimos 2 digitos do ano
					ultimosDigitosAno = Integer.parseInt(Integer.toString(ano).substring(2));

					// validando mês de fevereiro
					if (mes == 2) {

						// valida ano bissexto
						if ((ano % 4 == 0) && (ano % 100 == 0) || (ano % 400 == 0 && !(ano % 100 == 0))
								|| (ultimosDigitosAno % 4 == 0)) {

							// valida dia de fevereiro no ano bissexto
							if (dia > 29) {
								System.out.println(
										"Dia inválido, o ano é bissexto então no mês de fevereiro o dia não pode ser maior que 29");
							} else {
								System.out.printf("Data válida: %s/%s/%d", stringDia, stringMes, ano);
							}

							// valida dia de fevereiro no ano nao bissexto
						} else if (dia > 28) {
							System.out.println("Dia inválido, o ano não é bissexto então no mês de fevereiro o dia não pode ser maior que 28");

						} else {
							System.out.printf("Data válida: %s/%s/%d", stringDia, stringMes, ano);
						}
					} else {
						System.out.printf("Data válida: %s/%s/%d", stringDia, stringMes, ano);
					}
				}
			} else {
				System.out.println("Mês inválido, digite valores entre 1 e 12");
			}

		} else

		{
			System.out.println("Dia inválido, digite valores entre 1 e 31.");
		}

	}
}
