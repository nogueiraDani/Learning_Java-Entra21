import java.util.ArrayList;
import java.util.Collections;

public class App {
    public static void main(String[] args) {
        
        String palavra = "Amor";
        palavra.toLowerCase();
        
        StringBuilder palavraInvertida = new StringBuilder();

        ArrayList<Character> palavraInicial = new ArrayList<>();

        for (Character character : palavra.toCharArray()) {
            palavraInicial.add(character);
        }

        Collections.reverse(palavraInicial);

        for (Character character : palavraInicial) {
            palavraInvertida.append(character);
        }

        System.out.println(palavra);
        System.out.println(palavraInvertida);

        //TODO: -- PAREI AQUI -- falta fazer lowercase

        

    }
}
