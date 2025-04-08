package matrizes.aula_08_04_25;

public class Ex06 {

	public static void main(String[] args) {

		// Utilizando matrizes e laços de repetição, imprima as seguintes figuras:
		// a)
		// * * * *
		// * * * *
		// * * * *
		// * * * *

		// b)
		// * * * *
		// * *
		// * *
		// * * * *

		// c)
		// *
		// * *
		// * * *
		// * * * *

		String simbolo = "*";
		String vazio = " ";

		String respostaA[][] = new String[4][4];
		String respostaB[][] = new String[4][4];
		String respostaC[][] = new String[4][4];

		// populando a respostaA
		for (int i = 0; i < respostaA.length; i++) {
			for (int j = 0; j < respostaA[i].length; j++) {
				respostaA[i][j] = simbolo;
			}
		}

		// populando a respostaB
		for (int i = 0; i < respostaB.length; i++) {
			for (int j = 0; j < respostaB[i].length; j++) {
				if (i == 0 || i == 3) {
					respostaB[i][j] = simbolo;
				}

				if (i == 1 || i == 2) {
					if (j == 0 || j == 3) {
						respostaB[i][j] = simbolo;
					} else {
						respostaB[i][j] = vazio;
					}
				}
			}
		}

		// populando a respostaC

		for (int i = 0; i < respostaC.length; i++) {
			for (int j = 0; j < respostaC[i].length; j++) {

				if (i == 0) {
					if (j == 0) {
						respostaC[i][j] = simbolo;
					} else {
						respostaC[i][j] = vazio;
					}
				}

				if (i == 1) {
					if (j == 0 || j == 1) {
						respostaC[i][j] = simbolo;
					} else {
						respostaC[i][j] = vazio;
					}
				}

				if (i == 2) {
					if (j >= 0 && j <= 2) {
						respostaC[i][j] = simbolo;
					} else {
						respostaC[i][j] = vazio;
					}
				}

				if (i == 3) {
					respostaC[i][j] = simbolo;

				}
			}

		}

		System.out.println("------ Matriz A ------");
		for (int i = 0; i < respostaA.length; i++) {
			for (int j = 0; j < respostaA[i].length; j++) {
				System.out.print(respostaA[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println("------ Matriz B ------");
		for (int i = 0; i < respostaB.length; i++) {
			for (int j = 0; j < respostaB[i].length; j++) {
				System.out.print(respostaB[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println("------ Matriz C ------");
		for (int i = 0; i < respostaC.length; i++) {
			for (int j = 0; j < respostaC[i].length; j++) {
				System.out.print(respostaC[i][j] + " ");
			}
			System.out.println();
		}
	}

}
