package view.venda;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

import principal.Principal;


/**
 * Exibe as op��es referentes ao produto da loja
 * @author Juan Cerqueira
 * @version 1.0 (Out 2021)
 */
public class VendaMenu implements ActionListener{
	private static JFrame principalVendas = new JFrame("Loja de �culos");
	private static JLabel titulo = new JLabel("Vendas");
	private static JButton visualizar = new JButton("Visualizar");
	private static JButton cadastrar = new JButton("Cadastrar");
	private static JButton voltar = new JButton("Voltar");

	/**
	 * Define o tamanho e posi��o dos bot�es
	 * Implementa o ActionListener para que os bot�es possam reconhecer o click
	 * @author Juan Cerqueira
	 * @version 1.0 (Out 2021)
	 */
	public VendaMenu() {
		titulo.setFont(new Font("Arial", Font.BOLD, 20));
		titulo.setBounds(152, 10, 150, 30);
		
		principalVendas.add(titulo);
		principalVendas.add(cadastrar);
		principalVendas.add(visualizar);
		principalVendas.add(voltar);
		
		cadastrar.setBounds(140, 50, 100, 30);
		visualizar.setBounds(140, 100, 100, 30);
		voltar.setBounds(10, 150, 70, 25);
		
		principalVendas.setLayout(null);

		principalVendas.setSize(400, 220);
		principalVendas.setVisible(true);
		
		visualizar.addActionListener(this);
		cadastrar.addActionListener(this);
		voltar.addActionListener(this);
	}

	/**
	 * Redireciona o usu�rio para a tela desejada
	 * @author Juan Cerqueira
	 * @version 1.0 (Out 2021)
	 */
	public void actionPerformed(ActionEvent e) {
		Object src = e.getSource();
		
		if (src == visualizar) {
			new TelaVisualizaVenda();
			principalVendas.dispose();
		}

		if (src == cadastrar) {
			new TelaCadastroVenda();
			principalVendas.dispose();
		}
		if (src == voltar) {
			new Principal();
			principalVendas.dispose();
		}
	}
}
