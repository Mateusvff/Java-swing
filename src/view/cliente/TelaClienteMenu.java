package view.cliente;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import view.fornecedor.TelaFornecedorMenu;
import view.vendedor.TelaVendedorMenu;

public class TelaClienteMenu implements ActionListener {
	private static JFrame principalCliente = new JFrame("Loja de Óculos");
	private static JLabel titulo = new JLabel("Clientes");
	private static JButton visualizar = new JButton("Visualizar");
	private static JButton cadastrar = new JButton("Cadastrar");
	private static JButton alterar = new JButton("Alterar");
	private static JButton deletar = new JButton("Deletar");
	private static JButton buscar = new JButton("Buscar");
	
	public TelaClienteMenu() {
		titulo.setFont(new Font("Arial", Font.BOLD, 20));
		titulo.setBounds(155, 10, 150, 30);
		
		principalCliente.add(titulo);
		principalCliente.add(visualizar);
		principalCliente.add(cadastrar);
		principalCliente.add(alterar);
		principalCliente.add(deletar);
		principalCliente.add(buscar);
		
		cadastrar.setBounds(140, 50, 100, 30);
		visualizar.setBounds(140, 100, 100, 30);
		alterar.setBounds(140, 150, 100, 30);
		deletar.setBounds(140, 200, 100, 30);
		buscar.setBounds(140, 250, 100, 30);
		
		principalCliente.setLayout(null);

		principalCliente.setSize(400, 350);
		principalCliente.setVisible(true);
		
		visualizar.addActionListener(this);
		cadastrar.addActionListener(this);
		alterar.addActionListener(this);
		deletar.addActionListener(this);
		buscar.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object src = e.getSource();

		if (src == visualizar) {
			new TelaVendedorMenu();
		}

		if (src == cadastrar) {
			new TelaCadastroCliente();
		}

		if (src == alterar) {
			new TelaFornecedorMenu();
		}
		
		if (src == deletar) {
			new TelaFornecedorMenu();
		}
		
		if (src == buscar) {
			new TelaFornecedorMenu();
		}
	}
	
}
