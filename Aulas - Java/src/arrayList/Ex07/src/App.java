import java.util.ArrayList;
import java.util.Collections;

public class App {
    public static void main(String[] args) {
        
        String palavra = "Amor";
        String palavraLower = palavra.toLowerCase();
        
        // Converte a palavra para uma lista de caracteres
        ArrayList<Character> caracteres = new ArrayList<>();
        for (char c : palavraLower.toCharArray()) {
            caracteres.add(c);
        }
        
        // Cria uma cópia da lista e inverte
        ArrayList<Character> caracteresInvertidos = new ArrayList<>(caracteres);
        Collections.reverse(caracteresInvertidos);
        
        // Verifica se a lista original é igual à lista invertida
        if (caracteres.equals(caracteresInvertidos)) {
            System.out.println("'" + palavra + "' é um palíndromo!");
        } else {
            System.out.println("'" + palavra + "' NÃO é um palíndromo.");
        }

    }
}
