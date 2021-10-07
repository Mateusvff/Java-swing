package controle;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import modelo.produtos.Oculos;

/**
 * Realiza a comunicação entre o pacote modelo e o pacote view de óculos por meio dos métodos de:
 * (1) Cadastro
 * (2) Busca
 * (3) Visualização
 * (4) Deleção
 * @author Mateus Vinícius
 * @version 1.0 (Out 2021)
 */
public class ControleOculos {

	public static List<Oculos> oculosProd = new ArrayList<>();
	Scanner sc = new Scanner(System.in);
	
	
	/**
	 * Realiza o cadastro de um novo produto na lista de óculos
	 * @param id um int que contém o código identificador do óculos
	 * @param marca uma srting que contém a marca
	 * @param modelo uma string que contém o modelo do óculos
	 * @param material uma string que contém o material de fabricação
	 * @param cor uma string que contém a cor do óculos
	 * @param quantEstoque um int que contém a quantidade em estoque do óculos
	 * @param preco um double que contém o preço de venda do óculos
	 * @param genero uma string que difere o produto em masculino, feminino e unissex
	 * @author Mateus Vinícius
	 * @version 1.0 (Out 2021)
	 */
	public void cadastroOculos(int id, String marca, String modelo, String material, String cor, int quantEstoque,
			double preco, String genero) {
		Oculos oculos = new Oculos(id, marca, modelo, material, cor, quantEstoque, preco, genero);
		oculosProd.add(oculos);
	}

	/**
	 * Realiza a busca de um produto a partir do código de identificação
	 * @param idBusca um int que contém o código de identificação a ser procurado na lista
	 * @return informa caso o id digitado não pertenca a nenhum produto cadastrado
	 * @author Juan Cerqueira
	 * @version 1.0 (Out 2021)
	 */
	public String buscarOculos(int idBusca) {

		for (int i = 0; i < oculosProd.size(); i++) {
			if (oculosProd.get(i).getId() == idBusca) {
				return oculosProd.get(i).toString();
			}
		}
		
		return "Óculos de sol não encontrado ! ";
	}
	
	/**
	 * Realiza a busca de um produto a partir do código de identificação
	 * @param idBusca um int que contém o código de identificação a ser procurado na lista
	 * @return lista o produto que contém o código de identificação idêntico ao procurado
	 * @author Juan Cerqueira
	 * @version 1.0 (Out 2021)
	 */
	public Oculos buscarOculosint(int idBusca) {
		for (int i = 0; i < oculosProd.size(); i++) {
			if (oculosProd.get(i).getId() == idBusca) {
				return oculosProd.get(i);
			}
		}
		return null;
	}

	/**
	 * Realiza a deleção de um óculos da lista a partir do código digitado
	 * @param idBusca um int que contém o código do óculos que será deletado
	 * @author Mateus Vinícius
	 * @version 1.0 (Out 2021)
	 */
	public void deletarOculos(int idBusca) {
		for (int i = 0; i < oculosProd.size(); i++) {
			if (oculosProd.get(i).getId() == idBusca) {
				oculosProd.remove(i);
			}
		}
	}
	
	/**
	 * Carrega dados de teste na lista de óculos
	 * @author Mateus Vinícius
	 * @version 1.0 (Out 2021)
	 */
	public void dados() {
		Oculos oculos1 = new Oculos(01, "Ray Ban", "Aviador", "Titânio", "Prata", 10, 250.00, "Masculino");
		Oculos oculos2 = new Oculos(02, "Oakley", "Juliet", "Alumínio", "Roxo", 20, 150.00, "Unissex");
		Oculos oculos3 = new Oculos(03, "Chilli Beans", "Bossa Nova", "Plástico", "Preto", 30, 300.00, "Unissex");
		Oculos oculos4 = new Oculos(04, "Vivara", "Retrô", "Plástico", "Preto", 20, 799.90, "Unissex");
		Oculos oculos5 = new Oculos(05, "Chilli Beans", "Roma", "Alum´nio", "Dourado", 30, 250.00, "Masculino");
		
		oculosProd.add(oculos1);
		oculosProd.add(oculos2);
		oculosProd.add(oculos3);
		oculosProd.add(oculos4);
		oculosProd.add(oculos5);
	}
	

}
