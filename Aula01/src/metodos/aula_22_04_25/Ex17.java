import java.util.Scanner;

public class Ex17 {

    /**
     * Faça um código que recebe uma palavra do usuário, se essa palavra tem tamanho
     * impar, retorne o primeiro caractere dessa palavra.
     * Caso ela tenha tamanho par, retorne o segundo caractere dessa palavra.
     */

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        String palavra = pedirPalavra(scanner);
        System.out.println(imprimirCodigo(palavra));

        scanner.close();

    }

    private static String imprimirCodigo(String palavra) {
        char codigo = gerarCodigo(palavra);
        return String.format("O codigo gerado pela palavra = \"%s\" é %s.", palavra, codigo);
    }

    private static char gerarCodigo(String palavra) {
        if (palavra.length() % 2 == 0) {
            return palavra.charAt(1);
        } else {
            return palavra.charAt(0);
        }
    }

    private static String pedirPalavra(Scanner scanner) {
        System.out.println("Digite uma palavra:");
        return scanner.next();
    }

}
