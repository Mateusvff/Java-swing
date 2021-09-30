package modelo.produtos;

public class OculosDeSol extends Produto {
	private String genero;
	
	public OculosDeSol(String marca, String modelo, String codigo, String material, String cor, String genero) {
		super(marca, modelo, codigo, material, cor);
		this.genero = genero;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}
	
}
