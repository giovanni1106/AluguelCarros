package viewAdmin;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.border.LineBorder;

import veiculo.Agencia;
import Sistema.BancoDados;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JList;

public class AgenciaDetalhar extends JFrame {

	private JPanel contentPane;
	private static AgenciaDetalhar frame;

	/**
	 * Launch the application.
	 */
	public static void Construtor(Agencia ag) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame = new AgenciaDetalhar(ag);
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
	public AgenciaDetalhar(Agencia ag) {
		setTitle("Detalhar agencia");
		setBounds(100, 100, 622, 297);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.activeCaption);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		panel.setBounds(10, 11, 433, 234);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Identifica\u00E7\u00E3o");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel.setBounds(10, 11, 413, 22);
		panel.add(lblNewLabel);
		
		JLabel lblId = new JLabel(ag.getIdentificacao());
		lblId.setHorizontalAlignment(SwingConstants.CENTER);
		lblId.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblId.setBounds(10, 44, 413, 22);
		panel.add(lblId);
		
		JLabel lblEndereo = new JLabel(ag.getEndereco());
		lblEndereo.setHorizontalAlignment(SwingConstants.CENTER);
		lblEndereo.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblEndereo.setBounds(10, 110, 413, 22);
		panel.add(lblEndereo);
		
		JLabel lblEndereco = new JLabel("New label");
		lblEndereco.setHorizontalAlignment(SwingConstants.CENTER);
		lblEndereco.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblEndereco.setBounds(10, 143, 413, 22);
		panel.add(lblEndereco);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(453, 49, 138, 196);
		contentPane.add(scrollPane);
		
		String[] Cars = Agencia.ImprimirCarrosVinculados(null, ag);
		
		JList list = new JList(Cars);
		scrollPane.setRowHeaderView(list);
		
		
		JLabel lblNewLabel_1 = new JLabel("Carros vinculados");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(453, 11, 138, 27);
		contentPane.add(lblNewLabel_1);
	}

	/**
	 * Fecha a janela
	 */
	public static void Encerrar() {
		if(frame != null)
			frame.dispose();
	}
}
