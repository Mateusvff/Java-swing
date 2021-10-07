package controle;

import java.util.ArrayList;
import java.util.List;
import modelo.produtos.Oculos;
import modelo.venda.Venda;

/**
 * Realiza a comunicação entre o pacote modelo e o pacote view do produto por meio dos métodos de:
 * (1) Cadastro
 * (2) Visualização
 * @author Mateus Vinícius
 * @version 1.0 (Out 2021)
 *
 */
public class ControleVenda {

	public static List<Venda> vendas = new ArrayList<>();
	
	/**
	 * Realiza o cadastro de uma nova venda feita na loja
	 * @param oculos recebe o objeto óculos a partir do id fornecido 
	 * @param quantidade um int que contém a quantidade vendida
	 * @param valor um double que contém o preço total da venda
	 */
	public void cadastroVenda(Oculos oculos, int quantidade, double valor) {
		Venda venda = new Venda(oculos, quantidade, valor);
		vendas.add(venda);
	}
	
	/**
	 * Carrega dados de teste na lista de vendas
	 * @author Mateus Vinícius
	 * @version 1.0 (Out 2021)
	 */
	public void dados() {
		Oculos oculos1 = new Oculos(01, "Ray Ban", "Aviador", "Titânio", "Prata", 10, 250.00, "Masculino");
		Oculos oculos2 = new Oculos(02, "Oakley", "Juliet", "Alumínio", "Roxo", 20, 150.00, "Unissex");
		Oculos oculos3 = new Oculos(03, "Chilli Beans", "Bossa Nova", "Plástico", "Preto", 30, 300.00, "Unissex");
		Oculos oculos4 = new Oculos(04, "Vivara", "Retrô", "Plástico", "Preto", 20, 799.90, "Unissex");
		Oculos oculos5 = new Oculos(05, "Chilli Beans", "Roma", "Alumínio", "Dourado", 30, 250.00, "Masculino");
		
		Venda venda1 = new Venda(oculos1, 10, 2500);
		Venda venda2 = new Venda(oculos2, 5, 750);
		Venda venda3 = new Venda(oculos3, 8, 2400);
		Venda venda4 = new Venda(oculos4, 2, 1599.80);
		Venda venda5 = new Venda(oculos5, 1, 250.00);
		
		vendas.add(venda1);
		vendas.add(venda2);
		vendas.add(venda3);
		vendas.add(venda4);
		vendas.add(venda5);
	}
}
