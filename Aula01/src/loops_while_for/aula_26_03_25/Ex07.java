package loops_while_for.aula_26_03_25;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {

		/**
		 * Escreva um algoritmo que leia o número de inscrição e a altura de um atleta e
		 * informe: • O número de inscrição e a altura do atleta mais alto; • O número
		 * de inscrição e a altura do atleta mais baixo; • A altura média do grupo de
		 * atletas. • A quantidade de atletas cadastrados A leitura deve ser finalizada
		 * ao digitar 0 para o número de inscrição.
		 * 
		 */

		Scanner scanner = new Scanner(System.in);

		int quantidadeDeAtletas = 0;
		String inscricao = "1";
		String inscricaoMaisAlto = "";
		String inscricaoMaisBaixo = "";
		double altura = 0;
		double alturaMaisAlto = Double.MIN_VALUE;
		double alturaMaisBaixo = Double.MAX_VALUE;
		double somaAlturas = 0;
		double mediaAlturas = 0;

		while (!inscricao.equals("0")) {
			
			System.out.println("Digite a inscrição:");
			inscricao = scanner.next();

			if (!inscricao.equals("0")) {
				System.out.println("Digite a altura:");
				altura = scanner.nextDouble();

				if (altura > 0 && altura <= 2.60) {

					if (altura > alturaMaisAlto) {

						alturaMaisAlto = altura;
						inscricaoMaisAlto = inscricao;

					}

					if (altura < alturaMaisBaixo) {

						alturaMaisBaixo = altura;
						inscricaoMaisBaixo = inscricao;
					}

					somaAlturas += altura;
					quantidadeDeAtletas++;
				}
				
			} else {
				System.out.println("Resultado:");
			}

		}

		if (quantidadeDeAtletas > 0) {
			
			mediaAlturas = somaAlturas / quantidadeDeAtletas;

			System.out.printf("O atleta mais alto tem a inscrição: %s e  a altura de %.2f m\n", inscricaoMaisAlto,
					alturaMaisAlto);
			System.out.printf("O atleta mais baixo tem a inscrição: %s e  a altura de %.2f m\n", inscricaoMaisBaixo,
					alturaMaisBaixo);
			System.out.printf("A média de altura dos %d atletas é %.2f. m \n", quantidadeDeAtletas, mediaAlturas);
			
		} else {
			System.out.println("Nenhum atleta cadastrado.");
		}

	}
}
