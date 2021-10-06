package view.oculos;

import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;



public class TelaBuscaOculos {
	private static JFrame frame = new JFrame("Loja de Óculos");
	private DefaultListModel<String> listModel = new DefaultListModel<>();

	public TelaBuscaOculos() {
		frame.setSize(400, 280);

		JPanel panel = new JPanel();
		frame.add(panel);
		placeComponents(panel);

		frame.setVisible(true);
	}

	private void placeComponents(JPanel panel) {
		panel.setLayout(null);

		JLabel instrucao = new JLabel("Digite o ID ");
		instrucao.setBounds(20, 10, 80, 25);
		panel.add(instrucao);

		TextField idBusca = new TextField(5);
		idBusca.setBounds(110, 10, 100, 25);
		panel.add(idBusca);
		
		JButton buscaButton = new JButton("Buscar");
		buscaButton.setBounds(250, 10, 100, 25);
		panel.add(buscaButton);
		
		JList<String> listaOculos = new JList<>(listModel);
		listaOculos.setBounds(10,70,365,165);
		
		panel.add(listaOculos);
		
		JButton cancelarButton = new JButton("Cancelar");
		cancelarButton.setBounds(10, 50, 85, 25);
		panel.add(cancelarButton);
		

		cancelarButton.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				Object src = e.getSource();

				if (src == cancelarButton) {
					new OculosMenu();
					frame.dispose();
				}
			}
		});
		
	}
}
