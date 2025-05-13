public class Circulo {

    private String cor;
    private Double raio;

    public Circulo(String cor, Double raio){
        setCor(cor);
        setRaio(raio);
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        if (cor.isEmpty() || cor.isBlank()) {
            throw new IllegalArgumentException("Cor inválida.");
        }
        this.cor = cor;
    }

    public Double getRaio() {
        return raio;
    }

    public void setRaio(Double raio) {
        if (raio <= 0) {
            throw new IllegalArgumentException("Raio inválido.");
        }
        this.raio = raio;
    }

    public Double calcularArea() {
        return Math.PI * Math.pow(raio, 2);
    }

}
