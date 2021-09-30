package view;

import java.awt.Font;

import javax.swing.*;

public class TelaLentesMenu {
	private static JFrame principalLentes = new JFrame("Loja de �culos");
	private static JLabel titulo = new JLabel("Lentes");
	private static JButton visualizar = new JButton("Visualizar");
	private static JButton cadastrar = new JButton("Cadastrar");
	private static JButton alterar = new JButton("Alterar");
	private static JButton deletar = new JButton("Deletar");
	private static JButton buscar = new JButton("Buscar");
	
	public TelaLentesMenu() {
		titulo.setFont(new Font("Arial", Font.BOLD, 20));
		titulo.setBounds(160, 10, 150, 30);
		
		principalLentes.add(titulo);
		principalLentes.add(visualizar);
		principalLentes.add(cadastrar);
		principalLentes.add(alterar);
		principalLentes.add(deletar);
		principalLentes.add(buscar);
		
		visualizar.setBounds(140, 50, 100, 30);
		cadastrar.setBounds(140, 100, 100, 30);
		alterar.setBounds(140, 150, 100, 30);
		deletar.setBounds(140, 200, 100, 30);
		buscar.setBounds(140, 250, 100, 30);
		
		principalLentes.setLayout(null);

		principalLentes.setSize(400, 350);
		principalLentes.setVisible(true);
	}
	
}