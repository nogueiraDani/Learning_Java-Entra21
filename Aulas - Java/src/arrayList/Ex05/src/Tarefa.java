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
        return "Tarefa: " + nomeTarefa;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nomeTarefa == null) ? 0 : nomeTarefa.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Tarefa other = (Tarefa) obj;
        if (nomeTarefa == null) {
            if (other.nomeTarefa != null)
                return false;
        } else if (!nomeTarefa.equals(other.nomeTarefa))
            return false;
        return true;
    }

    

    


}
