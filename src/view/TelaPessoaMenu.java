package view;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

import principal.Principal;
import view.cliente.ClienteMenu;
import view.fornecedor.FornecedorMenu;
import view.vendedor.VendedorMenu;

/**
 * Exibe as op��es referentes �s pessoas, sendo elas:
 * (1) Vendedores
 * (2) Clientes
 * (3) Fornecedores
 * @author Juan Cerqueira
 * @version 1.0 (Out 2021)
 */
public class TelaPessoaMenu implements ActionListener {
	private static JFrame principalPessoa = new JFrame("Loja de �culos");
	private static JButton voltar = new JButton("voltar");
	private static JLabel titulo = new JLabel("Pessoas");
	private static JButton vendedor = new JButton("Vendedores");
	private static JButton cliente = new JButton("Clientes");
	private static JButton fornecedor = new JButton("Fornecedores");

	/**
	 * Define o tamanho e posi��o dos bot�es e do frame
	 * Implementa o ActionListener para que os bot�es possam reconhecer o click
	 * @author Juan Cerqueira
	 * @version 1.0 (Out 2021)
	 */
	public TelaPessoaMenu() {
		titulo.setFont(new Font("Arial", Font.BOLD, 20));
		titulo.setBounds(147, 10, 150, 30);
		
		principalPessoa.add(titulo);
		principalPessoa.add(vendedor);
		principalPessoa.add(cliente);
		principalPessoa.add(fornecedor);
		principalPessoa.add(voltar);
		
		cliente.setBounds(90, 50, 200, 30);
		vendedor.setBounds(90, 100, 200, 30);
		fornecedor.setBounds(90, 150, 200, 30);
		voltar.setBounds(10, 230, 70, 25);
		
		principalPessoa.setLayout(null);

		principalPessoa.setSize(400, 300);
		principalPessoa.setVisible(true);
		
		vendedor.addActionListener(this);
		cliente.addActionListener(this);
		fornecedor.addActionListener(this);
		voltar.addActionListener(this);
	}
	
	/**
	 * Redireciona o usu�rio para a tela desejada
	 * @author Juan Cerqueira
	 * @version 1.0 (Out 2021)
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		Object src = e.getSource();
		
		if(src == vendedor) {
			new VendedorMenu();
			principalPessoa.dispose();
		}
		
		if(src == cliente) {
			new ClienteMenu();
			principalPessoa.dispose();
			
		}
		
		if(src == fornecedor) {
			new FornecedorMenu();
			principalPessoa.dispose();
		}
		
		if (src == voltar) {
			new Principal();
			principalPessoa.dispose();

		}
	}
}
