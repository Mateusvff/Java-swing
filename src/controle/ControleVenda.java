package controle;

import java.util.ArrayList;
import java.util.List;

import modelo.pessoas.Vendedor;
import modelo.produtos.Oculos;
import modelo.venda.Venda;

public class ControleVenda {

	public static List<Venda> vendas = new ArrayList<>();

	
	
	//CADASTRO VENDA
	public void cadastroVenda(Vendedor vendedor, Oculos oculos, int quantidade, double valor) {
		Venda venda = new Venda(vendedor.getNome(), oculos, quantidade, valor);
		vendas.add(venda);
	}
}
