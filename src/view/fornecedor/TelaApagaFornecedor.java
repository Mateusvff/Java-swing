package view.fornecedor;

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

import controle.ControleFornecedor;
import view.TelaPessoaMenu;

/**
 * Cria e configura o tamanho do frame de exibição
 * @author Juan Cerqueira
 * @version 1.0 (Out 2021)
 */
public class TelaApagaFornecedor {
	private static JFrame frame = new JFrame("Loja de Óculos");

	public TelaApagaFornecedor() {
		frame.setSize(400, 130);

		JPanel panel = new JPanel();
		frame.add(panel);
		placeComponents(panel);

		frame.setVisible(true);
	}

	private void placeComponents(JPanel panel) {
		panel.setLayout(null);

		MaskFormatter mascaraCnpj = null;

		/**
		 * Adiciona uma máscara de CNPJ ao campo de preenchimento
		 * Limita o número de caracteres a serem inseridos
		 * @author Mateus Vinícius
		 * @version 1.0 (Out 2021)
		 */
		try {
			mascaraCnpj = new MaskFormatter("##.###.###/0001-##");
		} catch (ParseException e1) {

			System.err.println("Erro na formatação" + e1.getMessage());
			e1.printStackTrace();
		}

		JLabel instrucao = new JLabel("Digite o CNPJ ");
		instrucao.setBounds(20, 10, 120, 25);
		panel.add(instrucao);

		JFormattedTextField cnpjApaga = new JFormattedTextField(mascaraCnpj);
		cnpjApaga.setBounds(110, 10, 85, 25);
		panel.add(cnpjApaga);

		JButton apagaButton = new JButton("Apagar");
		apagaButton.setBounds(10, 50, 85, 25);
		panel.add(apagaButton);
		
		JButton voltar = new JButton("Cancelar");
		voltar.setBounds(110, 50, 85, 25);
		panel.add(voltar);

		apagaButton.addActionListener(new ActionListener() {

			/**
			 * Realiza o método de deleção de fornecedor
			 * @author Mateus Vinícius
			 * @version 1.0 (Out 2021)
			 */
			public void actionPerformed(ActionEvent e) {
				ControleFornecedor controleFornecedor = new ControleFornecedor();
				controleFornecedor.deletarFornecedor(cnpjApaga.getText());
				frame.dispose();

				JOptionPane.showMessageDialog(null, "Cliente excluído!");
				new TelaPessoaMenu();	
			}
			
		});
		
		voltar.addActionListener(new ActionListener() {

			/**
			 * Retorna para o menu anterior ao clickar no botão
			 * @author Juan Cerqueira
			 * @version 1.0 (Out 2021)
			 */
			public void actionPerformed(ActionEvent e) {
				Object src = e.getSource();

				if (src == voltar) {
					new FornecedorMenu();
					frame.dispose();
				}
			}
		});
	}

}
