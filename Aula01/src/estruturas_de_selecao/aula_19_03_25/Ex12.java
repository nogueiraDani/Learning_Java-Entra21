package estruturas_de_selecao.aula_19_03_25;

import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {

		/**
		 * Faça um programa que funciona como um conversor universal. Primeiro o usuário
		 * escolhe se ele quer converter: temperatura, peso, comprimento ou volume.
		 * Depois, ele escolhe qual a unidade do valor que ele deseja converter Após
		 * isso, o usuário entra com o valor desejado Depois, ele escolhe para qual ele
		 * quer converter. As opções de temperatura, são: celsius, fahrenheit e kelvin.
		 * As opções de peso são: quilos, libras e onças As opções de comprimento são:
		 * metros, pés e polegadas As opções de volume são: litros, galão líquido e
		 * onças líquidas
		 */

		Scanner scanner = new Scanner(System.in);

		boolean opcaoConversorValida = true;
		int opcaoConversor, opcaoUnidadeMedidaAtual, opcaoUnidadeMedidaDesejada;
		double valorInicial, valorConvertido;

		// menu inicial
		System.out.println("Calculadora universal");
		System.out.println("--------------------------");
		System.out.println("O que deseja converter:");
		System.out.println("1 - temperatura");
		System.out.println("2 - peso");
		System.out.println("3 - comprimento");
		System.out.println("4 - volume");
		opcaoConversor = scanner.nextInt();

		// valida opcao do menu inicial
		if (opcaoConversor < 1 || opcaoConversor > 4) {
			opcaoConversorValida = false;
			System.out.println("Opção inválida");
		}

		// incia o pedido das opçoes
		if (opcaoConversorValida) {
			System.out.println("--------------------------");
			System.out.print("Informe a unidade de medida atual");

			// menu para opcao de temperatura
			if (opcaoConversor == 1) {
				System.out.println(" da temperatura: ");
				System.out.println("1 - celsius");
				System.out.println("2 - fahrenheit");
				System.out.println("3 - kelvin");

				opcaoUnidadeMedidaAtual = scanner.nextInt();

				// menu para opçcao de temperatura Celsius
				if (opcaoUnidadeMedidaAtual == 1) {
					System.out.println("Para qual unidade deseja converter: ");
					System.out.println("1 - fahrenheit");
					System.out.println("2 - kelvin");
					opcaoUnidadeMedidaDesejada = scanner.nextInt();

					// convertendo para fahrenheit
					if (opcaoUnidadeMedidaDesejada == 1) {
						System.out.println("Digite o valor em celsisus:");
						valorInicial = scanner.nextDouble();
						valorConvertido = (valorInicial * 9 / 5) + 32;
						System.out.printf("%.1f°C = %.1f°F", valorInicial, valorConvertido);
						// convertendo para kelvin
					} else if (opcaoUnidadeMedidaDesejada == 2) {
						System.out.println("Digite o valor em celsisus:");
						valorInicial = scanner.nextDouble();
						valorConvertido = valorInicial + 273.15;
						System.out.printf("%.1f°C = %.2fK", valorInicial, valorConvertido);
						// opçao incorreta
					} else {
						System.out.println("Opção inválida");
					}

					// menu para opcao de temperatura fahrenheit
				} else if (opcaoUnidadeMedidaAtual == 2) {
					System.out.println("Para qual unidade deseja converter: ");
					System.out.println("1 - celsius");
					System.out.println("2 - kelvin");
					opcaoUnidadeMedidaDesejada = scanner.nextInt();

					// convertendo para celsius
					if (opcaoUnidadeMedidaDesejada == 1) {
						System.out.println("Digite o valor em fahrenheit:");
						valorInicial = scanner.nextDouble();
						valorConvertido = (valorInicial - 32) * 5 / 9;
						System.out.printf("%.1f°F = %.1f°C", valorInicial, valorConvertido);

						// convertendo para kelvin
					} else if (opcaoUnidadeMedidaDesejada == 2) {
						System.out.println("Digite o valor em fahrenheit:");
						valorInicial = scanner.nextDouble();
						valorConvertido = (valorInicial - 32) * 5 / 9 + 273.15;
						System.out.printf("%.1f°F = %.3fK", valorInicial, valorConvertido);

						// opcao incorreta
					} else {
						System.out.println("Opção inválida");
					}

					// menu para opcao de temperatura kelvin
				} else if (opcaoUnidadeMedidaAtual == 3) {
					System.out.println("Para qual unidade deseja converter: ");
					System.out.println("1 - celsius");
					System.out.println("2 - fahrenheit");
					opcaoUnidadeMedidaDesejada = scanner.nextInt();

					// convertendo para celsius
					if (opcaoUnidadeMedidaDesejada == 1) {
						System.out.println("Digite o valor em kelvin:");
						valorInicial = scanner.nextDouble();
						valorConvertido = valorInicial - 273.15;
						System.out.printf("%..3fK = %.1f°C", valorInicial, valorConvertido);

						// convertendo para fahrenheit
					} else if (opcaoUnidadeMedidaDesejada == 2) {
						System.out.println("Digite o valor em kelvin:");
						valorInicial = scanner.nextDouble();
						valorConvertido = (valorInicial - 273.15) * 9 / 5 + 32;
						System.out.printf("%.3fK = %.2fF", valorInicial, valorConvertido);

						// opcao incorreta
					} else {
						System.out.println("Opção inválida");
					}
				}

				// menu para opcao de peso
			} else if (opcaoConversor == 2) {
				System.out.println(" do peso: ");
				System.out.println("1 - quilos");
				System.out.println("2 - libras");
				System.out.println("3 - onças");
				opcaoUnidadeMedidaAtual = scanner.nextInt();

				// menu para opçcao de peso quilos
				if (opcaoUnidadeMedidaAtual == 1) {
					System.out.println("Para qual unidade deseja converter: ");
					System.out.println("1 - libras");
					System.out.println("2 - onças");
					opcaoUnidadeMedidaDesejada = scanner.nextInt();

					// convertendo para libras
					if (opcaoUnidadeMedidaDesejada == 1) {
						System.out.println("Digite o valor em quilos:");
						valorInicial = scanner.nextDouble();
						valorConvertido = valorInicial * 2.205;
						System.out.printf("%.2f quilos = %.3f libras", valorInicial, valorConvertido);

						// convertendo para onças
					} else if (opcaoUnidadeMedidaDesejada == 2) {
						System.out.println("Digite o valor em quilos:");
						valorInicial = scanner.nextDouble();
						valorConvertido = valorInicial * 35.274;
						System.out.printf("%.2f quilos = %.3f onças", valorInicial, valorConvertido);

						// opcao incorreta
					} else {
						System.out.println("Opção inválida");
					}

					// menu para opçcao de peso libras
				} else if (opcaoUnidadeMedidaAtual == 2) {
					System.out.println("Para qual unidade deseja converter: ");
					System.out.println("1 - quilos");
					System.out.println("2 - onças");
					opcaoUnidadeMedidaDesejada = scanner.nextInt();

					// convertendo para quilos
					if (opcaoUnidadeMedidaDesejada == 1) {
						System.out.println("Digite o valor em libras:");
						valorInicial = scanner.nextDouble();
						valorConvertido = valorInicial / 2.205;
						System.out.printf("%.2f libras = %.2f quilos", valorInicial, valorConvertido);

						// convertendo para onças
					} else if (opcaoUnidadeMedidaDesejada == 2) {
						System.out.println("Digite o valor em libras:");
						valorInicial = scanner.nextDouble();
						valorConvertido = valorInicial * 16;
						System.out.printf("%.2f libras = %.2f onças", valorInicial, valorConvertido);

						// opcao incorreta
					} else {
						System.out.println("Opção inválida");
					}

					// menu para opçcao de peso onças
				} else if (opcaoUnidadeMedidaAtual == 3) {
					System.out.println("Para qual unidade deseja converter: ");
					System.out.println("1 - quilos");
					System.out.println("2 - libras");
					opcaoUnidadeMedidaDesejada = scanner.nextInt();

					// convertendo para quilos
					if (opcaoUnidadeMedidaDesejada == 1) {
						System.out.println("Digite o valor em onças:");
						valorInicial = scanner.nextDouble();
						valorConvertido = valorInicial / 35.274;
						System.out.printf("%.2f onças = %.2f quilos", valorInicial, valorConvertido);

						// convertendo para libras
					} else if (opcaoUnidadeMedidaDesejada == 2) {
						System.out.println("Digite o valor em onças:");
						valorInicial = scanner.nextDouble();
						valorConvertido = valorInicial / 16;
						System.out.printf("%.2f onças = %.3f libras", valorInicial, valorConvertido);

						// opcao incorreta
					} else {
						System.out.println("Opção inválida");
					}
				}

				// menu para opcao de comprimento
			} else if (opcaoConversor == 3) {
				System.out.println(" do comprimento: ");
				System.out.println("1 - metros");
				System.out.println("2 - pés");
				System.out.println("3 - polegadas");

				opcaoUnidadeMedidaAtual = scanner.nextInt();

				// menu para opçcao de comprimento em metros
				if (opcaoUnidadeMedidaAtual == 1) {
					System.out.println("Para qual unidade deseja converter: ");
					System.out.println("1 - pés");
					System.out.println("2 - polegadas");
					opcaoUnidadeMedidaDesejada = scanner.nextInt();

					// convertendo para pés
					if (opcaoUnidadeMedidaDesejada == 1) {
						System.out.println("Digite o valor em metros:");
						valorInicial = scanner.nextDouble();
						valorConvertido = valorInicial * 3.281;
						System.out.printf("%.2f metros = %.2f pés", valorInicial, valorConvertido);

						// convertendo para polegadas
					} else if (opcaoUnidadeMedidaDesejada == 2) {
						System.out.println("Digite o valor em metros:");
						valorInicial = scanner.nextDouble();
						valorConvertido = valorInicial * 39.37;
						System.out.printf("%.2f metros = %.2f polegadas", valorInicial, valorConvertido);

						// opcao incorreta
					} else {
						System.out.println("Opção inválida");
					}

					// menu para opçcao de comprimento em pés
				} else if (opcaoUnidadeMedidaAtual == 2) {
					System.out.println("Para qual unidade deseja converter: ");
					System.out.println("1 - metros");
					System.out.println("2 - polegadas");
					opcaoUnidadeMedidaDesejada = scanner.nextInt();

					// convertendo para metros
					if (opcaoUnidadeMedidaDesejada == 1) {
						System.out.println("Digite o valor em pés:");
						valorInicial = scanner.nextDouble();
						valorConvertido = valorInicial / 3.281;
						System.out.printf("%.2f pés = %.2f metros", valorInicial, valorConvertido);

						// convertendo para polegadas
					} else if (opcaoUnidadeMedidaDesejada == 2) {
						System.out.println("Digite o valor em pés:");
						valorInicial = scanner.nextDouble();
						valorConvertido = valorInicial * 12;
						System.out.printf("%.2f metros = %.2f polegadas", valorInicial, valorConvertido);

						// opcao incorreta
					} else {
						System.out.println("Opção inválida");
					}

					// menu para opçcao de comprimento em pés
				} else if (opcaoUnidadeMedidaAtual == 2) {
					System.out.println("Para qual unidade deseja converter: ");
					System.out.println("1 - metros");
					System.out.println("2 - polegadas");
					opcaoUnidadeMedidaDesejada = scanner.nextInt();

					// convertendo para metros
					if (opcaoUnidadeMedidaDesejada == 1) {
						System.out.println("Digite o valor em pés:");
						valorInicial = scanner.nextDouble();
						valorConvertido = valorInicial / 3.281;
						System.out.printf("%.2f pés = %.2f metros", valorInicial, valorConvertido);

						// convertendo para polegadas
					} else if (opcaoUnidadeMedidaDesejada == 2) {
						System.out.println("Digite o valor em pés:");
						valorInicial = scanner.nextDouble();
						valorConvertido = valorInicial * 12;
						System.out.printf("%.2f metros = %.2f polegadas", valorInicial, valorConvertido);

						// opcao incorreta
					} else {
						System.out.println("Opção inválida");
					}

					// menu para opçcao de comprimento em polegadas
				} else if (opcaoUnidadeMedidaAtual == 3) {
					System.out.println("Para qual unidade deseja converter: ");
					System.out.println("1 - metros");
					System.out.println("2 - pés");
					opcaoUnidadeMedidaDesejada = scanner.nextInt();

					// convertendo para metros
					if (opcaoUnidadeMedidaDesejada == 1) {
						System.out.println("Digite o valor em polegadas:");
						valorInicial = scanner.nextDouble();
						valorConvertido = valorInicial / 39.37;
						System.out.printf("%.2f polegadas = %.2f metros", valorInicial, valorConvertido);

						// convertendo para pés
					} else if (opcaoUnidadeMedidaDesejada == 2) {
						System.out.println("Digite o valor em polegadas:");
						valorInicial = scanner.nextDouble();
						valorConvertido = valorInicial / 12;
						System.out.printf("%.2f polegadas = %.2f pés", valorInicial, valorConvertido);

						// opcao incorreta
					} else {
						System.out.println("Opção inválida");
					}

				}

				// menu para opcao de volume
			} else {
				System.out.println(" do volume: ");
				System.out.println("1 - litros");
				System.out.println("2 - galão líquido");
				System.out.println("3 - onças líquidas");

				opcaoUnidadeMedidaAtual = scanner.nextInt();

				// menu para opçcao de volume em litros
				if (opcaoUnidadeMedidaAtual == 1) {
					System.out.println("Para qual unidade deseja converter: ");
					System.out.println("1 - galão líquido");
					System.out.println("2 - onças líquidas");
					opcaoUnidadeMedidaDesejada = scanner.nextInt();

					// convertendo para galão líquido
					if (opcaoUnidadeMedidaDesejada == 1) {
						System.out.println("Digite o valor em litros:");
						valorInicial = scanner.nextDouble();
						valorConvertido = valorInicial / 3.785;
						System.out.printf("%.2f litros = %.2f galões amreicanos", valorInicial, valorConvertido);

						// convertendo para onças líquidas
					} else if (opcaoUnidadeMedidaDesejada == 2) {
						System.out.println("Digite o valor em litros:");
						valorInicial = scanner.nextDouble();
						valorConvertido = valorInicial * 33.814;
						System.out.printf("%.2f liquido = %.2f onças líquidas", valorInicial, valorConvertido);

						// opcao incorreta
					} else {
						System.out.println("Opção inválida");
					}

					// menu para opçcao de volume em galão líquido
				} else if (opcaoUnidadeMedidaAtual == 2) {
					System.out.println("Para qual unidade deseja converter: ");
					System.out.println("1 - litros");
					System.out.println("2 - onças líquidas");
					opcaoUnidadeMedidaDesejada = scanner.nextInt();

					// convertendo para litros
					if (opcaoUnidadeMedidaDesejada == 1) {
						System.out.println("Digite o valor em galão líquido:");
						valorInicial = scanner.nextDouble();
						valorConvertido = valorInicial * 3.785;
						System.out.printf("%.2f galões líquidos = %.2f litros", valorInicial, valorConvertido);

						// convertendo para onças líquidas
					} else if (opcaoUnidadeMedidaDesejada == 2) {
						System.out.println("Digite o valor em galão líquido:");
						valorInicial = scanner.nextDouble();
						valorConvertido = valorInicial * 128;
						System.out.printf("%.2f galões líquidos = %.2f litros", valorInicial, valorConvertido);

						// opcao incorreta
					} else {
						System.out.println("Opção inválida");
					}

					// menu para opçcao de volume em onças líquidas
				} else if (opcaoUnidadeMedidaAtual == 3) {
					System.out.println("Para qual unidade deseja converter: ");
					System.out.println("1 - litros");
					System.out.println("2 - galão líquido");
					opcaoUnidadeMedidaDesejada = scanner.nextInt();

					// convertendo para litros
					if (opcaoUnidadeMedidaDesejada == 1) {
						System.out.println("Digite o valor em onças líquidas:");
						valorInicial = scanner.nextDouble();
						valorConvertido = valorInicial / 33.814;
						System.out.printf("%.2f onças líquidas = %.2f litros", valorInicial, valorConvertido);

						// convertendo para galões líquidos
					} else if (opcaoUnidadeMedidaDesejada == 2) {
						System.out.println("Digite o valor em onças líquidas:");
						valorInicial = scanner.nextDouble();
						valorConvertido = valorInicial / 128;
						System.out.printf("%.2f onças líquidas = %.2f galões líquidos", valorInicial, valorConvertido);

						// opcao incorreta
					} else {
						System.out.println("Opção inválida");
					}
				}
			}

		}
	}

}
