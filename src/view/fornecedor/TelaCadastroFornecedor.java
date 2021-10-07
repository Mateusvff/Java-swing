package view.fornecedor;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;

import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.text.MaskFormatter;
import controle.ControleFornecedor;
import principal.Principal;

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
		
		MaskFormatter mascaraTel = null;
		MaskFormatter mascaraCnpj = null;

		try {
			mascaraTel = new MaskFormatter("(##)#####-####");
			mascaraCnpj = new MaskFormatter("##.###.###/0001-##");
		} catch (ParseException e1) {

			System.err.println("Erro na formatação" + e1.getMessage());
			e1.printStackTrace();
		}

		JLabel nomeLabel = new JLabel("Nome");
		nomeLabel.setBounds(30, 10, 80, 25);
		panel.add(nomeLabel);

		JTextField nomeText = new JTextField(20);
		nomeText.setBounds(100, 10, 180, 25);
		panel.add(nomeText);

		JLabel cnpjLabel = new JLabel("CNPJ");
		cnpjLabel.setBounds(30, 40, 80, 25);
		panel.add(cnpjLabel);

		JFormattedTextField cnpjText = new JFormattedTextField(mascaraCnpj);
		cnpjText.setBounds(100, 40, 180, 25);
		panel.add(cnpjText);

		JLabel telefoneLabel = new JLabel("Telefone");
		telefoneLabel.setBounds(30, 70, 80, 25);
		panel.add(telefoneLabel);

		JFormattedTextField telefoneText = new JFormattedTextField(mascaraTel);
		telefoneText.setBounds(100, 70, 180, 25);
		panel.add(telefoneText);

		JLabel enderecoLabel = new JLabel("Endereço");
		enderecoLabel.setBounds(30, 100, 80, 25);
		panel.add(enderecoLabel);

		JTextField enderecoText = new JTextField(20);
		enderecoText.setBounds(100, 100, 180, 25);
		panel.add(enderecoText);

		JLabel emailLabel = new JLabel("Email");
		emailLabel.setBounds(30, 130, 80, 25);
		panel.add(emailLabel);

		JTextField emailText = new JTextField(20);
		emailText.setBounds(100, 130, 180, 25);
		panel.add(emailText);

		JButton registerButton = new JButton("Cadastrar");
		registerButton.setBounds(100, 180, 90, 25);
		panel.add(registerButton);
		
		JButton voltar = new JButton("Cancelar");
		voltar.setBounds(195, 180, 85, 25);
		panel.add(voltar);
		

		voltar.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				Object src = e.getSource();

				if (src == voltar) {
					new FornecedorMenu();
					frame.dispose();
				}
			}
		});

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

				new Principal();
				frame.dispose();
			}
		});
	}
}