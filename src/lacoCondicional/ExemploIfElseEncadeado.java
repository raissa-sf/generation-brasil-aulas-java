package lacoCondicional;

import java.util.Scanner;

public class ExemploIfElseEncadeado {

	public static void main(String[] args) {
		
		float nota1, nota2, media;
		Scanner scanner = new Scanner (System.in);
		
		//Entrada de dados
		System.out.println("Digite a primeira nota: ");
		nota1 = scanner.nextFloat();
		
		System.out.println("Digite a segunta nota: ");
		nota2 = scanner.nextFloat();
		
		// Processamento
		media = (nota1 + nota2) / 2;
		
		if (media >= 6) {
			System.out.println("Parabéns, pessoa participante aprovada!");
			
		} else if (media >= 5) {
			System.out.println("Pessoa participante de recuperação!");
		}
		
		else {
			System.out.println("Infelizmente, a pessoa participante foi reprovada!");
		}

	}

}
