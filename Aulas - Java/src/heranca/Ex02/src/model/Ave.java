package model;

import utils.TipoPorte;

public class Ave extends Animal {

    private String corPenas;
    private String tipoAlimentacao;

    public Ave(String raca, String nome, TipoPorte porte, String habitat, String pais, String corPenas, String tipoAlimentacao) {
        super(raca, nome, porte, habitat, pais);
        setCorPenas(corPenas);
        setTipoAlimentacao(tipoAlimentacao);
    }

    public String getCorPenas() {
        return corPenas;
    }

    public void setCorPenas(String corPenas) {
        if (corPenas.isEmpty() || corPenas.isBlank()) {
            throw new IllegalArgumentException("Cor de penas não pode ser vazia ou nula");
        }
        this.corPenas = corPenas;
    }

    public String getTipoAlimentacao() {
        return tipoAlimentacao;
    }

    public void setTipoAlimentacao(String tipoAlimentacao) {
        if (tipoAlimentacao.isEmpty() || tipoAlimentacao.isBlank()) {
            throw new IllegalArgumentException("Cor de penas não pode ser vazia ou nula");
        }
        this.tipoAlimentacao = tipoAlimentacao;
    }

    @Override
    public String toString() {
        return "Ave [corPenas=" + corPenas + ", tipoAlimentacao=" + tipoAlimentacao + "]";
    }

    

}
