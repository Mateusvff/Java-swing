package view.vendedor;

import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;

import controle.ControleVendedor;
import modelo.pessoas.Vendedor;

/**
 * Cria e configura o tamanho do frame de exibição, do botão, label e painel
 * @author Juan Cerqueira
 * @version 1.0 (Out 2021)
 */
public class TelaVisualizaVendedor {
	private JFrame frame = new JFrame("Loja de Óculos");
	private DefaultListModel<String> listaVendedor = new DefaultListModel<>();
	private JLabel label = new JLabel("Ainda não há clientes cadastrados");

	public TelaVisualizaVendedor() {
		frame.setSize(400, 280);

		JPanel panel = new JPanel();
		frame.add(panel);
		placeComponents(panel);
		frame.setVisible(true);
		label.setBounds(10, 10, 150, 30);
	}

	/**
	 * Puxa os dados da lista de vendedores cadastrados e apresenta na tela por meio do JPanel
	 * @param panel painel que contém os vendedores listados
	 * @author Juan Cerqueira
	 * @version 1.0 (Out 2021)
	 */
	private void placeComponents(JPanel panel) {
		if (ControleVendedor.vendedores.isEmpty()) {
			panel.add(label);
		} else {
			for (int i = 0; i < ControleVendedor.vendedores.size(); i++) {
				Vendedor vendedor = ControleVendedor.vendedores.get(i);
				listaVendedor.addElement("Nome: " + vendedor.getNome() + " - " + "CPF: " + vendedor.getCpf());
			}
		}

		JList<String> jList = new JList<>(listaVendedor);
		jList.setBounds(0,0,400,280);
		
		panel.add(jList);
	}

}
