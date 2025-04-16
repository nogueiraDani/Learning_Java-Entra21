package metodos.aula_16_04_25;

import java.util.Scanner;

public class Ex10 {

    /**
     * Faça um método booleano que retorne true se o número passado como parâmetro
     * seja par.
     * Retorne false caso seja ímpar.
     */

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um valor:");
        int valor = scanner.nextInt();

        boolean valorEhPar = descobrirSeValorEhPar(valor);
        System.out.printf("O valor %d é %s", valor, resultadoFinal(valorEhPar));

        scanner.close();
    }

    private static String resultadoFinal(boolean valorEhPar) {
        if (valorEhPar) {
            return "par";
        } else {
            return "ímpar";
        }
    }

    private static boolean descobrirSeValorEhPar(int valor) {
        return valor % 2 == 0;
    }

}
