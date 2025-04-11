package avaliacao_11_04_25;

import java.util.Scanner;

import javax.imageio.IIOParam;

public class Questao_01 {

	public static void main(String[] args) {

		/*
		 * Escreva um programa onde o usuário informa os dados dos lados de um triangulo
		 * depois verifique e imprima se ele é: Equilátero (três lados iguais),
		 * Isósceles (dois lados iguais), ou Escaleno (três lados diferentes).
		 */

		Scanner scanner = new Scanner(System.in);

		System.out.println("---- Descubra a classificação do triangulo. ----");
		System.out.println("------------------------------------------------");
		double[] lados = new double[3];
		int opcaoMenu = 1;
		boolean ladosInformados= false;

		// mostra o menu inicial
		while (opcaoMenu == 1) {
			System.out.println("""
					-------------------Menu-------------------------
					1- Informar os lados ---------------------------
					2- Mostrar classificação -----------------------
					3- Sair ----------------------------------------
					""");
			opcaoMenu = scanner.nextInt();

			// pedi pelo for as medidas das laterais do triangulo
			if (opcaoMenu == 1) {
				for (int i = 0; i < lados.length; i++) {
					System.out.printf("Digite o %dº lado -> ", i + 1);
					lados[i] = scanner.nextDouble();
				}
				
				ladosInformados = true;
				
				// após completar as medidas pede para seguir ou nao
				System.out.println("Medidas informadas, deseja descobrir a classificação? (S / N)");
				String resposta = scanner.next();

				while (!resposta.isEmpty()) {
					if (resposta.equalsIgnoreCase("s")) {
						opcaoMenu = 2;
						break;
					} else if (resposta.equalsIgnoreCase("n")) {
						System.out.println("Deseja sair do programa? (S / N)");
						String segundaResposta = scanner.next();
						if (segundaResposta.equalsIgnoreCase("s")) {
							opcaoMenu = 3;
							break;
						} else if (segundaResposta.equalsIgnoreCase("n")) {
							opcaoMenu = 1;
							break;
						} else {
							System.out.println("Opcao invalida.");
							continue;
						}
					}
				}
			}
			
			// classifica o triangulo e mostra a mensagem se houver dados informados
			if (opcaoMenu == 2) {
				if (ladosInformados) {
					if(lados[0] == lados[1] && lados[1] == lados[2]) {
						System.out
								.println("A classificação do triangulo conforme as medidas informadas é: Equilátero.");
					} else if (lados[0] == lados[1] && lados[1] != lados[2]) {
						System.out.println("A classificação do triangulo conforme as medidas informadas é: Isóceles.");
					} else {
						System.out.println("A classificação do triangulo conforme as medidas informadas é: Escaleno");
					}
					
				} else {
					System.out.println("Não há medidas informadas para o trianguilo.");
					opcaoMenu = 1;
				}
			}
			
			// finaliza o programa
			if (opcaoMenu == 3) {
				System.out.println("Fim do programa.");
				break;
			}
		}

		scanner.close();

	}

}
