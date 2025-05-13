import model.Ave;
import model.GatoSelvagem;
import model.Primata;
import model.Zoologico;
import utils.CorPelo;
import utils.TipoMancha;
import utils.TipoPorte;

public class App {
    public static void main(String[] args) {

        Zoologico zoo = new Zoologico();

        GatoSelvagem g1 = new GatoSelvagem(
                "Siames",
                "Ted",
                TipoPorte.PEQUENO,
                "Apartamento",
                "Brasil",
                CorPelo.PRETO,
                TipoMancha.AUSENTE);

        Ave a1 = new Ave(
                "Papagaio",
                "Louro",
                TipoPorte.PEQUENO,
                "Floresta",
                "Brasil",
                "Verde",
                "Vegetariano");

        Primata p1 = new Primata(
                "Gorila",
                "King Kong",
                TipoPorte.GRANDE,
                "Floresta",
                "Brasil");

        zoo.adicionarAnimal(g1);
        zoo.adicionarAnimal(a1);
        zoo.adicionarAnimal(p1);

        System.out.println(zoo.toString());
    }
}
