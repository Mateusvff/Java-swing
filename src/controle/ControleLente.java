package controle;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import modelo.produtos.Lente;

public class ControleLente {

	public static List<Lente> lentes = new ArrayList<>();
	Scanner sc = new Scanner(System.in);

	// CADASTRAR LENTE
	public void cadastroLente() {

		System.out.print("Digite a marca da lente: ");
		String marca = sc.nextLine();

		System.out.print("Digite o modelo da lente: ");
		String modelo = sc.next();

		System.out.print("Digite o código da lente: ");
		String codigo = sc.nextLine();

		System.out.print("Digite o material da lente: ");
		String material = sc.nextLine();

		System.out.print("Digite a cor da lente: ");
		String cor = sc.nextLine();

		System.out.print("Digite o grau da lente: ");
		double grau = sc.nextDouble();

		Lente lente = new Lente(marca, modelo, codigo, material, cor, grau);
		lentes.add(lente);

	}

	// BUSCAR LENTE
	public String buscarLente() {

		System.out.print("Digite o código da lente (somente números) à ser verificado: ");
		String codigoBusca = sc.next();

		for (int i = 0; i < lentes.size(); i++) {
			if (lentes.get(i).getCodigo().equals(codigoBusca)) {
				return lentes.get(i).toString();
			}
		}
		return "Lente não encontrada ! ";
	}

	// VISUALIZAR LENTE
	public void verLente() {
		for (int i = 0; i < lentes.size(); i++) {
			System.out.println(lentes.get(i).toString() + "\n");
		}
	}

	// ATUALIZAR LENTE
	public void atualizarLente() {

		System.out.print("Digite o codigo da lente que deseja alterar as informações: ");
		String codigo = sc.next();

		System.out.println("SELECIONE A OPÇÃO DESEJADA: ");
		System.out.println("1) ALTERAR MARCA");
		System.out.println("2) ALTERAR MODELO");
		System.out.println("3) ALTERAR MATERIAL");
		System.out.println("4) ALTERAR COR");
		System.out.println("5) ALTERAR GRAU DA LENTE");

		int opcao = sc.nextInt();
		sc.nextLine();

		switch (opcao) {
		case 1:
			System.out.print("Digite a marca para o qual deseja alterar: ");
			String marca = sc.nextLine();

			for (int i = 0; i < lentes.size(); i++) {
				if (lentes.get(i).getCodigo().equals(codigo)) {
					lentes.get(i).setMarca(marca);
				}
			}

			break;

		case 2:
			System.out.print("Digite o modelo para o qual deseja alterar: ");
			String modelo = sc.nextLine();

			for (int i = 0; i < lentes.size(); i++) {
				if (lentes.get(i).getCodigo().equals(codigo)) {
					lentes.get(i).setModelo(modelo);
				}
			}

			break;

		case 3:
			System.out.print("Digite o material para o qual deseja alterar: ");
			String material = sc.nextLine();

			for (int i = 0; i < lentes.size(); i++) {
				if (lentes.get(i).getCodigo().equals(codigo)) {
					lentes.get(i).setMaterial(material);
				}
			}

			break;

		case 4:
			System.out.print("Digite a cor para o qual deseja alterar: ");
			String cor = sc.nextLine();

			for (int i = 0; i < lentes.size(); i++) {
				if (lentes.get(i).getCodigo().equals(codigo)) {
					lentes.get(i).setCor(cor);
				}
			}

			break;

		case 5:
			System.out.print("Digite o grau da lente para o qual deseja alterar: ");
			double grau = sc.nextDouble();

			for (int i = 0; i < lentes.size(); i++) {
				if (lentes.get(i).getCodigo().equals(codigo)) {
					lentes.get(i).setGrauLente(grau);
				}
			}

			break;

		default:
			System.out.println("Seleção Inválida");
		}
	}

	// DELETAR LENTE
	public void deletarLente() {
		System.out.println("Digite o código da lente (somente números) à ser apagado: ");
		String codigo = sc.next();

		for (int i = 0; i < lentes.size(); i++) {
			if (lentes.get(i).getCodigo().equals(codigo)) {
				lentes.remove(i);
			}
		}
	}

}
