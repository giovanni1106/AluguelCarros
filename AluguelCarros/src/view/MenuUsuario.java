package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Component;
import javax.swing.Box;
import javax.swing.JList;
import javax.swing.JOptionPane;

import Pessoas.Usuario;
import Sistema.BancoDados;
import Sistema.Login;
import Sistema.SoftwareManager;

public class MenuUsuario extends JFrame {

	private JPanel contentPane;
	private static MenuUsuario frame;

	/**
	 * Launch the application.
	 */
	public static void Construtor() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame = new MenuUsuario(BancoDados.cadastrarUsuario[BancoDados.pos]);
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
	public MenuUsuario(Usuario Us) {
		setTitle("Menu de usuário");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 500);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.activeCaption);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel(Us.getNome());
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel.setBounds(10, 11, 564, 45);
		contentPane.add(lblNewLabel);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(SystemColor.inactiveCaption);
		panel_2.setBounds(223, 128, 141, 322);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		JButton btnEncerrar = new JButton("Encerrar");
		btnEncerrar.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnEncerrar.setBounds(10, 282, 121, 29);
		panel_2.add(btnEncerrar);
		btnEncerrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SoftwareManager.Encerrar();
			}
		});
		
		JButton btnHistrico = new JButton("Hist\u00F3rico");
		btnHistrico.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnHistrico.setBounds(10, 172, 121, 40);
		panel_2.add(btnHistrico);
		btnHistrico.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				UsuarioHistorico.Construtor();
			}
		});
		
		JButton btnAlugar = new JButton("Alugar");
		btnAlugar.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnAlugar.setBounds(10, 121, 121, 40);
		panel_2.add(btnAlugar);
		btnAlugar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				UsuarioAlugar.Construtor();
			}
		});
		
		JButton btnEditar = new JButton("Editar");
		btnEditar.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnEditar.setBounds(10, 70, 121, 40);
		panel_2.add(btnEditar);
		btnEditar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				UsuarioEditar.Construtor(BancoDados.cadastrarUsuario[BancoDados.pos]);
			}
		});
		
		JButton btnNewButton_1_1 = new JButton("Perfil");
		btnNewButton_1_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNewButton_1_1.setBounds(10, 19, 121, 40);
		panel_2.add(btnNewButton_1_1);
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				UsuarioPerfil.Construtor(BancoDados.cadastrarUsuario[BancoDados.pos]);
			}
		});
		
		JButton btnFidelidade = new JButton("Fidelidade");
		btnFidelidade.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnFidelidade.setBounds(10, 223, 121, 40);
		panel_2.add(btnFidelidade);
	}

	/**
	 * Fecha a janela
	 */
	public static void Encerrar() {
		if(frame != null)
			frame.dispose();
	}
}
