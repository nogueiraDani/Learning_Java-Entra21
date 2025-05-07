public class App {
    public static void main(String[] args) {

        try {
            Floricultura floricultura = new Floricultura();

            floricultura.adicionarFloresVendidas(new FlorVendida(
                    "Rosa",
                    10.0,
                    "João",
                    false));

            floricultura.adicionarFloresVendidas(new FlorVendida(
                    "Tulipa",
                    15.0,
                    "Maria",
                    true));

            floricultura.adicionarFloresVendidas(new FlorVendida(
                    "Margarida",
                    20.0,
                    "Pedro",
                    false));

            floricultura.adicionarFloresVendidas(new FlorVendida(
                    "Orquídea",
                    25.0,
                    "Ana",
                    true));

            floricultura.adicionarFloresVendidas(new FlorVendida(
                    "Girassol",
                    30.0,
                    "Carlos",
                    false));
            
            System.out.println(floricultura.descobrirFlorMaisCara());
            System.out.println(floricultura.descobrirTipoMaiorReceita());

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
