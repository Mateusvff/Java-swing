package view;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TelaCadastroArmacao {

	public static void main(String[] args) {
		JFrame frame = new JFrame("Loja de Óculos");
		frame.setSize(400, 300);

		JPanel panel = new JPanel();
		frame.add(panel);
		placeComponents(panel);

		frame.setVisible(true);
	}

	private static void placeComponents(JPanel panel) {

		panel.setLayout(null);

		JLabel marcaLabel = new JLabel("Marca");
		marcaLabel.setBounds(70, 10, 80, 25);
		panel.add(marcaLabel);

		JTextField marcaText = new JTextField(20);
		marcaText.setBounds(140, 10, 160, 25);
		panel.add(marcaText);

		JLabel modeloLabel = new JLabel("Modelo");
		modeloLabel.setBounds(70, 40, 80, 25);
		panel.add(modeloLabel);
		
		JTextField modeloText = new JTextField(20);
		modeloText.setBounds(140, 40, 160, 25);
		panel.add(modeloText);
		
		JLabel materialLabel = new JLabel("Material");
		materialLabel.setBounds(70, 70, 80, 25);
		panel.add(materialLabel);
		
		JTextField materialText = new JTextField(20);
		materialText.setBounds(140, 70, 160, 25);
		panel.add(materialText);
		
		JLabel corLabel = new JLabel("Cor");
		corLabel.setBounds(70, 100, 80, 25);
		panel.add(corLabel);
		
		JTextField corText = new JTextField(20);
		corText.setBounds(140, 100, 160, 25);
		panel.add(corText);
		
		JLabel generoLabel = new JLabel("Gênero");
		generoLabel.setBounds(70, 130, 80, 25);
		panel.add(generoLabel);
		
		JTextField generoText = new JTextField(20);
		generoText.setBounds(140, 130, 160, 25);
		panel.add(generoText);
		
		JButton registerButton = new JButton("Cadastrar");
		registerButton.setBounds(140, 200, 100, 25);
		panel.add(registerButton);
	}
}