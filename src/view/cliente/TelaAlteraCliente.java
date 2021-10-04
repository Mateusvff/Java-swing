package view.cliente;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;

import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.text.MaskFormatter;

public class TelaAlteraCliente {
	private static JFrame frame = new JFrame("Loja de Óculos");

	public TelaAlteraCliente() {
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

		JFormattedTextField cpfAltera = new JFormattedTextField(mascaraCpf);
		cpfAltera.setBounds(110, 10, 100, 25);
		panel.add(cpfAltera);
		
		JButton registerButton = new JButton("Alterar");
		registerButton.setBounds(250, 10, 100, 25);
		panel.add(registerButton);
		
		JButton voltar = new JButton("Cancelar");
		voltar.setBounds(10, 50, 85, 25);
		panel.add(voltar);

		voltar.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				Object src = e.getSource();

				if (src == voltar) {
					new ClienteMenu();
					frame.dispose();
				}
			}
		});

	}
}
