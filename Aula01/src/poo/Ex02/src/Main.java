

public class Main {

    public static void main(String[] args) {

        /*
         * Crie uma classe denominada Mercado.
         * Essa classe terá 5 atributos, as informações que deverão ser guardadas são:
         * • Nome do mercado
         * • Número de maçãs vendidas por ano.
         * • Preço de venda das maçãs.
         * • Número de laranjas vendidas por ano.
         * • Preço de venda das laranjas.
         * Crie 3 objetos da classe Mercado chamados:
         * unidadeDeBlumenau
         * unidadeDeJoinville
         * unidadeDeFlorianopolis
         * Atribua valores a esses objetos
         */
        
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
