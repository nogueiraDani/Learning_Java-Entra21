import java.util.ArrayList;
import java.util.List;

public class Main {
        public static void main(String[] args) {


                List<Pessoa> pessoas = new ArrayList<>();

                pessoas.add(new Pessoa(
                                "aline",
                                "123.456.789-98",
                                "PR",
                                3500));

                pessoas.add(new Pessoa(
                                "bruna",
                                "123.456.789-89",
                                "SC",
                                7200));

                pessoas.add(new Pessoa(
                                "cris",
                                "123.456.987-98",
                                "SP",
                                25000));

                pessoas.add(new Pessoa(
                                "day",
                                "321.456.789-98",
                                "RS",
                                57000));

                pessoas.add(new Pessoa(
                                "eve",
                                "123.654.789-98",
                                "PR",
                                10500));

                if (pessoas.isEmpty()) {
                        System.out.println("Não há pessoas cadastradas para calcular IR.");
                } else {

                        int indiceMaiorDevedorDeIR = CalculadoraIR.getIndiceMaiorDevedorIR(pessoas);
                        int indiceMenorDevedorDeIR = CalculadoraIR.getIndiceMenorDevedorIR(pessoas);

                        System.out.printf("Quem paga mais imposto é %s, com renda anual de R$%.2f e IR de R$%.2f\n",
                                        pessoas.get(indiceMaiorDevedorDeIR).getNome(),
                                        pessoas.get(indiceMaiorDevedorDeIR).getRendaAnual(),
                                        CalculadoraIR.calcularImpostoAPagar(pessoas.get(indiceMaiorDevedorDeIR)));

                        System.out.printf("Quem paga menor imposto é %s, com renda anual de R$%.2f e IR de R$%.2f\n",
                                        pessoas.get(indiceMenorDevedorDeIR).getNome(),
                                        pessoas.get(indiceMenorDevedorDeIR).getRendaAnual(),
                                        CalculadoraIR.calcularImpostoAPagar(pessoas.get(indiceMenorDevedorDeIR)));

                        System.out.printf("O total de imposto pago pelos %d contrinuintes foi R$%.2f.\n",
                                        pessoas.size(),
                                        CalculadoraIR.getTotalDeImpostoPago(pessoas));
                }

        }
}
