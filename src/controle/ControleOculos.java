package controle;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import modelo.produtos.Oculos;

public class ControleOculos {

	public static List<Oculos> oculosProd = new ArrayList<>();
	Scanner sc = new Scanner(System.in);

	// CADASTRAR OCULOS
	public void cadastroOculos(int id, String marca, String modelo, String material, String cor, int quantEstoque,
			double preco, String genero) {
		Oculos oculos = new Oculos(marca, modelo, id, material, cor, quantEstoque, preco, genero);
		oculosProd.add(oculos);
	}

	// BUSCAR OCULOS
	public String buscarOculos(int idBusca) {

		for (int i = 0; i < oculosProd.size(); i++) {
			if (oculosProd.get(i).getId() == idBusca) {
				return oculosProd.get(i).toString();
			}
		}
		
		return "Óculos de sol não encontrado ! ";
	}
	
	public Oculos buscarOculosint(int idBusca) {
		for (int i = 0; i < oculosProd.size(); i++) {
			if (oculosProd.get(i).getId() == idBusca) {
				return oculosProd.get(i);
			}
		}
		return null;
	}

	// VISUALIZAR OCULOS
	public void visualizarOculos() {
		for (int i = 0; i < oculosProd.size(); i++) {
			System.out.println(oculosProd.get(i).toString() + "\n");
		}
	}

	// DELETAR OCULOS
	public void deletarOculos(int idBusca) {
		for (int i = 0; i < oculosProd.size(); i++) {
			if (oculosProd.get(i).getId() == idBusca) {
				oculosProd.remove(i);
			}
		}
	}

}
