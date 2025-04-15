import java.util.Arrays;

public class Ex04 {

    /*
     * Faça um programa que descubra:
     * a) O maior elemento de um vetor
     * b) O menor elemento de um vetor
     * c) A média dos valores
     * (Criar um método para cada questão)
     * 
     */

    public static void descobrirMaiorElemento(int vetor[]) {
        /*
         * a) O maior elemento de um vetor
        
         */

        int maiorValor = Integer.MIN_VALUE;

        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] > maiorValor) {
                maiorValor = vetor[i];
            }
        }

        System.out.printf("O maior valor do vetor %s é: %d.\n", Arrays.toString(vetor), maiorValor);

    }
    
    private static void descobrirMenorElemento(int[] vetor) {
        /*
         * b) O menor elemento de um vetor
         */

        int menorValor = Integer.MAX_VALUE;

        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] < menorValor) {
                menorValor = vetor[i];
            }
        }

        System.out.printf("O menor valor do vetor %s é: %d.\n", Arrays.toString(vetor), menorValor);

    }
    
    public static void descobrirMediaDosElementos(int vetor[]) {
        /*
         * c) A média dos valores
         */

        int soma = 0;

        for (int i = 0; i < vetor.length; i++) {
            soma += vetor[i];
        }

        double media = soma / vetor.length;
    
        System.out.printf("A média dos valores dos elementos do vetor é %.1f.\n", media);
    }


    public static void main(String[] args) {

        int vetor[] = { 12, 9, 15, 65, 98, 45, 16, 2, 0 };

        descobrirMaiorElemento(vetor);

        descobrirMenorElemento(vetor);

        descobrirMediaDosElementos(vetor);

    }




}
