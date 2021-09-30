package modelo.produtos;

public class Lente extends Produto {
	private double grauLente;

	public Lente(String marca, String modelo, String codigo, String material, String cor, double grauLente) {
		super(marca, modelo, codigo, material, cor);
		this.grauLente = grauLente;
	}


	public double getGrauLente() {
		return grauLente;
	}

	public void setGrauLente(double grauLente) {
		this.grauLente = grauLente;
	}
}
