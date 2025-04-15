public class Ex05 {

    /*
     * Faça um código que receba duas entradas do usuário
     * Imprima essas duas entradas ao cubo se:
     * Algum dos dois números for 5 ou a soma deles for 5 ou a diferença deles for 5
     * Se nenhuma dessas condições forem satisfeitas, imprima o quadrado dos
     * números.
     * 
     */

    private static void imprimirValores(int i, int j) {

        int somaNumeros = i + j;
        int diferencaNumeros = i - j;

        if (i == 5 || j == 5 || somaNumeros == 5 || diferencaNumeros == 5) {
            System.out.printf("Resultado de %d = %.1f.\n", i, Math.pow(i, 3));
            System.out.printf("Resultado de %d = %.1f.\n", j, Math.pow(j, 3));
        } else {
            System.out.printf("Resultado de %d = %.1f.\n", i, Math.pow(i, 2));
            System.out.printf("Resultado de %d = %.1f.\n", j, Math.pow(j, 2));

        }

    }


    public static void main(String[] args) {

        imprimirValores(1, 2);
        
    }

}
