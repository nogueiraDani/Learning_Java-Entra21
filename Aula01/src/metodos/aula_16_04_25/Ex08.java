package metodos.aula_16_04_25;

import java.util.Scanner;

public class Ex08 {

    /**
     * Faça um programa em que o usuário entre com um número de 1 a 4
     * Com o número 1 sendo verão, 2 sendo outono...
     * Dependendo de o que o usuário informa, retorne:
     * É verão
     * E o tempo está quente.
     * Ou
     * É inverno
     * E está frio.
     * Faça um método para cada estação do ano
     * 
     */

    // Codigo feito baseado em Clean Code

    public static void processarEstacao(int resposta) {

        if (resposta == 1) {
            eixibirVerao();
        } else if (resposta == 2) {
            exibirOutono();
        } else if (resposta == 3) {
            exibirInverno();
        } else {
            exibirPrimavera();
        }

    }

    private static void exibirPrimavera() {
        System.out.println("Primavera");
    }

    private static void exibirInverno() {
        System.out.println("Inverno");
    }

    private static void exibirOutono() {
        System.out.println("Outono");
    }

    private static void eixibirVerao() {
        System.out.println("Verão");
    }

    public static int obterCodigoEstacao(Scanner scanner) {
        int codigoDigitado;

        do {
            System.out.println("Digite um valor, entre 1 e 4:");
            codigoDigitado = scanner.nextInt();

        } while (!ehCodigoValido(codigoDigitado));

        return codigoDigitado;

    }

    public static boolean ehCodigoValido(int resultado) {

        return resultado >= 1 && resultado <= 4;
    }

    public static void iniciarPrograma() {
        System.out.println("Desubra a estação");
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        iniciarPrograma();
        int resposta = obterCodigoEstacao(scanner);
        processarEstacao(resposta);

        scanner.close();
    }

}
