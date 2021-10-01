package view.vendedor;

import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.*;

public class VendedorMenu implements ActionListener {
	private JFrame principalCliente = new JFrame("Loja de Óculos");
	private JLabel titulo = new JLabel("Vendedores");
	private JButton visualizar = new JButton("Visualizar");
	private JButton cadastrar = new JButton("Cadastrar");
	private JButton alterar = new JButton("Alterar");
	private JButton deletar = new JButton("Deletar");
	private JButton buscar = new JButton("Buscar");
	
	public VendedorMenu() {
		titulo.setFont(new Font("Arial", Font.BOLD, 20));
		titulo.setBounds(135, 10, 150, 30);
		
		principalCliente.add(titulo);
		principalCliente.add(visualizar);
		principalCliente.add(cadastrar);
		principalCliente.add(alterar);
		principalCliente.add(deletar);
		principalCliente.add(buscar);
		
		cadastrar.setBounds(140, 50, 100, 30);
		visualizar.setBounds(140, 100, 100, 30);
		alterar.setBounds(140, 150, 100, 30);
		deletar.setBounds(140, 200, 100, 30);
		buscar.setBounds(140, 250, 100, 30);
		
		principalCliente.setLayout(null);

		principalCliente.setSize(400, 350);
		principalCliente.setVisible(true);
		
		visualizar.addActionListener(this);
		cadastrar.addActionListener(this);
		alterar.addActionListener(this);
		deletar.addActionListener(this);
		buscar.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object src = e.getSource();

		if (src == visualizar) {
			new TelaVisualizaVendedor();
		}

		if (src == cadastrar) {
			new TelaCadastroVendedor();
		}

		if (src == alterar) {
			new TelaAlteraVendedor();
		}
		
		if (src == deletar) {
			new TelaApagaVendedor();
			
		}
		
		if (src == buscar) {
			new TelaBuscaVendedor();
		}
	}
}
