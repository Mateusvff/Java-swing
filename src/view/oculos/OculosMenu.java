package view.oculos;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import view.Principal;

public class OculosMenu implements ActionListener {
	private static JFrame principalProdutos = new JFrame("Loja de Óculos");
	private static JLabel titulo = new JLabel("Óculos");
	private static JButton voltar = new JButton("voltar");
	private static JButton cadastrar = new JButton("Cadastrar");
	private static JButton visualizar = new JButton("Visualizar");
	private static JButton alterar = new JButton("Alterar");
	private static JButton deletar = new JButton("Deletar");
	private static JButton buscar = new JButton("Buscar");

	public OculosMenu() {
		titulo.setFont(new Font("Arial", Font.BOLD, 20));
		titulo.setBounds(152, 10, 150, 30);

		principalProdutos.add(titulo);
		principalProdutos.add(cadastrar);
		principalProdutos.add(visualizar);
		principalProdutos.add(alterar);
		principalProdutos.add(deletar);
		principalProdutos.add(buscar);
		principalProdutos.add(voltar);

		cadastrar.setBounds(140, 50, 100, 30);
		visualizar.setBounds(140, 100, 100, 30);
		alterar.setBounds(140, 150, 100, 30);
		deletar.setBounds(140, 200, 100, 30);
		buscar.setBounds(140, 250, 100, 30);
		voltar.setBounds(10,270, 70, 25);

		principalProdutos.setLayout(null);

		principalProdutos.setSize(400, 350);
		principalProdutos.setVisible(true);

		cadastrar.addActionListener(this);
		visualizar.addActionListener(this);
		alterar.addActionListener(this);
		deletar.addActionListener(this);
		buscar.addActionListener(this);
		voltar.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object src = e.getSource();

		if (src == cadastrar) {
			new TelaCadastroOculos();
			principalProdutos.dispose();
		}

		if (src == visualizar) {
			new TelaVisualizaOculos();
			principalProdutos.dispose();
		}

		if (src == alterar) {
			new TelaAlteraOculos();
			principalProdutos.dispose();
		}

		if (src == deletar) {
			new TelaApagaOculos();
			principalProdutos.dispose();
		}

		if (src == buscar) {
			new TelaBuscaOculos();
			principalProdutos.dispose();
		}

		if (src == voltar) {
			new Principal();
			principalProdutos.dispose();
		}
	}
}
