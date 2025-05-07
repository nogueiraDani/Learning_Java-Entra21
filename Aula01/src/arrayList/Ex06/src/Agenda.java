import java.util.ArrayList;
import java.util.List;

public class Agenda {

    private List<Contato> listContatos;

    public Agenda() {
        setListContatos();
    }

    public void setListContatos() {
        this.listContatos = new ArrayList<>();
    }

    public void adicionarContato(Contato contato) {
        listContatos.add(contato);
    }

    public List<Contato> removerContatoDuplicado() {
        List<Contato> listaSemDuplicados = new ArrayList<>();

        for (Contato contato : listContatos) {
            if (!listaSemDuplicados.contains(contato)) {
                listaSemDuplicados.add(contato);
            }
            //TODO: -- PAREI AQUI -- nao quero q essa funcao retorne algo, ela deve ser void
        }
        return listaSemDuplicados;
    }

    public void imprimirListaContatos() {
        for (Contato contato : listContatos) {
            System.out.println(contato);
        }
    }

    

}
