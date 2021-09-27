package view;

import java.awt.Font;

import javax.swing.*;

public class TelaPessoa {
	private static JFrame principalPessoas = new JFrame("Loja de Óculos");
	private static JLabel titulo = new JLabel("Pessoas");
	private static JButton visualizar = new JButton("Visualizar");
	private static JButton cadastrar = new JButton("Cadastrar");
	private static JButton alterar = new JButton("Alterar");
	private static JButton deletar = new JButton("Deletar");
	private static JButton buscar = new JButton("Buscar");

	public TelaPessoa() {
		titulo.setFont(new Font("Arial", Font.BOLD, 20));
		titulo.setBounds(147, 10, 150, 30);
		
		principalPessoas.add(titulo);
		principalPessoas.add(visualizar);
		principalPessoas.add(cadastrar);
		principalPessoas.add(alterar);
		principalPessoas.add(deletar);
		principalPessoas.add(buscar);
		
		visualizar.setBounds(140, 50, 100, 30);
		cadastrar.setBounds(140, 100, 100, 30);
		alterar.setBounds(140, 150, 100, 30);
		deletar.setBounds(140, 200, 100, 30);
		buscar.setBounds(140, 250, 100, 30);
		
		principalPessoas.setLayout(null);

		principalPessoas.setSize(400, 350);
		principalPessoas.setVisible(true);
	}
	
	public static void main(String[] args) {
		TelaPessoa telaPessoa = new TelaPessoa();
	}
}
