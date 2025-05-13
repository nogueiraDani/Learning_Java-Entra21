package introducao_java.aula_12_03_25;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {

		/**
		 * Faça um programa que leia o nome de um vendedor, o seu salário fixo e o total
		 * de vendas efetuadas por ele no mês (em valor). Sabendo que este vendedor
		 * ganha 15% de comissão sobre suas vendas efetuadas, informar o total a receber
		 * no final do mês, com duas casas decimais.
		 */

		class Vendedor {

			private String nome;
			private double salarioFixo;
			private double totalVendasMes;
			private final double comissao = 0.15;

			public Vendedor() {
			}

			public void setNome(String nome) {
				this.nome = nome;
			}

			public void setSalarioFixo(double salarioFixo) {
				this.salarioFixo = salarioFixo;
			}

			public void setTotalVendasMes(double totalVendasMes) {
				this.totalVendasMes = totalVendasMes;
			}

			@Override
			public String toString() {
				return String.format("O vendedor %s deve receber R$ %.2f", nome, calcularSalario());
			}

			public double calcularSalario() {
				return salarioFixo + (totalVendasMes * comissao);
			}

		}

		Scanner scanner = new Scanner(System.in);
		Vendedor vendedor = new Vendedor();

		System.out.println("Digite o nome do vendedor:");
		vendedor.setNome(scanner.next());

		System.out.println("Digite o salario fixo:");
		vendedor.setSalarioFixo(scanner.nextDouble());

		System.out.println("Digite o total de vendas:");
		vendedor.setTotalVendasMes(scanner.nextDouble());

		System.out.println(vendedor.toString());

		scanner.close();
	}

}
