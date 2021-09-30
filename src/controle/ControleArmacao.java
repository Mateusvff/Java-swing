package controle;

import java.util.ArrayList;

import java.util.List;
import java.util.Scanner;
import modelo.produtos.Armacao;

public class ControleArmacao {

	public static List<Armacao> armacoes = new ArrayList<>();
	Scanner sc = new Scanner(System.in);

	// CADASTRAR ARMA��O
	public void cadastroArmacao() {

		System.out.print("Digite a marca da arma��o: ");
		String marca = sc.nextLine();

		System.out.print("Digite o modelo da arma��o: ");
		String modelo = sc.next();

		System.out.print("Digite o c�digo da arma��o ");
		String codigo = sc.nextLine();

		System.out.print("Digite o material da arma��o: ");
		String material = sc.nextLine();

		System.out.print("Digite a cor da arma��o: ");
		String cor = sc.nextLine();

		System.out.print("Digite o g�nero da lente: ");
		String genero = sc.nextLine();
		
		Armacao armacao = new Armacao(marca, modelo, codigo, material, cor, genero);
		armacoes.add(armacao);
	}

	// BUSCAR ARMA��O
	public String buscarArmacao() {

		System.out.print("Digite o c�digo da arma��o (somente n�meros) � ser verificado: ");
		String codigoBusca = sc.next();

		for (int i = 0; i < armacoes.size(); i++) {
			if (armacoes.get(i).getCodigo().equals(codigoBusca)) {
				return armacoes.get(i).toString();
			}
		}
		return "Arma��o n�o encontrado ! ";
	}

	// VISUALIZAR ARMA��O
	public void verArmacao() {
		for (int i = 0; i < armacoes.size(); i++) {
			System.out.println(armacoes.get(i).toString() + "\n");
		}
	}

	// ATUALIZAR ARMA��O
	public void atualizarArmacao() {

		System.out.print("Digite o codigo da arma��o que deseja alterar as informa��es: ");
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

			for (int i = 0; i < armacoes.size(); i++) {
				if (armacoes.get(i).getCodigo().equals(codigo)) {
					armacoes.get(i).setMarca(marca);
				}
			}

			break;

		case 2:
			System.out.print("Digite o modelo para o qual deseja alterar: ");
			String modelo = sc.nextLine();

			for (int i = 0; i < armacoes.size(); i++) {
				if (armacoes.get(i).getCodigo().equals(codigo)) {
					armacoes.get(i).setModelo(modelo);
				}
			}

			break;

		case 3:
			System.out.print("Digite o material para o qual deseja alterar: ");
			String material = sc.nextLine();

			for (int i = 0; i < armacoes.size(); i++) {
				if (armacoes.get(i).getCodigo().equals(codigo)) {
					armacoes.get(i).setMaterial(material);
				}
			}

			break;

		case 4:
			System.out.print("Digite a cor para o qual deseja alterar: ");
			String cor = sc.nextLine();

			for (int i = 0; i < armacoes.size(); i++) {
				if (armacoes.get(i).getCodigo().equals(codigo)) {
					armacoes.get(i).setCor(cor);
				}
			}

			break;

		case 5:
			System.out.print("Digite o g�nero para o qual deseja alterar: ");
			String genero = sc.nextLine();

			for (int i = 0; i < armacoes.size(); i++) {
				if (armacoes.get(i).getCodigo().equals(codigo)) {
					armacoes.get(i).setGenero(genero);
				}
			}

			break;

		default:
			System.out.println("Sele��o Inv�lida");
		}
	}

	// DELETAR ARMA��O
	public void deletarArmacao() {
		System.out.println("Digite o c�digo da arma��o (somente n�meros) � ser apagado: ");
		String codigo = sc.next();

		for (int i = 0; i < armacoes.size(); i++) {
			if (armacoes.get(i).getCodigo().equals(codigo)) {
				armacoes.remove(i);
			}
		}
	}
}
