import java.util.Scanner;

public class Ex11 {

    /**
     * Faça um programa que receba 2 números do usuário.
     * Faça um método que descubra qual dos números é maior e retorne esse valor.
     * Se os dois números forem iguais, retorne: número iguais.
     */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        iniciarPrograma();

        System.out.println("Digite um valor:");
        int valor1 = scanner.nextInt();

        System.out.println("Digite outro valor:");
        int valor2 = scanner.nextInt();

        String resultado = gerarResultado(valor1, valor2);
        System.out.println(resultado);

        finalizarPrograma();

        scanner.close();

    }

    private static void finalizarPrograma() {
        System.out.println("Finalizando programa.");
    }

    private static void iniciarPrograma() {
        System.out.println("Iniciando programa.");
    }

    private static String gerarResultado(int valor1, int valor2) {

        if (valor1 > valor2) {
            return String.format("O valor %d é maior que o %d.\n", valor1, valor2);
        } else if (valor2 > valor1) {
            return String.format("O valor %d é maior que o %d.\n", valor2, valor1);
        } else {
            return "Os valores são iguais.";
        }

    }

}
