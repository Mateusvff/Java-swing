package modelo.produtos;

import java.util.List;
import modelo.pessoas.Fornecedor;

public abstract class Produto {
	protected String marca;
	protected String modelo;
	protected int id;
	protected String material;
	protected String cor;
	protected int quantidade;
	protected double precoCompra;
	protected double precoVenda;
	protected double lucro;
	protected List<Fornecedor> fornecedor;
	
	public Produto(String marca, String modelo, int id) {
		this.marca = marca;
		this.modelo = modelo;
		this.id = id;
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
	
	public int getQuantidade() {
		return quantidade;
	}
	
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
	public double getPrecoCompra() {
		return precoCompra;
	}
	
	public void setPrecoCompra(double precoCompra) {
		this.precoCompra = precoCompra;
	}
	
	public double getPrecoVenda() {
		return precoVenda;
	}
	
	public void setPrecoVenda(double precoVenda) {
		this.precoVenda = precoVenda;
	}
	
	public double getLucro() {
		return lucro;
	}
	
	public void setLucro(double lucro) {
		this.lucro = lucro;
	}
	
}
