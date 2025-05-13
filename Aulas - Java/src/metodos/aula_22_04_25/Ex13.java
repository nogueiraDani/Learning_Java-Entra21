import java.util.Scanner;

public class Ex13 {

    /**
     * Faça um método que calcule o perímetro e outro que calcule a área de um
     * retângulo
     * passando a altura e largura como parâmetros
     * Retornar os valores calculados
     * 
     */

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Iniciando programa...");
        System.out.println("Digite o valor da altura:");
        double valorAltura = scanner.nextDouble();

        System.out.println("Digite o valor da largura:");
        double valorLargura = scanner.nextDouble();

        System.out.println(getAreaRetangulo(valorLargura, valorAltura));
        System.out.println(getPerimetroRetangulo(valorAltura, valorLargura));


        System.out.println();
        System.out.println("Finalizando programa...");

        scanner.close();


    }

    private static String getPerimetroRetangulo(double valor1, double valor2) {
        return String.format("O perimetro do retangulo é %.1f.", calcularPerimetroRetangulo(valor1, valor2));
    }

    private static Double calcularPerimetroRetangulo(double valor1, double valor2) {
        return valor1 + valor2 * 2; 
    }

    private static String getAreaRetangulo(double valor1, double valor2) {
        return String.format("A área do retangulo é %.1f.", calcularAreaRetangulo(valor1, valor2));
    }

    private static Double calcularAreaRetangulo(double valor1, double valor2) {
        return valor1 * valor2;
    }

}
