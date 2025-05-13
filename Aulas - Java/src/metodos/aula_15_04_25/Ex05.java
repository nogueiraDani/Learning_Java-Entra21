package metodos.aula_15_04_25;

import java.util.Scanner;

public class Ex05 {

    /*
     * Faça um código que receba duas entradas do usuário
     * Imprima essas duas entradas ao cubo se:
     * Algum dos dois números for 5 ou a soma deles for 5 ou a diferença deles for 5
     * Se nenhuma dessas condições forem satisfeitas, imprima o quadrado dos
     * números.
     * 
     */

    // refatorado com Clean Code
    
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int valores[] = obterValores(scanner);
        compararValores(valores);

        scanner.close();

    }

    public static void compararValores(int valores[]) {

        int somaNumeros = valores[0] + valores[1];
        int diferencaNumeros = valores[0] - valores[1];

        if (valores[0] == 5 || valores[1] == 5 || somaNumeros == 5 || diferencaNumeros == 5) {
            mostrarValorAoCubo(valores[0]);
            mostrarValorAoCubo(valores[1]);
        } else {
            mostrarValorAoQuadrado(valores[0]);
            mostrarValorAoQuadrado(valores[1]);
        }

    }

    public static void mostrarValorAoQuadrado(int i) {
            System.out.printf("Resultado de %d = %.1f.\n", i, Math.pow(i, 2));
    }

    public static void mostrarValorAoCubo(int i) {
            System.out.printf("Resultado de %d = %.1f.\n", i, Math.pow(i, 3));
    }

    public static int[] obterValores(Scanner scanner) {
        int QUANTIDADE_VALORES = 2;
        int valores[] = new int[QUANTIDADE_VALORES];
        for (int i = 0; i < QUANTIDADE_VALORES; i++) {
            System.out.println("Digite um numero:");
            valores[i] = scanner.nextInt();
        }

        return valores;
    }

}
