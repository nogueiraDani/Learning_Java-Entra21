import java.util.ArrayList;
import java.util.List;

public class Caderno {

    private List<Tarefa> listaTarefas;

    public Caderno() {
        listaTarefas = new ArrayList<>();
    }

    public void adicionarTarefa(Tarefa tarefa) throws Exception {
        for (Tarefa t : listaTarefas) {
            if (t.getNomeTarefa().equals(tarefa.getNomeTarefa())) {
                throw new Exception("A tarefa já está na lista.");
            }
        }
        listaTarefas.add(tarefa);
    }

    public void removerTarefa(String tarefa) throws Exception {
        Boolean temTarefa = false;
        for (Tarefa t : listaTarefas) {
            if (t.getNomeTarefa().equals(tarefa)) {
                listaTarefas.remove(t);
                temTarefa = true;
                break;
            }
        }

        if (!temTarefa) {
            throw new Exception("A tarefa não está na lista.");
        }
    }

    public void listarTarefas() {
        for (Tarefa tarefa : listaTarefas) {
            System.out.println(tarefa);
        }
    }

}
