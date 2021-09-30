package controle;

import java.util.ArrayList;

import java.util.List;
import java.util.Scanner;
import modelo.produtos.Armacao;

public class ControleArmacao {

	public static List<Armacao> armacoes = new ArrayList<>();
	Scanner sc = new Scanner(System.in);

	// CADASTRAR ARMAÇÃO
	public void cadastroArmacao() {

		System.out.print("Digite a marca da armação: ");
		String marca = sc.nextLine();

		System.out.print("Digite o modelo da armação: ");
		String modelo = sc.next();

		System.out.print("Digite o código da armação ");
		String codigo = sc.nextLine();

		System.out.print("Digite o material da armação: ");
		String material = sc.nextLine();

		System.out.print("Digite a cor da armação: ");
		String cor = sc.nextLine();

		System.out.print("Digite o gênero da lente: ");
		String genero = sc.nextLine();
		
		Armacao armacao = new Armacao(marca, modelo, codigo, material, cor, genero);
		armacoes.add(armacao);
	}

	// BUSCAR ARMAÇÃO
	public String buscarArmacao() {

		System.out.print("Digite o código da armação (somente números) à ser verificado: ");
		String codigoBusca = sc.next();

		for (int i = 0; i < armacoes.size(); i++) {
			if (armacoes.get(i).getCodigo().equals(codigoBusca)) {
				return armacoes.get(i).toString();
			}
		}
		return "Armação não encontrado ! ";
	}

	// VISUALIZAR ARMAÇÃO
	public void verArmacao() {
		for (int i = 0; i < armacoes.size(); i++) {
			System.out.println(armacoes.get(i).toString() + "\n");
		}
	}

	// ATUALIZAR ARMAÇÃO
	public void atualizarArmacao() {

		System.out.print("Digite o codigo da armação que deseja alterar as informações: ");
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
			System.out.print("Digite o gênero para o qual deseja alterar: ");
			String genero = sc.nextLine();

			for (int i = 0; i < armacoes.size(); i++) {
				if (armacoes.get(i).getCodigo().equals(codigo)) {
					armacoes.get(i).setGenero(genero);
				}
			}

			break;

		default:
			System.out.println("Seleção Inválida");
		}
	}

	// DELETAR ARMAÇÃO
	public void deletarArmacao() {
		System.out.println("Digite o código da armação (somente números) à ser apagado: ");
		String codigo = sc.next();

		for (int i = 0; i < armacoes.size(); i++) {
			if (armacoes.get(i).getCodigo().equals(codigo)) {
				armacoes.remove(i);
			}
		}
	}
}
