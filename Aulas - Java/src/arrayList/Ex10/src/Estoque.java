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

    public void removerDoEstoque(Material material, Integer quantidade) throws Exception {
        if (listaEstoque.containsKey(material)) {
            Integer quantidadeEmEstoque = listaEstoque.get(material);
            if (quantidadeEmEstoque >= quantidade) {
                listaEstoque.replace(material, listaEstoque.get(material) - quantidade);
            } else {
                throw new Exception(String.format(
                        "Não há %d %s no estoque.", quantidade, material.getDescricao()));
            }
        } else {
            throw new Exception(String.format("Não há %s no estoque.", material.getDescricao()));
        }
    }
    
    public Integer consultarEstoque(Material material) {
        return listaEstoque.get(material);
    }

}
