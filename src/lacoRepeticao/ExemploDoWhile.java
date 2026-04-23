package lacoRepeticao;

import java.util.Scanner;

public class ExemploDoWhile {

	public static void main(String[] args) {
		
		int numero, resultado, contador = 3;
		Scanner scanner = new Scanner(System.in);
		
		do {
			
			System.out.println("\nDigite um número inteiro: ");
			numero = scanner.nextInt();
			resultado = numero * 5;
			System.out.println("\nO resultado da múltiplicação é: " + resultado);
		} while(contador <=2);
		
		scanner.close();
	}

}
