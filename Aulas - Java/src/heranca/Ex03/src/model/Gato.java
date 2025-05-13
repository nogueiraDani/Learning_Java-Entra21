package model;

public class Gato extends Animal {

    public Gato(String especie, Boolean estimacao, Double peso) {
        super(especie, estimacao, peso);
    }

    @Override
    public String gerarSom() {
        return "Miau";
    }

}
