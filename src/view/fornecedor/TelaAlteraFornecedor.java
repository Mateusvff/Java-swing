package view.fornecedor;

import java.text.ParseException;

import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.text.MaskFormatter;

public class TelaAlteraFornecedor {
	private static JFrame frame = new JFrame("Loja de Óculos");

	public TelaAlteraFornecedor() {
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

		JFormattedTextField cnpjAltera = new JFormattedTextField(mascaraCnpj);
		cnpjAltera.setBounds(130, 10, 150, 25);
		panel.add(cnpjAltera);
		
		JButton registerButton = new JButton("Alterar");
		registerButton.setBounds(290, 10, 80, 25);
		panel.add(registerButton);

	}

}
