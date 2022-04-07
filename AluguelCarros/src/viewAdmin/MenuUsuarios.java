package viewAdmin;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

import Sistema.BancoDados;
import view.UsuarioEditar;
import view.UsuarioPerfil;

import java.awt.Color;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.Font;

public class MenuUsuarios extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void Construtor() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MenuUsuarios frame = new MenuUsuarios();
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
	public MenuUsuarios() {
		setTitle("Gerenciar usuários");
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.activeCaption);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		panel.setBounds(10, 11, 414, 239);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JComboBox<String> comboBox = new JComboBox<String>();
		comboBox.setBounds(10, 11, 394, 33);
		panel.add(comboBox);
		
		for(int i = 0; i < BancoDados.MAX; i ++)
			if(BancoDados.cadastrarUsuario[i] != null)
				comboBox.addItem(BancoDados.cadastrarUsuario[i].getNome());
		
		JButton btnEditar = new JButton("Editar");
		btnEditar.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnEditar.setBounds(10, 169, 185, 59);
		panel.add(btnEditar);
		btnEditar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				UsuarioEditar.Construtor(BancoDados.cadastrarUsuario[comboBox.getSelectedIndex()]);
			}
		});
		
		JButton btnExcluir = new JButton("Excluir");
		btnExcluir.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnExcluir.setBounds(219, 169, 185, 59);
		panel.add(btnExcluir);
		btnEditar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				UsuarioExcluir.Construtor(BancoDados.cadastrarUsuario[comboBox.getSelectedIndex()]);
			}
		});
		
		JButton btnPerfil = new JButton("Perfil");
		btnPerfil.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnPerfil.setBounds(10, 99, 185, 59);
		panel.add(btnPerfil);
		btnPerfil.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				UsuarioPerfil.Construtor(BancoDados.cadastrarUsuario[comboBox.getSelectedIndex()]);
			}
		});
		
		JButton btnHistrico = new JButton("Hist\u00F3rico");
		btnHistrico.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnHistrico.setBounds(219, 99, 185, 59);
		panel.add(btnHistrico);
	}
}
