package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.SystemColor;
import java.awt.Color;

import Pessoas.Usuario;
import Sistema.BancoDados;

public class UsuarioPerfil extends JFrame {

	private JPanel contentPane;
	private static UsuarioPerfil frame;

	/**
	 * Launch the application.
	 */
	public static void Construtor(Usuario us) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame = new UsuarioPerfil(us);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public UsuarioPerfil(Usuario Us) {
		setTitle("Perfil");
		setBackground(Color.GREEN);
		setBounds(100, 100, 600, 500);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(176, 196, 222));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nome");
		lblNewLabel.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setBounds(10, 11, 55, 23);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel(Us.getNome());
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1.setBounds(10, 45, 564, 23);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel(Us.imprimeCPF(Us.getCpf()));
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_1.setBounds(10, 113, 564, 23);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblEmail = new JLabel("CPF");
		lblEmail.setHorizontalAlignment(SwingConstants.LEFT);
		lblEmail.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblEmail.setBounds(10, 79, 44, 23);
		contentPane.add(lblEmail);
		
		JLabel lblNewLabel_1_2 = new JLabel(Us.getEmail());
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_2.setBounds(10, 181, 564, 23);
		contentPane.add(lblNewLabel_1_2);
		
		JLabel lblEmail_1 = new JLabel("E-mail");
		lblEmail_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblEmail_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblEmail_1.setBounds(10, 147, 55, 23);
		contentPane.add(lblEmail_1);
		
		JLabel lblNewLabel_1_3 = new JLabel(Us.getCelular());
		lblNewLabel_1_3.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_3.setBounds(10, 249, 564, 23);
		contentPane.add(lblNewLabel_1_3);
		
		JLabel lblCel = new JLabel("Celular");
		lblCel.setHorizontalAlignment(SwingConstants.LEFT);
		lblCel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblCel.setBounds(10, 215, 55, 23);
		contentPane.add(lblCel);
		
		JLabel lblNewLabel_1_4 = new JLabel(Us.getGenero());
		lblNewLabel_1_4.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_4.setBounds(10, 317, 564, 23);
		contentPane.add(lblNewLabel_1_4);
		
		JLabel lblGenero = new JLabel("Genero");
		lblGenero.setHorizontalAlignment(SwingConstants.LEFT);
		lblGenero.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblGenero.setBounds(10, 283, 65, 23);
		contentPane.add(lblGenero);
		
		JLabel lblNewLabel_1_5 = new JLabel(Us.imprimeEndereco(Us.getEndereco()));
		lblNewLabel_1_5.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_5.setBounds(10, 385, 564, 23);
		contentPane.add(lblNewLabel_1_5);
		
		JLabel lblEndereo = new JLabel("Endere\u00E7o");
		lblEndereo.setHorizontalAlignment(SwingConstants.LEFT);
		lblEndereo.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblEndereo.setBounds(10, 351, 76, 23);
		contentPane.add(lblEndereo);
	}

	/**
	 * Fecha a janela
	 */
	public static void Encerrar() {
		if(frame != null)
			frame.dispose();
	}
}
