package view.vendedor;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class TelaVisualizaVendedor {
	private static JFrame frame = new JFrame("Loja de Óculos");

	public TelaVisualizaVendedor() {
		frame.setSize(400, 280);

		JPanel panel = new JPanel();
		frame.add(panel);
		placeComponents(panel);

		frame.setVisible(true);
	}

	private void placeComponents(JPanel panel) {
		panel.setLayout(null);

	}

}
