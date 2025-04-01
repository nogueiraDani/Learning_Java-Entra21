package estruturas_de_selecao.aula_19_03_25;

import java.util.Scanner;

public class Ex15 {
 
    public static void main(String[] args) {
 
        /**
         * O índice de massa corporal (IMC) é uma medida internacional usada para
         * calcular se uma pessoa está no peso ideal.
         * O IMC é determinado pela divisão da massa do indivíduo pelo
         * quadrado de sua altura, onde a massa está em quilogramas e a altura está em
         * metros, de acordo com a fórmula:
         * IMC = Massa / Altura²
         * Faça um algoritmo para classificar o IMC e dizer o grau de obesidade do
         * indivíduo, de acordo com a seguinte tabela:
         * < 18.5 Magreza
         * 18.5 – 24.9 Saudável
         * 25.0 – 29.9 Sobrepeso
         * 30.0 – 34.9 Obesidade Grau I
         * 35.0 – 39.9 Obesidade Grau II (severa)
         * > 40.0 Obesidade Grau III (morbida)
         */
 
        Scanner scanner = new Scanner(System.in);
 
        double peso;
        double altura;
 
        System.out.println("Digite o peso:");
        peso = scanner.nextDouble();
 
        System.out.println("Digite a altura:");
        altura = scanner.nextDouble();
 
        double imc = peso / Math.pow(altura, 2);
 
        System.out.print("Classificação: ");
 
        if (imc < 18.5) {
            System.out.print("magreza.");
        } else if (imc >= 18.5 && imc <= 24.9) {
            System.out.print("saudável.");
        } else if (imc >= 25 && imc <= 29.9) {
            System.out.print("sobrepeso.");
        } else if (imc >= 30 && imc <= 34.9) {
            System.out.print("obesidade grau I.");
        } else if (imc >= 35 && imc <= 39.9) {
            System.out.print("obesidade grau II (severa).");
        } else {
            System.out.print("obesidade grau III (morbida).");
        }
 
    }
 
}
