package estruturas_de_selecao.aula_14_03_25;

import java.util.Scanner;

public class PedirNumero {

	int numero;
	
	Scanner scanner = new Scanner(System.in);
	
		
	public PedirNumero() {
	}

	public int perguntar() {
		System.out.println("Digite um numero:");
		return scanner.nextInt();
	}

}
