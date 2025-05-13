public class Cilindro extends Circulo {

    private Double altura;

    public Cilindro(String cor, Double raio, Double altura) {
        super(cor, raio);
        setAltura(altura);
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        if (altura <= 0) {
            throw new IllegalArgumentException("Altura inválida.");
        }
        this.altura = altura;
    }

    public Double calcularVolume() {
        return super.calcularArea() * altura;
    }

}
