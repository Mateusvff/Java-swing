package view;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import view.cliente.TelaClienteMenu;
import view.fornecedor.TelaFornecedorMenu;
import view.oculos.TelaCadastroOculos;
import view.vendedor.TelaVendedorMenu;

public class TelaProdutoMenu implements ActionListener {
	private static JFrame principalProdutos = new JFrame("Loja de Óculos");
	private static JLabel titulo = new JLabel("Óculos");
	private static JButton cadastrar = new JButton("Cadastrar");
	private static JButton visualizar = new JButton("Visualizar");
	private static JButton alterar = new JButton("Alterar");
	private static JButton deletar = new JButton("Deletar");
	private static JButton buscar = new JButton("Buscar");

	public TelaProdutoMenu() {
		titulo.setFont(new Font("Arial", Font.BOLD, 20));
		titulo.setBounds(152, 10, 150, 30);
		
		principalProdutos.add(titulo);
		principalProdutos.add(cadastrar);
		principalProdutos.add(visualizar);
		principalProdutos.add(alterar);
		principalProdutos.add(deletar);
		principalProdutos.add(buscar);
		
		cadastrar.setBounds(140, 50, 100, 30);
		visualizar.setBounds(140, 100, 100, 30);
		alterar.setBounds(140, 150, 100, 30);
		deletar.setBounds(140, 200, 100, 30);
		buscar.setBounds(140, 250, 100, 30);
		
		principalProdutos.setLayout(null);

		principalProdutos.setSize(400, 350);
		principalProdutos.setVisible(true);
		
		cadastrar.addActionListener(this);
		visualizar.addActionListener(this);
		alterar.addActionListener(this);
		deletar.addActionListener(this);
		buscar.addActionListener(this);
	}
	
	public static void main(String[] args) {
		TelaProdutoMenu produto = new TelaProdutoMenu();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		Object src = e.getSource();
		
		if(src == cadastrar) {
			new TelaCadastroOculos();
		}
		
		if(src == visualizar) {
			
		}
		
		if(src == alterar) {
			
		}
		
		if(src == deletar) {
			
		}
		
		if(src == buscar) {
			
		}
		
	}

}
