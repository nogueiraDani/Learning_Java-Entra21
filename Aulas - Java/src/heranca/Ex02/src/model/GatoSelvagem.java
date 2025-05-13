package model;

import utils.CorPelo;
import utils.TipoMancha;
import utils.TipoPorte;

public class GatoSelvagem extends Animal {
    
    private CorPelo corPelo;
    private TipoMancha tipoMancha;

    public GatoSelvagem(String raca, String nome, TipoPorte porte, String habitat, String pais, CorPelo corPelo, TipoMancha TipoMancha) {
        super(raca, nome, porte, habitat, pais);
        setCorPelo(corPelo);
        setTipoMancha(TipoMancha);
    }

    public CorPelo getCorPelo() {
        return corPelo;
    }

    public void setCorPelo(CorPelo corPelo) {
        if (corPelo == null) {
            throw new IllegalArgumentException("Cor do pelo não pode ser nula");
        }
        this.corPelo = corPelo;
    }

    public TipoMancha getTipoMancha() {
        return tipoMancha;
    }

    public void setTipoMancha(TipoMancha tipoMancha) {
        if (tipoMancha == null) {
            throw new IllegalArgumentException("Tipo de mancha não pode ser nulo");
        }
        this.tipoMancha = tipoMancha;
    }

    @Override
    public String toString() {
        return "GatoSelvagem [corPelo=" + corPelo + ", tipoMancha=" + tipoMancha + "]";
    }
    
       

}
