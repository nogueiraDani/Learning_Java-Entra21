public class Material {


    private TipoDeMaterial tipo;
    private String descricao;
    private Double preco;
    private Double volume;
    private Double peso;
    private Integer quantidadeEmEstoque;

    public Material(TipoDeMaterial tipo, String descricao, Double preco, Double volume, Double peso,
            Integer quantidadeEmEstoque) {
        setTipo(tipo);
        setDescricao(descricao);
        setPreco(preco);
        setVolume(volume);
        setPeso(peso);
        setQuantidadeEmEstoque(quantidadeEmEstoque);
    }

    public TipoDeMaterial getTipo() {
        return tipo;
    }
    public void setTipo(TipoDeMaterial tipo) {
        this.tipo = tipo;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public Double getPreco() {
        return preco;
    }
    public void setPreco(Double preco) {
        this.preco = preco;
    }
    public Double getVolume() {
        return volume;
    }
    public void setVolume(Double volume) {
        this.volume = volume;
    }
    public Double getPeso() {
        return peso;
    }
    public void setPeso(Double peso) {
        this.peso = peso;
    }
    public Integer getQuantidadeEmEstoque() {
        return quantidadeEmEstoque;
    }
    public void setQuantidadeEmEstoque(Integer quantidadeEmEstoque) {
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }

    

    


}
