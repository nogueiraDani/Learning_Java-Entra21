package loops_while_for.aula_28_03_25;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {

		/**
		 * Uma turma tem n alunos. Dado n, o nome (somente o primeiro nome) e idade de
		 * cada aluno descreva: a) os nomes dos alunos que tem 18 anos b) a quantidade
		 * de alunos que tem idade acima de 20 anos
		 */
		
		Scanner scanner = new Scanner(System.in);
		ArrayList<String> nomes = new ArrayList<String>();
		int quantidadeAlunos = 0;
		int quantidadeAlunosAcimaDe20 = 0;
		
		System.out.println("Digite quantos alunos quer verificar:");
		quantidadeAlunos = scanner.nextInt();
		
		for (int i = 0; i < quantidadeAlunos; i++) {
			System.out.println("Digite o primeiro nome:");
			String nome = scanner.next();
			
			System.out.println("Digite a idade:");
			int idade = scanner.nextInt();
			
			if (idade >= 0 ) {
				if (idade == 18) {
					nomes.add(nome);
				}
				
				if(idade >= 20) {
					quantidadeAlunosAcimaDe20++;
				}
			}
		}
		
		if(!nomes.isEmpty()) {
			System.out.println("Os alunos com 18 são:");
			
			for (String nome : nomes) {
				System.out.println(nome);
			}
		} else {
			System.out.println("Não há alunos com 18 anos cadastrados.");
		}
		
		if (quantidadeAlunosAcimaDe20 > 0 ) {
			System.out.printf("Há %d alunos com mais que 20 anos.\n", quantidadeAlunosAcimaDe20);
		} else {
			System.out.println("Não há alunos com mais que 20 anos cadastrados.");
		}
		scanner.close();
	}

}
