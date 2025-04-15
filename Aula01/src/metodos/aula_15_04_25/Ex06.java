package metodos.aula_15_04_25;

public class Ex06 {

    /*
     * Faça um método que receba um número, esse será o número "base"
     * Dentro do método, faça o usuário entrar com mais dois números
     * Imprima qual dos dois últimos números está mais perto do primeiro número
     * "base"
     * 
     */

    private static void descobrirOMaisProximo(int base, int j, int k) {

        int diferenca1 = 0;
        int diferenca2 = 0;

        if (j == k) {
            System.out.println("As diferenças são iguais.");
        } else {
            if (j > base) {
                diferenca1 = base - j;
            } else {
                diferenca1 = j - base;
            }

            if (k > base) {
                diferenca2 = base - k;
            } else {
                diferenca1 = k - base;
            }

            if (diferenca1 > diferenca2) {
                System.out.printf("O número %d está mais próximo de %d.\n", j, base);
            } else {
                System.out.printf("O número %d está mais próximo de %d.\n", k, base);
            }

        }

    }

    public static void main(String[] args) {

        descobrirOMaisProximo(2, 3, 3);
        descobrirOMaisProximo(2, 4, 9);
        descobrirOMaisProximo(2, 9, 4);

    }

}
