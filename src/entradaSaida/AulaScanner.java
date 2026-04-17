package entradaSaida;

import java.util.Scanner;

public class AulaScanner {

	public static void main(String[] args) {
		
		// Declarando as variáveis
		Scanner scanner = new Scanner(System.in);
		String nome;
		
		// Entrada de dados
		System.out.println("Digite o seu nome: ");
		
		// Processamento
		nome = scanner.nextLine();
		
		// Saída de dados
		System.out.println("Seu nome é: " + nome);
		

	}

}
