package lacoRepeticao;

import java.util.Scanner;

public class ExemploWhileContinuaString {

	public static void main(String[] args) {
		
		String continua = "";
		int numero1, numero2, resultado;
		Scanner scanner = new Scanner(System.in);
		
		while (!continua.equalsIgnoreCase("n")) {
			
			System.out.println("Digite o primeiro valor: ");
			numero1 = scanner.nextInt();
			
			System.out.println("Digite o segundo valor: ");
			numero2 = scanner.nextInt();
			
			resultado = numero1 + numero2;
			
			System.out.println("O resultado da soma é: " + resultado);
			
			System.out.println("\nDeseja continuar? (s/n)");
			continua = scanner.next();
			
		}
		
		scanner.close();
	}

}
