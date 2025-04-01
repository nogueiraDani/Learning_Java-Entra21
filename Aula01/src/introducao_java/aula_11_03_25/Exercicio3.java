package introducao_java.aula_11_03_25;

public class Exercicio3 {
	
	public static void main(String[] args) {
		
		/**
		 *  calcule a area e o perimetro do retangula
		 */
		
		double base, altura;
		
		base = 5.2;
		altura = 10.5;
		
		double area = base * altura;	
		double perimetro = 2*(base + altura);
		
		System.out.println(String.format("a area do retangulo é %.2f metros quadrados", area));
		System.out.println(String.format("o perimetro do retangulo é %.2f metros", perimetro));
		
		
	}

}
