

public class Main {

    public static void main(String[] args) {
        
        Mercado unidadeDeBlumenau = new Mercado();
        Mercado unidadeDeJoiville = new Mercado();
        Mercado unidadeDeFlorianopolis = new Mercado();

        // unidade Blumenau
        unidadeDeBlumenau.nome = "Mercado Blumenau";
        unidadeDeBlumenau.macasVendidasPorAno = 200;
        unidadeDeBlumenau.precoMacas = 2.50;
        unidadeDeBlumenau.laranjasVendidasPorAno = 150;
        unidadeDeBlumenau.precoLaranjas = 3.00;

        // unidade Joinville
        unidadeDeJoiville.nome = "Mercado Joinville";
        unidadeDeJoiville.macasVendidasPorAno = 100;
        unidadeDeJoiville.precoMacas = 2.65;
        unidadeDeJoiville.laranjasVendidasPorAno = 200;
        unidadeDeJoiville.precoLaranjas = 1.89;

        // unidade Florianopolis
        unidadeDeFlorianopolis.nome = "Mercado Florianopolis";
        unidadeDeFlorianopolis.macasVendidasPorAno = 500;
        unidadeDeFlorianopolis.precoMacas = 5.00;
        unidadeDeFlorianopolis.laranjasVendidasPorAno = 350;
        unidadeDeFlorianopolis.precoLaranjas = 2.90;

        System.out.println(unidadeDeBlumenau.macasVendidasPorAno);

    }

}
