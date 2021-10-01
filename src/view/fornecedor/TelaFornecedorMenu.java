package view.fornecedor;

import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.*;

public class TelaFornecedorMenu {
	private static JFrame principalFornecedor = new JFrame("Loja de Óculos");
	private static JLabel titulo = new JLabel("Fornecedores");
	private static JButton visualizar = new JButton("Visualizar");
	private static JButton cadastrar = new JButton("Cadastrar");
	private static JButton alterar = new JButton("Alterar");
	private static JButton deletar = new JButton("Deletar");
	private static JButton buscar = new JButton("Buscar");
	
	public TelaFornecedorMenu() {
		titulo.setFont(new Font("Arial", Font.BOLD, 20));
		titulo.setBounds(125, 10, 150, 30);
		
		principalFornecedor.add(titulo);
		principalFornecedor.add(visualizar);
		principalFornecedor.add(cadastrar);
		principalFornecedor.add(alterar);
		principalFornecedor.add(deletar);
		principalFornecedor.add(buscar);
		
		visualizar.setBounds(140, 50, 100, 30);
		cadastrar.setBounds(140, 100, 100, 30);
		alterar.setBounds(140, 150, 100, 30);
		deletar.setBounds(140, 200, 100, 30);
		buscar.setBounds(140, 250, 100, 30);
		
		principalFornecedor.setLayout(null);

		principalFornecedor.setSize(400, 350);
		principalFornecedor.setVisible(true);
	}
	
}
