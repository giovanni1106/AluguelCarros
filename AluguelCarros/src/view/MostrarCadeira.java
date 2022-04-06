package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.border.LineBorder;
import java.awt.Color;

import veiculo.CadeiraCrianca;

public class MostrarCadeira extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void Construtor(CadeiraCrianca Cadeira) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MostrarCadeira frame = new MostrarCadeira(Cadeira);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MostrarCadeira(CadeiraCrianca Cadeira) {
		setBounds(100, 100, 300, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblCadeira = new JLabel(Cadeira.getIdentificacao());
		lblCadeira.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblCadeira.setHorizontalAlignment(SwingConstants.CENTER);
		lblCadeira.setBounds(10, 11, 264, 40);
		contentPane.add(lblCadeira);
		
		JLabel lblNewLabel = new JLabel("Idade");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel.setBounds(10, 105, 46, 33);
		contentPane.add(lblNewLabel);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		panel.setBounds(10, 196, 264, 54);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblPreco = new JLabel("R$" + String.valueOf(Cadeira.getValor()));
		lblPreco.setHorizontalAlignment(SwingConstants.CENTER);
		lblPreco.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblPreco.setBounds(10, 11, 197, 32);
		panel.add(lblPreco);
		
		JLabel lblNewLabel_1 = new JLabel("/Dia");
		lblNewLabel_1.setBounds(217, 29, 37, 14);
		panel.add(lblNewLabel_1);
		
		JLabel lblIdade = new JLabel(String.valueOf(Cadeira.getIdade()));
		lblIdade.setBounds(66, 105, 46, 33);
		contentPane.add(lblIdade);
	}
}
