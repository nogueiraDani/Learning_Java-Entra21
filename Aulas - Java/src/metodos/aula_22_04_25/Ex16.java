import java.util.Arrays;
import java.util.Scanner;

public class Ex16 {

    /**
     * Faça um programa que descubra:
     * a) O maior elemento de um vetor
     * b) O menor elemento
     * c) A média dos valores
     * Retorne esses valores
     * 
     */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int tamanhoDoVetor = pedirTamanhoVetor(scanner);

        int vetorNumeros[] = preencherVetor(scanner, tamanhoDoVetor);

        System.out.println(imprimirMaiorElmento(vetorNumeros));
        System.out.println(imprimirMenorElemento(vetorNumeros));
        System.out.println(imprimirMediaElementos(vetorNumeros));

        scanner.close();
    }

    private static String imprimirMediaElementos(int[] vetorNumeros) {
        double mediaDosElementos = descobrirMediaElementos(vetorNumeros);
        return String.format("A média dos valores do vetor %s é %.1f", Arrays.toString(vetorNumeros), mediaDosElementos);
    }

    private static double descobrirMediaElementos(int[] vetorNumeros) {
        int somaValoresVetores = descobrirSomaValores(vetorNumeros);
        return somaValoresVetores / vetorNumeros.length;
    }

    private static int descobrirSomaValores(int[] vetorNumeros) {
        int soma = 0;
        for (int i = 0; i < vetorNumeros.length; i++) {
            soma += vetorNumeros[i];
        }

        return soma;
    }

    private static String imprimirMenorElemento(int[] vetorNumeros) {
        int valorMinimo = descobrirValorMinimoVetor(vetorNumeros);
        return String.format("O maior valor do vetor %s é %d.",Arrays.toString(vetorNumeros), valorMinimo);

    }

    private static int descobrirValorMinimoVetor(int[] vetorNumeros) {
        int valorMinimo = Integer.MAX_VALUE;
        for (int i = 0; i < vetorNumeros.length; i++) {
            if (vetorNumeros[i] < valorMinimo) {
                valorMinimo = vetorNumeros[i];
            }
        }
        return valorMinimo;
        
    }

    private static String imprimirMaiorElmento(int[] vetorNumeros) {
        int valorMaximo = descobrirValorMaximoVetor(vetorNumeros);
        return String.format("O maior valor do vetor %s é %d.",Arrays.toString(vetorNumeros), valorMaximo);
    
    }

    private static int descobrirValorMaximoVetor(int[] vetorNumeros) {
        int valorMaximo = Integer.MIN_VALUE;
        for (int i = 0; i < vetorNumeros.length; i++) {
            if (vetorNumeros[i] > valorMaximo) {
                valorMaximo = vetorNumeros[i];
            }
        }
        return valorMaximo;
    }

    private static int[] preencherVetor(Scanner scanner, int tamanhoDoVetor) {
        int vetor[] = new int[tamanhoDoVetor];
        if (tamanhoDoVetor > 0) {
            for (int i = 0; i < vetor.length; i++) {
                System.out.println("Digite um valor:");
                vetor[i] = scanner.nextInt();
            }
        }
        return vetor;
    }

    private static int pedirTamanhoVetor(Scanner scanner) {
        System.out.println("Digite quantos elementos deseja no vetor:");
        int resposta = scanner.nextInt();

        if (validarTamanho(resposta)) {
            return resposta;
        } else {
            return 0;
        }
    }

    private static boolean validarTamanho(int resposta) {
        return resposta > 0;
    }

}
