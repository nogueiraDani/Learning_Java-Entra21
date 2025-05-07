import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {

        Caixa caixaDeRetangulos = new Caixa();

        try (Scanner scanner = new Scanner(System.in)) {
            int retangulosAdicionados = 0;
            while (retangulosAdicionados < 5) {
                System.out.printf("Digite a largura do %dº retangulo:\n", retangulosAdicionados + 1);
                double largura = scanner.nextDouble();

                System.out.printf("Digite a altura do %dº retangulo:\n", retangulosAdicionados + 1);
                double altura = scanner.nextDouble();
                scanner.nextLine();

                try {
                    caixaDeRetangulos.adicionarRetangulo(new Retangulo(altura, largura));
                    retangulosAdicionados++;
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            }

            if (!caixaDeRetangulos.getListaRetangulos().isEmpty()) {
                caixaDeRetangulos.imprimirRetanguloMaiorArea();
                caixaDeRetangulos.imprimirRetanguloMaiorPerimetro();
                caixaDeRetangulos.imiprirTodosOsRetangulos();
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
