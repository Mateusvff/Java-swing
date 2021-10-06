package view.fornecedor;

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
import controle.ControleFornecedor;
import modelo.pessoas.Fornecedor;
import view.Principal;

public class TelaBuscaFornecedor {
	private static JFrame frame = new JFrame("Loja de Óculos");
	private DefaultListModel<String> listModel = new DefaultListModel<>();

	public TelaBuscaFornecedor() {
		frame.setSize(400, 280);

		JPanel panel = new JPanel();
		frame.add(panel);
		placeComponents(panel);

		frame.setVisible(true);
	}

	private void placeComponents(JPanel panel) {
		panel.setLayout(null);

		MaskFormatter mascaraCnpj = null;

		try {
			mascaraCnpj = new MaskFormatter("##.###.###/0001-##");
		} catch (ParseException e1) {

			System.err.println("Erro na formatação" + e1.getMessage());
			e1.printStackTrace();
		}

		JLabel instrucao = new JLabel("Digite o CNPJ ");
		instrucao.setBounds(20, 10, 120, 25);
		panel.add(instrucao);

		JFormattedTextField cnpjBusca = new JFormattedTextField(mascaraCnpj);
		cnpjBusca.setBounds(130, 10, 150, 25);
		panel.add(cnpjBusca);
		
		JLabel texto = new JLabel("Fornecedores encontrados");
		texto.setBounds(10, 55, 200, 25);
		panel.add(texto);

		JList<String> listaFornecedores = new JList<>(listModel);
		listaFornecedores.setBounds(10, 80, 365, 155);
		panel.add(listaFornecedores);
		
		JButton buscaButton = new JButton("Buscar");
		buscaButton.setBounds(290, 10, 80, 25);
		panel.add(buscaButton);
		
		JButton voltar = new JButton("Cancelar");
		voltar.setBounds(10, 50, 85, 25);
		panel.add(voltar);

		voltar.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				Object src = e.getSource();

				if (src == voltar) {
					new FornecedorMenu();
					frame.dispose();
				}
			}
		});
		
		buscaButton.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				
				ControleFornecedor controleFornecedor = new ControleFornecedor();
				Fornecedor retorno = controleFornecedor.buscarFornecedor1(cnpjBusca.getText());
				
				listModel.addElement(retorno.getNome() + " - " + retorno.getCnpj() + " - " + retorno.getCidade() + 
					     " - " + retorno.getTelefone() + " - " + retorno.getEmail());

				new Principal();

				frame.dispose();
			}

		});
	}
}
