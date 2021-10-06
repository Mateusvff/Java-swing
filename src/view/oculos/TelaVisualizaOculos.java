package view.oculos;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;

import controle.ControleOculos;
import modelo.produtos.Oculos;

public class TelaVisualizaOculos {
	private JFrame frame = new JFrame("Loja de Óculos");
	private DefaultListModel<String> listaOculos = new DefaultListModel<>();
	private JLabel label = new JLabel("Ainda não há óculos cadastrados na loja");
	private JButton voltar = new JButton("Voltar");

	public TelaVisualizaOculos() {
		frame.setSize(400, 280);

		JPanel panel = new JPanel();
		frame.add(panel);
		placeComponents(panel);
		frame.setVisible(true);

		label.setBounds(10, 10, 150, 30);
		
	}

	private void placeComponents(JPanel panel) {
		if (ControleOculos.oculosProd.isEmpty()) {
			panel.add(label);
		} else {
			for (int i = 0; i < ControleOculos.oculosProd.size(); i++) {
				Oculos oculos = ControleOculos.oculosProd.get(i);
				listaOculos.addElement("Id: " + oculos.getId() +  " - " + "Modelo: " + oculos.getModelo() + 
						               " - " + "Marca: " + oculos.getMarca() +  " - " + "Preço: " + oculos.getPreco());
			}
		}
		
		voltar.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				Object src = e.getSource();

				if (src == voltar) {
					new OculosMenu();
					frame.dispose();
				}
			}
		});

		JList<String> jList = new JList<>(listaOculos);
		jList.setBounds(0, 0, 400, 280);

		panel.add(jList);
		panel.add(voltar);
	}
}
