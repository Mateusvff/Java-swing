package view.cliente;

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

import controle.ControleCliente;
import principal.Principal;

public class TelaCadastroCliente {
	private static JFrame frame = new JFrame("Loja de Óculos");

	/**
	 * Cria e configura o tamanho do frame de exibição
	 * @author Juan Cerqueira
	 * @version 1.0 (Out 2021)
	 */
	public TelaCadastroCliente() {
		frame.setSize(400, 280);

		JPanel panel = new JPanel();
		frame.add(panel);
		placeComponents(panel);

		frame.setVisible(true);
	}

	/**
	 * Adiciona o painel e os componentes ao frame
	 * @author Juan Cerqueira
	 * @param panel painel que contém os componentes da tela
	 * @version 1.0 (Out 2021)
	 */
	private static void placeComponents(JPanel panel) {

		panel.setLayout(null);

		MaskFormatter mascaraCpf = null;
		MaskFormatter mascaraTel = null;

		/**
		 * Adiciona uma máscara de CPF ao campo de preenchimento
		 * Limita o número de caracteres a serem inseridos
		 * @author Mateus Vinícius
		 * @version 1.0 (Out 2021)
		 */
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
		nomeText.setBounds(100, 10, 185, 25);
		panel.add(nomeText);
		
		JLabel telefoneLabel = new JLabel("Telefone");
		telefoneLabel.setBounds(30, 40, 80, 25);
		panel.add(telefoneLabel);
		
		JFormattedTextField telefoneText = new JFormattedTextField(mascaraTel);
		telefoneText.setBounds(100, 40, 185, 25);
		panel.add(telefoneText);
		
		JLabel cidadeLabel = new JLabel("Cidade");
		cidadeLabel.setBounds(30, 70, 80, 25);
		panel.add(cidadeLabel);
		
		JTextField cidadeText = new JTextField(20);
		cidadeText.setBounds(100, 70, 185, 25);
		panel.add(cidadeText);
		
		JLabel cpfLabel = new JLabel("CPF");
		cpfLabel.setBounds(30, 100, 80, 25);
		panel.add(cpfLabel);
		
		JFormattedTextField cpfText = new JFormattedTextField(mascaraCpf);
		cpfText.setBounds(100, 100, 185, 25);
		panel.add(cpfText);
		
		JLabel emailLabel = new JLabel("Email");
		emailLabel.setBounds(30, 130, 80, 25);
		panel.add(emailLabel);
		
		JTextField emailText = new JTextField(20);
		emailText.setBounds(100, 130, 185, 25);
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
					new ClienteMenu();
					frame.dispose();
				}
			}
		});
		
		
		registerButton.addActionListener(new ActionListener() {
			
			/**
			 * Puxa os dados preenchidos na tela e aciona o método de cadastro de clientes
			 * @param e monitora a ação realizada no botão
			 * @author Mateus Vinícius
			 * @version 1.0 (Out 2021)
			 */
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