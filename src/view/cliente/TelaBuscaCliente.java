package view.cliente;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.text.MaskFormatter;

import controle.ControleCliente;
import modelo.pessoas.Cliente;
import principal.Principal;

public class TelaBuscaCliente{
	private static JFrame frame = new JFrame("Loja de Óculos");
	private DefaultListModel<String> listModel = new DefaultListModel<>();

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

		JButton buscaButton = new JButton("Buscar");
		buscaButton.setBounds(250, 10, 85, 25);
		panel.add(buscaButton);

		JButton cancelarButton = new JButton("Cancelar");
		cancelarButton.setBounds(250, 45, 85, 25);
		panel.add(cancelarButton);
		
		JLabel texto = new JLabel("Clientes encontrados");
		texto.setBounds(10, 55, 200, 25);
		panel.add(texto);

		JList<String> listaClientes = new JList<>(listModel);
		listaClientes.setBounds(10, 80, 365, 155);
		panel.add(listaClientes);
		
		cancelarButton.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				Object src = e.getSource();

				if (src == cancelarButton) {
					new ClienteMenu();
					frame.dispose();
				}
			}
		});
		
		buscaButton.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				ControleCliente controleCliente = new ControleCliente();
				Cliente retorno = controleCliente.buscarClientes1(cpfBusca.getText());
				
				listModel.addElement(retorno.getNome() + " - " + retorno.getTelefone() + " - " + retorno.getCpf() + 
					     " - " + retorno.getCidade() + " - " + retorno.getEmail());
				
				new Principal();

				frame.dispose();
			}
		});
	}
}
