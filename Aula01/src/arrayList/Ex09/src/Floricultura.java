import java.util.ArrayList;
import java.util.List;

public class Floricultura {

    private List<FlorVendida> listaFloresVendidas;

    public Floricultura() {
        setListaFloresVendidas(listaFloresVendidas);
    }

    public void setListaFloresVendidas(List<FlorVendida> listaFloresVendidas) {
        this.listaFloresVendidas = new ArrayList<>();
    }

    public void adicionarFloresVendidas(FlorVendida florVendida) {
        if (!listaFloresVendidas.contains(florVendida)) {
            listaFloresVendidas.add(florVendida);
        } else {
            throw new IllegalArgumentException("A flor já foi vendida.");
        }
    }

    public void removerFloresVendidas(FlorVendida florVendida) {
        if (listaFloresVendidas.contains(florVendida)) {
            listaFloresVendidas.remove(florVendida);
        } else {
            throw new IllegalArgumentException("A flor não foi vendida.");
        }
    }

    public FlorVendida descobrirFlorMaisCara() {
        if (listaFloresVendidas.isEmpty()) {
            throw new IllegalArgumentException("Não há flores vendidas.");
        }

        Double valor = Double.MIN_VALUE;
        FlorVendida florMaisCara = null;

        for (FlorVendida flor : listaFloresVendidas) {
            if (flor.getPreco() > valor) {
                valor = flor.getPreco();
                florMaisCara = flor;
            }
        }
        return florMaisCara;
    }

    public String descobrirTipoMaiorReceita() {
        Double receitaComPresente = 0.0;
        Double receitaSemPresente = 0.0;

        for (FlorVendida flor : listaFloresVendidas) {
            if (flor.getFoiPresente()) {
                receitaComPresente += flor.getPreco();
            }
            if (!flor.getFoiPresente()) {
                receitaSemPresente += flor.getPreco();
            }
        }

        return receitaComPresente > receitaSemPresente ? "Com presente" : "Sem presente";
    }

}
