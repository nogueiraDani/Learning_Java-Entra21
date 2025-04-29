public class Aeronave {

    String modelo;
    int quantidadeDePassageiros;
    double velocidadeMaxima;
    double capacidadeDeCombustivel;
    double queimaCombustivelPorMinuto;

    public Aeronave(String modelo, int quantidadeDePassageiros, double velocidadeMaxima, double capacidadeDeCombustivel,
            double queimaCombustivelPorMinuto) {
        this.modelo = modelo;
        this.quantidadeDePassageiros = quantidadeDePassageiros;
        this.velocidadeMaxima = velocidadeMaxima;
        this.capacidadeDeCombustivel = capacidadeDeCombustivel;
        this.queimaCombustivelPorMinuto = queimaCombustivelPorMinuto;
    }

    public double getEficiencia() {
        return capacidadeDeCombustivel / queimaCombustivelPorMinuto;
    }

    public double getTempoDeVoo() {
        return velocidadeMaxima * getEficiencia();
    }

    
}
