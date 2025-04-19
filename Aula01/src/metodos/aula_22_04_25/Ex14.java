import java.util.Scanner;

public class Ex14 {

    /**
     * Faça um programa que receba 3 notas do usuário e informe a média aritmética
     * dessas notas
     * Retorne a média
     */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Iniciando...");

        int quantidadeNotas = 1;

        while (quantidadeNotas != 0) {
            quantidadeNotas = perguntarQuantidadeNotas(scanner);

            double notas[] = obterNotas(scanner, quantidadeNotas);
            double somaNotas = obterSomaNotas(notas);
            System.out.println(mostrarMediaNotas(somaNotas, quantidadeNotas));
        }

        System.out.println("Finalizando...");

        scanner.close();

    }

    private static String mostrarMediaNotas(double somaNotas, int quantidadeNotas) {
        double media = somaNotas / quantidadeNotas;
        if (quantidadeNotas > 0) {
            return String.format("A média das notas é: %.1f.", media);
        } else {
            return "Não há notas lançadas.";
        }

    }

    private static double obterSomaNotas(double[] notas) {
        double soma = 0;
        for (int i = 0; i < notas.length; i++) {
            soma += notas[i];
        }

        return soma;
    }

    private static double[] obterNotas(Scanner scanner, int quantidadeNotas) {
        double notas[] = new double[quantidadeNotas];
        for (int i = 0; i < notas.length; i++) {
            System.out.println("Digite a nota");
            double nota = scanner.nextDouble();
            if (notaEhValida(nota)) {
                notas[i] = nota;
            } else {
                i--;
            }
        }
        return notas;
    }

    private static boolean notaEhValida(double nota) {
        return nota >= 0;
    }

    private static int perguntarQuantidadeNotas(Scanner scanner) {
        System.out.println("Quantas notas deseja incluir?");
        int resposta = scanner.nextInt();
        if (resposta > 0) {
            return resposta;
        } else {
            return 0;
        }
    }

}
