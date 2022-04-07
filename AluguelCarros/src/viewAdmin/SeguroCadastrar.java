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
import veiculo.SeguroCarro;

public class SeguroCadastrar extends JFrame {

	private JPanel contentPane;
	private static SeguroCadastrar frame;
	private JTextField textNome;
	private JTextField textValor;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void Construtor() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame = new SeguroCadastrar();
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
	public SeguroCadastrar() {
		setTitle("Cadastrar seguro");
		setBounds(100, 100, 450, 346);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.activeCaption);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		panel.setBounds(10, 11, 414, 285);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Identifica\u00E7\u00E3o");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel.setBounds(10, 11, 394, 24);
		panel.add(lblNewLabel);
		
		textNome = new JTextField();
		textNome.setBounds(10, 46, 394, 24);
		panel.add(textNome);
		textNome.setColumns(10);
		
		JLabel lblValor = new JLabel("Valor/Aluguel");
		lblValor.setHorizontalAlignment(SwingConstants.CENTER);
		lblValor.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblValor.setBounds(10, 81, 394, 24);
		panel.add(lblValor);
		
		textValor = new JTextField();
		textValor.setColumns(10);
		textValor.setBounds(10, 116, 394, 24);
		panel.add(textValor);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnCadastrar.setBounds(145, 240, 128, 34);
		panel.add(btnCadastrar);
		
		JLabel lblCaracteristicas = new JLabel("Caracteristicas");
		lblCaracteristicas.setHorizontalAlignment(SwingConstants.CENTER);
		lblCaracteristicas.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblCaracteristicas.setBounds(10, 151, 394, 24);
		panel.add(lblCaracteristicas);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(10, 186, 394, 24);
		panel.add(textField);
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int pos = BancoDados.CadastrarSeguro();
				try {
					if (textValor.getText().length() <= 0 || textNome.getText().length() <= 0 || textField.getText().length() <= 0)
						JOptionPane.showMessageDialog(null, "Dados incompletos");
					else {
						BancoDados.cadastrarSeguro[pos] = new SeguroCarro(textNome.getText(), textField.getText(), Integer.parseInt(textValor.getText()));
						JOptionPane.showMessageDialog(null, "Seguro cadastrado com sucesso");
						
					}
				} catch (Exception nexc) {
					JOptionPane.showMessageDialog(null, "Favor inserir um valor inteiro no 'Valor/Aluguel'");
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
