package view.oculos;

import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import controle.ControleOculos;
import modelo.produtos.Oculos;

/**
 * Cria e configura o tamanho do frame de exibição
 * @author Juan Cerqueira
 * @version 1.0 (Out 2021)
 */
public class TelaBuscaOculos {
	private static JFrame frame = new JFrame("Loja de Óculos");
	private DefaultListModel<String> listModel = new DefaultListModel<>();

	public TelaBuscaOculos() {
		frame.setSize(400, 280);

		JPanel panel = new JPanel();
		frame.add(panel);
		placeComponents(panel);

		frame.setVisible(true);
	}

	/**
	 * Adiciona os componentes de botões, painel e textos ao frame anteriormente criado
	 * @param panel painel que contém os demais componentes
	 * @author Mateus Vinícius
	 * @version 1.0 (Out 2021)
	 */
	private void placeComponents(JPanel panel) {
		panel.setLayout(null);

		JLabel instrucao = new JLabel("Digite o ID ");
		instrucao.setBounds(20, 10, 80, 25);
		panel.add(instrucao);

		TextField idBusca = new TextField(5);
		idBusca.setBounds(110, 10, 100, 25);
		panel.add(idBusca);
		
		JButton buscaButton = new JButton("Buscar");
		buscaButton.setBounds(250, 10, 85, 25);
		panel.add(buscaButton);
		
		JLabel texto = new JLabel("Produtos encontrados");
		texto.setBounds(10, 55, 200, 25);
		panel.add(texto);
		
		JList<String> listaOculos = new JList<>(listModel);
		listaOculos.setBounds(10, 80, 365, 155);
		panel.add(listaOculos);
		
		JButton cancelarButton = new JButton("Cancelar");
		cancelarButton.setBounds(250, 45, 85, 25);
		panel.add(cancelarButton);
		
		buscaButton.addActionListener(new ActionListener() {

			/**
			 * Realiza o método de busca dos óculos a partir do click do botão
			 * @param e monitora a ação realizada no botão
			 * @return o método retorna o produto,em forma de lista, que possui id idêntico ao procurado
			 * @author Mateus Vinícius
			 * @version 1.0 (Out 2021)
			 */
			public void actionPerformed(ActionEvent e) {
				
				int id = Integer.parseInt(idBusca.getText());

				ControleOculos controleOculos = new ControleOculos();  
				Oculos retorno = controleOculos.buscarOculosint(id); 
				
				listModel.addElement(retorno.getMarca() + " - " + retorno.getModelo() + " - " + retorno.getMaterial() + 
						     " - " + retorno.getCor() + " - " + retorno.getQuantEstoque() + " - " + retorno.getPreco() + 
						     " - " + retorno.getGenero());
				
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
