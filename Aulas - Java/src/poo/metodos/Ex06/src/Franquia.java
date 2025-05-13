import java.util.ArrayList;
import java.util.List;

public class Franquia {

    List<Mercado> mercados = new ArrayList<>();

    public int descobrirIndiceMercadoComMaiorVendaDeMacas() {
        double maiorVenda = Double.MIN_VALUE;
        int indiceMaiorVenda = -1;

        for (int i = 0; i < mercados.size(); i++) {
            double vendaMercado = mercados.get(i).getReceitaComMacas();
            if (vendaMercado > maiorVenda) {
                maiorVenda = vendaMercado;
                indiceMaiorVenda = i;

            }
        }

        return indiceMaiorVenda;
    }

    public int descobrirIndiceMercadoComMaiorVendaDeLaranjas() {
        double maiorVenda = Double.MIN_VALUE;
        int indiceMaiorVenda = -1;

        for (int i = 0; i < mercados.size(); i++) {
            double vendaMercado = mercados.get(i).getReceitaComLaranjas();
            if (vendaMercado > maiorVenda) {
                maiorVenda = vendaMercado;
                indiceMaiorVenda = i;

            }
        }

        return indiceMaiorVenda;
    }

    public int descobrirIndiceMercadoComMaiorReceita() {
        double maiorReceita = Double.MIN_VALUE;
        int indiceMaiorReceita = -1;

        for (int i = 0; i < mercados.size(); i++) {
            double receitaMercado = mercados.get(i).getReceitaTotal();
            if (receitaMercado > maiorReceita) {
                maiorReceita = receitaMercado;
                indiceMaiorReceita = i;

            }
        }

        return indiceMaiorReceita;

    }

    public int descobrirIndiceMercadoComMenorReceita() {
        double menorReceita = Double.MAX_VALUE;
        int indiceMenorReceita = -1;

        for (int i = 0; i < mercados.size(); i++) {
            double receitaMercado = mercados.get(i).getReceitaTotal();
            if (receitaMercado < menorReceita) {
                menorReceita = receitaMercado;
                indiceMenorReceita = i;

            }
        }

        return indiceMenorReceita;

    }

    public int descobrirIndiceMercadoComReceitaMedia() {
        int maiorReceita = descobrirIndiceMercadoComMaiorReceita();
        int menorReceita = descobrirIndiceMercadoComMenorReceita();
        int indice = -1;

        for (int i = 0; i < mercados.size(); i++) {
            if (i != maiorReceita && i != menorReceita) {
                indice = i;
            }
        }
        return indice;
    }

    public String descobrirReceitaTotalMaiorComMacasOuLaranjas() {
        double receitasTotaisDaFranquiaComMaca = descobrirReceitaTotalFranquiaComMacas();
        double receitasTotaisDaFranquiaComLaranja = descobrirReceitaTotalFranquiaComLaranjas();

        if (receitasTotaisDaFranquiaComMaca > receitasTotaisDaFranquiaComLaranja) {
            return "Maças";
        } else if (receitasTotaisDaFranquiaComMaca < receitasTotaisDaFranquiaComLaranja) {
            return "Laranja";
        } else {
            return "Iguais";
        }
        
    }

    private double descobrirReceitaTotalFranquiaComLaranjas() {
        double receita = 0;

        for (int i = 0; i < mercados.size(); i++) {
            receita += mercados.get(i).getReceitaComLaranjas();
        }

        return receita;
    }

    private double descobrirReceitaTotalFranquiaComMacas() {
        double receita = 0;

        for (int i = 0; i < mercados.size(); i++) {
            receita += mercados.get(i).getReceitaComMacas();
        }

        return receita;
    }

}
