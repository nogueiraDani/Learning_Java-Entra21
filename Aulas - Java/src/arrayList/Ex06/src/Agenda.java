import java.util.ArrayList;
import java.util.List;

public class Agenda {

    private List<Contato> listContatos;
    private List<Contato> nomesRepetidos;

    public Agenda() {
        setListContatos();
        setListNomesRepetidos();
    }

    public void setListContatos() {
        this.listContatos = new ArrayList<>();
    }
    
    public void setListNomesRepetidos() {
        this.nomesRepetidos = new ArrayList<>();
    }

    public List<Contato> getListContatos() {
        return listContatos;
    }

    public List<Contato> getNomesRepetidos() {
        return nomesRepetidos;
    }    

    public void adicionarContato(Contato contato) {
        listContatos.add(contato);
    }

    public void removerContatoDuplicado() {
        for (Contato contato : listContatos) {
            if (nomesRepetidos.isEmpty()) {
                nomesRepetidos.add(contato);
            } else {
                if (nomesRepetidos.contains(contato)) {
                    listContatos.remove(contato);
                }
            }
        }
    }
}
