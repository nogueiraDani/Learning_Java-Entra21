package metodos.aula_16_04_25;

import java.util.Scanner;

public class Ex09 {

    /**
     * Faça um método que receba 4 números como parâmetros, some os 4 números.
     * Retorne a soma.
     * 
     */

    // Codigo feito baseado em Clean Code

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        iniciarPrograma();
        int valores[] = obterValores(scanner);
        mostrarResultado(valores);
        finalizarPrograma();

        scanner.close();
        
    }

    public static void iniciarPrograma() {
        System.out.println("--- Somar 4 valores ---");
    }

    public static int[] obterValores(Scanner scanner) {
        int QUANTIDADE_VALORES = 4;
        int valores[] = new int[QUANTIDADE_VALORES];

        for (int i = 0; i < valores.length; i++) {
            System.out.println("Digite um valor");
            valores[i] = scanner.nextInt();
        }

        return valores;
    }

    public static int somar(int[] valores) {
        int soma = 0;

        for (int i = 0; i < valores.length; i++) {
            soma += valores[i];
        }

        return soma;
    }

    public static void mostrarResultado(int[] valores) {
        System.out.printf("A soma dos números é %d.\n", somar(valores));
    }

    public static void finalizarPrograma() {
        System.out.println("Finalizando programa...");
    }



}
