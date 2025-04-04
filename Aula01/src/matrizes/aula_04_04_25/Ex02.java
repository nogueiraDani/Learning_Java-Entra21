package matrizes.aula_04_04_25;

public class Ex02 {

	public static void main(String[] args) {

		// Calcule o determinante da matriz abaixo:
		// 4 12
		// 2 -3

		int matriz[][] = { { 4, 12 }, { 2, -3 } };
		int resultado = matriz[0][0] * matriz[1][1] - matriz[1][0] * matriz[0][1];
		
		System.out.printf("A determinante é %d\n", resultado);

	}

}
