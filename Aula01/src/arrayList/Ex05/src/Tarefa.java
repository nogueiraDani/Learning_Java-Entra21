public class Tarefa {

    private String nomeTarefa;

    public Tarefa(String nome) {
        setNomeTarefa(nome);
    }

    public String getNomeTarefa() {
        return nomeTarefa;
    }

    public void setNomeTarefa(String nomeTarefa) {
        this.nomeTarefa = nomeTarefa;
    }

    @Override
    public String toString() {
        return "Tarefa [nomeTarefa=" + nomeTarefa + "]";
    }

    


}
