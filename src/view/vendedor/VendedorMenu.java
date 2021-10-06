package view.vendedor;

import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.*;

public class VendedorMenu implements ActionListener {
	private JFrame principalVendedor = new JFrame("Loja de Óculos");
	private JLabel titulo = new JLabel("Vendedores");
	private JButton visualizar = new JButton("Visualizar");
	private JButton cadastrar = new JButton("Cadastrar");
	private JButton deletar = new JButton("Deletar");
	private JButton buscar = new JButton("Buscar");
	private JButton voltar = new JButton("Voltar");
	
	public VendedorMenu() {
		titulo.setFont(new Font("Arial", Font.BOLD, 20));
		titulo.setBounds(135, 10, 150, 30);
		
		principalVendedor.add(titulo);
		principalVendedor.add(visualizar);
		principalVendedor.add(cadastrar);
		principalVendedor.add(deletar);
		principalVendedor.add(buscar);
		principalVendedor.add(voltar);
		
		cadastrar.setBounds(140, 50, 100, 30);
		visualizar.setBounds(140, 100, 100, 30);
		deletar.setBounds(140, 150, 100, 30);
		buscar.setBounds(140, 200, 100, 30);
		voltar.setBounds(10, 230, 70, 25);
		
		principalVendedor.setLayout(null);

		principalVendedor.setSize(400, 300);
		principalVendedor.setVisible(true);
		
		visualizar.addActionListener(this);
		cadastrar.addActionListener(this);
		deletar.addActionListener(this);
		buscar.addActionListener(this);
		voltar.addActionListener(this);
	}

	public void actionPerformed(ActionEvent e) {
		Object src = e.getSource();

		if (src == visualizar) {
			new TelaVisualizaVendedor();
		}

		if (src == cadastrar) {
			new TelaCadastroVendedor();
			principalVendedor.dispose();
		}

		if (src == deletar) {
			new TelaApagaVendedor();
		}

		if (src == buscar) {
			new TelaBuscaVendedor();
		}

		if (src == voltar) {
			new VendedorMenu();
			principalVendedor.dispose();

		}
	}
}
