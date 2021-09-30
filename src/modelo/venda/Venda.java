package modelo.venda;

import modelo.pessoas.Cliente;
import modelo.pessoas.Vendedor;
import modelo.produtos.Produto;

public class Venda {
	
	private Cliente cliente;
	private Vendedor vendedor;
	private Produto produto;
	private int quantVendida;
	private double valorVenda;

	public Venda(Cliente cliente, Vendedor vendedor, Produto produto, int quantVendida, double valorVenda) {
		this.cliente = cliente;
		this.produto = produto;
		this.vendedor = vendedor;
		this.quantVendida = quantVendida;
		this.valorVenda = valorVenda;
	}
	
	@Override
	public String toString() {
		return "Dados da venda: " + "\n" + 
				"Cliente: " + cliente + "\n" +
				"Produto: " + produto + "\n" +
				"Vendedor: " + vendedor + "\n" +
				"Quantidade vendida: " + quantVendida + "\n" +
				"Valor da venda: " + valorVenda;
	}

	public Cliente getCliente() {
		return cliente;
	}


	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}


	public Vendedor getVendedor() {
		return vendedor;
	}


	public void setVendedor(Vendedor vendedor) {
		this.vendedor = vendedor;
	}


	public Produto getProduto() {
		return produto;
	}


	public void setProduto(Produto produto) {
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

