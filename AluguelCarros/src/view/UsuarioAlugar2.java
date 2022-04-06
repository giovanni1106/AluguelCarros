package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JProgressBar;
import javax.swing.JCheckBox;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Calendar;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

import veiculo.Carro;
import Sistema.BancoDados;
import veiculo.Agencia;
import Pessoas.Fidelidade;
import veiculo.CadeiraCrianca;
import veiculo.SeguroCarro;

public class UsuarioAlugar2 extends JFrame {

	private JPanel contentPane;
	private int valorWifi = 100;

	public static void Construtor(Carro carro) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UsuarioAlugar2 frame = new UsuarioAlugar2(carro);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public UsuarioAlugar2(Carro carro) {

		int cont = 0;

		Calendar DataAtual = Calendar.getInstance();
		int anoAtual = DataAtual.get(Calendar.YEAR);
		int mesAtual = DataAtual.get(Calendar.MONTH);
		int diaAtual = DataAtual.get(Calendar.DAY_OF_MONTH);

		setBounds(100, 100, 750, 550);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.activeCaption);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel panel = new JPanel();
		panel.setBackground(SystemColor.menu);
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		panel.setBounds(210, 11, 247, 489);
		contentPane.add(panel);
		panel.setLayout(null);

		JLabel lblTarifasAdicionais = new JLabel("TARIFAS ADICIONAIS");
		lblTarifasAdicionais.setHorizontalAlignment(SwingConstants.CENTER);
		lblTarifasAdicionais.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblTarifasAdicionais.setBounds(10, 11, 227, 25);
		panel.add(lblTarifasAdicionais);

		JComboBox<String> comboSeguro = new JComboBox<String>();
		comboSeguro.setBounds(10, 125, 227, 22);
		panel.add(comboSeguro);

		cont = 0;
		while (BancoDados.cadastrarSeguro[cont] != null) {
			comboSeguro.addItem(BancoDados.cadastrarSeguro[cont].getIdentificacao());
			cont++;
		}

		JButton btnDetalharSeguro = new JButton("Detalhar");
		btnDetalharSeguro.setBounds(10, 158, 227, 23);
		panel.add(btnDetalharSeguro);
		btnDetalharSeguro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MostrarSeguro.Construtor(BancoDados.cadastrarSeguro[comboSeguro.getSelectedIndex()]);
			}
		});

		JComboBox<String> comboCadeira = new JComboBox<String>();
		comboCadeira.setBounds(10, 246, 227, 22);
		panel.add(comboCadeira);

		cont = 0;
		while (BancoDados.cadastrarCadeira[cont] != null) {
			comboCadeira.addItem(BancoDados.cadastrarCadeira[cont].getIdentificacao());
			cont++;
		}

		JButton btnDetalharCadeira = new JButton("Detalhar");
		btnDetalharCadeira.setBounds(10, 279, 227, 23);
		panel.add(btnDetalharCadeira);
		btnDetalharCadeira.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MostrarCadeira.Construtor(BancoDados.cadastrarCadeira[comboSeguro.getSelectedIndex()]);
			}
		});

		JCheckBox chckbxNewCheckBox = new JCheckBox("Cadeira crian\u00E7a");
		chckbxNewCheckBox.setFont(new Font("Tahoma", Font.BOLD, 12));
		chckbxNewCheckBox.setBounds(10, 216, 227, 23);
		panel.add(chckbxNewCheckBox);

		JCheckBox chckbxSeguro = new JCheckBox("Seguro");
		chckbxSeguro.setFont(new Font("Tahoma", Font.BOLD, 12));
		chckbxSeguro.setBounds(10, 95, 227, 23);
		panel.add(chckbxSeguro);

		JCheckBox chckbxWifi = new JCheckBox("Wi-fi");
		chckbxWifi.setFont(new Font("Tahoma", Font.BOLD, 12));
		chckbxWifi.setBounds(10, 345, 227, 23);
		panel.add(chckbxWifi);

		JLabel lblNewLabel = new JLabel("R$" + valorWifi + ",00");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel.setBounds(10, 388, 88, 25);
		panel.add(lblNewLabel);

		JLabel lblNewLabel_2 = new JLabel("/Aluguel");
		lblNewLabel_2.setBounds(108, 395, 46, 14);
		panel.add(lblNewLabel_2);

		JPanel panel_1 = new JPanel();
		panel_1.setBackground(SystemColor.menu);
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		panel_1.setBounds(10, 11, 190, 246);
		contentPane.add(panel_1);
		panel_1.setLayout(null);

		JLabel lblNewLabel_1 = new JLabel("RETIRADA");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1.setBounds(10, 11, 170, 25);
		panel_1.add(lblNewLabel_1);

		JLabel lblAgencia_2 = new JLabel("Agencia");
		lblAgencia_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblAgencia_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblAgencia_2.setBounds(10, 53, 170, 16);
		panel_1.add(lblAgencia_2);

		JComboBox<String> comboRetirada = new JComboBox<String>();
		comboRetirada.setBounds(10, 80, 170, 22);
		panel_1.add(comboRetirada);

		Agencia[] Agencias = BancoDados.ImprimirAgencias(carro);

		cont = 0;
		while (Agencias[cont] != null) {
			comboRetirada.addItem(Agencias[cont].getIdentificacao());
			cont++;
		}

		JButton btnEnderecoRetirada = new JButton("Endere\u00E7o");
		btnEnderecoRetirada.setBounds(10, 113, 170, 23);
		panel_1.add(btnEnderecoRetirada);
		btnEnderecoRetirada.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MostrarAgencia.Construtor(Agencias[comboRetirada.getSelectedIndex()]);
			}
		});

		JLabel lblDataRetirada_2 = new JLabel("Dia");
		lblDataRetirada_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblDataRetirada_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblDataRetirada_2.setBounds(10, 147, 45, 16);
		panel_1.add(lblDataRetirada_2);

		JLabel lblMs_2 = new JLabel("M\u00EAs");
		lblMs_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblMs_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblMs_2.setBounds(65, 147, 45, 16);
		panel_1.add(lblMs_2);

		JLabel lblAno_2 = new JLabel("Ano");
		lblAno_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblAno_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblAno_2.setBounds(120, 147, 60, 16);
		panel_1.add(lblAno_2);

		JComboBox comboAnoRetirada = new JComboBox();
		comboAnoRetirada.setBounds(120, 174, 60, 22);
		panel_1.add(comboAnoRetirada);

		comboAnoRetirada.addItem(anoAtual);
		comboAnoRetirada.addItem(anoAtual + 1);

		JComboBox comboMesRetirada = new JComboBox();
		comboMesRetirada.setBounds(65, 174, 45, 22);
		panel_1.add(comboMesRetirada);

		for (int i = 0; i < 12; i++) {
			comboMesRetirada.addItem(mesAtual + i + 1);
		}

		JComboBox comboDiaRetirada = new JComboBox();
		comboDiaRetirada.setBounds(10, 174, 45, 22);
		panel_1.add(comboDiaRetirada);

		for (int i = 0; i < 31; i++) {
			comboDiaRetirada.addItem(i + 1);
		}

		JPanel panel_1_1 = new JPanel();
		panel_1_1.setLayout(null);
		panel_1_1.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		panel_1_1.setBackground(SystemColor.menu);
		panel_1_1.setBounds(10, 268, 190, 232);
		contentPane.add(panel_1_1);

		JLabel lblEntrega_1_1 = new JLabel("ENTREGA");
		lblEntrega_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblEntrega_1_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblEntrega_1_1.setBounds(10, 11, 170, 25);
		panel_1_1.add(lblEntrega_1_1);

		JLabel lblAgencia_1_1_1 = new JLabel("Agencia");
		lblAgencia_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblAgencia_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblAgencia_1_1_1.setBounds(10, 53, 170, 16);
		panel_1_1.add(lblAgencia_1_1_1);

		JComboBox<String> comboEntrega = new JComboBox<String>();
		comboEntrega.setBounds(10, 80, 170, 22);
		panel_1_1.add(comboEntrega);

		cont = 0;
		while (BancoDados.cadastrarAgencia[cont] != null) {
			comboEntrega.addItem(BancoDados.cadastrarAgencia[cont].getIdentificacao());
			cont++;
		}

		JButton btnEnderecoEntrega = new JButton("Endere\u00E7o");
		btnEnderecoEntrega.setBounds(10, 113, 170, 23);
		panel_1_1.add(btnEnderecoEntrega);
		btnEnderecoEntrega.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MostrarAgencia.Construtor(BancoDados.cadastrarAgencia[comboEntrega.getSelectedIndex()]);
			}
		});

		JLabel lblDataRetirada_1_1_1 = new JLabel("Dia");
		lblDataRetirada_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblDataRetirada_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblDataRetirada_1_1_1.setBounds(10, 147, 45, 16);
		panel_1_1.add(lblDataRetirada_1_1_1);

		JLabel lblMs_1_1_1 = new JLabel("M\u00EAs");
		lblMs_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblMs_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblMs_1_1_1.setBounds(65, 147, 45, 16);
		panel_1_1.add(lblMs_1_1_1);

		JLabel lblAno_1_1_1 = new JLabel("Ano");
		lblAno_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblAno_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblAno_1_1_1.setBounds(120, 147, 60, 16);
		panel_1_1.add(lblAno_1_1_1);

		JComboBox comboAnoEntrega = new JComboBox();
		comboAnoEntrega.setBounds(120, 174, 60, 22);
		panel_1_1.add(comboAnoEntrega);

		for (int i = 0; i < 2; i++) {
			comboAnoEntrega.addItem(anoAtual + i);
		}

		JComboBox comboMesEntrega = new JComboBox();
		comboMesEntrega.setBounds(65, 174, 45, 22);
		panel_1_1.add(comboMesEntrega);

		for (int i = 0; i < 12; i++) {
			comboMesEntrega.addItem(i + 1);
		}

		JComboBox comboDiaEntrega = new JComboBox();
		comboDiaEntrega.setBounds(10, 174, 45, 22);
		panel_1_1.add(comboDiaEntrega);

		for (int i = 0; i < 31; i++) {
			comboDiaEntrega.addItem(i + 1);
		}

		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		panel_2.setBackground(new Color(240, 255, 240));
		panel_2.setBounds(467, 158, 257, 342);
		contentPane.add(panel_2);
		panel_2.setLayout(null);

		JLabel carroEscolhido = new JLabel(carro.getModelo());
		carroEscolhido.setHorizontalAlignment(SwingConstants.CENTER);
		carroEscolhido.setFont(new Font("Tahoma", Font.BOLD, 16));
		carroEscolhido.setBounds(10, 11, 237, 38);
		panel_2.add(carroEscolhido);

		JButton btnConfirmarAluguel = new JButton("Confirmar Aluguel");
		btnConfirmarAluguel.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnConfirmarAluguel.setBounds(10, 277, 237, 54);
		panel_2.add(btnConfirmarAluguel);

		JButton btnRevisar = new JButton("Revisar pedido");
		btnRevisar.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnRevisar.setBounds(10, 212, 237, 54);
		panel_2.add(btnRevisar);
		btnRevisar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					CadeiraCrianca cad = null;
					SeguroCarro seg = null;

					if (chckbxNewCheckBox.isSelected())
						cad = BancoDados.cadastrarCadeira[comboCadeira.getSelectedIndex()];

					if (chckbxSeguro.isSelected())
						seg = BancoDados.cadastrarSeguro[comboSeguro.getSelectedIndex()];

					int diaR = Integer.parseInt(String.valueOf(comboDiaRetirada.getSelectedItem()));
					int mesR = Integer.parseInt(String.valueOf(comboMesRetirada.getSelectedItem()));
					int anoR = Integer.parseInt(String.valueOf(comboAnoRetirada.getSelectedItem()));

					LocalDateTime dataRetirada = LocalDateTime.of(anoR, mesR, diaR, 0, 0, 0);
					Calendar dR = new GregorianCalendar(anoR, mesR, diaR);

					int diaE = Integer.parseInt(String.valueOf(comboDiaEntrega.getSelectedItem()));
					int mesE = Integer.parseInt(String.valueOf(comboMesEntrega.getSelectedItem()));
					int anoE = Integer.parseInt(String.valueOf(comboAnoEntrega.getSelectedItem()));

					LocalDateTime dataEntrega = LocalDateTime.of(anoE, mesE, diaE, 0, 0, 0);
					Calendar dE = new GregorianCalendar(anoE, mesE, diaE);

					long dias = dataRetirada.until(dataEntrega, ChronoUnit.DAYS);

					SimpleDateFormat sdf = new SimpleDateFormat("dd/MMM/YYYY");

					Calendar dataA = Calendar.getInstance();
					LocalDateTime dataAtual = LocalDateTime.of(dataA.get(Calendar.YEAR), dataA.get(Calendar.MONTH),
							dataA.get(Calendar.DAY_OF_MONTH), 0, 0, 0);

					long dias2 = dataAtual.until(dataRetirada, ChronoUnit.DAYS);

					if (dias < 3)
						JOptionPane.showMessageDialog(null, "Tempo mínimo de aluguel são 3 dias");
					else if (dias2 < 2)
						JOptionPane.showMessageDialog(null, "Favor reservar com mais de 2 dias de antecedencia");
					else
						MostrarRevisao.Construtor(BancoDados.cadastrarUsuario[BancoDados.pos], carro, seg, cad,
								chckbxWifi.isSelected(), valorWifi,
								BancoDados.cadastrarAgencia[comboRetirada.getSelectedIndex()],
								BancoDados.cadastrarAgencia[comboEntrega.getSelectedIndex()], sdf.format(dR.getTime()),
								sdf.format(dE.getTime()), dias);
				} catch (Exception nexc) {
					JOptionPane.showMessageDialog(null, "Favor inserir uma data válida");
				}
			}
		});

		JLabel nomeUsuario = new JLabel(BancoDados.cadastrarUsuario[BancoDados.pos].getNome());
		nomeUsuario.setHorizontalAlignment(SwingConstants.CENTER);
		nomeUsuario.setFont(new Font("Tahoma", Font.BOLD, 13));
		nomeUsuario.setBounds(10, 60, 237, 30);
		panel_2.add(nomeUsuario);

		JLabel emailUsuario = new JLabel(BancoDados.cadastrarUsuario[BancoDados.pos].getEmail());
		emailUsuario.setHorizontalAlignment(SwingConstants.CENTER);
		emailUsuario.setFont(new Font("Tahoma", Font.BOLD, 13));
		emailUsuario.setBounds(10, 101, 237, 30);
		panel_2.add(emailUsuario);

		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		panel_3.setBounds(467, 11, 257, 136);
		contentPane.add(panel_3);
		panel_3.setLayout(null);

		JLabel lblFidelidade = new JLabel("FIDELIDADE");
		lblFidelidade.setHorizontalAlignment(SwingConstants.CENTER);
		lblFidelidade.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblFidelidade.setBounds(10, 11, 237, 25);
		panel_3.add(lblFidelidade);

		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("Desconto");
		chckbxNewCheckBox_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		chckbxNewCheckBox_1.setBounds(10, 70, 97, 23);
		panel_3.add(chckbxNewCheckBox_1);

		JComboBox<Float> comboDesconto = new JComboBox<Float>();
		comboDesconto.setBounds(10, 100, 97, 22);
		panel_3.add(comboDesconto);
		if (BancoDados.cadastrarUsuario[BancoDados.pos].getFidelidade() != null)
			comboDesconto.addItem(BancoDados.cadastrarUsuario[BancoDados.pos].getFidelidade().getDesconto());
	}
}
