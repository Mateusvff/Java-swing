package view.fornecedor;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class TelaAlteraFornecedor {
	private static JFrame frame = new JFrame("Loja de �culos");

	public TelaAlteraFornecedor() {
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
