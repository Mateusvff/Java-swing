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
		Oculos oculos = new Oculos(id, marca, modelo, material, cor, quantEstoque, preco, genero);
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

	// DELETAR OCULOS
	public void deletarOculos(int idBusca) {
		for (int i = 0; i < oculosProd.size(); i++) {
			if (oculosProd.get(i).getId() == idBusca) {
				oculosProd.remove(i);
			}
		}
	}
	
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
