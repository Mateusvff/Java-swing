package view.oculos;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;

import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.text.MaskFormatter;

import controle.ControleOculos;
import view.Principal;

public class TelaCadastroOculos {
	private static JFrame frame = new JFrame("Loja de Óculos");

	public TelaCadastroOculos() {
		frame.setSize(400, 340);

		JPanel panel = new JPanel();
		frame.add(panel);
		placeComponents(panel);
		

		frame.setVisible(true);
	}

	private static void placeComponents(JPanel panel) {
		
		MaskFormatter mascaraId = null;
		MaskFormatter mascaraEstoque = null;

		try {
			mascaraId = new MaskFormatter("#####");
			mascaraEstoque = new MaskFormatter("#####");
		} catch (ParseException e1) {

			System.err.println("Erro na formatação" + e1.getMessage());
			e1.printStackTrace();
		}

		panel.setLayout(null);

		JLabel idLabel = new JLabel("ID");
		idLabel.setBounds(70, 10, 80, 25);
		panel.add(idLabel);

		JFormattedTextField idText = new JFormattedTextField(mascaraId);
		idText.setBounds(140, 10, 180, 25);
		panel.add(idText);

		JLabel marcaLabel = new JLabel("Marca");
		marcaLabel.setBounds(70, 40, 80, 25);
		panel.add(marcaLabel);

		JTextField marcaText = new JTextField(20);
		marcaText.setBounds(140, 40, 180, 25);
		panel.add(marcaText);

		JLabel modeloLabel = new JLabel("Modelo");
		modeloLabel.setBounds(70, 70, 80, 25);
		panel.add(modeloLabel);

		JTextField modeloText = new JTextField(20);
		modeloText.setBounds(140, 70, 180, 25);
		panel.add(modeloText);

		JLabel materialLabel = new JLabel("Material");
		materialLabel.setBounds(70, 100, 80, 25);
		panel.add(materialLabel);

		JTextField materialText = new JTextField(20);
		materialText.setBounds(140, 100, 180, 25);
		panel.add(materialText);

		JLabel corLabel = new JLabel("Cor");
		corLabel.setBounds(70, 130, 80, 25);
		panel.add(corLabel);

		JTextField corText = new JTextField(20);
		corText.setBounds(140, 130, 180, 25);
		panel.add(corText);

		JFormattedTextField estoqueLabel = new JFormattedTextField(mascaraEstoque);
		estoqueLabel.setBounds(70, 160, 80, 25);
		panel.add(estoqueLabel);

		JTextField estoqueText = new JTextField(20);
		estoqueText.setBounds(140, 160, 180, 25);
		panel.add(estoqueText);

		JLabel precoLabel = new JLabel("Preço");
		precoLabel.setBounds(70, 190, 80, 25);
		panel.add(precoLabel);

		JTextField precoText = new JTextField(20);
		precoText.setBounds(140, 190, 180, 25);
		panel.add(precoText);

		JLabel generoLabel = new JLabel("Gênero");
		generoLabel.setBounds(70, 220, 80, 25);
		panel.add(generoLabel);

		JTextField generoText = new JTextField(20);
		generoText.setBounds(140, 220, 180, 25);
		panel.add(generoText);

		JButton registerButton = new JButton("Cadastrar");
		registerButton.setBounds(140, 260, 90, 25);
		panel.add(registerButton);

		JButton cancelarButton = new JButton("Cancelar");
		cancelarButton.setBounds(235, 260, 85, 25);
		panel.add(cancelarButton);

		registerButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				
				int id = Integer.parseInt(idText.getText());
				String marca = marcaText.getText();
				String modelo = modeloText.getText();
				String material = materialText.getText();
				String cor = corText.getText();
				int estoque = Integer.parseInt(estoqueText.getText());
				double preco = Double.parseDouble(precoText.getText());
				String genero = generoText.getText();

				ControleOculos controleOculos = new ControleOculos();
				controleOculos.cadastroOculos(id, marca, modelo, material, cor, estoque, preco, genero);

				JOptionPane.showMessageDialog(null, "Cadastro realizado");
				new Principal();
				frame.dispose();

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
