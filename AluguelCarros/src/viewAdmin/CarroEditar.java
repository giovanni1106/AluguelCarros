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

import Pessoas.Usuario;
import Sistema.BancoDados;
import veiculo.Carro;
import view.MostrarCarro;

public class CarroEditar extends JFrame {

	private JPanel contentPane;
	private JTextField textDado;

	/**
	 * Launch the application.
	 */
	public static void Construtor(Carro car) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CarroEditar frame = new CarroEditar(car);
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
	public CarroEditar(Carro car) {
		setBounds(100, 100, 400, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JComboBox<String> comboDados = new JComboBox<String>();
		comboDados.setBounds(10, 44, 364, 22);
		contentPane.add(comboDados);
		comboDados.addItem("Classe");
		comboDados.addItem("Cor");
		comboDados.addItem("Km");
		comboDados.addItem("Placa");

		JComboBox<String> comboClasses = new JComboBox<String>();
		comboClasses.setBounds(10, 198, 364, 22);
		contentPane.add(comboClasses);

		for (int i = 0; i < BancoDados.MAX; i++)
			if (BancoDados.cadastrarClasse[i] != null)
				comboClasses.addItem(BancoDados.cadastrarClasse[i].getNome());

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
		btnNewButton.setBounds(10, 290, 130, 60);
		contentPane.add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String texto = textDado.getText();
				int index = comboDados.getSelectedIndex();

				System.out.println(texto);
				if (texto.length() <= 0 && index != 0)
					JOptionPane.showMessageDialog(null, "Favor inserir um dado valido");
				else if (index != 0) {
					Carro.Editar(index, texto, car, null);
					JOptionPane.showMessageDialog(null, "Dado Alterado com sucesso!");
					textDado.setText("");
				} else {
					Carro.Editar(index, null, car, BancoDados.cadastrarClasse[comboClasses.getSelectedIndex()]);
					JOptionPane.showMessageDialog(null, "Dado Alterado com sucesso!");
					textDado.setText("");
				}
			}
		});

		JLabel lblNewLabel_1_1 = new JLabel("Caso queira alterar a classe");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1_1.setBounds(10, 165, 364, 22);
		contentPane.add(lblNewLabel_1_1);

		JButton btnDetalhar = new JButton("Detalhar");
		btnDetalhar.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnDetalhar.setBounds(244, 290, 130, 60);
		contentPane.add(btnDetalhar);
		btnDetalhar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MostrarCarro.Construtor(car);
			}
		});

	}

}
