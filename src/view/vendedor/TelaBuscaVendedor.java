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

public class TelaBuscaVendedor {
	private JFrame frame = new JFrame("Loja de Óculos");
	private DefaultListModel<String> listModel = new DefaultListModel<>();

	public TelaBuscaVendedor() {
		frame.setSize(400, 280);

		JPanel panel = new JPanel();
		frame.add(panel);
		placeComponents(panel);

		frame.setVisible(true);
	}

	private void placeComponents(JPanel panel) {
		panel.setLayout(null);

		MaskFormatter mascaraCpf = null;

		try {
			mascaraCpf = new MaskFormatter("###.###.###-##");
		} catch (ParseException e1) {

			System.err.println("Erro na formatação" + e1.getMessage());
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
