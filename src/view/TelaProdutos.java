package view;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;


public class TelaProdutos implements ActionListener {
	private static JFrame principalProdutos = new JFrame("Loja de Óculos");
	private static JLabel titulo = new JLabel("Produtos");
	private static JButton oculosDeSol = new JButton("Óculos de Sol");
	private static JButton armacao = new JButton("Armação");
	private static JButton lentes = new JButton("Lentes");
	private TelaODSMenu telaODSMenu;

	// Construtor de tela das opções de produtos 

	public TelaProdutos() {
		titulo.setFont(new Font("Arial", Font.BOLD, 20));
		titulo.setBounds(147, 10, 150, 30);
		
		principalProdutos.add(titulo);
		principalProdutos.add(oculosDeSol);
		principalProdutos.add(armacao);
		principalProdutos.add(lentes);
		
		oculosDeSol.setBounds(90, 50, 200, 30);
		armacao.setBounds(90, 100, 200, 30);
		lentes.setBounds(90, 150, 200, 30);
		
		principalProdutos.setLayout(null);

		principalProdutos.setSize(400, 300);
		principalProdutos.setVisible(true);
	}
	
	public static void main(String[] args) {
		TelaProdutos menu = new TelaProdutos();
		
		oculosDeSol.addActionListener(menu);
		armacao.addActionListener(menu);
		lentes.addActionListener(menu);
	}
	
	public void actionPerformed(ActionEvent e) {
		Object src = e.getSource();
		
		if(src == oculosDeSol) {
			telaODSMenu = new TelaODSMenu();
		}
		
		if(src == armacao) {
			TelaArmacaoMenu TelaArmacaoMenu = new TelaArmacaoMenu();
		}
		
		if(src == lentes) {
			TelaLentesMenu TelaLentesMenu = new TelaLentesMenu();
		}
	}
}
