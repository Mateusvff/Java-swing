package modelo.venda;

import modelo.pessoas.Vendedor;
import modelo.produtos.Oculos;

public class Venda {
	private Oculos produto;
	private Vendedor vendedor;
	private int quantVendida;
	private double valorVenda;

	public Venda(Vendedor vendedor, Oculos produto, int quantVendida, double valorVenda) {
		this.produto = produto;
		this.vendedor = vendedor;
		this.quantVendida = quantVendida;
		this.valorVenda = valorVenda;
	}

	@Override
	public String toString() {
		return "Dados da venda: " + "\n" + 
				"Produto: " + produto + "\n" +
				"Vendedor: " + vendedor + "\n" +
				"Quantidade vendida: " + quantVendida + "\n" +
				"Valor da venda: " + valorVenda;
	}

	public Vendedor getVendedor() {
		return vendedor;
	}

	public void setVendedor(Vendedor vendedor) {
		this.vendedor = vendedor;
	}

	public Oculos getProduto() {
		return produto;
	}

	public void setProduto(Oculos produto) {
		this.produto = produto;
	}

	public int getQuantVendida() {
		return quantVendida;
	}

	public void setQuantVendida(int quantVendida) {
		this.quantVendida = quantVendida;
	}

	public double getValorVenda() {
		return valorVenda;
	}

	public void setValorVenda(double valorVenda) {
		this.valorVenda = valorVenda;
	}

}

