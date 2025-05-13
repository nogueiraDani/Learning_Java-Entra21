public class FlorVendida {

    private String nome;
    private Double preco;
    private String nomeCliente;
    private Boolean foiPresente;

    public FlorVendida(String nome, Double preco, String nomeCliente, Boolean foiPresente) {
        setNome(nome);
        setPreco(preco);
        setNomeCliente(nomeCliente);
        setFoiPresente(foiPresente);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        if (preco > 0) {
            this.preco = preco;
        } else {
            throw new IllegalArgumentException("O preço deve ser maior que zero.");
        }
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public Boolean getFoiPresente() {
        return foiPresente;
    }

    public void setFoiPresente(Boolean foiPresente) {
        this.foiPresente = foiPresente;
    }

    @Override
    public String toString() {
        return "FlorVendida [nome=" + nome + ", preco=" + preco + ", nomeCliente=" + nomeCliente + ", foiPresente="
                + foiPresente + "]";
    }

    

}
