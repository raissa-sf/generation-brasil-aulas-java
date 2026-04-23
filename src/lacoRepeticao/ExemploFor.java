package lacoRepeticao;

import java.util.Scanner;

public class ExemploFor {

	public static void main(String[] args) {
		
		String nome;
		Scanner scanner = new Scanner(System.in);
		
		for (int contador = 1; contador < 4; contador++) {
			
			System.out.println("Digite o " + contador + "º nome: ");
			nome = scanner.nextLine();
			System.out.println("O " + contador + "º nome é: " + nome + "\n");
		}
		
		scanner.close();

	}

}
