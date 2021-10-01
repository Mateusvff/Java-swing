package view.oculos;

import java.awt.Font;

import javax.swing.*;

public class TelaOculosMenu {
	private static JFrame principalOculosDeSol = new JFrame("Loja de Óculos");
	private static JLabel titulo = new JLabel("Óculos de Sol");
	private static JButton visualizar = new JButton("Visualizar");
	private static JButton cadastrar = new JButton("Cadastrar");
	private static JButton alterar = new JButton("Alterar");
	private static JButton deletar = new JButton("Deletar");
	private static JButton buscar = new JButton("Buscar");
	
	public TelaOculosMenu() {
		titulo.setFont(new Font("Arial", Font.BOLD, 20));
		titulo.setBounds(120, 10, 150, 30);
		
		principalOculosDeSol.add(titulo);
		principalOculosDeSol.add(visualizar);
		principalOculosDeSol.add(cadastrar);
		principalOculosDeSol.add(alterar);
		principalOculosDeSol.add(deletar);
		principalOculosDeSol.add(buscar);
		
		visualizar.setBounds(140, 50, 100, 30);
		cadastrar.setBounds(140, 100, 100, 30);
		alterar.setBounds(140, 150, 100, 30);
		deletar.setBounds(140, 200, 100, 30);
		buscar.setBounds(140, 250, 100, 30);
		
		principalOculosDeSol.setLayout(null);

		principalOculosDeSol.setSize(400, 350);
		principalOculosDeSol.setVisible(true);
	}
	
}
