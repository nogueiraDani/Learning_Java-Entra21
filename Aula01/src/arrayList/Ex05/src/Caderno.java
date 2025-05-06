import java.util.ArrayList;
import java.util.List;

public class Caderno {

    private List<Tarefa> listaTarefas;

    public Caderno() {
        listaTarefas = new ArrayList<>();
    }

    public void adicionarTarefa(Tarefa tarefa) throws Exception {
        if (listaTarefas.isEmpty() || !listaTarefas.contains(tarefa)) {
            listaTarefas.add(tarefa);
        } else {
            throw new Exception("A tarefa já está na lista.");
        }
    }

    public void removerTarefa(String tarefa) throws Exception {
        boolean temTarefa = false;
        for (Tarefa t : listaTarefas) {
            if (t.getNomeTarefa().equals(tarefa)) {
                listaTarefas.remove(t);
                temTarefa = true;
            }
        }

        if (!temTarefa) {
            throw new Exception("A tarefa não está na lista.");
        }
    }

}
