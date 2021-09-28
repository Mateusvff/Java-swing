package modelo.venda;

public class Venda {
	
	private String cliente;
	private String vendedor;
	private String produto;
	private int quantVendida;
	private double valorVenda;

	public Venda(String cliente, String vendedor, String produto) {
		this.cliente = cliente;
		this.produto = produto;
		this.vendedor = vendedor;
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

	public String getCliente() {
		return cliente;
	}


	public void setCliente(String cliente) {
		this.cliente = cliente;
	}


	public String getVendedor() {
		return vendedor;
	}


	public void setVendedor(String vendedor) {
		this.vendedor = vendedor;
	}


	public String getProduto() {
		return produto;
	}


	public void setProduto(String produto) {
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

