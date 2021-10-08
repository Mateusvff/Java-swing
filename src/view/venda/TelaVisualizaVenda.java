package view.venda;


import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import controle.ControleVenda;
import modelo.venda.Venda;

/**
 * Cria e configura o tamanho do frame de exibição, do botão, label e painel
 * @author Juan Cerqueira
 * @version 1.0 (Out 2021)
 */
public class TelaVisualizaVenda {
	private static JFrame frame = new JFrame("Loja de Óculos");
	private DefaultListModel<String> listaVendas = new DefaultListModel<>();
	private JLabel label = new JLabel("Ainda não há vendas cadastradas na loja");

	public TelaVisualizaVenda() {
		frame.setSize(400, 280);

		JPanel panel = new JPanel();
		frame.add(panel);
		placeComponents(panel);
		label.setBounds(10, 5, 400, 30);
		frame.setVisible(true);
	}

	
	/**
	 * Puxa os dados da lista de vendas cadastradas e apresenta na tela por meio do JPanel
	 * @param panel painel que contém as vendas listados
	 * @author Juan Cerqueira
	 * @version 1.0 (Out 2021)
	 */
	private void placeComponents(JPanel panel) {
		if (ControleVenda.vendas.isEmpty()) {
			panel.add(label);
		} else {
			for (int i = 0; i < ControleVenda.vendas.size(); i++) {
				Venda vendas = ControleVenda.vendas.get(i);
				listaVendas.addElement("Produto: " + vendas.getOculos() + "\n" + "- " + "Quantidade: "
						+ vendas.getQuantidade()  + "\n" + " - " + "Valor da venda: " + vendas.getValor());
			}
		}

		JList<String> jList = new JList<>(listaVendas);
		jList.setBounds(0, 0, 400, 280);

		panel.add(jList);
		panel.setLayout(null);

	}
}
