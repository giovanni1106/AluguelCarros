package viewAdmin;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

import Sistema.BancoDados;
import veiculo.Agencia;

public class AgenciaCadastrar extends JFrame {

	private JPanel contentPane;
	private static AgenciaCadastrar frame;
	private JTextField textId;
	private JTextField textLogradouro;
	private JTextField textNumero;
	private JTextField textBairro;
	private JTextField textPais;
	private JTextField textCidade;
	private JTextField textEstado;

	/**
	 * Launch the application.
	 */
	public static void Construtor() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame = new AgenciaCadastrar();
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
	public AgenciaCadastrar() {
		setBounds(100, 100, 385, 395);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.activeCaption);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		panel.setBounds(10, 11, 350, 330);
		contentPane.add(panel);
		panel.setLayout(null);

		JLabel lblNewLabel = new JLabel("Identifica\u00E7\u00E3o");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel.setBounds(10, 11, 321, 29);
		panel.add(lblNewLabel);

		textId = new JTextField();
		textId.setHorizontalAlignment(SwingConstants.CENTER);
		textId.setBounds(66, 51, 214, 20);
		panel.add(textId);
		textId.setColumns(10);

		JLabel lblNewLabel_5 = new JLabel("Logradouro");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_5.setBounds(10, 94, 76, 14);
		panel.add(lblNewLabel_5);

		textLogradouro = new JTextField();
		textLogradouro.setColumns(10);
		textLogradouro.setBounds(10, 121, 214, 20);
		panel.add(textLogradouro);

		JLabel lblNewLabel_6 = new JLabel("N\u00FAmero");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_6.setBounds(234, 95, 46, 14);
		panel.add(lblNewLabel_6);

		textNumero = new JTextField();
		textNumero.setColumns(10);
		textNumero.setBounds(234, 121, 97, 20);
		panel.add(textNumero);

		JLabel lblNewLabel_7 = new JLabel("Bairro");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_7.setBounds(10, 152, 46, 14);
		panel.add(lblNewLabel_7);

		textBairro = new JTextField();
		textBairro.setColumns(10);
		textBairro.setBounds(10, 177, 214, 20);
		panel.add(textBairro);

		JLabel lblNewLabel_10 = new JLabel("Pa\u00EDs");
		lblNewLabel_10.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_10.setBounds(234, 152, 46, 14);
		panel.add(lblNewLabel_10);

		textPais = new JTextField();
		textPais.setColumns(10);
		textPais.setBounds(234, 177, 97, 20);
		panel.add(textPais);

		JLabel lblNewLabel_8 = new JLabel("Cidade");
		lblNewLabel_8.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_8.setBounds(10, 208, 46, 14);
		panel.add(lblNewLabel_8);

		textCidade = new JTextField();
		textCidade.setColumns(10);
		textCidade.setBounds(10, 233, 214, 20);
		panel.add(textCidade);

		JLabel lblNewLabel_9 = new JLabel("Estado");
		lblNewLabel_9.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_9.setBounds(10, 264, 46, 14);
		panel.add(lblNewLabel_9);

		textEstado = new JTextField();
		textEstado.setColumns(10);
		textEstado.setBounds(10, 289, 214, 20);
		panel.add(textEstado);

		JButton btnNewButton = new JButton("Cadastrar");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnNewButton.setBounds(242, 233, 89, 78);
		panel.add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (textId.getText().length() <= 0 || textLogradouro.getText().length() <= 0
						|| textNumero.getText().length() <= 0 || textBairro.getText().length() <= 0
						|| textCidade.getText().length() <= 0 || textEstado.getText().length() <= 0
						|| textPais.getText().length() <= 0) {
					JOptionPane.showMessageDialog(null, "Dados incompletos");
				} else if (Agencia.TesteId(textId.getText()) == false)
					JOptionPane.showMessageDialog(null, "Identificação ja existente");
				else {
					int posicao = BancoDados.CadastrarAgencia();
					BancoDados.cadastrarAgencia[posicao] = new Agencia(textId.getText(), textLogradouro.getText(),
							textNumero.getText(), textBairro.getText(), textCidade.getText(), textEstado.getText(),
							textPais.getText());
					JOptionPane.showMessageDialog(null, "Agencia cadastrada com sucesso");
				}
			}
		});
	}

	/**
	 * Fecha a janela
	 */
	public static void Encerrar() {
		if(frame != null)
			frame.dispose();
	}
}
