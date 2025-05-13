package matrizes.aula_04_04_25;

public class Ex04 {

	public static void main(String[] args) {

		/*
		 * Considere essa matriz: int[][] matriz = { {2104, 3, 399900}, {1600, 3,
		 * 329900}, {2400, 3, 369000}, {1416, 2, 232000}, {3000, 4, 539900}, {1985, 4,
		 * 299900}, {1534, 3, 314900}, {1427, 3, 199000}, {1380, 3, 212000}, {1494, 3,
		 * 242500}, {1940, 4, 240000}, {2000, 3, 347000}, {1890, 3, 330000}, {4478, 5,
		 * 699900}, {1268, 3, 259900} };
		 */

		// A primeira coluna é o tamanho da casa
		// A segunda coluna é a quantidade de quartos
		// A terceira coluna é o preço

		// Determinar:
		// a) Qual é a média dos preços das casas?
		// b) Quanto custa a menor casa?
		// c) Quantos quartos tem a casa mais cara?
		// d) Qual a diferença de tamanho da casa com o maior número de quartos para a
		// casa com o menor número de quartos?
		// e) Qual a média do tamanho das casas que custam mais de 300.000 mil?

		int[][] matriz = { { 2104, 3, 399900 }, { 1600, 3, 329900 }, { 2400, 3, 369000 }, { 1416, 2, 232000 },
				{ 3000, 4, 539900 }, { 1985, 4, 299900 }, { 1534, 3, 314900 }, { 1427, 3, 199000 }, { 1380, 3, 212000 },
				{ 1494, 3, 242500 }, { 1940, 4, 240000 }, { 2000, 3, 347000 }, { 1890, 3, 330000 }, { 4478, 5, 699900 },
				{ 1268, 3, 259900 } };

		double somaValorCasas = 0;
		double mediaValorCasas = 0;
		int tamanhoCasaMenor = Integer.MAX_VALUE;
		int valorCasaMenor = 0;
		int valorCasaMaisCara = Integer.MIN_VALUE;
		int quantidadeQuartosCasaMaisCara = 0;
		int tamanhoCasaComMaisQuartos = 0;
		int tamanhoCasaComMenosQuartos = 0;
		int quantidadeDeCasasAcima300 = 0;
		int somaTamanhoCasasAcima300 = 0;
		double mediaTamanhoCasasAcima300 = 0;
		int maiorQuantidadeDeQuartos = Integer.MIN_VALUE;
		int menorQuantidadeDeQuartos = Integer.MAX_VALUE;
		int diferencaTamanhoCasaMaisQuartoComCasaMenosQuartos = 0;

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {

				// buscando o tamanho da casa menor e seu valor
				if (j == 0) {
					if (matriz[i][j] < tamanhoCasaMenor) {
						tamanhoCasaMenor = matriz[i][j];
						valorCasaMenor = matriz[i][2];
					}
				}

				// buscando os tamanhos das casas com mais quartos e menos quartos
				if (j == 1) {
					if (matriz[i][j] > maiorQuantidadeDeQuartos) {
						maiorQuantidadeDeQuartos = matriz[i][j];
						tamanhoCasaComMaisQuartos = matriz[i][0];
					}
					if (matriz[i][j] < menorQuantidadeDeQuartos) {
						menorQuantidadeDeQuartos = matriz[i][j];
						tamanhoCasaComMenosQuartos = matriz[i][0];
					}
				}

				// buscando o valor da casa e adicionando a soma total
				if (j == 2) {
					somaValorCasas += matriz[i][j];

					// buscando q quantidade de quartos da casa mais cara
					if (matriz[i][j] > valorCasaMaisCara) {
						valorCasaMaisCara = matriz[i][j];
						quantidadeQuartosCasaMaisCara = matriz[i][1];
					}
					
					if(matriz[i][j] > 300000) {
						quantidadeDeCasasAcima300++;
						somaTamanhoCasasAcima300 += matriz[i][0];
					}
				}
			}
		}

		// calculando a média dos valores da casa
		mediaValorCasas = somaValorCasas / matriz.length;

		// calculando a diferença do tamanho das casas com mais e menos quartos
		diferencaTamanhoCasaMaisQuartoComCasaMenosQuartos = tamanhoCasaComMaisQuartos - tamanhoCasaComMenosQuartos;
		
		// calculando a media do tamanho das casas acima de 300
		mediaTamanhoCasasAcima300 = somaTamanhoCasasAcima300 / quantidadeDeCasasAcima300;

		
		System.out.printf("A média dos valores das casas é R$%.2f\n", mediaValorCasas);
		System.out.printf("O valor da casa menor é R$%d\n", valorCasaMenor);
		System.out.printf("A casa mais cara tem %d quartos.\n", quantidadeQuartosCasaMaisCara);
		System.out.printf("A diferença dos tamanhos das casa com mais quartos e menos quartos é %d.\n",
				diferencaTamanhoCasaMaisQuartoComCasaMenosQuartos);
		System.out.printf("A média do tamanho das casas acima de R$300.000,00 é %.2f\n", mediaTamanhoCasasAcima300);

	}

}
