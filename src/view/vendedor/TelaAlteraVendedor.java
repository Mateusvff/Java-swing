package view.vendedor;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;

import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.text.MaskFormatter;

import controle.ControleVendedor;
import modelo.pessoas.Vendedor;

public class TelaAlteraVendedor implements ActionListener {
	private JFrame frame = new JFrame("Loja de Óculos");

	private JPanel panel = new JPanel();

	private JButton registerButton = new JButton("Alterar");
	private JButton salvarButton = new JButton("Salvar alterações");

	private JFormattedTextField cpfAltera;
	
	private JTextField nomeText;
	private JTextField emailText2;
	private JTextField salarioText2;
	
	private JFormattedTextField telefoneText;
	private JFormattedTextField cpfText;
	
	Vendedor vendedorSelecionado = null;

	public TelaAlteraVendedor() {
		frame.setSize(400, 350);
		frame.setLocationRelativeTo(null);
		frame.getContentPane().add(createJPanel());
		frame.setVisible(true);
	}

	private JPanel createJPanel() {
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

		JLabel instrucao = new JLabel("Digite o CPF ");
		instrucao.setBounds(20, 10, 80, 25);
		panel.add(instrucao);

		cpfAltera = new JFormattedTextField(mascaraCpf);
		cpfAltera.setBounds(110, 10, 100, 25);
		panel.add(cpfAltera);

		registerButton.setBounds(250, 10, 100, 25);
		registerButton.addActionListener(this);
		panel.add(registerButton);

		JLabel nomeLabel = new JLabel("Nome");
		nomeLabel.setBounds(20, 50, 80, 25);
		panel.add(nomeLabel);

		nomeText = new JTextField(20);
		nomeText.setBounds(110, 50, 240, 25);
		panel.add(nomeText);

		JLabel nomeLabel2 = new JLabel("Telefone");
		nomeLabel2.setBounds(20, 90, 80, 25);
		panel.add(nomeLabel2);

		telefoneText = new JFormattedTextField(mascaraTel);
		telefoneText.setBounds(110, 90, 240, 25);
		panel.add(telefoneText);

		JLabel nomeLabel3 = new JLabel("CPF");
		nomeLabel3.setBounds(20, 130, 80, 25);
		panel.add(nomeLabel3);

		cpfText.setBounds(110, 130, 240, 25);
		panel.add(cpfText);

		JLabel nomeLabel4 = new JLabel("Email");
		nomeLabel4.setBounds(20, 170, 80, 25);
		panel.add(nomeLabel4);

		emailText2 = new JTextField(20);
		emailText2.setBounds(110, 170, 240, 25);
		panel.add(emailText2);

		JLabel nomeLabel5 = new JLabel("Salário");
		nomeLabel5.setBounds(20, 210, 80, 25);
		panel.add(nomeLabel5);

		salarioText2 = new JTextField(20);
		salarioText2.setBounds(110, 210, 240, 25);
		panel.add(salarioText2);

		salvarButton.setBounds(100, 260, 200, 25);
		salvarButton.addActionListener(this);
		panel.add(salvarButton);

		return panel;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object src = e.getSource();

		if (src == registerButton) {
			ControleVendedor controleVendedor = new ControleVendedor();

			vendedorSelecionado = controleVendedor.buscarVendedor(cpfAltera.getText());

			if (vendedorSelecionado != null) {
				nomeText.setText(vendedorSelecionado.getNome());
				telefoneText.setText(vendedorSelecionado.getTelefone());
				cpfText.setText(vendedorSelecionado.getCpf());
				emailText2.setText(vendedorSelecionado.getEmail());
				salarioText2.setText(Double.toString(vendedorSelecionado.getSalario()));
			}
		}
		
		if (src == salvarButton) {
			if(vendedorSelecionado != null) {
				String nome = nomeText.getText();
				String telefone = telefoneText.getText();
				String cpf = cpfText.getText();
				String email = emailText2.getText();
				String salario = salarioText2.getText();
				
				ControleVendedor controleVendedor = new ControleVendedor();
				controleVendedor.atualizarVendedor(vendedorSelecionado, nome, telefone, cpf, email, Double.parseDouble(salario));
				
//				frame.dispose();
			}
		}
	}
}
