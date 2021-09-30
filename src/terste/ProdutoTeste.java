package terste;

import java.util.ArrayList;
import java.util.List;

import modelo.pessoas.Fornecedor;

public class ProdutoTeste {
	private int codigoProduto;
	private String nomeProduto;
	private int qtdEstoque;
	private Fornecedor fornecedor;

	public String getNomeProduto() {
		return nomeProduto;
	}

	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}

	public int getQtdEstoque() {
		return qtdEstoque;
	}

	public void setQtdEstoque(int qtdEstoque) {
		this.qtdEstoque = qtdEstoque;
	}

}

class ControleProduto {
	public static List<ProdutoTeste> listaProduto = new ArrayList<>();
	
	public void cadastrarProduto(int codigo, String nome, int qtdEstoque, Fornecedor fornecedor) {
		ProdutoTeste produto = new ProdutoTeste();
		produto.setNomeProduto(nome);
		produto.setQtdEstoque(10);
		
		listaProduto.add(produto);
	}
	
	public static void main(String[] args) {
		ControleProduto controle = new ControleProduto();
		
		controle.cadastrarProduto(1, "Óculos de Sol", 10, null);
		controle.cadastrarProduto(2, "Óculos de Grau", 10, null);
		controle.cadastrarProduto(3, "Armação", 10, null);
		controle.cadastrarProduto(4, "Exame", 50000, null);
	}
}
