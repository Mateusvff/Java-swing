package view.venda;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import view.Principal;


public class VendaMenu implements ActionListener{
	private static JFrame principalVendas = new JFrame("Loja de Óculos");
	private static JLabel titulo = new JLabel("Vendas");
	private static JButton visualizar = new JButton("Visualizar");
	private static JButton cadastrar = new JButton("Cadastrar");
	private static JButton deletar = new JButton("Deletar");
	private static JButton buscar = new JButton("Buscar");
	private static JButton voltar = new JButton("Voltar");

	public VendaMenu() {
		titulo.setFont(new Font("Arial", Font.BOLD, 20));
		titulo.setBounds(152, 10, 150, 30);
		
		principalVendas.add(titulo);
		principalVendas.add(cadastrar);
		principalVendas.add(visualizar);
		principalVendas.add(deletar);
		principalVendas.add(buscar);
		principalVendas.add(voltar);
		
		cadastrar.setBounds(140, 50, 100, 30);
		visualizar.setBounds(140, 100, 100, 30);
		deletar.setBounds(140, 150, 100, 30);
		buscar.setBounds(140, 200, 100, 30);
		voltar.setBounds(10, 230, 70, 25);
		
		principalVendas.setLayout(null);

		principalVendas.setSize(400, 300);
		principalVendas.setVisible(true);
		
		visualizar.addActionListener(this);
		cadastrar.addActionListener(this);
		deletar.addActionListener(this);
		buscar.addActionListener(this);
		voltar.addActionListener(this);
	}

	public void actionPerformed(ActionEvent e) {
		Object src = e.getSource();
		
		if (src == visualizar) {
			new TelaVisualizaVenda();
			principalVendas.dispose();

		}

		if (src == cadastrar) {
			new TelaCadastroVenda();
			principalVendas.dispose();
		}

		if (src == deletar) {
			new TelaApagaVenda();
			principalVendas.dispose();
		}

		if (src == buscar) {
			new TelaBuscaVenda();
			principalVendas.dispose();
		}
		
		if (src == voltar) {
			new Principal();
			principalVendas.dispose();
		}
	}
}
