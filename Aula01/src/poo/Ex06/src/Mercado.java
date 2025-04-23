

public class Mercado {

    String nome;

    int macasVendidasPorAno;
    double precoMacas;

    int laranjasVendidasPorAno;
    double precoLaranjas;


    public double getReceitaComMacas() {
        return macasVendidasPorAno * precoMacas;
    }


    public double getReceitaComLaranjas() {
        return laranjasVendidasPorAno * precoLaranjas;
    }


    public double getReceitaTotal() {
        return getReceitaComMacas() + getReceitaComLaranjas();
    }

    

    

}
