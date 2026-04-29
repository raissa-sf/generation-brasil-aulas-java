package poo;

public class TestaCarro {

	public static void main(String[] args) {
		
		// Instanciamento | Instanciar um objeto
		Carro carro1 = new Carro("Kombi", 4, 4, "Modelo XYZ"); // carro1 é um objeto
		Carro carro2 = new Carro("Toyota", 2, 4, "Supra");
		
		carro1.locomover();
		System.out.println("Marca: " + carro1.getMarca());
		System.out.println("Qtd. Portas: " + carro1.getPortas());
		System.out.println(carro1.parar());
		
		System.out.println();
		
		carro2.locomover();
		System.out.println("Marca: " + carro2.getMarca());
		System.out.println("Qtd. Portas: " + carro2.getPortas());
		System.out.println(carro2.parar());

	}

}
