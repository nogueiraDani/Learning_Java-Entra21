import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.OptionalDouble;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        List<Double> listaDecimais = new ArrayList<>();

        try (Scanner scanner = new Scanner(System.in)) {
            while (true) {
                System.out.println("Digite um valor decimal:");

                try {
                    double valor = scanner.nextDouble();
                    if (valor > 0) {
                        listaDecimais.add(valor);
                    } else if (valor == 0) {
                        break;
                    } else {
                        throw new IllegalArgumentException("O valor deve ser maior que 0");
                    }
                } catch (java.util.InputMismatchException e) {
                    System.out.println("Valor inválido.");
                    scanner.next();
                    continue;
                }
            }

        }

        OptionalDouble mediaOptional = listaDecimais.stream()
                .mapToDouble(Double::doubleValue)
                .average();

        System.out.println(listaDecimais);
        System.out.println(Collections.min(listaDecimais));
        System.out.println(Collections.max(listaDecimais));
        System.out.println(mediaOptional.getAsDouble());
        
    }
}
