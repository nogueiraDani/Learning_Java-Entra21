public class Ex03 {

    /**
     * Faça um programa que exiba o número que o usuário entrou como parâmetro e os
     * 20 números que vem após esse número
     * (O parâmetro do método deve ser o número inserido pelo usuário)
     * 
     */

    public static void exibirNumeros(int numero) {
        System.out.printf("O numero digitado foi %d.\n", numero);
        System.out.println("Os 20 números que vem após esse número são: ");
        for (int i = 1; i <= 20; i++) {
            System.out.printf("%d ", numero + i);
        }
        System.out.println();
    }

    public static void main(String[] args) {

        exibirNumeros(15);

    }

}
