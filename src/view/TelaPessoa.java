package view;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;


public class TelaPessoa implements ActionListener {
	private static JFrame principalPessoa = new JFrame("Loja de Óculos");
	private static JLabel titulo = new JLabel("Pessoas");
	private static JButton funcionario = new JButton("Funcionários");
	private static JButton cliente = new JButton("Clientes");

	// Construtor de tela das opções de funcionários e clientes

	public TelaPessoa() {
		titulo.setFont(new Font("Arial", Font.BOLD, 20));
		titulo.setBounds(147, 10, 150, 30);
		
		principalPessoa.add(titulo);
		principalPessoa.add(funcionario);
		principalPessoa.add(cliente);
		
		funcionario.setBounds(90, 50, 200, 30);
		cliente.setBounds(90, 100, 200, 30);
		
		principalPessoa.setLayout(null);

		principalPessoa.setSize(400, 300);
		principalPessoa.setVisible(true);
	}
	
	public static void main(String[] args) {
		TelaPessoa menu = new TelaPessoa();
		
		funcionario.addActionListener(menu);
		cliente.addActionListener(menu);
	}
	
	public void actionPerformed(ActionEvent e) {
		Object src = e.getSource();
		
		if(src == funcionario) {
			new TelaFuncionarioMenu();
		}
		
		if(src == cliente) {
			new TelaClienteMenu();
		}
		
	}
}
