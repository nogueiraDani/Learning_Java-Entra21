public class Franquia {

    Mercado mercados[];
    Double receitasComFrutas[][] = gerarReceitasComFrutas();
    Double receitasTotais[] = gerarReceitasTotais();

    // receitas com macas e laranjas
    public Double[][] gerarReceitasComFrutas() {

        Double receitasComFrutas[][] = new Double[mercados.length][2];

        for (int i = 0; i < receitasComFrutas.length; i++) {
            for (int j = 0; j < receitasComFrutas[i].length; j++) {
                if (j == 0) {
                    receitasComFrutas[i][j] = mercados[i].getReceitaComMacas();
                } else {
                    receitasComFrutas[i][j] = mercados[i].getReceitaComLaranjas();
                }
            }
        }

        return receitasComFrutas;
    }

    public Double[] gerarReceitasTotais() {

        Double receitasTotais[] = new Double[mercados.length];

        for (int i = 0; i < receitasTotais.length; i++) {
            receitasTotais[i] = mercados[i].getReceitaTotal();
        }

        return receitasTotais;
    }

    public String mostrarQuemTeveMaiorReceitaComMacas() {
        double maiorReceita = Double.MIN_VALUE;
        int indiceDaMaiorReceita = -1;

        for (int i = 0; i < mercados.length; i++) {
            for (int j = 0; j < receitasComFrutas.length; j++) {
                if (j == 0 && receitasComFrutas[i][j] > maiorReceita) {
                    maiorReceita = receitasComFrutas[i][j];
                    indiceDaMaiorReceita = i;
                }
            }
        }

        return String.format("A unidade de %s foi a que obteve maior receita com maças: R$ %.2f",
                mercados[indiceDaMaiorReceita].nome,
                receitasComFrutas[indiceDaMaiorReceita][0]);

    }

    public String mostrarQuemTeveMaiorReceitaComLaranjas() {
        double menorReceita = Double.MAX_VALUE;
        int indiceDaMaiorReceita = -1;

        for (int i = 0; i < mercados.length; i++) {
            for (int j = 0; j < receitasComFrutas.length; j++) {
                if (j == 0 && receitasComFrutas[i][j] < menorReceita) {
                    menorReceita = receitasComFrutas[i][j];
                    indiceDaMaiorReceita = i;
                }
            }
        }

        return String.format("A unidade de %s foi a que obteve menor receita com maças: R$ %.2f",
                mercados[indiceDaMaiorReceita].nome,
                receitasComFrutas[indiceDaMaiorReceita][0]);
    }

    //TODO: parei aqui, tá com erro pq o mercados[] mostra vazio.
}
