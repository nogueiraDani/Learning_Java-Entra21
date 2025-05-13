public class Retangulo {

    private Double altura;
    private Double largura;

    public Retangulo(Double altura, Double largura) throws Exception {
        setAltura(altura);
        setLargura(largura);
    }

    public Double calcularArea() {
        return getAltura() * getLargura();
    }

    public Double calcularPerimentro() {
        return (getAltura() + getLargura()) * 2;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) throws Exception {
        if (altura > 0) {
            this.altura = altura;
        } else {
            throw new IllegalArgumentException("A altura deve ser maior que 0");
        }
    }

    public Double getLargura() {
        return largura;
    }

    public void setLargura(Double largura) throws Exception {
        if (largura > 0) {
            this.largura = largura;
        } else {
            throw new IllegalArgumentException("A largura deve ser maior que 0");
        }
    }

    @Override
    public String toString() {
        return String.format("Retangulo:\n [altura=%.2fm,\n largura=%.2fm,\n area=%.2fm², \nperimetro=%.2fm]", getAltura(),
                getLargura(), calcularArea(), calcularPerimentro());
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((altura == null) ? 0 : altura.hashCode());
        result = prime * result + ((largura == null) ? 0 : largura.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Retangulo other = (Retangulo) obj;
        if (altura == null) {
            if (other.altura != null)
                return false;
        } else if (!altura.equals(other.altura))
            return false;
        if (largura == null) {
            if (other.largura != null)
                return false;
        } else if (!largura.equals(other.largura))
            return false;
        return true;
    }

    

}
