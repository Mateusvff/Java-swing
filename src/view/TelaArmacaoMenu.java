package view;

import java.awt.Font;

import javax.swing.*;

public class TelaArmacaoMenu {
	private static JFrame principalArmacao = new JFrame("Loja de Óculos");
	private static JLabel titulo = new JLabel("Armações");
	private static JButton visualizar = new JButton("Visualizar");
	private static JButton cadastrar = new JButton("Cadastrar");
	private static JButton alterar = new JButton("Alterar");
	private static JButton deletar = new JButton("Deletar");
	private static JButton buscar = new JButton("Buscar");
	
	public TelaArmacaoMenu() {
		titulo.setFont(new Font("Arial", Font.BOLD, 20));
		titulo.setBounds(147, 10, 150, 30);
		
		principalArmacao.add(titulo);
		principalArmacao.add(visualizar);
		principalArmacao.add(cadastrar);
		principalArmacao.add(alterar);
		principalArmacao.add(deletar);
		principalArmacao.add(buscar);
		
		visualizar.setBounds(140, 50, 100, 30);
		cadastrar.setBounds(140, 100, 100, 30);
		alterar.setBounds(140, 150, 100, 30);
		deletar.setBounds(140, 200, 100, 30);
		buscar.setBounds(140, 250, 100, 30);
		
		principalArmacao.setLayout(null);

		principalArmacao.setSize(400, 350);
		principalArmacao.setVisible(true);
	}
	
}
