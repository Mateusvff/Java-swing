package controle;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JFormattedTextField;

import modelo.pessoas.Cliente;

public class ControleCliente {

	public static List<Cliente> clientes = new ArrayList<>();
	

	// CADASTRAR CLIENTES
	public void cadastroClientes(String nome, String telefone, String endereco, String cpf, String email) {
		Cliente cliente = new Cliente(nome, telefone, endereco, cpf, email);
		clientes.add(cliente);
	}

	// BUSCAR CLIENTES
	public String buscarClientes(String cpfBusca) {
		for (int i = 0; i < clientes.size(); i++) {
			if (clientes.get(i).getCpf().equals(cpfBusca)) {
				return clientes.get(i).toString();
			}
		}
		return "Usuário não encontrado ! ";
	}

	
	// VISUALIZAR CLIENTES
	public void verClientes() {
		for (int i = 0; i < clientes.size(); i++) {
			System.out.println(clientes.get(i).toString() + "\n");
		}
	}

	// DELETAR CLIENTES
	public void deletarClientes(JFormattedTextField cpfDelete) {
		for (int i = 0; i < clientes.size(); i++) {
			if (clientes.get(i).getCpf().equals(cpfDelete)) {
				clientes.remove(i);
			}
		}
	}
}
