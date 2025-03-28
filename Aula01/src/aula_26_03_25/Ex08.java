package aula_26_03_25;

import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {

		/**
		 * Dada uma turma de alunos, contendo seu nome e nota de duas provas. Descreva
		 * um algoritmo para informar a média de cada aluno. Considere que a leitura dos
		 * dados deve ser finalizada quando o nome do aluno for “fim”.
		 * 
		 */

		Scanner scanner = new Scanner(System.in);
		String nome = "";

		while (!(nome.equalsIgnoreCase("fim"))) {

			System.out.println("Digite o nome:");
			nome = scanner.next();
			int notasValidas = 0;

			if (!(nome.equalsIgnoreCase("fim"))) {

				double somaNotas = 0;
				double mediaNota = 0;

				for (int i = 0; i < 2; i++) {
					System.out.printf("Digite a %d° nota:\n", (i + 1));
					double nota = scanner.nextDouble();
					
					if (nota >=0 && nota <= 10 ) {
						somaNotas =+ nota;
						notasValidas ++;
					}
				}
				
				if (notasValidas == 2) {
					mediaNota = somaNotas / 2;
					System.out.printf("A média das notas de %s é %.2f\n", nome, mediaNota);
				} else {
					System.out.println("Impossivel de calcular a média, há alguma nota com valor incorreto.");
					break;
				}

			} else {
				System.out.println("Fim");
				break;
			}
		}

	}

}
