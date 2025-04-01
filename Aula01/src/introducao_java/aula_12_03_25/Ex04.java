package introducao_java.aula_12_03_25;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {

		/**
		 * Escreva um programa que leia o número de um funcionário, seu nome, sua
		 * quantidade de horas trabalhadas, o valor que recebe por hora e calcule o
		 * salário desse funcionário. A seguir, mostre o número, nome e o salário do
		 * funcionário, com duas casas decimais
		 * 
		 */
		
	
		class Funcionario{
			
			private int numero;
			private String nome;
			private double horasTrabalhadas;
			private double valorPorHora;
			
			
			public Funcionario() {
			}
			
			
			public int getNumero() {
				return numero;
			}
			public void setNumero(int numero) {
				this.numero = numero;
			}
			public String getNome() {
				return nome;
			}
			public void setNome(String nome) {
				this.nome = nome;
			}
			public double getHorasTrabalhadas() {
				return horasTrabalhadas;
			}
			public void setHorasTrabalhadas(double horasTrabalhadas) {
				this.horasTrabalhadas = horasTrabalhadas;
			}
			public double getValorPorHora() {
				return valorPorHora;
			}
			public void setValorPorHora(double valorPorHora) {
				this.valorPorHora = valorPorHora;
			}
			
			
			public double calcularSalario() {
				return horasTrabalhadas * valorPorHora;
			}


			@Override
			public String toString() {
				return String.format("%d: %s - salário R$ %.2f", numero, nome, calcularSalario() );
			}
			
			
		}
		
		Scanner scanner = new Scanner(System.in);
		
		Funcionario funcionario = new Funcionario();
		
		System.out.println("Digite o numero do funcionario: ");
		funcionario.setNumero(scanner.nextInt());
		
		System.out.println("Digite o nome do funcionario: ");
		funcionario.setNome(scanner.next());
		
		System.out.println("Digite as horas trabalhadas: ");
		funcionario.setHorasTrabalhadas(scanner.nextDouble());
		
		System.out.println("Digite o valor da hora: ");
		funcionario.setValorPorHora(scanner.nextDouble());
		
		
		System.out.println(funcionario.toString());
		
		
		scanner.close();
		
	}

}
