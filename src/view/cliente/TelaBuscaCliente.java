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

import controle.ControleCliente;
import view.Principal;

public class TelaBuscaCliente{
	private static JFrame frame = new JFrame("Loja de Óculos");

	public TelaBuscaCliente() {
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

		JFormattedTextField cpfBusca = new JFormattedTextField(mascaraCpf);
		cpfBusca.setBounds(110, 10, 100, 25);
		panel.add(cpfBusca);

		JButton registerButton = new JButton("Buscar");
		registerButton.setBounds(250, 10, 100, 25);
		panel.add(registerButton);

		registerButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				String cpf = cpfBusca.getText();

				ControleCliente controleCliente = new ControleCliente();
				String retorno = controleCliente.buscarClientes(cpf);
				
				System.out.println(retorno);
				
				new Principal();

				frame.dispose();
			}
		});
	}
}
