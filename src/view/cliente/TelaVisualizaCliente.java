package view.cliente;

import java.text.ParseException;

import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.text.MaskFormatter;

public class TelaVisualizaCliente {
	private static JFrame frame = new JFrame("Loja de Óculos");

	public TelaVisualizaCliente() {
		frame.setSize(400, 280);

		JPanel panel = new JPanel();
		frame.add(panel);
		placeComponents(panel);

		frame.setVisible(true);
	}

	private void placeComponents(JPanel panel) {
		panel.setLayout(null);
		
		MaskFormatter mascaraCpf = null;

		try {
			mascaraCpf = new MaskFormatter("###.###.###-##");
		} catch (ParseException e1) {

			System.err.println("Erro na formatação" + e1.getMessage());
			e1.printStackTrace();
		}
		
		JLabel instrucao = new JLabel("Digite o CPF ");
		instrucao.setBounds(20, 10, 80, 25);
		panel.add(instrucao);

		JFormattedTextField cpfVisualiza = new JFormattedTextField(mascaraCpf);
		cpfVisualiza.setBounds(110, 10, 100, 25);
		panel.add(cpfVisualiza);
		
		JButton registerButton = new JButton("Visualizar");
		registerButton.setBounds(250, 10, 100, 25);
		panel.add(registerButton);

	}
}
