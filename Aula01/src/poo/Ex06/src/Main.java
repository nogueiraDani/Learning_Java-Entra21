public class Main {

    public static void main(String[] args) {

        /*
         * Utilizando a classe Mercado.
         * Atribua valores às variáveis da classe Mercado para cada um dos objetos de
         * Mercado.
         * Calcule:
         * a) Quem teve a maior receita vendendo maçãs?
         * b) Quem teve a maior receita vendendo laranjas?
         * c) Qual das lojas teve a maior receita?
         * d) Qual das lojas teve a menor receita?
         * e) Qual das lojas ficou no "meio" em termos de receita?
         * f) Juntando as 3 lojas, a franquia teve uma receita maior vendendo maçãs ou
         * laranjas?
         */

        Franquia franquia = new Franquia();

        Mercado mercados[] = new Mercado[3];

        for (int i = 0; i < mercados.length; i++) {
            mercados[i] = new Mercado();
        }

        franquia.mercados = mercados;

        // unidade Blumenau
        mercados[0].nome = "Mercado Blumenau";
        mercados[0].macasVendidasPorAno = 200;
        mercados[0].precoMacas = 2.50;
        mercados[0].laranjasVendidasPorAno = 150;
        mercados[0].precoLaranjas = 3.00;

        // unidade Joinville
        mercados[1].nome = "Mercado Joinville";
        mercados[1].macasVendidasPorAno = 100;
        mercados[1].precoMacas = 2.65;
        mercados[1].laranjasVendidasPorAno = 200;
        mercados[1].precoLaranjas = 1.89;

        // unidade Florianopolis
        mercados[2].nome = "Mercado Florianopolis";
        mercados[2].macasVendidasPorAno = 500;
        mercados[2].precoMacas = 5.00;
        mercados[2].laranjasVendidasPorAno = 350;
        mercados[2].precoLaranjas = 2.90;

        System.out.println(franquia.mostrarQuemTeveMaiorReceitaComMacas());
        System.out.println(franquia.mostrarQuemTeveMaiorReceitaComLaranjas());


    }

}
