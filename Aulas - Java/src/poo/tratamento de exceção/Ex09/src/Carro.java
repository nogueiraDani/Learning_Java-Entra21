public class Carro {

    private int velocidade;

    public Carro() {
    }

    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        if (velocidade >= 0) {
            this.velocidade = velocidade;
        } else {
            throw new IllegalArgumentException("Velocidade inválida.");
        }
    }

    public void acelerar(int i) throws Exception {
        if (i < 20) {
            int novaVelocidade = getVelocidade() + i;
            setVelocidade(novaVelocidade);
        } else {
            setVelocidade(0);
            throw new Exception("Valor inválido para acelerar.");
        }
    }

    public void reduzir(int i) throws Exception {
        if (velocidade >= 0 && velocidade < 30) {
            setVelocidade(velocidade - i);
        } else {
            throw new Exception("Valor inválido para reduzir.");
        }
    }

}
