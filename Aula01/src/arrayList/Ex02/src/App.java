import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class App {
    public static void main(String[] args) {

        List<Integer> listaNumeros = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < 10; i++) {
            listaNumeros.add(random.nextInt(50));
        }

        System.out.println(listaNumeros);

        Collections.reverse(listaNumeros);

        System.out.println(listaNumeros);


    }
}
