package aula_12_03_25;

import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {

		/**
		 * Escreva um programa que leia três valores com ponto flutuante de dupla
		 * precisão: A, B e C. Em seguida, calcule e mostre:
		 *  
		 * a) a área do triângulo retângulo que tem base A e altura C. 
		 * b) a área do círculo de raio C. 
		 * c) a area do trapézio que tem A e B por bases e C por altura. 
		 * d) a área do quadrado que tem lado B. 
		 * e) a área do retângulo que tem lados A e B.
		 */
		
		Scanner scanner = new Scanner(System.in);
		
		Double medidaA, medidaB, medidaC, areaTriangulo, areaCirculo, areaTrapezio, areaQuadrado, areaRetangulo;
		
		System.out.println("Digite a medida A:");
		medidaA = scanner.nextDouble();
		
		System.out.println("Digite a medida B:");
		medidaB = scanner.nextDouble();
		
		System.out.println("Digite a medida C:");
		medidaC = scanner.nextDouble();
		
		areaTriangulo = (medidaA * medidaC) / 2;
		areaCirculo = Math.PI * Math.pow(medidaC, 2);
		areaTrapezio = ((medidaA + medidaB) * medidaC) / 2;
		areaQuadrado = Math.pow(medidaB, 2);
		areaRetangulo = medidaA * medidaB;
		
		System.out.println(
				String.format("A area do triangulo de base %.2f e altura %.2f é %.2f m²", medidaA, medidaC, areaTriangulo));
		
		System.out.println(
				String.format("A area do circulo de raio %.2f é %.2f m²", medidaC, areaCirculo));
	
		System.out.println(
				String.format("A area do trapezio de bases %.2f, %.2f e altura %.2f é %.2f m²", medidaA, medidaB, medidaC, areaTrapezio));
		
		System.out.println(
				String.format("A area do quadrado de lado %.2f é %.2f m²", medidaB, areaQuadrado));
		
		System.out.println(
				String.format("A area do retangulo de lados %.2f e %.2f é %.2f m²", medidaA, medidaB, areaRetangulo));
		

	}

}
