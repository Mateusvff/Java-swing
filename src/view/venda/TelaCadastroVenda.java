package view.venda;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import controle.ControleCliente;
import controle.ControleVenda;
import view.Principal;
public class TelaCadastroVenda {
	private static JFrame frame = new JFrame("Loja de Óculos");

	public TelaCadastroVenda() {
		frame.setSize(400, 200);

		JPanel panel = new JPanel();
		frame.add(panel);
		placeComponents(panel);

		frame.setVisible(true);
	}
	
	public static void main(String[] args) {
		frame.setSize(400, 280);

		JPanel panel = new JPanel();
		frame.add(panel);
		placeComponents(panel);

		frame.setVisible(true);
	}

	//!!!!!! ALTERAR DADOS !!!!!!!!
	private static void placeComponents(JPanel panel) {

		panel.setLayout(null);

		JLabel idLabel = new JLabel("Id do Produto");
		idLabel.setBounds(20, 10, 80, 25);
		panel.add(idLabel);

		JTextField idText = new JTextField(20);
		idText.setBounds(110, 10, 180, 25);
		panel.add(idText);
		
		JLabel vendedorLabel = new JLabel("Vendedor");
		vendedorLabel.setBounds(20, 40, 80, 25);
		panel.add(vendedorLabel);
		
		JTextField vendedorText = new JTextField(20);
		vendedorText.setBounds(110, 40, 180, 25);
		panel.add(vendedorText);
		
		JLabel quantLabel = new JLabel("Quantidade");
		quantLabel.setBounds(20, 70, 80, 25);
		panel.add(quantLabel);
		
		JTextField quantText = new JTextField(20);
		quantText.setBounds(110, 70, 180, 25);
		panel.add(quantText);
		
		JLabel valorLabel = new JLabel("Valor");
		valorLabel.setBounds(20, 100, 80, 25);
		panel.add(valorLabel);
		
		JTextField valorText = new JTextField(20);
		valorText.setBounds(110, 100, 180, 25);
		panel.add(valorText);
		
		
		JButton cadastrarButton = new JButton("Cadastrar");
		cadastrarButton.setBounds(110, 130, 90, 25);
		panel.add(cadastrarButton);
		
		JButton voltar = new JButton("Cancelar");
		voltar.setBounds(205, 130, 85, 25);
		panel.add(voltar);
		
		
	/*	cadastrarButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String id = idText.getText();
				String vendedor = vendedorText.getText();
				String quantidade = quantText.getText();
				String valor = valorText.getText();

				
				ControleVenda controleVenda = new ControleVenda();
				controleVenda.cadastroVenda(vendedor, , quantidade, valor);
				
				JOptionPane.showMessageDialog(null, "Cadastro realizado");
				
				new Principal();
				
				frame.dispose();
			}
		}); */

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
