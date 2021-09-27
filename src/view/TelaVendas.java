package view;

import java.awt.Font;

import javax.swing.*;


public class TelaVendas {
	private static JFrame principalVendas = new JFrame("Loja de Óculos");
	private static JLabel titulo = new JLabel("Vendas");
	private static JButton visualizar = new JButton("Visualizar");
	private static JButton cadastrar = new JButton("Cadastrar");
	private static JButton alterar = new JButton("Alterar");
	private static JButton deletar = new JButton("Deletar");
	private static JButton buscar = new JButton("Buscar");

	public TelaVendas() {
		titulo.setFont(new Font("Arial", Font.BOLD, 20));
		titulo.setBounds(152, 10, 150, 30);
		
		principalVendas.add(titulo);
		principalVendas.add(visualizar);
		principalVendas.add(cadastrar);
		principalVendas.add(alterar);
		principalVendas.add(deletar);
		principalVendas.add(buscar);
		
		visualizar.setBounds(140, 50, 100, 30);
		cadastrar.setBounds(140, 100, 100, 30);
		alterar.setBounds(140, 150, 100, 30);
		deletar.setBounds(140, 200, 100, 30);
		buscar.setBounds(140, 250, 100, 30);
		
		principalVendas.setLayout(null);

		principalVendas.setSize(400, 350);
		principalVendas.setVisible(true);
	}
	
	public static void main(String[] args) {
		TelaVendas Vendas = new TelaVendas();
	}
}
