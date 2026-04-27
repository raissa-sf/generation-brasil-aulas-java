package vetor;

import java.util.Scanner;

public class ExemploVetorNumero {

	public static void main(String[] args) {
		
		int vetorNumeros[] = new int[3];
		Scanner scanner = new Scanner(System.in);
		
		for(int indice = 0; indice < 3; indice++) {
			System.out.println("Digite um número: ");
			vetorNumeros[indice] = scanner.nextInt();
		}
		
		for (int indice = 0; indice < 3; indice++) {
			System.out.println((indice + 1)+ "º elemento:" + vetorNumeros[indice] );
		}
		
		scanner.close();

	}

}
