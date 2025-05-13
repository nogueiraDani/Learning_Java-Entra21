package metodos.aula_15_04_25;

import java.util.Scanner;

public class Ex06 {

    /*
     * Faça um método que receba um número, esse será o número "base"
     * Dentro do método, faça o usuário entrar com mais dois números
     * Imprima qual dos dois últimos números está mais perto do primeiro número
     * "base"
     * 
     */

    // refatorado com Clean Code

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int valores[] = obterValores(scanner);
        descobrirOMaisProximo(valores);
        
    }

    public static void descobrirOMaisProximo(int valores[]) {

        int base = valores[0];
        int valor1 = valores[1];
        int valor2 = valores[2];

        int diferenca1 = 0;
        int diferenca2 = 0;

        if (valor1 == valor2) {
            System.out.println("As diferenças são iguais.");
        } else {

            // Math.abs -> busca o modulo do numero (-5 = 5, 5 = 5)
            diferenca1 = Math.abs(base - valor1);
            diferenca2 = Math.abs(base - valor2);

            if (diferenca1 < diferenca2) {
                System.out.printf("O número %d está mais próximo de %d.\n", valor1, base);
            } else {
                System.out.printf("O número %d está mais próximo de %d.\n", valor2, base);
            }

        }

    }

    public static int[] obterValores(Scanner scanner) {

        int QUANTIDADE_VALORES = 3;

        int valores[] = new int[QUANTIDADE_VALORES];

        for (int i = 0; i < valores.length; i++) {
            System.out.println("Digite um valor:");
            valores[i] = scanner.nextInt();
        }

        return valores;

    }

}
