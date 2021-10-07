package controle;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import modelo.produtos.Oculos;

/**
 * Realiza a comunica��o entre o pacote modelo e o pacote view de �culos por meio dos m�todos de:
 * (1) Cadastro
 * (2) Busca
 * (3) Visualiza��o
 * (4) Dele��o
 * @author Mateus Vin�cius
 * @version 1.0 (Out 2021)
 */
public class ControleOculos {

	public static List<Oculos> oculosProd = new ArrayList<>();
	Scanner sc = new Scanner(System.in);
	
	
	/**
	 * Realiza o cadastro de um novo produto na lista de �culos
	 * @param id um int que cont�m o c�digo identificador do �culos
	 * @param marca uma srting que cont�m a marca
	 * @param modelo uma string que cont�m o modelo do �culos
	 * @param material uma string que cont�m o material de fabrica��o
	 * @param cor uma string que cont�m a cor do �culos
	 * @param quantEstoque um int que cont�m a quantidade em estoque do �culos
	 * @param preco um double que cont�m o pre�o de venda do �culos
	 * @param genero uma string que difere o produto em masculino, feminino e unissex
	 * @author Mateus Vin�cius
	 * @version 1.0 (Out 2021)
	 */
	public void cadastroOculos(int id, String marca, String modelo, String material, String cor, int quantEstoque,
			double preco, String genero) {
		Oculos oculos = new Oculos(id, marca, modelo, material, cor, quantEstoque, preco, genero);
		oculosProd.add(oculos);
	}

	/**
	 * Realiza a busca de um produto a partir do c�digo de identifica��o
	 * @param idBusca um int que cont�m o c�digo de identifica��o a ser procurado na lista
	 * @return informa caso o id digitado n�o pertenca a nenhum produto cadastrado
	 * @author Juan Cerqueira
	 * @version 1.0 (Out 2021)
	 */
	public String buscarOculos(int idBusca) {

		for (int i = 0; i < oculosProd.size(); i++) {
			if (oculosProd.get(i).getId() == idBusca) {
				return oculosProd.get(i).toString();
			}
		}
		
		return "�culos de sol n�o encontrado ! ";
	}
	
	/**
	 * Realiza a busca de um produto a partir do c�digo de identifica��o
	 * @param idBusca um int que cont�m o c�digo de identifica��o a ser procurado na lista
	 * @return lista o produto que cont�m o c�digo de identifica��o id�ntico ao procurado
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
	 * Realiza a dele��o de um �culos da lista a partir do c�digo digitado
	 * @param idBusca um int que cont�m o c�digo do �culos que ser� deletado
	 * @author Mateus Vin�cius
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
	 * Carrega dados de teste na lista de �culos
	 * @author Mateus Vin�cius
	 * @version 1.0 (Out 2021)
	 */
	public void dados() {
		Oculos oculos1 = new Oculos(01, "Ray Ban", "Aviador", "Tit�nio", "Prata", 10, 250.00, "Masculino");
		Oculos oculos2 = new Oculos(02, "Oakley", "Juliet", "Alum�nio", "Roxo", 20, 150.00, "Unissex");
		Oculos oculos3 = new Oculos(03, "Chilli Beans", "Bossa Nova", "Pl�stico", "Preto", 30, 300.00, "Unissex");
		Oculos oculos4 = new Oculos(04, "Vivara", "Retr�", "Pl�stico", "Preto", 20, 799.90, "Unissex");
		Oculos oculos5 = new Oculos(05, "Chilli Beans", "Roma", "Alum�nio", "Dourado", 30, 250.00, "Masculino");
		
		oculosProd.add(oculos1);
		oculosProd.add(oculos2);
		oculosProd.add(oculos3);
		oculosProd.add(oculos4);
		oculosProd.add(oculos5);
	}
	

}
