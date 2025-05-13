package avaliacao_11_04_25;

import java.util.Scanner;

public class Questao_02 {

	public static void main(String[] args) {

		/**
		 * Uma grande loja de departamentos paga aos vendedores um salário variável com
		 * base nas vendas efetuadas durante o mês, que é igual a 17% de comissão sobre
		 * o preço de cada produto vendido. Cada vendedor, em um determinado mês, vende
		 * n reais em produtos. Deseja-se obter um relatório com: nome, total de vendas
		 * (em R$) e salário base de cada vendedor. Descreva um algoritmo que gere o
		 * relatório desejado. Para prosseguir com a entrada de um novo vendedor o
		 * algoritmo deve apresentar a seguinte mensagem: “deseja digitar os dados de
		 * mais um vendedor: s (SIM) / n (NÃO)
		 */

		Scanner scanner = new Scanner(System.in);

		double comissao = 0.17;
		double salarioFinal = 0;

		System.out.println("----- Cadastro de funcionarios -----");
		System.out.println("""
				Deseja cadastrar dados de um vendedor?
				s (Sim) / n (Não)""");
		String opcaoMenu = scanner.next();

		while (opcaoMenu.equalsIgnoreCase("s")) {

			System.out.println("Digite o nome:");
			String nome = scanner.next();

			System.out.println("Digite o sobrenome:");
			String sobrenome = scanner.next();

			String nomeCompleto = nome + " " + sobrenome;

			System.out.println("Digite o salário base em R$: ");
			double salarioBase = scanner.nextDouble();

			boolean[] dadosSaoValidos = { false, false };

			// validando se há salario base
			if (salarioBase > 0) {
				System.out.println("Digite o total de vendas em R$:");
				double totalVendas = scanner.nextDouble();
				dadosSaoValidos[0] = true;

				// validando se há vendas
				if (totalVendas > 0) {
					double valorComissao = totalVendas * comissao;
					salarioFinal = salarioBase + valorComissao;
					dadosSaoValidos[1] = true;

					while (dadosSaoValidos[0] == true && dadosSaoValidos[1] == true) {
						// mostrando o relatorio
						System.out.printf("-> Nome: %s\n", nomeCompleto);
						System.out.printf("-> Valor total das vendas R$%.2f\n", totalVendas);
						System.out.printf("-> Valor do salário base R$%.2f\n", salarioBase);
						System.out.printf("-> Salario final R$%.2f\n", salarioFinal);
						System.out.println("""
								Deseja cadastrar dados de um vendedor?
								s (Sim) / n (Não)""");
						opcaoMenu = scanner.next();
						dadosSaoValidos[0] = false;
						dadosSaoValidos[1] = false;

					}
				} else if (totalVendas == 0) {
					System.out.println("Não houve vendas no mes atual?(s / n)");
					String respostaVendas = scanner.next();

					if (respostaVendas.equalsIgnoreCase("s")) {

						dadosSaoValidos[0] = true;

						// TODO: melhorar essa validação da resposta n
					} else {
						dadosSaoValidos[0] = false;
					}
				}

			} else if (salarioBase == 0) {
				System.out.println("Não há salario base no mes atual?(s / n)");
				String respostaVendas = scanner.next();

				if (respostaVendas.equalsIgnoreCase("s")) {
					dadosSaoValidos[1] = true;
					continue;

					// TODO: melhorar essa validação da resposta n
				} else {
					dadosSaoValidos[1] = false;
				}
			}

		}
		if (opcaoMenu.equalsIgnoreCase("n")) {
			System.out.println("Fim do programa.");
		}

		scanner.close();

	}

}
