import java.util.List;

public class CalculadoraIR {

    private static final double RENDA_ISENTA_ATE = 4000;
    private static final double RENDA_FAIXA_1_ATE = 9000;
    private static final double RENDA_FAIXA_2_ATE = 25000;
    private static final double RENDA_FAIXA_3_ATE = 35000;

    public static double calcularImpostoAPagar(Pessoa pessoa) {
        return pessoa.getRendaAnual() * getAliquota(pessoa);
    }

    public static double getAliquota(Pessoa pessoa) {
        double rendaAnual = pessoa.getRendaAnual();

        if (rendaAnual >= 0 && rendaAnual <= RENDA_ISENTA_ATE) {
            return Aliquotas.ISENTO.getValor();
        } else if (rendaAnual > RENDA_ISENTA_ATE && rendaAnual <= RENDA_FAIXA_1_ATE) {
            return Aliquotas.FAIXA_1.getValor();
        } else if (rendaAnual > RENDA_FAIXA_1_ATE && rendaAnual <= RENDA_FAIXA_2_ATE) {
            return Aliquotas.FAIXA_2.getValor();
        } else if (rendaAnual > RENDA_FAIXA_2_ATE && rendaAnual <= RENDA_FAIXA_3_ATE) {
            return Aliquotas.FAIXA_3.getValor();
        } else {
            return Aliquotas.FAIXA_4.getValor();
        }

    }

    public static int getIndiceMaiorDevedorIR(List<Pessoa> pessoas) {
        int indice = -1;
        double impostoDevido = Double.MIN_VALUE;

        for (int i = 0; i < pessoas.size(); i++) {
            double impostoAtual = calcularImpostoAPagar(pessoas.get(i));
            if (impostoAtual > impostoDevido) {
                impostoDevido = impostoAtual;
                indice = i;
            }
        }
        return indice;

    }

    public static int getIndiceMenorDevedorIR(List<Pessoa> pessoas) {
        int indice = -1;
        double impostoDevido = Double.MAX_VALUE;

        for (int i = 0; i < pessoas.size(); i++) {
            double impostoAtual = calcularImpostoAPagar(pessoas.get(i));
            if (impostoAtual < impostoDevido) {
                impostoDevido = impostoAtual;
                indice = i;
            }
        }
        return indice;
    }

    public static double getTotalDeImpostoPago(List<Pessoa> pessoas) {
        double totalImposto = 0;

        for (Pessoa pessoa : pessoas) {
            totalImposto += calcularImpostoAPagar(pessoa);
        }

        return totalImposto;
    }

}
