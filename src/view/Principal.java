package view;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import view.oculos.OculosMenu;
import view.venda.VendaMenu;

public class Principal implements ActionListener {
	private static JFrame principal = new JFrame("Loja de Óculos");
	private static JLabel titulo = new JLabel("Menu Principal");
	private static JButton produtos = new JButton("Produtos");
	private static JButton pessoas = new JButton("Pessoas");
	private static JButton vendas = new JButton("Vendas");
	
	public Principal() {
		titulo.setFont(new Font("Arial", Font.BOLD, 20));
		titulo.setBounds(120, 10, 150, 30);
		produtos.setBounds(140, 50, 100, 30);
		pessoas.setBounds(140, 100, 100, 30);
		vendas.setBounds(140, 150, 100, 30);

		principal.setLayout(null);
		principal.add(titulo);
		principal.add(produtos);
		principal.add(pessoas);
		principal.add(vendas);

		principal.setSize(400, 250);
		principal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		principal.setVisible(true);
	}

	public static void main(String[] args) {
		
		Principal menu = new Principal(); 
		
		produtos.addActionListener(menu);
		pessoas.addActionListener(menu);
		vendas.addActionListener(menu);
	}
	
	public void actionPerformed(ActionEvent e) {
		Object src = e.getSource();
		
		if (src == produtos) {
			new OculosMenu();
		}
		
		if (src == pessoas) {
			new TelaPessoaMenu();
		}
		
		if (src == vendas) {
			new VendaMenu();
		}

	}
}