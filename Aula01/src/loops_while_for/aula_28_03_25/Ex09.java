package loops_while_for.aula_28_03_25;

import java.util.Scanner;

public class Ex09 {

	public static void main(String[] args) {

		/**
		 * Dado um determinado grupo de pessoas, descreva um algoritmo que a partir da
		 * altura e do sexo (sexo = 'M' ou 'm' para masculino e sexo = 'F' ou 'f' para
		 * feminino) de cada pessoa informe a média da altura das mulheres e a média de
		 * altura do grupo. A leitura deve ser finalizada ao digitar 0 para a altura.
		 */

		Scanner scanner = new Scanner(System.in);
		String genero = "f";
		double somaAlturasMulheres = 0;
		double somaAlturasHomens = 0;
		double mediaAlturaMulheres = 0;
		double mediaAlturaHomens = 0;
		int quantidadeMulheres = 0;
		int quantidadeHomens = 0;

		while ((genero.equalsIgnoreCase("f") || (genero.equalsIgnoreCase("m")))) {
			System.out.println("Digite o sexo:");
			genero = scanner.next();

			if (!genero.equals("0")) {

				System.out.println("Digite a altura:");
				double altura = scanner.nextDouble();

				if (altura >= 0 && altura <= 2.60) {

					if (genero.equalsIgnoreCase("f")) {
						quantidadeMulheres++;
						somaAlturasMulheres += altura;
						
					} else if (genero.equalsIgnoreCase("m")) {
						quantidadeHomens++;
						somaAlturasHomens += altura;
						
					}
					
				} else {
					System.out.println("Altura inválida");
				}
			}
		}
		
		if (quantidadeMulheres > 0) {
			mediaAlturaMulheres = somaAlturasMulheres / quantidadeMulheres;
			System.out.printf("A média de altura entre as %d mulheres é %.2f\n", quantidadeMulheres,
					mediaAlturaMulheres);
			
		} else {
			System.out.println("Não há mulheres cadastradas.");
		}

		if (quantidadeHomens > 0) {
			mediaAlturaHomens = somaAlturasHomens / quantidadeHomens;
			System.out.printf("A média de altura entre os %d homens é %.2f\n", quantidadeHomens, mediaAlturaHomens);
			
		} else {
			System.out.println("Não há homens cadastrados.");
		}
		scanner.close();

	}

}
