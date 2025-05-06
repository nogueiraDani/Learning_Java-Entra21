import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class App {
    public static void main(String[] args) {
        
        List<String> listaNomes = new ArrayList<>();

        listaNomes.add("José");
        listaNomes.add("Abreu");
        listaNomes.add("Claudio");
        listaNomes.add("Maria");
        
        System.out.println(listaNomes);

        Collections.sort(listaNomes);

        System.out.println(listaNomes);

        
    }
}
