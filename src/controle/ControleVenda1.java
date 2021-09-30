package controle;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import modelo.pessoas.Cliente;
import modelo.venda.Venda;

public class ControleVenda1 {
	
	public static List<Venda> vendas = new ArrayList<>();
	Scanner sc = new Scanner(System.in);
	
	ControleCliente controleCliente = new ControleCliente();
	
	public void cadastroVenda() {
		Cliente clienteVenda = controleCliente.buscarClientesObject();
	}
	
	public static void main(String[] args){
		ControleVenda1 venda = new ControleVenda1();
		
		venda.cadastroVenda();
	}

}
