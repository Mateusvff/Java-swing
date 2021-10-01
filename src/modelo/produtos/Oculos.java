package modelo.produtos;

public class Oculos {
	protected String marca;
	protected String modelo;
	protected int id;
	protected String material;
	protected String cor;
	protected int quantEstoque;
	protected double precoVenda;
	protected String genero;
	
	public Oculos(String marca, String modelo, int id, String material, String cor, int quantEstoque, double precoVenda, String genero) {
		this.marca = marca;
		this.modelo = modelo;
		this.id = id;
		this.material = material;
		this.cor = cor;
		this.quantEstoque = quantEstoque;
		this.precoVenda = precoVenda;
		this.genero = genero;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public int getQuantEstoque() {
		return quantEstoque;
	}

	public void setQuantEstoque(int quantEstoque) {
		this.quantEstoque = quantEstoque;
	}

	public double getPrecoVenda() {
		return precoVenda;
	}

	public void setPrecoVenda(double precoVenda) {
		this.precoVenda = precoVenda;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}
		
}
