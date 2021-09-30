package view;

import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.*;

public class TelaFuncionarioMenu {
	private static JFrame principalFuncionario = new JFrame("Loja de �culos");
	private static JLabel titulo = new JLabel("Funcion�rios");
	private static JButton visualizar = new JButton("Visualizar");
	private static JButton cadastrar = new JButton("Cadastrar");
	private static JButton alterar = new JButton("Alterar");
	private static JButton deletar = new JButton("Deletar");
	private static JButton buscar = new JButton("Buscar");
	
	public TelaFuncionarioMenu() {
		titulo.setFont(new Font("Arial", Font.BOLD, 20));
		titulo.setBounds(130, 10, 150, 30);
		
		principalFuncionario.add(titulo);
		principalFuncionario.add(visualizar);
		principalFuncionario.add(cadastrar);
		principalFuncionario.add(alterar);
		principalFuncionario.add(deletar);
		principalFuncionario.add(buscar);
		
		visualizar.setBounds(140, 50, 100, 30);
		cadastrar.setBounds(140, 100, 100, 30);
		alterar.setBounds(140, 150, 100, 30);
		deletar.setBounds(140, 200, 100, 30);
		buscar.setBounds(140, 250, 100, 30);
		
		principalFuncionario.setLayout(null);

		principalFuncionario.setSize(400, 350);
		principalFuncionario.setVisible(true);
	}
	
}
