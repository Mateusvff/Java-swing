package view.cliente;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;

import controle.ControleCliente;
import modelo.pessoas.Cliente;

public class TelaVisualizaCliente {
	private JFrame frame = new JFrame("Loja de Óculos");
	private DefaultListModel<String> listaClientes = new DefaultListModel<>();
	private JLabel label = new JLabel("Ainda não há clientes cadastrados na loja");
	private JButton voltar = new JButton("Voltar");

	public TelaVisualizaCliente() {
		frame.setSize(400, 280);

		JPanel panel = new JPanel();
		frame.add(panel);
		placeComponents(panel);
		frame.setVisible(true);

		label.setBounds(10, 10, 150, 30);
		
	}

	private void placeComponents(JPanel panel) {
		if (ControleCliente.clientes.isEmpty()) {
			panel.add(label);
		} else {
			for (int i = 0; i < ControleCliente.clientes.size(); i++) {
				Cliente clientes = ControleCliente.clientes.get(i);
				listaClientes.addElement("Nome: " + clientes.getNome() +  " - " + "CPF: " + clientes.getCpf());
			}
		}
		
		voltar.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				Object src = e.getSource();

				if (src == voltar) {
					new ClienteMenu();
					frame.dispose();
				}
			}
		});

		JList<String> jList = new JList<>(listaClientes);
		jList.setBounds(0, 0, 400, 280);

		panel.add(jList);
		panel.add(voltar);
	}
}
