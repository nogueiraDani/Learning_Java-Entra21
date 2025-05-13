package model;

import utils.TipoPorte;

public class Animal {

    private String raca;
    private String nome;
    private TipoPorte porte;
    private String habitat;
    private String pais;

    public Animal(String raca, String nome, TipoPorte porte, String habitat, String pais) {
        setRaca(raca);
        setNome(nome);
        setPorte(porte);
        setHabitat(habitat);
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        if (raca.isEmpty() || raca.isBlank()) {
            throw new IllegalArgumentException("Raça não pode ser vazia ou nula");
        }
        this.raca = raca;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome.isEmpty() || nome.isBlank()) {
            throw new IllegalArgumentException("Nome não pode ser vazio ou nulo");
        }
        this.nome = nome;
    }

    public TipoPorte getPorte() {
        return porte;
    }

    public void setPorte(TipoPorte porte) {
        if (porte == null) {
            throw new IllegalArgumentException("Porte não pode ser nulo");
        }
        this.porte = porte;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        if (habitat.isEmpty() || habitat.isBlank()) {
            throw new IllegalArgumentException("Habitat não pode ser vazio ou nulo");
        }
        this.habitat = habitat;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        if (pais.isEmpty() || pais.isBlank()) {
            throw new IllegalArgumentException("País não pode ser vazio ou nulo");
        }
        this.pais = pais;
    }

    @Override
    public String toString() {
        return "Animal [raca=" + raca + ", nome=" + nome + ", porte=" + porte + ", habitat=" + habitat + ", pais="
                + pais + "]";
    }

    

}
