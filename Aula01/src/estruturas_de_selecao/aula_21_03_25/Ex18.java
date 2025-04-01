package estruturas_de_selecao.aula_21_03_25;

import java.util.Scanner;

public class Ex18 {
 
    public static void main(String[] args) {
 
        /**
         * Elabore um algoritmo para exibir o valor de reajuste que um funcionário
         * receberá no seu salário. A empresa irá conceder 5% de reajuste para o funcionário que for
         * admitido há menos de 12 meses. Para funcionário admitido entre 13 e 48 meses, irá conceder 7%
         * de reajuste. O seu algoritmo deve solicitar ao usuário que digite a quantidade de meses que
         * o funcionário foi admitido
         */
 
        Scanner scanner = new Scanner(System.in);
 
        double reajusteNovato = 0.05;
        double reajusteVeterano = 0.07;
 
        double salario;
        int tempoDeEmpresa;
 
        System.out.println("Digite o tempo de empresa:");
        tempoDeEmpresa = scanner.nextInt();
 
        System.out.println("Digite o salario:");
        salario = scanner.nextDouble();
 
        if (tempoDeEmpresa <= 12) {
            System.out.printf("O valor do reajuste é R$ %.2f", (salario * reajusteNovato));
        } else if (tempoDeEmpresa >= 13 && tempoDeEmpresa <= 48) {
            System.out.printf("O valor do reajuste é R$ %.2f", (salario * reajusteVeterano));
        } else {
            System.out.println("reajuste não definido para mais de 48 meses.");
        }
 
    }
}
