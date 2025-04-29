public enum Aliquotas {

    ISENTO (0.0),
    FAIXA_1 (0.058),
    FAIXA_2 (0.15),
    FAIXA_3 (0.275),
    FAIXA_4(0.3);
    
    private final double valor;

    Aliquotas(double valor) {
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }

}
