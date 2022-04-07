package viewAdmin;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

import Sistema.BancoDados;
import veiculo.Classe;

import java.awt.Color;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;

public class ClasseCadastrar extends JFrame {

	private JPanel contentPane;
	private static ClasseCadastrar frame;
	private JTextField textNome;
	private JTextField textValor;

	/**
	 * Launch the application.
	 */
	public static void Construtor() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame = new ClasseCadastrar();
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
	public ClasseCadastrar() {
		setTitle("Cadastrar classe");
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
		
		JLabel lblNewLabel = new JLabel("Nome");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel.setBounds(10, 11, 394, 24);
		panel.add(lblNewLabel);
		
		textNome = new JTextField();
		textNome.setBounds(10, 46, 394, 24);
		panel.add(textNome);
		textNome.setColumns(10);
		
		JLabel lblValor = new JLabel("Valor/Dia");
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
		btnCadastrar.setBounds(146, 194, 128, 34);
		panel.add(btnCadastrar);
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int pos = BancoDados.CadastrarClasse();
				try {
					if (textValor.getText().length() <= 0 || textNome.getText().length() <= 0)
						JOptionPane.showMessageDialog(null, "Dados incompletos");
					else {
						BancoDados.cadastrarClasse[pos] = new Classe(textNome.getText(), Integer.parseInt(textValor.getText()));
						JOptionPane.showMessageDialog(null, "Classe cadastrada com sucesso");
						
					}
				} catch (Exception nexc) {
					JOptionPane.showMessageDialog(null, "Favor inserir um valor inteiro no 'Valor/Dia'");
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
