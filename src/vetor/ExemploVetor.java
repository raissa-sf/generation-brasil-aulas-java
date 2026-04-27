package vetor;

public class ExemploVetor {

	public static void main(String[] args) {

		String vetorCachorro[] = { "Boxer", "Pastor Alemão", "Pinscher", "Husky Siberiano", "Corgi" };

		for (int contador = 0; contador < 5; contador++) {
			System.out.println((contador + 1) + "º elemento: " + vetorCachorro[contador]);
		}

	}

}
