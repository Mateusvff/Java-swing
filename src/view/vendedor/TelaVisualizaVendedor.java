package view.vendedor;

import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;

import controle.ControleVendedor;
import modelo.pessoas.Vendedor;

public class TelaVisualizaVendedor {
	private JFrame frame = new JFrame("Loja de Óculos");
	private DefaultListModel<String> listaVendedor = new DefaultListModel<>();

	public TelaVisualizaVendedor() {
		frame.setSize(400, 280);

		JPanel panel = new JPanel();
		frame.add(panel);
		placeComponents(panel);

		frame.setVisible(true);
	}

	private void placeComponents(JPanel panel) {		
		for(int i = 0; i < ControleVendedor.vendedores.size(); i++) {
			Vendedor vendedor = ControleVendedor.vendedores.get(i);
			listaVendedor.addElement("Nome: " + vendedor.getNome() + " - " + "CPF:" + vendedor.getCpf());
		}
		
		JList<String> jList = new JList<>(listaVendedor);
		jList.setBounds(0,0,400,280);
		
		panel.add(jList);
	}

}
