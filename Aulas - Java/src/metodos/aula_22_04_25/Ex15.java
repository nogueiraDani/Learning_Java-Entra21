import java.util.Scanner;

public class Ex15 {

    /**
     * Faça um programa que diz se um número inserido está dentro de um limite
     * imposto pelo usuário
     * Por exemplo:
     * Usuário inseriu o limite máximo como 100.
     * Usuário inseriu o limite mínimo como 70.
     * Depois ele inseriu o número 80.
     * O retorno deve ser: 80 está nos limites impostos.
     */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        boolean limiteMaximaEhValida = false;
        boolean limiteMinimaEhValida = false;
        int limiteMaximo = 0;
        int limiteMinino = 0;

        while (!limiteMaximaEhValida) {
            System.err.println("Digite o limite maximo:");
            limiteMaximo = scanner.nextInt();

            if (!validarLimiteMaxima(limiteMaximaEhValida, limiteMaximo)) {
                limiteMaximo = 0;
                limiteMaximaEhValida = false;
            } else {
                limiteMaximaEhValida = true;
            }
        }

        while (!limiteMinimaEhValida) {
            System.err.println("Digite o limite mínimo:");
            limiteMinino = scanner.nextInt();

            if (!validarLimiteMinima(limiteMinimaEhValida, limiteMinino, limiteMaximo)) {
                limiteMinino = 0;
                limiteMinimaEhValida = false;
            } else {
                limiteMinimaEhValida = true;
            }
        }

        System.out.println("Digite um valor:");
        int resposta = scanner.nextInt();

        System.out.println(respostaEstaDentroDosLimites(resposta, limiteMinino, limiteMaximo));

        scanner.close();

    }

    

    private static String respostaEstaDentroDosLimites(int resposta, int limiteMinino, int limiteMaximo) {
        if (resposta >= limiteMinino && resposta <= limiteMaximo) {
            return String.format("O valor %d está dentro dos limites", resposta);
        } else {
            return String.format("O valor %d naõ está dentro dos limites", resposta);
        }
    }



    private static boolean validarLimiteMinima(boolean limiteMinimaEhValida, int limiteMinino, int limiteMaximo) {
        if (limiteMinino < limiteMaximo && limiteMinino > 0) {
            limiteMinimaEhValida = true;
            return true;
        } else {
            limiteMinimaEhValida = false;
            return false;
        }
    }



    private static boolean validarLimiteMaxima(boolean limiteMaximaEhValida, int limiteMaximo) {
        if (limiteMaximo > 1) {
            limiteMaximaEhValida = true;
            return true;
        } else {
            limiteMaximaEhValida = false;
            return false;
        }
    }

}
