package view.fornecedor;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import controle.ControleCliente;
import controle.ControleFornecedor;
import controle.ControleVendedor;
import view.TelaPrincipal;

public class TelaCadastroFornecedor {
	private static JFrame frame = new JFrame("Loja de Óculos");

	public TelaCadastroFornecedor() {
		frame.setSize(400, 280);

		JPanel panel = new JPanel();
		frame.add(panel);
		placeComponents(panel);

		frame.setVisible(true);
	}

	public static void main(String[] args) {
		frame.setSize(400, 280);

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

		JLabel cnpjLabel = new JLabel("CNPJ");
		cnpjLabel.setBounds(70, 40, 80, 25);
		panel.add(cnpjLabel);

		JTextField cnpjText = new JTextField(20);
		cnpjText.setBounds(140, 40, 160, 25);
		panel.add(cnpjText);

		JLabel telefoneLabel = new JLabel("Telefone");
		telefoneLabel.setBounds(70, 70, 80, 25);
		panel.add(telefoneLabel);

		JTextField telefoneText = new JTextField(20);
		telefoneText.setBounds(140, 70, 160, 25);
		panel.add(telefoneText);

		JLabel enderecoLabel = new JLabel("Endereço");
		enderecoLabel.setBounds(70, 100, 80, 25);
		panel.add(enderecoLabel);

		JTextField enderecoText = new JTextField(20);
		enderecoText.setBounds(140, 100, 160, 25);
		panel.add(enderecoText);

		JLabel emailLabel = new JLabel("Email");
		emailLabel.setBounds(70, 130, 80, 25);
		panel.add(emailLabel);

		JTextField emailText = new JTextField(20);
		emailText.setBounds(140, 130, 160, 25);
		panel.add(emailText);

		JButton registerButton = new JButton("Cadastrar");
		registerButton.setBounds(140, 180, 100, 25);
		panel.add(registerButton);

		registerButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String nome = nomeText.getText();
				String cnpj = cnpjText.getText();
				String telefone = telefoneText.getText();
				String endereco = enderecoText.getText();
				String email = emailText.getText();

				ControleFornecedor controleFornecedor = new ControleFornecedor();
				controleFornecedor.cadastroFornecedor(nome, cnpj, telefone, endereco, email);

				JOptionPane.showMessageDialog(null, "Cadastro realizado");

				new TelaPrincipal();
			}
		});
	}
}