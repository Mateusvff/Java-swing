package view.fornecedor;

import java.text.ParseException;

import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.text.MaskFormatter;

public class TelaVisualizaFornecedor {
	private static JFrame frame = new JFrame("Loja de Óculos");

	public TelaVisualizaFornecedor() {
		frame.setSize(400, 280);

		JPanel panel = new JPanel();
		frame.add(panel);
		placeComponents(panel);

		frame.setVisible(true);
	}

	private void placeComponents(JPanel panel) {
		panel.setLayout(null);

		MaskFormatter mascaraCnpj = null;

		try {
			mascaraCnpj = new MaskFormatter("##.###.###/0001-##");
		} catch (ParseException e1) {

			System.err.println("Erro na formatação" + e1.getMessage());
			e1.printStackTrace();
		}

		JLabel instrucao = new JLabel("Digite o CNPJ ");
		instrucao.setBounds(20, 10, 120, 25);
		panel.add(instrucao);

		JFormattedTextField cnpjVisualiza = new JFormattedTextField(mascaraCnpj);
		cnpjVisualiza.setBounds(130, 10, 150, 25);
		panel.add(cnpjVisualiza);

		JButton registerButton = new JButton("Visualizar");
		registerButton.setBounds(290, 10, 90, 25);
		panel.add(registerButton);
	}

}
