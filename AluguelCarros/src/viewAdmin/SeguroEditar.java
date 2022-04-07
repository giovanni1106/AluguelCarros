package viewAdmin;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import veiculo.Classe;
import veiculo.SeguroCarro;

public class SeguroEditar extends JFrame {

	private JPanel contentPane;
	private static SeguroEditar frame;
	private JTextField textDado;

	/**
	 * Launch the application.
	 */
	public static void Construtor(SeguroCarro se) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame = new SeguroEditar(se);
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
	public SeguroEditar(SeguroCarro se) {
		setTitle("Editar seguro");
		setBounds(100, 100, 400, 270);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JComboBox<String> comboDados = new JComboBox<String>();
		comboDados.setBounds(10, 44, 364, 22);
		contentPane.add(comboDados);
		comboDados.addItem("Identificacao");
		comboDados.addItem("Caracteristicas");
		comboDados.addItem("Valor");

		JLabel lblNewLabel = new JLabel("Dado que deseja alterar");
		lblNewLabel.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setBounds(10, 11, 364, 22);
		contentPane.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("Novo Dado");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1.setBounds(10, 86, 364, 22);
		contentPane.add(lblNewLabel_1);

		textDado = new JTextField();
		textDado.setBounds(10, 119, 364, 20);
		contentPane.add(textDado);
		textDado.setColumns(10);

		JButton btnNewButton = new JButton("Alterar");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton.setBounds(126, 167, 130, 53);
		contentPane.add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String texto = textDado.getText();
				int index = comboDados.getSelectedIndex();

				try {
					if (texto.length() <= 0)
						JOptionPane.showMessageDialog(null, "Favor inserir um dado valido");
					else {
						SeguroCarro.Editar(index, se, texto);
						JOptionPane.showMessageDialog(null, "Dado Alterado com sucesso!");
						textDado.setText("");
					}
				} catch (Exception nexc) {
					JOptionPane.showMessageDialog(null, "Favor inserir um numero inteiro para o valor");
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
