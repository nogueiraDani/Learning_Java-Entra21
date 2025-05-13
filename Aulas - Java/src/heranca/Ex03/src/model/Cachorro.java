package model;
public class Cachorro extends Animal {

    public Cachorro(String especie, Boolean estimacao, Double peso) {
        super(especie, estimacao, peso);
    }

    @Override
    public String gerarSom() {
        return "Au-Au";
    }

}
