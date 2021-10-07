package view.fornecedor;

import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.*;

import view.TelaPessoaMenu;

/**
 * Exibe as opções referentes aos fornecedores da loja
 * @author Juan Cerqueira
 * @version 1.0 (Out 2021)
 */
public class FornecedorMenu implements ActionListener {
	private static JFrame principalFornecedor = new JFrame("Loja de Óculos");
	private static JLabel titulo = new JLabel("Fornecedores");
	private static JButton visualizar = new JButton("Visualizar");
	private static JButton cadastrar = new JButton("Cadastrar");
	private static JButton deletar = new JButton("Deletar");
	private static JButton buscar = new JButton("Buscar");
	private static JButton voltar = new JButton("Voltar");

	/**
	 * Define o tamanho e posição dos botões e do frame
	 * Implementa o ActionListener para que os botões possam reconhecer o click
	 * @author Juan Cerqueira
	 * @version 1.0 (Out 2021)
	 */
	public FornecedorMenu() {
		titulo.setFont(new Font("Arial", Font.BOLD, 20));
		titulo.setBounds(125, 10, 150, 30);

		principalFornecedor.add(titulo);
		principalFornecedor.add(visualizar);
		principalFornecedor.add(cadastrar);
		principalFornecedor.add(deletar);
		principalFornecedor.add(buscar);
		principalFornecedor.add(voltar);

		cadastrar.setBounds(140, 50, 100, 30);
		visualizar.setBounds(140, 100, 100, 30);
		deletar.setBounds(140, 150, 100, 30);
		buscar.setBounds(140, 200, 100, 30);
		voltar.setBounds(10, 230, 70, 25);

		principalFornecedor.setLayout(null);

		principalFornecedor.setSize(400, 300);
		principalFornecedor.setVisible(true);

		visualizar.addActionListener(this);
		cadastrar.addActionListener(this);
		deletar.addActionListener(this);
		buscar.addActionListener(this);
		voltar.addActionListener(this);
	}

	/**
	 * Redireciona o usuário para a tela desejada
	 * @author Juan Cerqueira
	 * @version 1.0 (Out 2021)
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		Object src = e.getSource();

		if (src == visualizar) {
			new TelaVisualizaFornecedor();
			principalFornecedor.dispose();

		}

		if (src == cadastrar) {
			new TelaCadastroFornecedor();
			principalFornecedor.dispose();
		}

		if (src == deletar) {
			new TelaApagaFornecedor();
			principalFornecedor.dispose();
		}

		if (src == buscar) {
			new TelaBuscaFornecedor();
			principalFornecedor.dispose();
		}

		if (src == voltar) {
			new TelaPessoaMenu();
			principalFornecedor.dispose();
		}
	}
}
