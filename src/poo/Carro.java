package poo;

// A classe é o molde
public class Carro {

	// Atributos
	private String marca;
	private int rodas;
	private int portas;
	private String modeloMotor;
	
	// Método Construtor
	public Carro(String marca, int rodas, int portas, String modeloMotor) {
		this.marca = marca;
		this.rodas = rodas;
		this.portas = portas;
		this.modeloMotor = modeloMotor;
	}
	

	// Métodos
	public void locomover() {
		System.out.println("Estou me locomovendo...");
	}

	public String parar() {
		return "Estou parando";
	}
	
	// Métodos de Acesso / Especiais (Get/Set)
	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getRodas() {
		return rodas;
	}

	public void setRodas(int rodas) {
		this.rodas = rodas;
	}

	public int getPortas() {
		return portas;
	}

	public void setPortas(int portas) {
		this.portas = portas;
	}

	public String getModeloMotor() {
		return modeloMotor;
	}

	public void setModeloMotor(String modeloMotor) {
		this.modeloMotor = modeloMotor;
	}

	
	
}
