package avaliacao_11_04_25;

import java.util.Scanner;

public class Questao_04 {

	public static void main(String[] args) {
		/*
		 * Considere essa matriz: { {22.1, 23.5, 24.0, 23.8, 22.6, 21.9, 21.7, 22.2,
		 * 23.0, 24.1, 24.5, 24.0, 24.3, 24.4, 24.0, 24.5, 24.1, 24.4, 24.8, 24.5, 24.3,
		 * 24.7, 24.9, 23.8}, {21.8, 22.7, 23.2, 23.9, 23.7, 22.8, 22.5, 22.1, 22.9,
		 * 24.0, 24.6, 25.1, 26.2, 27.5, 28.1, 28.6, 29.2, 29.5, 28.9, 27.6, 26.4, 25.8,
		 * 25.1, 24.0}, {20.7, 21.0, 21.5, 22.1, 22.5, 22.7, 22.9, 23.1, 23.5, 23.9,
		 * 24.2, 24.6, 25.0, 25.3, 25.6, 25.9, 26.2, 26.5, 26.8, 27.1, 27.4, 27.7, 27.9,
		 * 27.8}, {20.2, 20.5, 21.0, 21.4, 21.8, 22.2, 22.5, 22.8, 23.1, 23.3, 23.6,
		 * 23.9, 24.2, 24.5, 24.8, 25.1, 25.4, 25.7, 26.0, 26.3, 26.6, 26.9, 27.1,
		 * 27.2}, {19.8, 20.0, 20.3, 20.7, 21.1, 21.4, 21.8, 22.1, 22.4, 22.7, 23.0,
		 * 23.3, 23.6, 23.9, 24.2, 24.5, 24.8, 25.1, 25.4, 25.7, 26.0, 26.2, 26.3,
		 * 26.5}, {19.5, 19.8, 20.1, 23.5, 23.9, 24.3, 24.7, 25.1, 25.5, 26.8, 27.1,
		 * 28.4, 28.7, 29.0, 28.3, 28.6, 28.9, 29.2, 28.5, 28.8, 28.1, 27.3, 27.5,
		 * 26.7}, {19.2, 19.5, 19.9, 20.3, 20.7, 21.1, 21.5, 21.9, 22.3, 22.7, 23.1,
		 * 23.4, 23.7, 24.0, 24.3, 24.6, 24.9, 25.2, 25.5, 25.8, 26.1, 26.3, 26.5, 26.7}
		 * } Você foi atarefado de desenvolver um programa que realiza uma análise de
		 * dados em uma array bidimensional que representa a informação da temperatura
		 * de uma determinada semana. Cada linha corresponde a um dia da semana e cada
		 * coluna corresponde a uma hora do dia. Calcule: a) A média diária de um dia da
		 * semana específico. O usuário entrará com o dia da semana por extenso, por
		 * exemplo “domingo”, então você deve pesquisar na linha correspondente. b) A
		 * média da hora de todos os dias da semana. O usuário entrará com a hora, por
		 * exemplo 15, então você deve pesquisar na coluna correspondente. c) Qual dia
		 * da semana teve a maior amplitude térmica.
		 */

		double matriz[][] = {
				{ 22.1, 23.5, 24.0, 23.8, 22.6, 21.9, 21.7, 22.2, 23.0, 24.1, 24.5, 24.0, 24.3, 24.4, 24.0, 24.5, 24.1,
						24.4, 24.8, 24.5, 24.3, 24.7, 24.9, 23.8 },
				{ 21.8, 22.7, 23.2, 23.9, 23.7, 22.8, 22.5, 22.1, 22.9, 24.0, 24.6, 25.1, 26.2, 27.5, 28.1, 28.6, 29.2,
						29.5, 28.9, 27.6, 26.4, 25.8, 25.1, 24.0 },
				{ 20.7, 21.0, 21.5, 22.1, 22.5, 22.7, 22.9, 23.1, 23.5, 23.9, 24.2, 24.6, 25.0, 25.3, 25.6, 25.9, 26.2,
						26.5, 26.8, 27.1, 27.4, 27.7, 27.9, 27.8 },
				{ 20.2, 20.5, 21.0, 21.4, 21.8, 22.2, 22.5, 22.8, 23.1, 23.3, 23.6, 23.9, 24.2, 24.5, 24.8, 25.1, 25.4,
						25.7, 26.0, 26.3, 26.6, 26.9, 27.1, 27.2 },
				{ 19.8, 20.0, 20.3, 20.7, 21.1, 21.4, 21.8, 22.1, 22.4, 22.7, 23.0, 23.3, 23.6, 23.9, 24.2, 24.5, 24.8,
						25.1, 25.4, 25.7, 26.0, 26.2, 26.3, 26.5 },
				{ 19.5, 19.8, 20.1, 23.5, 23.9, 24.3, 24.7, 25.1, 25.5, 26.8, 27.1, 28.4, 28.7, 29.0, 28.3, 28.6, 28.9,
						29.2, 28.5, 28.8, 28.1, 27.3, 27.5, 26.7 },
				{ 19.2, 19.5, 19.9, 20.3, 20.7, 21.1, 21.5, 21.9, 22.3, 22.7, 23.1, 23.4, 23.7, 24.0, 24.3, 24.6, 24.9,
						25.2, 25.5, 25.8, 26.1, 26.3, 26.5, 26.7 } };

		Scanner scanner = new Scanner(System.in);

		System.out.println("Informações sobre temperatura:");
		String diasDaSemana[] = { "domingo", "segunda", "terca", "quarta", "quinta", "sexta", "sabado" };
		int opcao = 0;
		int colunas = matriz[0].length;
		int linhas = 7;

		double maiorAmplitude = Double.MIN_VALUE;
		double matrizAmplitude[] = new double[7];

		int diaMaiorAmplitude = 0;

		while (opcao == 0) {
			System.out.println("Digite a opçao desejada:");
			System.out.println("1 - Descobrir média da temperatura de um dia especifico");
			System.out.println("2 - Descobrir a média da temperatura de um horario especifico, mas em todos os dias:");
			System.out.println("3 - Descobrir qual dia da semana teve maior amplitude térmica:");
			System.out.println("4 - Sair:");
			opcao = scanner.nextInt();

			if (opcao == 1) {
				// resolução A
				// a) A média diária de um dia da semana específico. O usuário entrará com o dia
				// da semana por extenso, por exemplo “domingo”, então você deve pesquisar na
				// linha correspondente.

				System.out.println("Digite o dia que deseja pesquisar:");
				String resposta = scanner.next();
				double somaTemperaturas = 0;
				int diaDaSemanaEscolhido = -1; // corrigido

				// TODO: falta validar os dias com acento e com ç
				for (int i = 0; i < diasDaSemana.length; i++) {
					if (resposta.equalsIgnoreCase(diasDaSemana[i])) {
						diaDaSemanaEscolhido = i;
						for (int j = 0; j < matriz[diaDaSemanaEscolhido].length; j++) {
							somaTemperaturas += matriz[diaDaSemanaEscolhido][j];
						}
					}
				}

				double mediaTemperaturaDia = somaTemperaturas / colunas;
				System.out.printf("A média da temperatura no dia da semana de %s é %.2f°C\n",
						diasDaSemana[diaDaSemanaEscolhido], mediaTemperaturaDia);

				System.out.println("-------------------------------------------------------------");
				opcao = 0;

			} else if (opcao == 2) {
				// resolução B
				// b) A média da hora de todos os dias da semana. O usuário entrará com a hora,
				// por exemplo 15, então você deve pesquisar na coluna correspondente.

				System.out.println("Digite a hora do dia que deseja pesquisar:");
				int resposta = scanner.nextInt();
				double somaTemperaturas = 0;

				for (int i = 0; i < matriz.length; i++) {
					somaTemperaturas += matriz[i][resposta];
				}

				double mediaTemperaturaDia = somaTemperaturas / linhas;
				System.out.printf("A média da temperatura na hora %d é %.2f°C\n", resposta, mediaTemperaturaDia);
				System.out.println("-------------------------------------------------------------");
				opcao = 0;
				continue;

			} else if (opcao == 3) {
				// resolução C
				// c) Qual dia da semana teve a maior amplitude térmica.

				for (int i = 0; i < matriz.length; i++) {
					double maiorTemperatura = Double.MIN_VALUE;
					double menorTemperatura = Double.MAX_VALUE;

					for (int j = 0; j < matriz[i].length; j++) {
						if (matriz[i][j] > maiorTemperatura) {
							maiorTemperatura = matriz[i][j];
						}
						if (matriz[i][j] < menorTemperatura) {
							menorTemperatura = matriz[i][j];
						}
					}
					matrizAmplitude[i] = maiorTemperatura - menorTemperatura;
					
					if (matrizAmplitude[i] > maiorAmplitude) {
						maiorAmplitude = matrizAmplitude[i];
						diaMaiorAmplitude = i;
					}
				}


				System.out.printf("O dia da semana com maior amplitude térmica foi %s, com %.2f°C de amplitude.\n",
						diasDaSemana[diaMaiorAmplitude], maiorAmplitude);
				System.out.println("-------------------------------------------------------------");
				opcao = 0;

			} else if (opcao == 4) {
				System.out.println("Fim do programa.");
			} else {
				System.out.println("Opção inválida, tente novamente.");
				opcao = 0;
			}
		}
		scanner.close();
	}

}
