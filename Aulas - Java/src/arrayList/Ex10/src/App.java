public class App {
    public static void main(String[] args) {

        Loja loja = new Loja();

        Material cod1 = new Material(
                TipoDeMaterial.AREIA,
                "areia fina",
                10.50,
                500.0,
                10.0);

        Material cod2 = new Material(
                TipoDeMaterial.CAL,
                "cal",
                12.50,
                300.0,
                5.0);

        Material cod3 = new Material(
                TipoDeMaterial.CIMENTO,
                "cimento x",
                60.00,
                100.0,
                50.0);

        Material cod4 = new Material(
                TipoDeMaterial.MADEIRA,
                "madeira y",
                45.00,
                250.0,
                32.0);

        try {
            loja.adicionarMaterialNoEstoque(cod1, 10);
            loja.adicionarMaterialNoEstoque(cod2, 15);
            loja.adicionarMaterialNoEstoque(cod3, 5);
            loja.adicionarMaterialNoEstoque(cod4, 25);

            loja.adicionarMaterialNoEstoque(cod4, 5);
            loja.venderMaterial(cod2, 3);

            loja.colocarMaterialEmPromocao(cod1, 0.15);

            System.out.printf(
                    "O material mais caro da loja é %s.\n",
                    loja.descobrirMaterialMaisCaro());

            System.out.printf(
                    "O material mais caro por metro cúbico da loja é %s.\n",
                    loja.descobrirMaterialMaisCaroPorMetroCubico());

            System.out.printf(
                    "O material mais denso da loja é %s.\n",
                    loja.descobrirMaterialMaisDenso());
            
            System.out.printf(
                    "O material que ocupa mais espaço na loja é %s.\n",
                    loja.descobrirMaterialQueOcupaMaisEspaco());

            // TODO: talvez tbm posso implemtar uma forma de imprimir o estoque

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        // TODO: está concluido, mas esse exercicio é um bom exemplo para fazer testes unitarios

    }
}
