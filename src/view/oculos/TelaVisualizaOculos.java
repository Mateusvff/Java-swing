package view.oculos;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;

import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.text.MaskFormatter;

public class TelaVisualizaOculos {
	private static JFrame frame = new JFrame("Loja de Óculos");

	public TelaVisualizaOculos() {
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

		JFormattedTextField idVisualiza = new JFormattedTextField(mascaraId);
		idVisualiza.setBounds(110, 10, 100, 25);
		panel.add(idVisualiza);
		
		JButton registerButton = new JButton("Visualizar");
		registerButton.setBounds(250, 10, 100, 25);
		panel.add(registerButton);
		
		JButton visualizarButton = new JButton("Cancelar");
		visualizarButton.setBounds(10, 50, 85, 25);
		panel.add(visualizarButton);

		visualizarButton.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				Object src = e.getSource();

				if (src == visualizarButton) {
					new OculosMenu();
					frame.dispose();
				}
			}
		});
	}

}
