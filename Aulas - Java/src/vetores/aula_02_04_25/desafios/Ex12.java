package vetores.aula_02_04_25.desafios;

import java.util.Arrays;
import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {

		/*
		 * Dado um vetor de números inteiros, com capacidade limitada a 50 elementos,
		 * faça um programa que construa um menu com as seguintes opções: - “1 – Incluir
		 * valor”: nesta opção inclua o valor no fim do vetor, se houver espaço. Informe
		 * o usuário se o valor foi incluído no vetor ou não; - “2 – Pesquisar valor”:
		 * nesta opção leia um valor e informe se o mesmo está no vetor; - “3 – Alterar
		 * valor”: nesta opção informe um número a ser alterado e um novo número a ser
		 * colocado no lugar (só para a primeira ocorrência deste número). Caso o número
		 * a ser alterado exista no vetor, substitua-o pelo novo número. Caso contrário,
		 * informe “número não encontrado”; - “4 – Excluir valor”: nesta opção leia um
		 * valor e, caso ele esteja no vetor, exclua-o. Informe o usuário se o valor foi
		 * excluído do vetor ou não. A posição que foi excluída o valor deve ser
		 * preenchido pelo valor seguinte, sucessivamente até o final dos valores do
		 * vetor; - “5 – Mostrar valores”: nesta opção mostre todos os valores
		 * armazenados no vetor; - “0 – Sair do sistema”: nesta opção deve ser
		 * finalizada a execução do programa. O menu deve-se repetir até que o usuário
		 * escolha a opção 0
		 */

		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite o tamanho do vetor que deseja manipular:");

		int quantidadeDeElementos = scanner.nextInt();
		int elementos[] = new int[quantidadeDeElementos];
		int opcaoMenu;
		String menu = """
				----------- Menu -----------
				1 - Incluir valor ----------
				2 - Pesquisar valor --------
				3 - Alterar valor ----------
				4 - Excluir valor ----------
				5 - Mostrar valores --------
				0 - Sair do sistema --------
				----------------------------
				""";
		boolean mostrarMenu = true;

		while (mostrarMenu) {
			System.out.print(menu);
			opcaoMenu = scanner.nextInt();

			if (opcaoMenu >= 0 && opcaoMenu < 6) {

				if (opcaoMenu == 1) {
					System.out.print("""
							------ Digite o valor ------
							""");
					int valor = scanner.nextInt();
					if (elementos[elementos.length - 1] == 0) {
						elementos[elementos.length - 1] = valor;
						System.out.printf("%d incluido na ultima posição do vetor.\n", valor);
					} else {
						System.out.printf("""
								A ultimca posicao do vetor está
								ocupada, o valor %d não foi adicionado.
								Tente outra opção.
								----------------------------
								""", valor);
					}
				}

				if (opcaoMenu == 2) {
					System.out.print("""
							------ Digite o valor ------
							""");
					int valor = scanner.nextInt();
					for (int i = 0; i < elementos.length; i++) {
						if (elementos[i] == valor) {
							System.out.printf("O valor %d está no vetor.\n", valor);
							break;
						}
					}
				}

				if (opcaoMenu == 3) {
					System.out.print("""
							------ Digite o valor a ser alterado ------
							""");
					int valorAntigo = scanner.nextInt();

					System.out.print("""
							----------- Digite o novo valor ------------
							""");
					int valorNovo = scanner.nextInt();
					boolean valorFoiEncontrado = false;

					for (int i = 0; i < elementos.length; i++) {
						if (elementos[i] == valorAntigo) {
							elementos[i] = valorNovo;
							valorFoiEncontrado = true;
							System.out.printf("O valor %d que estava na posicao %d  foi alterado para %d.\n",
									valorAntigo, i, valorNovo);
							break;
						}
					}

					if (!valorFoiEncontrado) {
						System.out.printf("O valor %d não foi encontrado.\n", valorAntigo);
					}
				}

				if (opcaoMenu == 4) {
					System.out.print("""
							------ Digite o valor a ser excluido ------
							""");
					int valor = scanner.nextInt();

					for (int i = 0; i < elementos.length; i++) {

						if (elementos[i] == valor && i != elementos.length - 1) {
							elementos[i] = elementos[i + 1];

							for (int j = i; j < elementos.length; j++) {
								if (j != elementos.length - 1) {
									elementos[j] = elementos[j + 1];
								}
								if (j == elementos.length - 1) {
									elementos[j] = 0;
								}
							}
						}

						if (elementos[i] == valor && i == elementos.length - 1) {
							elementos[i] = 0;
						}
					}
				}

				if (opcaoMenu == 5) {
					System.out.println(Arrays.toString(elementos));
				}

				if (opcaoMenu == 0) {
					mostrarMenu = false;
				}
			} else {
				System.out.println("Opçao inválida, escolha entre uma das opções abaixo:");
			}
		}
		scanner.close();

	}

}
