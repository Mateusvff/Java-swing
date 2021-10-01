package controle;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import modelo.pessoas.Vendedor;
import modelo.produtos.Oculos;
import modelo.produtos.OculosDeSol;

public class ControleOculos {

	public static List<Oculos> oculosProd = new ArrayList<>();
	Scanner sc = new Scanner(System.in);
	
	// CADASTRAR OCULOS
	public void cadastroOculos(int id, String marca, String modelo, String material, String cor, int quantEstoque, double preco, String genero ) {
		Oculos oculos = new Oculos(marca, modelo, id, material, cor, quantEstoque, preco, genero);
		oculosProd.add(oculos);
	}


		// BUSCAR ODS
		public String buscarOds() {

			System.out.print("Digite o código do Óculos de sol (somente números) à ser verificado: ");
			String codigoBusca = sc.next();

			for (int i = 0; i < ods.size(); i++) {
				if (ods.get(i).getCodigo().equals(codigoBusca)) {
					return ods.get(i).toString();
				}
			}
			return "Óculos de sol não encontrado ! ";
		}

		// VISUALIZAR ODS
		public void verOds() {
			for (int i = 0; i < ods.size(); i++) {
				System.out.println(ods.get(i).toString() + "\n");
			}
		}

		// ATUALIZAR ODS
		public void atualizarOds() {

			System.out.print("Digite o codigo da lente que deseja alterar as informações: ");
			String codigo = sc.next();

			System.out.println("SELECIONE A OPÇÃO DESEJADA: ");
			System.out.println("1) ALTERAR MARCA");
			System.out.println("2) ALTERAR MODELO");
			System.out.println("3) ALTERAR MATERIAL");
			System.out.println("4) ALTERAR COR");
			System.out.println("5) ALTERAR GENERO");

			int opcao = sc.nextInt();
			sc.nextLine();

			switch (opcao) {
			case 1:
				System.out.print("Digite a marca para o qual deseja alterar: ");
				String marca = sc.nextLine();

				for (int i = 0; i < ods.size(); i++) {
					if (ods.get(i).getCodigo().equals(codigo)) {
						ods.get(i).setMarca(marca);
					}
				}

				break;

			case 2:
				System.out.print("Digite o modelo para o qual deseja alterar: ");
				String modelo = sc.nextLine();

				for (int i = 0; i < ods.size(); i++) {
					if (ods.get(i).getCodigo().equals(codigo)) {
						ods.get(i).setModelo(modelo);
					}
				}

				break;

			case 3:
				System.out.print("Digite o material para o qual deseja alterar: ");
				String material = sc.nextLine();

				for (int i = 0; i < ods.size(); i++) {
					if (ods.get(i).getCodigo().equals(codigo)) {
						ods.get(i).setMaterial(material);
					}
				}

				break;

			case 4:
				System.out.print("Digite a cor para o qual deseja alterar: ");
				String cor = sc.nextLine();

				for (int i = 0; i < ods.size(); i++) {
					if (ods.get(i).getCodigo().equals(codigo)) {
						ods.get(i).setCor(cor);
					}
				}

				break;

			case 5:
				System.out.print("Digite o gênero para o qual deseja alterar: ");
				String genero = sc.nextLine();

				for (int i = 0; i < ods.size(); i++) {
					if (ods.get(i).getCodigo().equals(codigo)) {
						ods.get(i).setGenero(genero);
					}
				}

				break;

			default:
				System.out.println("Seleção Inválida");
			}
		}

		// DELETAR ODS
		public void deletarOds() {
			System.out.println("Digite o código do Óculos de sol (somente números) à ser apagado: ");
			String codigo = sc.next();

			for (int i = 0; i < ods.size(); i++) {
				if (ods.get(i).getCodigo().equals(codigo)) {
					ods.remove(i);
				}
			}
		}

}
