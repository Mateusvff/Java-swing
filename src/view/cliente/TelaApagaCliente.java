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
import javax.swing.text.MaskFormatter;

import controle.ControleCliente;
import view.Principal;

public class TelaApagaCliente {
	private static JFrame frame = new JFrame("Loja de Óculos");

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

			System.err.println("Erro na formatação" + e1.getMessage());
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
		
		JButton voltar = new JButton("Cancelar");
		voltar.setBounds(10, 50, 85, 25);
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

			@Override
			public void actionPerformed(ActionEvent e) {
				ControleCliente controleCliente = new ControleCliente();
				controleCliente.deletarClientes(cpfApaga);
				
				JOptionPane.showMessageDialog(null, "Cliente excluído");

				new Principal();

				frame.dispose();
			}
		});
		
		
	}
}
