package view.cliente;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;

import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.text.MaskFormatter;

import controle.ControleCliente;
import view.TelaPessoaMenu;

/**
 * Cria e configura o tamanho do frame de exibi��o
 * @author Juan Cerqueira
 * @version 1.0 (Out 2021)
 */
public class TelaApagaCliente {
	private static JFrame frame = new JFrame("Loja de �culos");

	public TelaApagaCliente() {
		frame.setSize(400, 130);

		JPanel panel = new JPanel();
		frame.add(panel);
		placeComponents(panel);

		frame.setVisible(true);
	}

	/**
	 * Adiciona um painel com um campo de preenchimento para o CPF,
	 * bot�o com op��o de voltar para o menu anterior,
	 * bot�o para realizar a pesquisa
	 * @param panel pain�l que cont�m o campo de preenchimento e bot�es
	 * @author Juan Cerqueira
	 * @version 1.0 (Out 2021)
	 */
	private void placeComponents(JPanel panel) {

		panel.setLayout(null);
		
		MaskFormatter mascaraCpf = null;
		
		/**
		 * Adiciona uma m�scara de CPF ao campo de preenchimento
		 * Limita o n�mero de caracteres a serem inseridos
		 * @author Mateus Vin�cius
		 * @version 1.0 (Out 2021)
		 */
		try {
			mascaraCpf = new MaskFormatter("###.###.###-##");
		} catch (ParseException e1) {

			System.err.println("Erro na formata��o" + e1.getMessage());
			e1.printStackTrace();
		}
		
		JLabel instrucao = new JLabel("Digite o CPF ");
		instrucao.setBounds(20, 10, 80, 25);
		panel.add(instrucao);

		JFormattedTextField cpfApaga = new JFormattedTextField(mascaraCpf);
		cpfApaga.setBounds(110, 10, 85, 25);
		panel.add(cpfApaga);
		
		JButton apagaButton = new JButton("Apagar");
		apagaButton.setBounds(10, 50, 85, 25);
		panel.add(apagaButton);
		
		JButton voltar = new JButton("Cancelar");
		voltar.setBounds(110, 50, 85, 25);
		panel.add(voltar);

		voltar.addActionListener(new ActionListener() {
			
			/**
			 * Retorna para o menu anterior ao clickar no bot�o
			 * @author Mateus Vin�cius
			 * @version 1.0 (Out 2021)
			 */
			public void actionPerformed(ActionEvent e) {
				Object src = e.getSource();

				if (src == voltar) {
					new ClienteMenu();
					frame.dispose();
				}
			}
		});
		
		apagaButton.addActionListener(new ActionListener() {
			
			/**
			 * Realiza o m�todo de dele��o do cliente
			 * @author Mateus Vin�cius
			 * @version 1.0 (Out 2021)
			 */
			public void actionPerformed(ActionEvent e) {
					
					ControleCliente controleCliente = new ControleCliente();
					controleCliente.deletarClientes(cpfApaga.getText());
					frame.dispose();

					JOptionPane.showMessageDialog(null, "Cliente exclu�do!");
					new TelaPessoaMenu();		
			}
			
		});
		
	}
}
