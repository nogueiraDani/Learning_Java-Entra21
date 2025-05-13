import model.Cachorro;
import model.Gato;

public class App {
    public static void main(String[] args) {

        try {
            Gato g1 = new Gato("Persa", true, 3.0);
            System.out.println(g1.gerarSom());

            Cachorro c1 = new Cachorro("Rusky", true, 8.0);
            System.out.println(c1.gerarSom());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
