package view.vendedor;

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
import controle.ControleVendedor;

public class TelaCadastroVendedor {
	private static JFrame frame = new JFrame("Loja de Óculos");

	public TelaCadastroVendedor() {
		frame.setSize(400, 280);

		JPanel panel = new JPanel();
		frame.add(panel);
		placeComponents(panel);

		frame.setVisible(true);
	}

	private static void placeComponents(JPanel panel) {

	panel.setLayout(null);
	
	MaskFormatter mascaraCpf = null;
	MaskFormatter mascaraTel = null;

	try {
		mascaraCpf = new MaskFormatter("###.###.###-##");
		mascaraTel = new MaskFormatter("(##) #####-####");
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
	
	JLabel telefoneLabel = new JLabel("Telefone");
	telefoneLabel.setBounds(30, 40, 80, 25);
	panel.add(telefoneLabel);

	JFormattedTextField telefoneText = new JFormattedTextField(mascaraTel);
	telefoneText.setBounds(100, 40, 180, 25);
	panel.add(telefoneText);

	JLabel cpfLabel = new JLabel("CPF");
	cpfLabel.setBounds(30, 70, 80, 25);
	panel.add(cpfLabel);
	
	JFormattedTextField cpfText = new JFormattedTextField(mascaraCpf);
	cpfText.setBounds(100, 70, 180, 25);
	panel.add(cpfText);
	
	JLabel emailLabel = new JLabel("Email");
	emailLabel.setBounds(30, 100, 80, 25);
	panel.add(emailLabel);
	
	JTextField emailText = new JTextField(20);
	emailText.setBounds(100, 100, 180, 25);
	panel.add(emailText);
	
	JLabel salarioLabel = new JLabel("Salário");
	salarioLabel.setBounds(30, 130, 80, 25);
	panel.add(salarioLabel);
	
	JTextField salarioText = new JTextField(20);
	salarioText.setBounds(100, 130, 180, 25);
	panel.add(salarioText);
	
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
				new VendedorMenu();
				frame.dispose();
			}
		}
	});
	
	registerButton.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			String nome = nomeText.getText();
			String telefone = telefoneText.getText();
			String cpf = cpfText.getText();
			String email = emailText.getText();
			double salario = Double.parseDouble(salarioText.getText());
			
			ControleVendedor controleVendedor = new ControleVendedor();
			controleVendedor.cadastroVendedor(nome, telefone, cpf, email, salario);
			
			JOptionPane.showMessageDialog(null, "Cadastro realizado");
			new VendedorMenu();
			frame.dispose();
		}
	});
}
}