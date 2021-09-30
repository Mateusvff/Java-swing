package modelo.produtos;

public class Armacao extends Produto{
	private String genero;
	
	public Armacao(String marca, String modelo, String material, String codigo, String cor, String genero) {
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
