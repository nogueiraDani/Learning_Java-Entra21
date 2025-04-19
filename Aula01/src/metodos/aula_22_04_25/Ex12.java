import java.util.Scanner;

public class Ex12 {

    /**
     * Faça um programa que calcule o quadrado de um número caso esse número seja
     * par e
     * o dobro desse número caso esse número seja ímpar.
     * Retorne o resultado
     * 
     */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Iniciando programa...");
        System.out.println("Digite um valor:");
        int valor = scanner.nextInt();

        System.out.println(calcularValor(valor));
        System.out.println("Finalizando programa...");

        scanner.close();
        
    }

    private static String calcularValor(int valor) {
    
        if (valor % 2 == 0) {
            return String.format("%d é par, o resultado é %.1f.\n", valor, Math.pow(valor, 2));

        } else {
            return String.format("%d é ímpar, o resultado é %d.\n", valor, valor * 2);
        }
    }

}
