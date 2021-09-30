package controle;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import modelo.produtos.OculosDeSol;

public class ControleODS {

	public List<OculosDeSol> ods = new ArrayList<>();
	Scanner sc = new Scanner(System.in);
	
	// CADASTRAR ODS
		public void cadastroOds() {

			System.out.print("Digite a marca da lente: ");
			String marca = sc.nextLine();

			System.out.print("Digite o modelo da lente: ");
			String modelo = sc.next();

			System.out.print("Digite o c�digo da lente: ");
			String codigo = sc.nextLine();

			System.out.print("Digite o material da lente: ");
			String material = sc.nextLine();

			System.out.print("Digite a cor da lente: ");
			String cor = sc.nextLine();

			System.out.print("Digite o g�nero da lente: ");
			String genero = sc.nextLine();

			OculosDeSol OculosDeSol = new OculosDeSol(marca, modelo, codigo, material, cor, genero);
			ods.add(OculosDeSol);

		}

		// BUSCAR ODS
		public String buscarOds() {

			System.out.print("Digite o c�digo do �culos de sol (somente n�meros) � ser verificado: ");
			String codigoBusca = sc.next();

			for (int i = 0; i < ods.size(); i++) {
				if (ods.get(i).getCodigo().equals(codigoBusca)) {
					return ods.get(i).toString();
				}
			}
			return "�culos de sol n�o encontrado ! ";
		}

		// VISUALIZAR ODS
		public void verOds() {
			for (int i = 0; i < ods.size(); i++) {
				System.out.println(ods.get(i).toString() + "\n");
			}
		}

		// ATUALIZAR ODS
		public void atualizarOds() {

			System.out.print("Digite o codigo da lente que deseja alterar as informa��es: ");
			String codigo = sc.next();

			System.out.println("SELECIONE A OP��O DESEJADA: ");
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
				System.out.print("Digite o g�nero para o qual deseja alterar: ");
				String genero = sc.nextLine();

				for (int i = 0; i < ods.size(); i++) {
					if (ods.get(i).getCodigo().equals(codigo)) {
						ods.get(i).setGenero(genero);
					}
				}

				break;

			default:
				System.out.println("Sele��o Inv�lida");
			}
		}

		// DELETAR ODS
		public void deletarOds() {
			System.out.println("Digite o c�digo do �culos de sol (somente n�meros) � ser apagado: ");
			String codigo = sc.next();

			for (int i = 0; i < ods.size(); i++) {
				if (ods.get(i).getCodigo().equals(codigo)) {
					ods.remove(i);
				}
			}
		}

}
