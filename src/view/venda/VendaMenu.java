package view.venda;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import view.fornecedor.TelaAlteraFornecedor;
import view.fornecedor.TelaApagaFornecedor;
import view.fornecedor.TelaBuscaFornecedor;
import view.fornecedor.TelaCadastroFornecedor;
import view.fornecedor.TelaVisualizaFornecedor;


public class VendaMenu implements ActionListener{
	private static JFrame principalVendas = new JFrame("Loja de Óculos");
	private static JLabel titulo = new JLabel("Vendas");
	private static JButton visualizar = new JButton("Visualizar");
	private static JButton cadastrar = new JButton("Cadastrar");
	private static JButton alterar = new JButton("Alterar");
	private static JButton deletar = new JButton("Deletar");
	private static JButton buscar = new JButton("Buscar");

	public VendaMenu() {
		titulo.setFont(new Font("Arial", Font.BOLD, 20));
		titulo.setBounds(152, 10, 150, 30);
		
		principalVendas.add(titulo);
		principalVendas.add(cadastrar);
		principalVendas.add(visualizar);
		principalVendas.add(alterar);
		principalVendas.add(deletar);
		principalVendas.add(buscar);
		
		cadastrar.setBounds(140, 50, 100, 30);
		visualizar.setBounds(140, 100, 100, 30);
		alterar.setBounds(140, 150, 100, 30);
		deletar.setBounds(140, 200, 100, 30);
		buscar.setBounds(140, 250, 100, 30);
		
		principalVendas.setLayout(null);

		principalVendas.setSize(400, 350);
		principalVendas.setVisible(true);
	}
	
	public static void main(String[] args) {
		VendaMenu Vendas = new VendaMenu();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object src = e.getSource();
		
		if (src == visualizar) {
			new TelaVisualizaVenda();

		}

		if (src == cadastrar) {
			new TelaCadastroVenda();
		
		}

		if (src == alterar) {
			new TelaAlteraVenda();

		}

		if (src == deletar) {
			new TelaApagaVenda();
			
		}

		if (src == buscar) {
			new TelaBuscaVenda();

		}
		
	}
}
