package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;

import veiculo.Agencia;

public class MostrarAgencia extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void Construtor(Agencia agencia) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MostrarAgencia frame = new MostrarAgencia(agencia);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public MostrarAgencia(Agencia agencia) {
		setTitle("Agencia");
		setBounds(100, 100, 450, 210);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblIDAgencia = new JLabel(agencia.getIdentificacao());
		lblIDAgencia.setHorizontalAlignment(SwingConstants.CENTER);
		lblIDAgencia.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblIDAgencia.setBounds(10, 11, 414, 40);
		contentPane.add(lblIDAgencia);
		
		JLabel lblEndereco = new JLabel(agencia.getEndereco());
		lblEndereco.setBounds(10, 139, 414, 14);
		contentPane.add(lblEndereco);
		
		JLabel lblNewLabel_2 = new JLabel("Endere\u00E7o");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_2.setBounds(10, 106, 70, 22);
		contentPane.add(lblNewLabel_2);
	}
}
