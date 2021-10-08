package view.oculos;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import controle.ControleOculos;
import principal.Principal;

/**
 * Cria e configura o tamanho do frame de exibi��o
 * @author Juan Cerqueira
 * @version 1.0 (Out 2021)
 */
public class TelaApagaOculos {
	private static JFrame frame = new JFrame("Loja de �culos");

	public TelaApagaOculos() {
		frame.setSize(400, 130);

		JPanel panel = new JPanel();
		frame.add(panel);
		placeComponents(panel);

		frame.setVisible(true);
	}

	/**
	 * Cria um painel e adiciona componentes de busca
	 * @param panel JPanel que cont�m o campo de preenchimento e label de instru��o
	 * @author Mateus Vinicius
	 * @version 1.0 (Out 2021)
	 */
	private void placeComponents(JPanel panel) {
	panel.setLayout(null);
				
		JLabel instrucao = new JLabel("Digite o ID ");
		instrucao.setBounds(20, 10, 80, 25);
		panel.add(instrucao);

		JTextField idBusca = new JTextField(5);
		idBusca.setBounds(110, 10, 85, 25);
		panel.add(idBusca);
		
		JButton apagarButton = new JButton("Apagar");
		apagarButton.setBounds(10, 50, 85, 25);
		panel.add(apagarButton);

		JButton cancelarButton = new JButton("Cancelar");
		cancelarButton.setBounds(110, 50, 85, 25);
		panel.add(cancelarButton);

		apagarButton.addActionListener(new ActionListener() {

			/**
			 * Realiza a busca do �culos a partir do id digitado e em seguida chama o m�todo de dele��o
			 * @author Mateus Vin�cius 
			 * @version 1.0 (Out 2021)
			 */
			public void actionPerformed(ActionEvent e) {
				try {
					int produtoID = Integer.parseInt(idBusca.getText());
					
					ControleOculos controleOculos = new ControleOculos();
					controleOculos.deletarOculos(produtoID);

					JOptionPane.showMessageDialog(null, "Produto exclu�do!");

					new Principal();

					frame.dispose();
				} catch (NumberFormatException ex) {
					JOptionPane.showMessageDialog(null, "ID Inv�lido");
				}
			}
		});

		cancelarButton.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				Object src = e.getSource();

				if (src == cancelarButton) {
					new OculosMenu();
					frame.dispose();
				}
			}
		});
	}

}
