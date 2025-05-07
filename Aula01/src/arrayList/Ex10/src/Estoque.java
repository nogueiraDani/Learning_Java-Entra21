import java.util.HashMap;

public class Estoque {

    private HashMap<Material, Integer> listaEstoque;

    public Estoque() {
        setListaEstoque();
    }

    private void setListaEstoque() {
        this.listaEstoque = new HashMap<Material, Integer>();
    }

    public void adicionarNoEstoque(Material material, Integer quantidade) {
        if (listaEstoque.containsKey(material)) {
            listaEstoque.put(material, listaEstoque.get(material) + quantidade);
        } else {
            listaEstoque.put(material, quantidade);
        }
    }

    public void removerDoEstoque(Material material, Integer quantidade) {
        if (listaEstoque.containsKey(material)) {
            listaEstoque.put(material, listaEstoque.get(material) - quantidade);
        } else {
            listaEstoque.put(material, -quantidade);
        }
        //TODO: -- PAREI AQUI --
    }
}
