package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

import veiculo.SeguroCarro;

public class MostrarSeguro extends JFrame {

	private JPanel contentPane;
	private static MostrarSeguro frame;

	/**
	 * Launch the application.
	 */
	public static void Construtor(SeguroCarro Seguro) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame = new MostrarSeguro(Seguro);
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
	public MostrarSeguro(SeguroCarro Seguro) {
		setTitle("Seguro");
		setBounds(100, 100, 300, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblCadeira = new JLabel(Seguro.getIdentificacao());
		lblCadeira.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblCadeira.setHorizontalAlignment(SwingConstants.CENTER);
		lblCadeira.setBounds(10, 11, 264, 40);
		contentPane.add(lblCadeira);
		
		JLabel lblNewLabel = new JLabel("Caracter\u00EDsticas");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel.setBounds(10, 62, 264, 33);
		contentPane.add(lblNewLabel);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		panel.setBounds(10, 196, 264, 54);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblPreco = new JLabel("R$" + String.valueOf(Seguro.getValor()));
		lblPreco.setHorizontalAlignment(SwingConstants.CENTER);
		lblPreco.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblPreco.setBounds(10, 11, 188, 32);
		panel.add(lblPreco);
		
		JLabel lblNewLabel_1 = new JLabel("/Aluguel");
		lblNewLabel_1.setBounds(208, 29, 46, 14);
		panel.add(lblNewLabel_1);
		
		JLabel lblIdade = new JLabel(String.valueOf(Seguro.getCaracteristicas()));
		lblIdade.setHorizontalAlignment(SwingConstants.CENTER);
		lblIdade.setBounds(10, 106, 264, 79);
		contentPane.add(lblIdade);
	}

	/**
	 * Fecha a janela
	 */
	public static void Encerrar() {
		if(frame != null)
			frame.dispose();
	}
}
