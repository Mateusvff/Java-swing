package view.fornecedor;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import controle.ControleFornecedor;
import modelo.pessoas.Fornecedor;

public class TelaVisualizaFornecedor {
	private JFrame frame = new JFrame("Loja de �culos");
	private DefaultListModel<String> listaFornecedores = new DefaultListModel<>();
	private JLabel label = new JLabel("Ainda n�o h� fornecedores cadastrados na loja");
	private JButton voltar = new JButton("Voltar");

	public TelaVisualizaFornecedor() {
		frame.setSize(400, 280);

		JPanel panel = new JPanel();
		frame.add(panel);
		placeComponents(panel);
		frame.setVisible(true);

		label.setBounds(10, 10, 150, 30);
		
	}

	private void placeComponents(JPanel panel) {
		if (ControleFornecedor.fornecedores.isEmpty()) {
			panel.add(label);
		} else {
			for (int i = 0; i < ControleFornecedor.fornecedores.size(); i++) {
				Fornecedor fornecedores = ControleFornecedor.fornecedores.get(i);
				listaFornecedores.addElement("Nome: " + fornecedores.getNome() + " - " + "CNPJ: " + fornecedores.getCnpj());
			}
		}

		voltar.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				Object src = e.getSource();

				if (src == voltar) {
					new FornecedorMenu();
					frame.dispose();
				}
			}
		});

		JList<String> jList = new JList<>(listaFornecedores);
		jList.setBounds(0, 0, 400, 280);

		panel.add(jList);
		panel.add(voltar);
	}
}
