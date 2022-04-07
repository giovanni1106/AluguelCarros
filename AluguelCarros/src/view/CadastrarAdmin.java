package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Pessoas.Usuario;
import Pessoas.Admin;
import Sistema.BancoDados;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CadastrarAdmin extends JFrame {

	private JPanel contentPane;
	private JTextField textLogin;
	private JTextField textSenha;
	private JTextField textChave;
	private JButton btnNewButton;

	/**
	 * Launch the application.
	 */
	public static void Construtor() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CadastrarAdmin frame = new CadastrarAdmin();
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
	public CadastrarAdmin() {
		setTitle("Cadastrar Admin");
		setBounds(100, 100, 450, 200);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(240, 255, 240));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("Login");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel.setBounds(10, 7, 46, 23);
		contentPane.add(lblNewLabel);

		textLogin = new JTextField();
		textLogin.setBounds(10, 36, 187, 20);
		contentPane.add(textLogin);
		textLogin.setColumns(10);

		JLabel lblNewLabel_1 = new JLabel("Senha");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_1.setBounds(235, 9, 46, 19);
		contentPane.add(lblNewLabel_1);

		textSenha = new JTextField();
		textSenha.setBounds(235, 36, 189, 20);
		contentPane.add(textSenha);
		textSenha.setColumns(10);

		JLabel lblNewLabel_2 = new JLabel("Chave de cadastro");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_2.setBounds(10, 95, 131, 23);
		contentPane.add(lblNewLabel_2);

		textChave = new JTextField();
		textChave.setBounds(10, 129, 187, 20);
		contentPane.add(textChave);
		textChave.setColumns(10);

		btnNewButton = new JButton("Cadastrar");
		btnNewButton.setBounds(287, 128, 89, 23);
		contentPane.add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if (textLogin.getText().length() <= 0 || textSenha.getText().length() <= 0)
					JOptionPane.showMessageDialog(null, "Dados incompletos");
				else if (textChave.getText().equals(BancoDados.CHAVEADM) == false)
					JOptionPane.showMessageDialog(null, "Chave de Adm incorreta");
				else if(Admin.TesteLogin(textLogin.getText()) == false)
					JOptionPane.showMessageDialog(null, "Login ja cadastrado"); 
				else{
					BancoDados.cadastrarAdm[BancoDados.CadastrarAdmin()] = new Admin(textLogin.getText(),
							textSenha.getText());
					setVisible(false);
					JOptionPane.showMessageDialog(null, "Administrador cadastrado com sucesso");
				}
			}
		});
	}
}
