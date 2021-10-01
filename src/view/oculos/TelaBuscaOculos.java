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
import controle.ControleOculos;
import view.Principal;

public class TelaBuscaOculos {
	private static JFrame frame = new JFrame("Loja de Óculos");

	public TelaBuscaOculos() {
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

		JFormattedTextField idBusca = new JFormattedTextField(mascaraId);
		idBusca.setBounds(110, 10, 100, 25);
		panel.add(idBusca);
		
		JButton registerButton = new JButton("Buscar");
		registerButton.setBounds(250, 10, 100, 25);
		panel.add(registerButton);
		
		registerButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				String id = idBusca.getText();

				ControleOculos controleOculos = new ControleOculos();
				String retorno = controleOculos.buscarOculos(id);

				new Principal();

				frame.dispose();
			}

		});
	}

}
