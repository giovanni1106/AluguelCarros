package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;

import Sistema.BancoDados;
import Sistema.Login;
import Pessoas.Usuario;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CadastrarUsuario extends JFrame {

	private JPanel contentPane;
	private JTextField textNome;
	private JTextField textCPF;
	private JTextField textEmail;
	private JTextField textLogradouro;
	private JTextField textNumero;
	private JTextField textBairro;
	private JTextField textCidade;
	private JTextField textEstado;
	private JTextField textPais;
	private JTextField textCelular;
	private JTextField textLogin;
	private JTextField textSenha;

	/**
	 * Launch the application.
	 */
	public static void Construtor() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CadastrarUsuario frame = new CadastrarUsuario();
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
	public CadastrarUsuario() {
		getContentPane().setBackground(new Color(135, 206, 235));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 500);
		contentPane = new JPanel();
		setLocationRelativeTo(null);
		getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel("Nome");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel.setBounds(10, 11, 46, 14);
		getContentPane().add(lblNewLabel);

		textNome = new JTextField();
		textNome.setBounds(10, 36, 310, 20);
		getContentPane().add(textNome);
		textNome.setColumns(10);

		JLabel lblNewLabel_1 = new JLabel("Genero");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1.setBounds(359, 67, 46, 14);
		getContentPane().add(lblNewLabel_1);

		JComboBox<String> comboGenero = new JComboBox<String>();
		comboGenero.setBounds(359, 91, 215, 22);
		getContentPane().add(comboGenero);
		comboGenero.addItem("Masculino");
		comboGenero.addItem("Feminino");
		comboGenero.addItem("Pref. não informar");
		String indexGen = String.valueOf(comboGenero.getSelectedItem());

		JComboBox<String> comboNacionalidade = new JComboBox<String>();
		comboNacionalidade.setBounds(359, 149, 215, 22);
		getContentPane().add(comboNacionalidade);
		comboNacionalidade.addItem("Brasileiro");
		comboNacionalidade.addItem("Estrangeiro");
		String indexNac = String.valueOf(comboNacionalidade.getSelectedItem());

		JLabel lblNewLabel_2 = new JLabel("CPF (Apenas numeros)");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_2.setBounds(359, 11, 134, 14);
		getContentPane().add(lblNewLabel_2);

		textCPF = new JTextField();
		textCPF.setBounds(359, 36, 215, 20);
		getContentPane().add(textCPF);
		textCPF.setColumns(10);

		JLabel lblNewLabel_3 = new JLabel("E-mail");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_3.setBounds(10, 67, 46, 14);
		getContentPane().add(lblNewLabel_3);

		textEmail = new JTextField();
		textEmail.setBounds(10, 92, 310, 20);
		getContentPane().add(textEmail);
		textEmail.setColumns(10);

		JLabel lblNewLabel_4 = new JLabel("Nacionalidade");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_4.setBounds(359, 124, 108, 14);
		getContentPane().add(lblNewLabel_4);

		JLabel lblNewLabel_5 = new JLabel("Logradouro");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_5.setBounds(10, 123, 76, 14);
		getContentPane().add(lblNewLabel_5);

		textLogradouro = new JTextField();
		textLogradouro.setBounds(10, 150, 214, 20);
		getContentPane().add(textLogradouro);
		textLogradouro.setColumns(10);

		JLabel lblNewLabel_6 = new JLabel("Numero");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_6.setBounds(234, 124, 46, 14);
		getContentPane().add(lblNewLabel_6);

		textNumero = new JTextField();
		textNumero.setBounds(234, 150, 86, 20);
		getContentPane().add(textNumero);
		textNumero.setColumns(10);

		JLabel lblNewLabel_7 = new JLabel("Bairro");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_7.setBounds(10, 181, 46, 14);
		getContentPane().add(lblNewLabel_7);

		textBairro = new JTextField();
		textBairro.setBounds(10, 206, 214, 20);
		getContentPane().add(textBairro);
		textBairro.setColumns(10);

		JLabel lblNewLabel_8 = new JLabel("Cidade");
		lblNewLabel_8.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_8.setBounds(10, 237, 46, 14);
		getContentPane().add(lblNewLabel_8);

		textCidade = new JTextField();
		textCidade.setBounds(10, 262, 214, 20);
		getContentPane().add(textCidade);
		textCidade.setColumns(10);

		JLabel lblNewLabel_9 = new JLabel("Estado");
		lblNewLabel_9.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_9.setBounds(10, 293, 46, 14);
		getContentPane().add(lblNewLabel_9);

		textEstado = new JTextField();
		textEstado.setBounds(10, 318, 214, 20);
		getContentPane().add(textEstado);
		textEstado.setColumns(10);

		JLabel lblNewLabel_10 = new JLabel("Pa\u00EDs");
		lblNewLabel_10.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_10.setBounds(234, 181, 46, 14);
		getContentPane().add(lblNewLabel_10);

		textPais = new JTextField();
		textPais.setBounds(234, 206, 86, 20);
		getContentPane().add(textPais);
		textPais.setColumns(10);

		JLabel lblNewLabel_11 = new JLabel("Celular para contato");
		lblNewLabel_11.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_11.setBounds(359, 182, 134, 14);
		getContentPane().add(lblNewLabel_11);

		textCelular = new JTextField();
		textCelular.setBounds(359, 206, 215, 20);
		getContentPane().add(textCelular);
		textCelular.setColumns(10);

		JLabel lblNewLabel_12 = new JLabel("Login");
		lblNewLabel_12.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_12.setBounds(289, 293, 46, 14);
		getContentPane().add(lblNewLabel_12);

		textLogin = new JTextField();
		textLogin.setBounds(289, 318, 116, 20);
		getContentPane().add(textLogin);
		textLogin.setColumns(10);

		JLabel lblNewLabel_13 = new JLabel("Senha");
		lblNewLabel_13.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_13.setBounds(421, 293, 46, 14);
		getContentPane().add(lblNewLabel_13);

		textSenha = new JTextField();
		textSenha.setBounds(421, 318, 153, 20);
		getContentPane().add(textSenha);
		textSenha.setColumns(10);

		JButton btnNewButton = new JButton("Cadastrar");
		btnNewButton.setBounds(234, 427, 116, 23);
		getContentPane().add(btnNewButton);
		setVisible(true);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if (Usuario.isCPF(textCPF.getText()) == false)
					JOptionPane.showMessageDialog(null, "CPF inválido");
				else if (textNome.getText().length() <= 0 || textCPF.getText().length() <= 0
						|| textEmail.getText().length() <= 0 || indexNac == null || indexGen == null
						|| textCelular.getText().length() <= 0 || textLogin.getText().length() <= 0
						|| textSenha.getText().length() <= 0 || textLogradouro.getText().length() <= 0
						|| textNumero.getText().length() <= 0 || textBairro.getText().length() <= 0
						|| textCidade.getText().length() <= 0 || textEstado.getText().length() <= 0
						|| textPais.getText().length() <= 0) {
					JOptionPane.showMessageDialog(null, "Dados incompletos");
				} else {
					int posicao = Usuario.Cadastrar();
					BancoDados.cadastrarUsuario[posicao] = new Usuario(textNome.getText(), textCPF.getText(),
							textEmail.getText(), indexNac, indexGen, textCelular.getText(), textLogin.getText(),
							textSenha.getText(), textLogradouro.getText(), textNumero.getText(), textBairro.getText(),
							textCidade.getText(), textEstado.getText(), textPais.getText());
					setVisible(false);
					JOptionPane.showMessageDialog(null, "Usuario cadastrado com sucesso");
				}

			}
		});
	}
}
