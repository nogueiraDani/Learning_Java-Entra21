package estruturas_de_selecao.aula_21_03_25;

import java.util.Scanner;

public class Ex19 {
 
    public static void main(String[] args) {
 
        /**
         * A jornada de trabalho semanal de um funcionário é de 40 horas. O funcionário
         * que trabalhar mais de 40 horas receberá hora extra, cujo cálculo é o valor da
         * hora regular
         * com um acréscimo de 50%. Escreva um algoritmo que leia o número de horas
         * trabalhadas em um
         * mês, o valor por hora e escreva o salário total do funcionário, que deverá
         * ser acrescido das
         * horas extras, caso tenham sido trabalhadas (considere que o mês possua 4
         * semanas exatas)
         */
 
        Scanner scanner = new Scanner(System.in);
 
        double horasSemanaisPadrao = 40;
        double horasMensaisPadrao = horasSemanaisPadrao * 4;
        double valorPorHora,salario, horasTrabalhadasMes, valorHoraExtra, horasExtrasTrabalhadas;
        double adicionalHoraExtra = 0.5;
       
        System.out.println("Digite o numero de horas trabalhadas no mês:");
        horasTrabalhadasMes = scanner.nextDouble();
 
        System.out.println("Digite o valor da hora trabalhada:");
        valorPorHora = scanner.nextDouble();
 
        valorHoraExtra = valorPorHora + (valorPorHora * adicionalHoraExtra);
 
        if (horasTrabalhadasMes > 160) {
            horasExtrasTrabalhadas = horasTrabalhadasMes - horasMensaisPadrao;
            salario = (horasMensaisPadrao * valorPorHora) + (horasExtrasTrabalhadas * valorHoraExtra);
        } else {
            salario = (horasTrabalhadasMes * valorPorHora);
        }
 
        System.out.printf("o salario total é R$ %.2f", salario);
 
    }
}
