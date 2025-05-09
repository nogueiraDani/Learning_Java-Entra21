import java.util.ArrayList;
import java.util.List;

public class Loja {

    private List<Material> listaDeMateriais;
    private Estoque estoque;

    public Loja() {
        setListaDeMateriais();
        setEstoque();
    }

    public List<Material> getListaDeMateriais() {
        return listaDeMateriais;
    }

    public void setListaDeMateriais() {
        this.listaDeMateriais = new ArrayList<Material>();
    }

    public Estoque getEstoque() {
        return estoque;
    }

    public void setEstoque() {
        this.estoque = new Estoque();
    }

    public void adicionarMaterialNoEstoque(Material material, Integer quantidade) {
        listaDeMateriais.add(material);
        estoque.adicionarNoEstoque(material, quantidade);
    }

    public void venderMaterial(Material material, Integer quantidade) throws Exception {
        listaDeMateriais.remove(material);
        estoque.removerDoEstoque(material, quantidade);
    }

    public void colocarMaterialEmPromocao(Material material, Double desconto) {
        Double novoPreco = material.getPreco() - (material.getPreco() * desconto);
        material.setPreco(novoPreco);
    }

    public String descobrirMaterialMaisCaro() {
        Double maiorValor = 0.0;
        String nomeMaterialMaiorValor = "";

        if (listaDeMateriais.isEmpty()) {
            return "Não há materiais cadastrados.";
        }

        for (Material material : listaDeMateriais) {
            if (material.getPreco() > maiorValor) {
                maiorValor = material.getPreco();
                nomeMaterialMaiorValor = material.getDescricao();
            }
        }

        return nomeMaterialMaiorValor;
    }

    public String descobrirMaterialMaisCaroPorMetroCubico() {
        Double maiorValor = 0.0;
        String nomeMaterialMaiorValor = "";

        if (listaDeMateriais.isEmpty()) {
            return "Não há materiais cadastrados.";
        }

        for (Material material : listaDeMateriais) {
            if (material.getPreco() / material.getVolume() > maiorValor) {
                maiorValor = material.getPreco() / material.getVolume();
                nomeMaterialMaiorValor = material.getDescricao();
            }
        }

        return nomeMaterialMaiorValor;
    }

    public String descobrirMaterialMaisDenso() {
        Double maiorPeso = 0.0;
        String nomeMaterialMaiorPeso = "";

        if (listaDeMateriais.isEmpty()) {
            return "Não há materiais cadastrados.";
        }

        for (Material material : listaDeMateriais) {
            if (material.getPeso() > maiorPeso) {
                maiorPeso = material.getPeso();
                nomeMaterialMaiorPeso = material.getDescricao();
            }
        }

        return nomeMaterialMaiorPeso;

    }

    public String descobrirMaterialQueOcupaMaisEspaco() {
        Double maiorVolume = 0.0;
        String nomeMaterialMaiorVolume = "";

        if (listaDeMateriais.isEmpty()) {
            return "Não há materiais cadastrados.";
        }

        for (Material material : listaDeMateriais) {
            if (material.getVolume() * estoque.consultarEstoque(material) > maiorVolume) {
                maiorVolume = material.getVolume();
                nomeMaterialMaiorVolume = material.getDescricao();
            }
        }

        return nomeMaterialMaiorVolume;

    }

}
