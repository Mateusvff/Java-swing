package view.cliente;

import java.text.ParseException;

import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.text.MaskFormatter;

import controle.ControleCliente;

public class TelaApagaCliente {
	private static JFrame frame = new JFrame("Loja de �culos");

	public TelaApagaCliente() {
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

			System.err.println("Erro na formata��o" + e1.getMessage());
			e1.printStackTrace();
		}
		
		JLabel instrucao = new JLabel("Digite o CPF ");
		instrucao.setBounds(20, 10, 80, 25);
		panel.add(instrucao);

		JFormattedTextField cpfApaga = new JFormattedTextField(mascaraCpf);
		cpfApaga.setBounds(110, 10, 100, 25);
		panel.add(cpfApaga);
		
		ControleCliente controleCliente = new ControleCliente();
		controleCliente.deletarClientes(cpfApaga);
		
		JButton registerButton = new JButton("Apagar");
		registerButton.setBounds(250, 10, 100, 25);
		panel.add(registerButton);
	}
}