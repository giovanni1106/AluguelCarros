package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.GridLayout;
import java.awt.Font;

import Sistema.Login;
import Sistema.BancoDados;



public class TelaLogin extends JFrame {

	private JPanel contentPane;
	private JTextField txtLogin;
	private JPasswordField txtSenha;
	
	
	public TelaLogin() {
		setBackground(Color.LIGHT_GRAY);
		setTitle("Login");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 500);
		contentPane = new JPanel();
		contentPane.setBackground(Color.ORANGE);
		contentPane.setToolTipText("");
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("ALUGUEL DE CARROS");
		lblNewLabel_1.setBounds(10, 5, 564, 45);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setLabelFor(this);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 40));
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel = new JLabel("Login");
		lblNewLabel.setBounds(196, 95, 191, 45);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 13));
		contentPane.add(lblNewLabel);
		
		txtLogin = new JTextField();
		txtLogin.setBounds(196, 140, 191, 45);
		txtLogin.setFont(new Font("Tahoma", Font.PLAIN, 14));
		contentPane.add(txtLogin);
		txtLogin.setColumns(10);
		
		JLabel lblSenha = new JLabel("Senha");
		lblSenha.setBounds(196, 185, 191, 45);
		lblSenha.setFont(new Font("Tahoma", Font.BOLD, 13));
		contentPane.add(lblSenha);
		
		txtSenha = new JPasswordField();
		txtSenha.setBounds(196, 230, 191, 45);
		txtSenha.setFont(new Font("Tahoma", Font.PLAIN, 14));
		contentPane.add(txtSenha);
		
		JButton btnNewButton = new JButton("Entrar");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNewButton.setBounds(196, 309, 191, 45);
		btnNewButton.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent e) {
				
				if(Login.Logando(txtLogin.getText(), txtSenha.getText()) == false)
					JOptionPane.showMessageDialog(null, "Login ou senha incorretos");
				else {
					if(BancoDados.Administrador == false)
						new MenuUsuario(BancoDados.cadastrarUsuario[BancoDados.pos]).Construtor();
						
					setVisible(false);
				}
			}
		});
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Cadastrar Usuario");
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNewButton_1.setBounds(196, 365, 191, 45);
		contentPane.add(btnNewButton_1);
		btnNewButton_1.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent e) {
				CadastrarUsuario.Construtor();
			}
		});
		
		JButton btnNewButton_2 = new JButton("Cadastrar Adm");
		btnNewButton_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNewButton_2.setBounds(196, 410, 191, 45);
		contentPane.add(btnNewButton_2);
	}
}
