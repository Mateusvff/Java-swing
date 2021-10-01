package view.oculos;

import java.text.ParseException;

import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.text.MaskFormatter;

public class TelaApagaOculos {
	private static JFrame frame = new JFrame("Loja de Óculos");

	public TelaApagaOculos() {
		frame.setSize(400, 280);

		JPanel panel = new JPanel();
		frame.add(panel);
		placeComponents(panel);

		frame.setVisible(true);
	}

	private void placeComponents(JPanel panel) {
	panel.setLayout(null);
		
		MaskFormatter mascaraId = null;

		try {
			mascaraId = new MaskFormatter("#####");
		} catch (ParseException e1) {

			System.err.println("Erro na formatação" + e1.getMessage());
			e1.printStackTrace();
		}
		
		JLabel instrucao = new JLabel("Digite o ID ");
		instrucao.setBounds(20, 10, 80, 25);
		panel.add(instrucao);

		JFormattedTextField idApaga = new JFormattedTextField(mascaraId);
		idApaga.setBounds(110, 10, 100, 25);
		panel.add(idApaga);
		
		JButton registerButton = new JButton("Apagar");
		registerButton.setBounds(250, 10, 100, 25);
		panel.add(registerButton);
	}
	
}
