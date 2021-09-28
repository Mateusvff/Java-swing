package modelo.produtos;

public class OculosDeSol extends Produto {
	private String genero;
	
	public OculosDeSol(String marca, String modelo, int id, String genero) {
		super(marca, modelo, id);
		this.genero = genero;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}
	
}
