package modelo.produtos;

/**
 * Define as variáveis associadas ao produto (Óculos de sol)
 * @author Juan Cerqueira
 * @version 1.0 (Out 2021)
 */
public class Oculos {
	protected String marca;
	protected String modelo;
	protected int id;
	protected String material;
	protected String cor;
	protected int quantEstoque;
	protected double preco;
	protected String genero;
	
	public Oculos( int id, String marca, String modelo, String material, String cor, int quantEstoque, double preco, String genero) {
		this.id = id;
		this.marca = marca;
		this.modelo = modelo;
		this.material = material;
		this.cor = cor;
		this.quantEstoque = quantEstoque;
		this.preco = preco;
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

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}
		
}
