package view.vendedor;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;

import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.text.MaskFormatter;

import controle.ControleVendedor;
import principal.Principal;

/**
 * Cria e configura o tamanho do frame de exibição
 * @author Juan Cerqueira
 * @version 1.0 (Out 2021)
 */
public class TelaApagaVendedor {
	private JFrame frame = new JFrame("Loja de Óculos");

	public TelaApagaVendedor() {
		frame.setSize(400, 280);

		JPanel panel = new JPanel();
		frame.add(panel);
		placeComponents(panel);

		frame.setVisible(true);
	}

	/**
	 * Adiciona um painel com um campo de preenchimento para o CPF,
	 * botão com opção de voltar para o menu anterior,
	 * botão para realizar a pesquisa
	 * @param panel painél que contém o campo de preenchimento e botões
	 * @author Juan Cerqueira
	 * @version 1.0 (Out 2021)
	 */
	private void placeComponents(JPanel panel) {
		panel.setLayout(null);

		MaskFormatter mascaraCpf = null;

		/**
		 * Adiciona uma máscara de CPF ao campo de preenchimento
		 * Limita o número de caracteres a serem inseridos
		 * @author Mateus Vinícius
		 * @version 1.0 (Out 2021)
		 */
		try {
			mascaraCpf = new MaskFormatter("###.###.###-##");
		} catch (ParseException e1) {

			System.err.println("Erro na formatação" + e1.getMessage());
			e1.printStackTrace();
		}

		JLabel instrucao = new JLabel("Digite o CPF ");
		instrucao.setBounds(20, 10, 80, 25);
		panel.add(instrucao);

		JFormattedTextField cpfApaga = new JFormattedTextField(mascaraCpf);
		cpfApaga.setBounds(110, 10, 100, 25);
		panel.add(cpfApaga);

		JButton apagarButton = new JButton("Apagar");
		apagarButton.setBounds(250, 10, 100, 25);
		panel.add(apagarButton);
		
		JButton voltarButton = new JButton("Cancelar");
		voltarButton.setBounds(10, 50, 85, 25);
		panel.add(voltarButton);

		voltarButton.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				Object src = e.getSource();

				if (src == voltarButton) {
					new VendedorMenu();
					frame.dispose();
				}
			}
		});

		apagarButton.addActionListener(new ActionListener() {

			/**
			 * Realiza o método de deleção do vendedor
			 * @author Mateus Vinícius
			 * @version 1.0 (Out 2021)
			 */
			@Override
			public void actionPerformed(ActionEvent e) {
				ControleVendedor controleVendedor = new ControleVendedor();
				controleVendedor.deletarVendedor(cpfApaga.getText());
				
				JOptionPane.showMessageDialog(null, "Vendedor excluído");

				new Principal();

				frame.dispose();
			}
		});
	}

}
