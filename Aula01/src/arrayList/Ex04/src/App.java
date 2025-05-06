import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        List<Integer> listNumeros = new ArrayList<>();
        Random random = new Random();
        int valorDigitado;
        Integer indice;

        for (int i = 0; i < 20; i++) {
            listNumeros.add(random.nextInt(0, 50));
        }

        System.out.println("Tente descobrir um número:");
        System.out.println("Digite um valor entre 0 e 50");

        try (Scanner scanner = new Scanner(System.in)) {
            valorDigitado = scanner.nextInt();
            if (valorDigitado >= 0 && valorDigitado <= 50) {
                indice = listNumeros.indexOf(valorDigitado);
            } else {
                throw new IllegalArgumentException("Valor inválido, digite entre 0 e 50");
            }
            if (indice != -1) {
                System.out.println("Acertou.");
                System.out.printf("O número %d existe na posição %d.\n", valorDigitado, indice);
            } else {
                System.out.println("Errou!");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
