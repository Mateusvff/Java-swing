package view;

import java.awt.Font;

import javax.swing.*;

public class TelaClienteMenu {
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
		
		visualizar.setBounds(140, 50, 100, 30);
		cadastrar.setBounds(140, 100, 100, 30);
		alterar.setBounds(140, 150, 100, 30);
		deletar.setBounds(140, 200, 100, 30);
		buscar.setBounds(140, 250, 100, 30);
		
		principalCliente.setLayout(null);

		principalCliente.setSize(400, 350);
		principalCliente.setVisible(true);
	}
	
}
