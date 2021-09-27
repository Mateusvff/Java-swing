package view;

import java.awt.Font;

import javax.swing.*;


public class TelaProdutos {
	private static JFrame principalProdutos = new JFrame("Loja de �culos");
	private static JLabel titulo = new JLabel("Produtos");
	private static JButton visualizar = new JButton("Visualizar");
	private static JButton cadastrar = new JButton("Cadastrar");
	private static JButton alterar = new JButton("Alterar");
	private static JButton deletar = new JButton("Deletar");
	private static JButton buscar = new JButton("Buscar");

	public TelaProdutos() {
		titulo.setFont(new Font("Arial", Font.BOLD, 20));
		titulo.setBounds(147, 10, 150, 30);
		
		principalProdutos.add(titulo);
		principalProdutos.add(visualizar);
		principalProdutos.add(cadastrar);
		principalProdutos.add(alterar);
		principalProdutos.add(deletar);
		principalProdutos.add(buscar);
		
		visualizar.setBounds(140, 50, 100, 30);
		cadastrar.setBounds(140, 100, 100, 30);
		alterar.setBounds(140, 150, 100, 30);
		deletar.setBounds(140, 200, 100, 30);
		buscar.setBounds(140, 250, 100, 30);
		
		principalProdutos.setLayout(null);

		principalProdutos.setSize(400, 350);
		principalProdutos.setVisible(true);
	}
	
	public static void main(String[] args) {
		TelaProdutos telaProdutos = new TelaProdutos();
	}
}
