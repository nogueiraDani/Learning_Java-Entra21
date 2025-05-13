public class App {
    public static void main(String[] args) throws Exception {

        Caderno caderno = new Caderno();

        try {
            caderno.adicionarTarefa(new Tarefa("Ex1"));
            caderno.adicionarTarefa(new Tarefa("Ex2"));
            caderno.adicionarTarefa(new Tarefa("Ex3"));
            caderno.adicionarTarefa(new Tarefa("Ex4"));
            caderno.adicionarTarefa(new Tarefa("Ex5"));
            caderno.adicionarTarefa(new Tarefa("Ex6"));
            caderno.removerTarefa("Ex2");
            caderno.listarTarefas();
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage()); 
        }

    }
}
