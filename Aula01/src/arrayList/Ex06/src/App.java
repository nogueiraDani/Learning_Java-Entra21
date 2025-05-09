import java.util.List;

public class App {
    public static void main(String[] args) {
        
        Agenda agenda = new Agenda();

        agenda.adicionarContato(new Contato("Dani"));
        agenda.adicionarContato(new Contato("Ana"));
        agenda.adicionarContato(new Contato("Davi"));
        agenda.adicionarContato(new Contato("Dani"));
        agenda.adicionarContato(new Contato("José"));

        agenda.removerContatoDuplicado();
        List<Contato> lista = agenda.getListContatos();
        List<Contato> listaRepetidos = agenda.getNomesRepetidos();

        for (Contato contato : lista) {
            System.out.println(contato.getNome());
        }

        System.out.println("--------");

        for (Contato contato : listaRepetidos) {
            System.out.println(contato.getNome());
        }
        

    }
}
