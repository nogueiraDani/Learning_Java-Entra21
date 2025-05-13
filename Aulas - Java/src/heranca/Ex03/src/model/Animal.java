package model;
public abstract class Animal {

    private String especie;
    private Boolean estimacao;
    private Double peso;

    public Animal(String especie, Boolean estimacao, Double peso) {
        setEspecie(especie);
        setEstimacao(estimacao);
        setPeso(peso);
    }

    public abstract String gerarSom();

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        if (especie.isEmpty() || especie.isBlank()) {
            throw new IllegalArgumentException("A espécia nao pode ser nula ou vazia.");
        }
        this.especie = especie;
    }

    public Boolean getEstimacao() {
        return estimacao;
    }

    public void setEstimacao(Boolean estimacao) {
        if (estimacao == null) {
            throw new IllegalArgumentException("A estimacao nao pode ser nula.");
        }
        this.estimacao = estimacao;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        if (peso == null || peso <= 0) {
            throw new IllegalArgumentException("O peso nao pode ser nulo ou igual a 0.");
        }
        this.peso = peso;
    }

}
