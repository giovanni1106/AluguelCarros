package viewAdmin;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JCheckBox;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import veiculo.Carro;
import view.CadastrarAdmin;
import Sistema.BancoDados;

public class CarroCadastrar extends JFrame {

	private JPanel contentPane;
	private JTextField textMarca;
	private JTextField textModelo;
	private JTextField textCor;
	private JTextField textKm;
	private JTextField textPlaca;
	private JTextField textCarga;
	private JTextField textAno;

	/**
	 * Launch the application.
	 */
	public static void Construtor() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CarroCadastrar frame = new CarroCadastrar();
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
	public CarroCadastrar() {
		setTitle("Cadastrar carro");
		setBounds(100, 100, 565, 645);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.activeCaption);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		panel.setBounds(10, 11, 260, 519);
		contentPane.add(panel);
		panel.setLayout(null);

		JLabel lblNewLabel = new JLabel("Marca");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel.setBounds(10, 11, 240, 30);
		panel.add(lblNewLabel);

		textMarca = new JTextField();
		textMarca.setBounds(10, 52, 240, 20);
		panel.add(textMarca);
		textMarca.setColumns(10);

		JLabel lblNewLabel_1 = new JLabel("Modelo");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1.setBounds(10, 83, 240, 30);
		panel.add(lblNewLabel_1);

		textModelo = new JTextField();
		textModelo.setColumns(10);
		textModelo.setBounds(10, 124, 240, 20);
		panel.add(textModelo);

		JLabel lblNewLabel_2 = new JLabel("Cor");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_2.setBounds(10, 155, 240, 30);
		panel.add(lblNewLabel_2);

		textCor = new JTextField();
		textCor.setColumns(10);
		textCor.setBounds(10, 196, 240, 20);
		panel.add(textCor);

		JLabel lblNewLabel_3 = new JLabel("Km (apenas numeros)");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_3.setBounds(10, 299, 240, 30);
		panel.add(lblNewLabel_3);

		textKm = new JTextField();
		textKm.setColumns(10);
		textKm.setBounds(10, 340, 240, 20);
		panel.add(textKm);

		JLabel lblNewLabel_4 = new JLabel("Placa");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_4.setBounds(10, 227, 240, 30);
		panel.add(lblNewLabel_4);

		textPlaca = new JTextField();
		textPlaca.setColumns(10);
		textPlaca.setBounds(10, 268, 240, 20);
		panel.add(textPlaca);

		JLabel lblNewLabel_5 = new JLabel("Carga (apenas numeros)");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_5.setBounds(10, 371, 240, 30);
		panel.add(lblNewLabel_5);

		textCarga = new JTextField();
		textCarga.setColumns(10);
		textCarga.setBounds(10, 412, 240, 20);
		panel.add(textCarga);

		textAno = new JTextField();
		textAno.setColumns(10);
		textAno.setBounds(10, 484, 240, 20);
		panel.add(textAno);

		JLabel lblNewLabel_5_5 = new JLabel("Ano (apenas numeros)");
		lblNewLabel_5_5.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_5_5.setBounds(10, 443, 240, 30);
		panel.add(lblNewLabel_5_5);

		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		panel_1.setBounds(280, 488, 260, 109);
		contentPane.add(panel_1);

		JCheckBox chckbxVidro = new JCheckBox("Vidro el\u00E9trico");
		chckbxVidro.setFont(new Font("Tahoma", Font.BOLD, 15));
		chckbxVidro.setBounds(6, 7, 127, 30);
		panel_1.add(chckbxVidro);

		JCheckBox chckbxArCondicionado = new JCheckBox("Ar condicionado");
		chckbxArCondicionado.setFont(new Font("Tahoma", Font.BOLD, 15));
		chckbxArCondicionado.setBounds(6, 40, 145, 30);
		panel_1.add(chckbxArCondicionado);

		JCheckBox chckbxAirbag = new JCheckBox("Airbag");
		chckbxAirbag.setFont(new Font("Tahoma", Font.BOLD, 15));
		chckbxAirbag.setBounds(6, 73, 75, 30);
		panel_1.add(chckbxAirbag);

		JPanel panel_1_1 = new JPanel();
		panel_1_1.setLayout(null);
		panel_1_1.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		panel_1_1.setBounds(280, 11, 260, 466);
		contentPane.add(panel_1_1);

		JLabel lblNewLabel_5_1 = new JLabel("Classe");
		lblNewLabel_5_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_5_1.setBounds(10, 11, 240, 30);
		panel_1_1.add(lblNewLabel_5_1);

		JComboBox<String> comboClasse = new JComboBox<String>();
		comboClasse.setBounds(10, 52, 240, 22);
		panel_1_1.add(comboClasse);

		for (int i = 0; i < BancoDados.MAX; i++)
			if (BancoDados.cadastrarClasse[i] != null)
				comboClasse.addItem(BancoDados.cadastrarClasse[i].getNome());

		JLabel lblNewLabel_5_2 = new JLabel("Assentos");
		lblNewLabel_5_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_5_2.setBounds(10, 85, 240, 30);
		panel_1_1.add(lblNewLabel_5_2);

		JComboBox<Integer> comboAssentos = new JComboBox<Integer>();
		comboAssentos.setBounds(10, 126, 240, 22);
		panel_1_1.add(comboAssentos);

		for (int i = 1; i < 11; i++)
			comboAssentos.addItem(i);

		JLabel lblNewLabel_5_3 = new JLabel("Porta Malas");
		lblNewLabel_5_3.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_5_3.setBounds(10, 159, 240, 30);
		panel_1_1.add(lblNewLabel_5_3);

		JComboBox<String> comboPortaMalas = new JComboBox<String>();
		comboPortaMalas.setBounds(10, 200, 240, 22);
		panel_1_1.add(comboPortaMalas);

		for (int i = 1; i < 11; i++)
			comboPortaMalas.addItem(i + " Malas pequenas");

		JLabel lblNewLabel_5_4 = new JLabel("Dire\u00E7\u00E3o");
		lblNewLabel_5_4.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_5_4.setBounds(10, 233, 240, 30);
		panel_1_1.add(lblNewLabel_5_4);

		JComboBox<String> comboDirecao = new JComboBox<String>();
		comboDirecao.setBounds(10, 274, 240, 22);
		panel_1_1.add(comboDirecao);

		comboDirecao.addItem("Hidráulica");
		comboDirecao.addItem("Elétrica");

		JLabel lblNewLabel_5_4_1 = new JLabel("Embreagem");
		lblNewLabel_5_4_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_5_4_1.setBounds(10, 307, 240, 30);
		panel_1_1.add(lblNewLabel_5_4_1);

		JComboBox<String> comboEmbreagem = new JComboBox<String>();
		comboEmbreagem.setBounds(10, 348, 240, 22);
		panel_1_1.add(comboEmbreagem);

		comboEmbreagem.addItem("Automático");
		comboEmbreagem.addItem("Manual");

		JLabel lblNewLabel_5_4_1_1 = new JLabel("Combustivel");
		lblNewLabel_5_4_1_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_5_4_1_1.setBounds(10, 381, 240, 30);
		panel_1_1.add(lblNewLabel_5_4_1_1);

		JComboBox<String> comboCombustivel = new JComboBox<String>();
		comboCombustivel.setBounds(10, 422, 240, 22);
		panel_1_1.add(comboCombustivel);

		comboCombustivel.addItem("Gasolina");
		comboCombustivel.addItem("Flex");
		comboCombustivel.addItem("Disel");
		comboCombustivel.addItem("Elétrico");

		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnCadastrar.setBounds(10, 541, 260, 56);
		contentPane.add(btnCadastrar);
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				int posicao = BancoDados.CadastrarCarro();
				int assentos = comboAssentos.getSelectedIndex() + 1;
				int portaM = comboPortaMalas.getSelectedIndex() + 1;
				int di = comboDirecao.getSelectedIndex() + 1;
				int em = comboEmbreagem.getSelectedIndex() + 1;
				int co = comboCombustivel.getSelectedIndex() + 1;

				try {
					if (textMarca.getText().length() <= 0 || textModelo.getText().length() <= 0
							|| textCor.getText().length() <= 0 || textKm.getText().length() <= 0
							|| textPlaca.getText().length() <= 0 || textCarga.getText().length() <= 0
							|| textAno.getText().length() <= 0) {
						JOptionPane.showMessageDialog(null, "Dados incompletos");
					} else {
						BancoDados.cadastrarCarro[posicao] = new Carro(
								BancoDados.cadastrarClasse[comboClasse.getSelectedIndex()], textMarca.getText(),
								textModelo.getText(), textCor.getText(), Integer.parseInt(textKm.getText()),
								textPlaca.getText(), chckbxAirbag.isSelected(), assentos, chckbxVidro.isSelected(),
								portaM, di, chckbxArCondicionado.isSelected(), em,
								Integer.parseInt(textCarga.getText()), co, Integer.parseInt(textAno.getText()));
						JOptionPane.showMessageDialog(null, "Carro cadastrado com sucesso");
					}
				} catch (Exception nexc) {
					JOptionPane.showMessageDialog(null, "Favor inserir dados válidos");
				}
			}
		});
	}
}
