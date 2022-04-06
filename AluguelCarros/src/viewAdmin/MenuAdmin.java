package viewAdmin;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import Sistema.BancoDados;
import view.MenuUsuario;
import view.UsuarioEditar;
import view.UsuarioPerfil;
import java.awt.Color;

import Pessoas.Admin;

public class MenuAdmin extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void Construtor() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MenuAdmin frame = new MenuAdmin(BancoDados.cadastrarAdm[BancoDados.pos]);
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
	public MenuAdmin(Admin ad) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 300, 500);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(173, 216, 230));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNome = new JLabel(ad.getLogin());
		lblNome.setHorizontalAlignment(SwingConstants.CENTER);
		lblNome.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNome.setBounds(10, 11, 264, 45);
		contentPane.add(lblNome);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(SystemColor.controlLtHighlight);
		panel_2.setBounds(10, 128, 264, 322);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		JButton btnEncerrar = new JButton("Encerrar");
		btnEncerrar.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnEncerrar.setBounds(10, 282, 244, 29);
		panel_2.add(btnEncerrar);
		
		JButton btnHistrico = new JButton("Ag\u00EAncias");
		btnHistrico.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnHistrico.setBounds(10, 172, 244, 40);
		panel_2.add(btnHistrico);
		
		JButton btnAlugar = new JButton("Classes");
		btnAlugar.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnAlugar.setBounds(10, 121, 244, 40);
		panel_2.add(btnAlugar);
		
		JButton btnEditar = new JButton("Carros");
		btnEditar.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnEditar.setBounds(10, 70, 244, 40);
		panel_2.add(btnEditar);
		btnEditar.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		
		JButton btnNewButton_1_1 = new JButton("Usuarios");
		btnNewButton_1_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNewButton_1_1.setBounds(10, 19, 244, 40);
		panel_2.add(btnNewButton_1_1);
		btnNewButton_1_1.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent e) {
				MenuUsuarios.Construtor();
			}
		});
		
		JButton btnFidelidade = new JButton("Tarifas");
		btnFidelidade.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnFidelidade.setBounds(10, 223, 244, 40);
		panel_2.add(btnFidelidade);
	}

}
