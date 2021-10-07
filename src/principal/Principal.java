package principal;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import controle.ControleCliente;
import controle.ControleFornecedor;
import controle.ControleOculos;
import controle.ControleVenda;
import controle.ControleVendedor;
import view.TelaPessoaMenu;
import view.oculos.OculosMenu;
import view.venda.VendaMenu;

/**
 * Inicia o sistema e exibe o menu principal com todas as funcionalidades
 * @author Mateus Vinícius
 * @version 1.0 (Out 2021)
 */
public class Principal implements ActionListener {
	private static JFrame principal = new JFrame("Loja de Óculos");
	private static JLabel titulo = new JLabel("Menu Principal");
	private static JButton produtos = new JButton("Produtos");
	private static JButton pessoas = new JButton("Pessoas");
	private static JButton vendas = new JButton("Vendas");
	
	/**
	 * Define o tamanho e posição dos botões e do frame
	 * @author Juan Cerqueira
	 * @version 1.0 (Out 2021)
	 */
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

	/**
	 * Implementa o ActionListener nos botões para que eles possam detectar o click
	 * @author Juan Cerqueira
	 * @version 1.0 (Out 2021)
	 */
	public static void main(String[] args) {
		
		Principal menu = new Principal(); 
		
		produtos.addActionListener(menu);
		pessoas.addActionListener(menu);
		vendas.addActionListener(menu);
		
		ControleCliente controleCliente = new ControleCliente();
		controleCliente.dados();
		
		ControleVendedor controleVendedor = new ControleVendedor();
		controleVendedor.dados();
		
		ControleFornecedor controleFornecedor = new ControleFornecedor();
		controleFornecedor.dados();
		
		ControleOculos controleOculos = new ControleOculos();
		controleOculos.dados();
		
		ControleVenda controleVenda = new ControleVenda();
		controleVenda.dados();
	}
	
	/**
	 * Redireciona o usuário para a tela da função desejada
	 * @author Juan Cerqueira
	 * @version (Out 2021)
	 */
	public void actionPerformed(ActionEvent e) {
		Object src = e.getSource();
		
		if (src == produtos) {
			new OculosMenu();
			principal.dispose();
		}
		
		if (src == pessoas) {
			new TelaPessoaMenu();
			principal.dispose();
		}
		
		if (src == vendas) {
			new VendaMenu();
			principal.dispose();
		}

	}
}