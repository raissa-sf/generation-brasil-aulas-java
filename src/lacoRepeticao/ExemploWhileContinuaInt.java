package lacoRepeticao;

import java.util.Scanner;

public class ExemploWhileContinuaInt {

	public static void main(String[] args) {
		
		int numero1, numero2, resultado, continua = 1;
		Scanner scanner = new Scanner(System.in);
		
		while (continua != 0) {
			
			System.out.println("Digite o primeiro valor: ");
			numero1 = scanner.nextInt();
			
			System.out.println("Digite o segundo valor: ");
			numero2 = scanner.nextInt();
			
			resultado = numero1 + numero2;
			
			System.out.println("O resultado da soma é: " + resultado);
			
			System.out.println("\nDeseja continuar? Digite um número diferente de 0.");
			continua = scanner.nextInt();
			
		}
		
		scanner.close();
	}

}
