package view.venda;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import controle.ControleCliente;
import view.Principal;

public class TelaCadastroVenda {
	private static JFrame frame = new JFrame("Loja de Óculos");

	public TelaCadastroVenda() {
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

	//!!!!!! ALTERAR DADOS !!!!!!!!
	private static void placeComponents(JPanel panel) {

		panel.setLayout(null);

		JLabel nomeLabel = new JLabel("Produto");
		nomeLabel.setBounds(70, 10, 80, 25);
		panel.add(nomeLabel);

		JTextField nomeText = new JTextField(20);
		nomeText.setBounds(140, 10, 160, 25);
		panel.add(nomeText);
		
		JLabel telefoneLabel = new JLabel("Telefone");
		telefoneLabel.setBounds(70, 40, 80, 25);
		panel.add(telefoneLabel);
		
		JTextField telefoneText = new JTextField(20);
		telefoneText.setBounds(140, 40, 160, 25);
		panel.add(telefoneText);
		
		JLabel cidadeLabel = new JLabel("Cidade");
		cidadeLabel.setBounds(70, 70, 80, 25);
		panel.add(cidadeLabel);
		
		JTextField cidadeText = new JTextField(20);
		cidadeText.setBounds(140, 70, 160, 25);
		panel.add(cidadeText);
		
		JLabel cpfLabel = new JLabel("CPF");
		cpfLabel.setBounds(70, 100, 80, 25);
		panel.add(cpfLabel);
		
		JTextField cpfText = new JTextField(20);
		cpfText.setBounds(140, 100, 160, 25);
		panel.add(cpfText);
		
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
				String telefone = telefoneText.getText();
				String cidade = cidadeText.getText();
				String cpf = cpfText.getText();
				String email = emailText.getText();
				
				ControleCliente controleCliente = new ControleCliente();
				controleCliente.cadastroClientes(nome, telefone, cidade, cpf, email);
				
				JOptionPane.showMessageDialog(null, "Cadastro realizado");
				
				new Principal();
				
				frame.dispose();
			}
		});
	}
}
