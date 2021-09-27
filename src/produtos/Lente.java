package produtos;

public class Lente extends Produto {
	private double grauLente;
	
	public Lente(String marca, String modelo, int id, double grauLente) {
		super(marca, modelo, id);
		this.grauLente = grauLente;
	}

	public double getGrauLente() {
		return grauLente;
	}

	public void setGrauLente(double grauLente) {
		this.grauLente = grauLente;
	}
	
}
