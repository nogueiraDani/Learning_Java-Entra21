package matrizes.aula_04_04_25;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {


		// Um cinema pretende fazer uma pesquisa para avaliar o grau de satisfação de seus clientes.
		// Trinta deles foram ouvidos e para cada um perguntou-se o sexo (1=feminino 2=masculino), uma 
		// nota para o cinema (zero até dez, valor inteiro) e a idade.
		// Baseado nisto faça um programa que informe:
		// - qual a nota média recebida pelo cinema;
		// - qual a nota média atribuída pelos homens;
		// - qual a nota atribuída pela mulher mais jovem;
		// - quantas das mulheres com mais de 50 anos deram nota superior à média recebida pelo 
		// cinema.
		// Não utilize vetores!

		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite quantas avaliacoes deseja fazer:");
		int quantidadeEntrevistas = scanner.nextInt();
		String perguntas[] = {"""
				Digite o seu gênero:
				1- feminino
				2- masculino""",
				"Digite a sua nota de 0 a 10:",
				"Digite a sua idade: "};
		
		int avaliacoes[][] = new int[quantidadeEntrevistas][3];
		boolean respostasSaoValidas[] = {true, true, true};
		
		
		for (int i = 0; i < avaliacoes.length; i++) {
			for (int j = 0; j < avaliacoes[i].length; j++) {
				// tentando fazer um while para validar as respostas
				while(respostasSaoValidas[j]) {
					System.out.println(perguntas[j]);
					int resposta = scanner.nextInt();
					
					// valida as respostas
					if((j == 0 && (resposta == 1 || resposta == 2) || (j == 1 && (resposta >= 0 && resposta <= 10)) || (j == 2 && ( resposta > 0)))) {
						avaliacoes[i][j] = scanner.nextInt();
						
					// muda o booelan da resposta
					} else {
						respostasSaoValidas[j] = false;
					}
					
					//TODO: parei aqui, mas ainda nao tá certo.
				}
			}
		}
		
		scanner.close();
		
	}

}
