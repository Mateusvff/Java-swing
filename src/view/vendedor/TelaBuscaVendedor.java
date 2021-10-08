package view.vendedor;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.text.MaskFormatter;

import controle.ControleVendedor;
import modelo.pessoas.Vendedor;

/**
 * Cria e configura o tamanho do frame de exibi��o
 * @author Juan Cerqueira
 * @version 1.0 (Out 2021)
 */
public class TelaBuscaVendedor {
	private JFrame frame = new JFrame("Loja de �culos");
	private DefaultListModel<String> listModel = new DefaultListModel<>();

	public TelaBuscaVendedor() {
		frame.setSize(400, 280);

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
	 * @param listaClientes lista que cont�m os vendedores encontrados a partir da pesquisa
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

		JFormattedTextField cpfBusca = new JFormattedTextField(mascaraCpf);
		cpfBusca.setBounds(110, 10, 100, 25);
		panel.add(cpfBusca);
		
		JList<String> listaVendedor = new JList<>(listModel);
		listaVendedor.setBounds(10,70,365,165);
		
		panel.add(listaVendedor);
		
		JButton buscaButton = new JButton("Buscar");
		buscaButton.setBounds(250, 10, 100, 25);
		panel.add(buscaButton);
		
		buscaButton.addActionListener(new ActionListener() {

			/**
			 * Realiza o m�todo de busca dos vendedores a partir do click do bot�o
			 * @param e monitora a a��o realizada no bot�o
			 * @author Mateus Vin�cius
			 * @version 1.0 (Out 2021)
			 */
			public void actionPerformed(ActionEvent e) {
				
				String cpf = cpfBusca.getText();

				ControleVendedor controleVendedor = new ControleVendedor();  
				Vendedor retorno = controleVendedor.buscarVendedor(cpf); 
				
				listModel.addElement(retorno.getNome() + " - " + retorno.getCpf() + " - " + retorno.getTelefone() + 
						     " - " + retorno.getEmail() + " - " + retorno.getCidade() + " - " + retorno.getSalario());
			
			}
			
		});
		
	}

}
