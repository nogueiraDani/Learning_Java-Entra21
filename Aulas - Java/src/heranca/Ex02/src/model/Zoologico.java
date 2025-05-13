package model;

import java.util.ArrayList;
import java.util.List;

public class Zoologico {

    private List<GatoSelvagem> listaGatosSelvagens;
    private List<Ave> listaAves;
    private List<Primata> listaPrimatas;

    public Zoologico() {
        setListaGatosSelvagens();
        setListaAves();
        setListaPrimatas();
    }

    public List<GatoSelvagem> getListaGatosSelvagens() {
        return listaGatosSelvagens;
    }

    public void setListaGatosSelvagens() {
        this.listaGatosSelvagens = new ArrayList<>();
    }

    public List<Ave> getListaAves() {
        return listaAves;
    }

    public void setListaAves() {
        this.listaAves = new ArrayList<>();
    }

    public List<Primata> getListaPrimatas() {
        return listaPrimatas;
    }

    public void setListaPrimatas() {
        this.listaPrimatas = new ArrayList<>();
    }

    public void adicionarAnimal(Animal animal) {
        if (animal.getClass() == GatoSelvagem.class) {
            listaGatosSelvagens.add((GatoSelvagem) animal);
        } else if (animal.getClass() == Ave.class) {
            listaAves.add((Ave) animal);
        } else if (animal.getClass() == Primata.class) {
            listaPrimatas.add((Primata) animal);
        } else {
            throw new IllegalArgumentException("Tipo de animal não suportado.");
        }
    }

    @Override
    public String toString() {
        return "Zoologico [listaGatosSelvagens=" + listaGatosSelvagens + ", listaAves=" + listaAves + ", listaPrimatas="
                + listaPrimatas + "]";
    }
    
}
