package view.vendedor;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class TelaApagaVendedor {
	private static JFrame frame = new JFrame("Loja de �culos");

	public TelaApagaVendedor() {
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
