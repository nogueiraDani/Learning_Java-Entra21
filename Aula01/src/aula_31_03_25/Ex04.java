package aula_31_03_25;

public class Ex04 {

	public static void main(String[] args) {

		/**
		 * Faça um algoritmo que atribua valores a um vetor de 100 posições de acordo
		 * com o quadrado do seu índice. Ex: [0] = 0 [1] = 1 [2] = 4 [3] = 9
		 * 
		 */
		
		int valores[] = new int[101];
		
		for (int i = 0; i < valores.length; i++) {
			valores[i] = (int) Math.pow(i, 2);
			
			System.out.printf("[%d] = %d\n", i, valores[i]);
		}

	}

}
