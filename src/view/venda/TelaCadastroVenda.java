package view.venda;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import controle.ControleOculos;
import controle.ControleVenda;
import modelo.produtos.Oculos;


public class TelaCadastroVenda {
	private static JFrame frame = new JFrame("Loja de Óculos");

	public TelaCadastroVenda() {
		frame.setSize(400, 190);

		JPanel panel = new JPanel();
		frame.add(panel);
		placeComponents(panel);

		frame.setVisible(true);
	}

	private static void placeComponents(JPanel panel) {

		panel.setLayout(null);

		JLabel idLabel = new JLabel("Id do Produto");
		idLabel.setBounds(20, 10, 80, 25);
		panel.add(idLabel);

		JTextField idText = new JTextField(20);
		idText.setBounds(110, 10, 180, 25);
		panel.add(idText);
		
		JLabel quantLabel = new JLabel("Quantidade");
		quantLabel.setBounds(20, 40, 80, 25);
		panel.add(quantLabel);
		
		JTextField quantText = new JTextField(20);
		quantText.setBounds(110, 40, 180, 25);
		panel.add(quantText);
		
		JLabel valorLabel = new JLabel("Valor");
		valorLabel.setBounds(20, 70, 80, 25);
		panel.add(valorLabel);
		
		JTextField valorText = new JTextField(20);
		valorText.setBounds(110, 70, 180, 25);
		panel.add(valorText);
		
		JButton cadastrarButton = new JButton("Cadastrar");
		cadastrarButton.setBounds(110, 110, 90, 25);
		panel.add(cadastrarButton);
		
		JButton voltar = new JButton("Cancelar");
		voltar.setBounds(205, 110, 85, 25);
		panel.add(voltar);
		
		cadastrarButton.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				int idCadastro = Integer.parseInt(idText.getText());
				int quantidade = Integer.parseInt(quantText.getText());
				double valor = Double.parseDouble(valorText.getText());

				for (int i = 0; i < ControleOculos.oculosProd.size(); i++) {
					if (ControleOculos.oculosProd.get(i).getId() == idCadastro) {
						Oculos oculos = ControleOculos.oculosProd.get(i);
						ControleVenda controleVenda = new ControleVenda();
						controleVenda.cadastroVenda(oculos, quantidade, valor);

					}
				}
				
				new VendaMenu();
				frame.dispose();
				
			}

		});

		voltar.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				Object src = e.getSource();

				if (src == voltar) {
					new VendaMenu();
					frame.dispose();
				}
			}
		});
		
	
	}
}
