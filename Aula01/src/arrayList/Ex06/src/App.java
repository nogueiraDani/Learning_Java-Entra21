public class App {
    public static void main(String[] args) {
        
        Agenda agenda = new Agenda();

        agenda.adicionarContato(new Contato("Dani"));
        agenda.adicionarContato(new Contato("Ana"));
        agenda.adicionarContato(new Contato("Davi"));
        agenda.adicionarContato(new Contato("Dani"));
        agenda.adicionarContato(new Contato("José"));

        agenda.imprimirListaContatos();
        System.out.println("------");
        agenda.removerContatoDuplicado();
        agenda.imprimirListaContatos();

    }
}
