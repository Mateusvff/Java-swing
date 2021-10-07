package modelo.venda;

import modelo.produtos.Oculos;

public class Venda {
	private Oculos oculos;
	private int quantidade;
	private double valor;

	public Venda(Oculos oculos, int quantidade, double valor) {
		this.oculos = oculos;
		this.quantidade = quantidade;
		this.valor = valor;
	}

	@Override
	public String toString() {
		return "Dados da venda: " + "\n" + 
				"Produto: " + oculos + "\n" +
				"Quantidade vendida: " + quantidade + "\n" +
				"Valor da venda: " + valor;
	}

	public Oculos getOculos() {
		return oculos;
	}

	public void setOculos(Oculos produto) {
		this.oculos = produto;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantVendida) {
		this.quantidade = quantVendida;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valorVenda) {
		this.valor = valorVenda;
	}

}

