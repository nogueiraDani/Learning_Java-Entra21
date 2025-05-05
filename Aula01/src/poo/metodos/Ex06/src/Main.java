public class Main {

    public static void main(String[] args) {

        Franquia franquia = new Franquia();

        franquia.mercados.add(new Mercado());
        franquia.mercados.add(new Mercado());
        franquia.mercados.add(new Mercado());

        // unidade Blumenau
        franquia.mercados.get(0).nome = "Mercado Blumenau";
        franquia.mercados.get(0).macasVendidasPorAno = 200;
        franquia.mercados.get(0).precoMacas = 2.50;
        franquia.mercados.get(0).laranjasVendidasPorAno = 500;
        franquia.mercados.get(0).precoLaranjas = 3.00;

        // unidade Joinville
        franquia.mercados.get(1).nome = "Mercado Joinville";
        franquia.mercados.get(1).macasVendidasPorAno = 100;
        franquia.mercados.get(1).precoMacas = 2.65;
        franquia.mercados.get(1).laranjasVendidasPorAno = 200;
        franquia.mercados.get(1).precoLaranjas = 1.89;

        // unidade Florianopolis
        franquia.mercados.get(2).nome = "Mercado Florianopolis";
        franquia.mercados.get(2).macasVendidasPorAno = 500;
        franquia.mercados.get(2).precoMacas = 5.00;
        franquia.mercados.get(2).laranjasVendidasPorAno = 350;
        franquia.mercados.get(2).precoLaranjas = 2.90;

        System.out.printf("Quem teve a maior receita vendendo maçãs foi o %s.\n",
                franquia.mercados.get(franquia.descobrirIndiceMercadoComMaiorVendaDeMacas()).nome);
        
        System.out.printf("Quem teve a maior receita vendendo laranjas foi o %s.\n",
                franquia.mercados.get(franquia.descobrirIndiceMercadoComMaiorVendaDeLaranjas()).nome);

        System.out.printf("A loja que teve maior receita foi o %s.\n",
                franquia.mercados.get(franquia.descobrirIndiceMercadoComMaiorReceita()).nome);

        System.out.printf("A loja que teve menor receita foi o %s.\n",
                franquia.mercados.get(franquia.descobrirIndiceMercadoComMenorReceita()).nome);

        System.out.printf("A loja que ficou no meio em realçao a receita foi o %s.\n",
                franquia.mercados.get(franquia.descobrirIndiceMercadoComReceitaMedia()).nome);

        System.out.printf("A franquia teve maior recedita com %s.\n",
                franquia.descobrirReceitaTotalMaiorComMacasOuLaranjas());

        
        



    }

}
