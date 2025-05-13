package estruturas_de_selecao.aula_21_03_25;

import java.util.Scanner;

public class Ex16 {
 
    public static void main(String[] args) {
 
        /**
         * Dadas 3 notas obtidas por um aluno em 3 provas e a média dos exercícios,
         * descreva um algoritmo que calcule a média de aproveitamento e o conceito do aluno.
         * Usando a fórmula: média de aproveitamento = (notaProva1 + notaProva2 * 2 + notaProva3 * 3 + notaExercicios) / 7
         * A atribuição dos conceitos obedece à tabela abaixo:
         * média de aproveitamento conceito
         * >= 9.0 A
         * >= 7.5 e < 9.0 B
         * >= 6.0 e < 7.5 C
         * >= 4.0 e < 6.0 D
         * < 4.0 E
         * O algoritmo deve escrever a média de aproveitamento, o conceito
         * correspondente e a mensagem ‘aprovado’ caso o conceito seja A, B ou C, e ‘reprovado’ caso o
         * conceito
         * seja D ou E
         */
 
        Scanner scanner = new Scanner(System.in);
 
        double nota1, nota2, nota3, notaExercicios, mediaAproveitamento;
        boolean aprovado = false;
 
        System.out.println("Digite a 1º nota:");
        nota1 = scanner.nextDouble();
 
        System.out.println("Digite a 2º nota:");
        nota2 = scanner.nextDouble();
 
        System.out.println("Digite a 3º nota:");
        nota3 = scanner.nextDouble();
 
        System.out.println("Digite a nota dos exercicios:");
        notaExercicios = scanner.nextDouble();
 
        mediaAproveitamento = (nota1 + nota2 * 2 + nota3 * 3) / 7;
 
        System.out.print("A sua classificação é: ");
 
        if (mediaAproveitamento >= 9.0) {
            System.out.println("A");
            aprovado = true;
        } else if (mediaAproveitamento >= 7.5 && mediaAproveitamento < 9.0) {
            System.out.println("B");
            aprovado = true;
        } else if (mediaAproveitamento >= 6.0 && mediaAproveitamento < 7.5) {
            System.out.println("C");
            aprovado = true;
        } else if (mediaAproveitamento >= 4.0 && mediaAproveitamento < 6.0) {
            System.out.println("D");
        } else {
            System.out.println("E");
        }
 
        if (aprovado) {
            System.out.println("Parabéns, você foi aprovado!");
        } else {
            System.out.println("Não foi dessa vez, você está reprovado.");
        }
        
        scanner.close();
 
    }
 
}
