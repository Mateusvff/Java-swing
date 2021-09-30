package controle;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import modelo.venda.Venda;

public class ControleVenda {

	public static List<Venda> vendas = new ArrayList<>();
	Scanner sc = new Scanner(System.in);

	ControleCliente controleCliente = new ControleCliente();
	ControleOds controleOds = new ControleOds();
	ControleArmacao controleArmacoes = new ControleArmacao();
	ControleLente controleLentes = new ControleLente();
	
	//CLIENTE (nome e cpf)
	//PRODUTO (tipo e código)
	//VENDEDOR (nome)

	public void cadastroVenda() {

		System.out.println("Digite o CPF do cliente que será cadastrado a venda: ");
		String cpfCliente = sc.nextLine();

		for (int i = 0; i < ControleCliente.clientes.size(); i++) {
			if (ControleCliente.clientes.get(i).getCpf().equals(cpfCliente)) {
				String nomeCliente = ControleCliente.clientes.get(i).getNome();
			}
		}

		System.out.println("Selecione a opção do produto que será cadastrado a venda: ");
		int opcao = sc.nextInt();

		System.out.println("1) ÓCULOS DE SOL");
		System.out.println("2) ARMAÇÃO");
		System.out.println("3) LENTE");

		switch (opcao) {
		case 1:

			System.out.println("Digite o código do produto que será cadastrado a venda: ");
			String codigoProd = sc.nextLine();

			for (int i = 0; i < ControleOds.ods.size(); i++) {
				if (ControleOds.ods.get(i).getCodigo().equals(codigoProd)) {
					String marcaOds = ControleOds.ods.get(i).getMarca();
					String modeloOds = ControleOds.ods.get(i).getModelo();
					String materialOds = ControleOds.ods.get(i).getMaterial();
					String corOds = ControleOds.ods.get(i).getCor();
					String generoOds = ControleOds.ods.get(i).getGenero();
				}
			}
			break;

		case 2:

			System.out.println("Digite o código da armação que será cadastrado a venda: ");
			String codigoArmacao = sc.nextLine();

			for (int i = 0; i < ControleArmacao.armacoes.size(); i++) {
				if (ControleArmacao.armacoes.get(i).getCodigo().equals(codigoArmacao)) {
					String marcaArm = ControleArmacao.armacoes.get(i).getMarca();
					String modeloArm = ControleArmacao.armacoes.get(i).getModelo();
					String materialArm = ControleArmacao.armacoes.get(i).getMaterial();
					String corArm = ControleArmacao.armacoes.get(i).getCor();
					String generoArm = ControleArmacao.armacoes.get(i).getGenero();
				}
			}
			break;

		case 3:

			System.out.println("Digite o código da lente que será cadastrado a venda: ");
			String codigoLente = sc.nextLine();

			for (int i = 0; i < ControleLente.lentes.size(); i++) {
				if (ControleLente.lentes.get(i).getCodigo().equals(codigoLente)) {
					String marcaLente = ControleLente.lentes.get(i).getMarca();
					String modeloLente = ControleLente.lentes.get(i).getModelo();
					String materialLente = ControleLente.lentes.get(i).getMaterial();
					String corLente = ControleLente.lentes.get(i).getCor();
					double grauLente = ControleLente.lentes.get(i).getGrauLente();
				}
			}
			break;
		default:
			System.out.println("Seleção inválida !");

		}

		System.out.println("Digite o CPF do vendedor que será cadastrado a venda: ");
		String cpfVendedor = sc.nextLine();

		for (int i = 0; i < ControleVendedor.vendedores.size(); i++) {
			if (ControleVendedor.vendedores.get(i).getCpf().equals(cpfVendedor)) {
				String nomeVendedor = ControleVendedor.vendedores.get(i).getNome();
			}
		}
	}
}
