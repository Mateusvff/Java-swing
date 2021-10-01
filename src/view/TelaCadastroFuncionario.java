package view;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TelaCadastroFuncionario {

	public static void main(String[] args) {
		JFrame frame = new JFrame("Loja de �culos");
		frame.setSize(400, 250);

		JPanel panel = new JPanel();
		frame.add(panel);
		placeComponents(panel);

		frame.setVisible(true);
	}

	private static void placeComponents(JPanel panel) {

		panel.setLayout(null);

		JLabel nomeLabel = new JLabel("Nome");
		nomeLabel.setBounds(70, 10, 80, 25);
		panel.add(nomeLabel);

		JTextField nomeText = new JTextField(20);
		nomeText.setBounds(140, 10, 160, 25);
		panel.add(nomeText);

		JLabel cpfLabel = new JLabel("CPF");
		cpfLabel.setBounds(70, 40, 80, 25);
		panel.add(cpfLabel);
		
		JTextField cpfText = new JTextField(20);
		cpfText.setBounds(140, 40, 160, 25);
		panel.add(cpfText);
		
		JLabel emailLabel = new JLabel("Email");
		emailLabel.setBounds(70, 70, 80, 25);
		panel.add(emailLabel);
		
		JTextField emailText = new JTextField(20);
		emailText.setBounds(140, 70, 160, 25);
		panel.add(emailText);
		
		JLabel salarioLabel = new JLabel("Sal�rio");
		salarioLabel.setBounds(70, 100, 80, 25);
		panel.add(salarioLabel);
		
		JTextField salarioText = new JTextField(20);
		salarioText.setBounds(140, 100, 160, 25);
		panel.add(salarioText);
		
		JButton registerButton = new JButton("Cadastrar");
		registerButton.setBounds(140, 150, 100, 25);
		panel.add(registerButton);
	}
}