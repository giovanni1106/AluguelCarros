package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
import java.text.SimpleDateFormat;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

import Sistema.Aluguel;

public class MostrarAluguel extends JFrame {

	private JPanel contentPane;
	private static MostrarAluguel frame;

	/**
	 * Launch the application.
	 */
	public static void Construtor(Aluguel al) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame = new MostrarAluguel(al);
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
	public MostrarAluguel(Aluguel al) {
		setTitle("Exibir aluguel");
		
		setBounds(100, 100, 600, 600);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.activeCaption);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblUsuario = new JLabel(al.getUsuario().getNome());
		lblUsuario.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblUsuario.setHorizontalAlignment(SwingConstants.CENTER);
		lblUsuario.setBounds(10, 11, 564, 54);
		contentPane.add(lblUsuario);

		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		panel.setBounds(10, 472, 564, 78);
		contentPane.add(panel);
		panel.setLayout(null);

		JLabel lblValorTotal = new JLabel("R$" + String.valueOf(al.getValorTotal()) + ",00");
		lblValorTotal.setHorizontalAlignment(SwingConstants.CENTER);
		lblValorTotal.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblValorTotal.setBounds(10, 11, 544, 56);
		panel.add(lblValorTotal);

		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		panel_1.setBounds(10, 82, 280, 379);
		contentPane.add(panel_1);
		panel_1.setLayout(null);

		JLabel lblNewLabel = new JLabel("Ve\u00EDculo");
		lblNewLabel.setBounds(10, 11, 260, 24);
		panel_1.add(lblNewLabel);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));

		JLabel lblVeiculo = new JLabel(al.getCarro().getModelo());
		lblVeiculo.setBounds(10, 46, 260, 24);
		panel_1.add(lblVeiculo);
		lblVeiculo.setHorizontalAlignment(SwingConstants.CENTER);
		lblVeiculo.setFont(new Font("Tahoma", Font.PLAIN, 13));

		JLabel lblNewLabel_1 = new JLabel("Seguro");
		lblNewLabel_1.setBounds(10, 81, 260, 24);
		panel_1.add(lblNewLabel_1);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));

		JLabel lblSeguro = new JLabel();
		lblSeguro.setBounds(10, 116, 260, 24);
		panel_1.add(lblSeguro);
		lblSeguro.setHorizontalAlignment(SwingConstants.CENTER);
		lblSeguro.setFont(new Font("Tahoma", Font.PLAIN, 13));
		
		if(al.getSeguro() != null)
			lblSeguro.setText(al.getSeguro().getIdentificacao());
		else
			lblSeguro.setText("Não adquirido");

		JLabel lblNewLabel_1_1 = new JLabel("Cadeira");
		lblNewLabel_1_1.setBounds(10, 151, 260, 24);
		panel_1.add(lblNewLabel_1_1);
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 14));

		JLabel lblCadeira = new JLabel();
		lblCadeira.setBounds(10, 186, 260, 24);
		panel_1.add(lblCadeira);
		lblCadeira.setHorizontalAlignment(SwingConstants.CENTER);
		lblCadeira.setFont(new Font("Tahoma", Font.PLAIN, 13));
		
		if(al.getCadeira() != null)
			lblCadeira.setText(al.getCadeira().getIdentificacao());
		else
			lblCadeira.setText("Não adquirida");

		JLabel lblNewLabel_1_1_1 = new JLabel("Wifi");
		lblNewLabel_1_1_1.setBounds(10, 221, 260, 24);
		panel_1.add(lblNewLabel_1_1_1);
		lblNewLabel_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 14));

		JLabel lblWifi = new JLabel();
		lblWifi.setBounds(10, 256, 260, 24);
		panel_1.add(lblWifi);
		lblWifi.setHorizontalAlignment(SwingConstants.CENTER);
		lblWifi.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblWifi.setText("Adquirido");

		JLabel lblNewLabel_1_1_1_1 = new JLabel("Desconto");
		lblNewLabel_1_1_1_1.setBounds(10, 291, 260, 24);
		panel_1.add(lblNewLabel_1_1_1_1);
		lblNewLabel_1_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 14));

		JLabel lblDesconto = new JLabel();
		lblDesconto.setBounds(10, 326, 260, 24);
		panel_1.add(lblDesconto);
		lblDesconto.setHorizontalAlignment(SwingConstants.CENTER);
		lblDesconto.setFont(new Font("Tahoma", Font.PLAIN, 13));
		
		if(al.getUsuario().getFidelidade() != null)
			lblDesconto.setText(String.valueOf(al.getUsuario().getFidelidade().getDesconto()));
		else
			lblDesconto.setText("Não possui");

		JPanel panel_1_1 = new JPanel();
		panel_1_1.setLayout(null);
		panel_1_1.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		panel_1_1.setBounds(294, 82, 280, 379);
		contentPane.add(panel_1_1);

		JLabel lblAgenciaDeRetirada = new JLabel("Agencia de Retirada");
		lblAgenciaDeRetirada.setHorizontalAlignment(SwingConstants.CENTER);
		lblAgenciaDeRetirada.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblAgenciaDeRetirada.setBounds(10, 11, 260, 24);
		panel_1_1.add(lblAgenciaDeRetirada);

		JLabel lblAgenciaRetirada = new JLabel(al.getAgenciaReitrada().getIdentificacao());
		lblAgenciaRetirada.setHorizontalAlignment(SwingConstants.CENTER);
		lblAgenciaRetirada.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblAgenciaRetirada.setBounds(10, 46, 260, 24);
		panel_1_1.add(lblAgenciaRetirada);

		JLabel lblNewLabel_1_2 = new JLabel("Data de retirada");
		lblNewLabel_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1_2.setBounds(10, 81, 260, 24);
		panel_1_1.add(lblNewLabel_1_2);

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MMM/YYYY");
		
		JLabel lblDataRetirada = new JLabel(sdf.format(al.getDataRetirada().getTime()));
		lblDataRetirada.setHorizontalAlignment(SwingConstants.CENTER);
		lblDataRetirada.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblDataRetirada.setBounds(10, 116, 260, 24);
		panel_1_1.add(lblDataRetirada);

		JLabel lblNewLabel_1_1_2 = new JLabel("Agencia de Entrega");
		lblNewLabel_1_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1_1_2.setBounds(10, 151, 260, 24);
		panel_1_1.add(lblNewLabel_1_1_2);

		JLabel lblAgenciaEntrega = new JLabel(al.getAgenciaEntrega().getIdentificacao());
		lblAgenciaEntrega.setHorizontalAlignment(SwingConstants.CENTER);
		lblAgenciaEntrega.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblAgenciaEntrega.setBounds(10, 186, 260, 24);
		panel_1_1.add(lblAgenciaEntrega);

		JLabel lblNewLabel_1_1_1_2 = new JLabel("Data de entrega");
		lblNewLabel_1_1_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_1_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1_1_1_2.setBounds(10, 221, 260, 24);
		panel_1_1.add(lblNewLabel_1_1_1_2);

		JLabel lblDataEntrega = new JLabel(sdf.format(al.getDataEntrega().getTime()));
		lblDataEntrega.setHorizontalAlignment(SwingConstants.CENTER);
		lblDataEntrega.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblDataEntrega.setBounds(10, 256, 260, 24);
		panel_1_1.add(lblDataEntrega);

		JLabel lblNewLabel_1_1_1_1_1 = new JLabel("Dias totais de aluguel");
		lblNewLabel_1_1_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1_1_1_1_1.setBounds(10, 291, 260, 24);
		panel_1_1.add(lblNewLabel_1_1_1_1_1);

		JLabel lblDiasAluguel = new JLabel(String.valueOf(al.getDiasTotais()));
		lblDiasAluguel.setHorizontalAlignment(SwingConstants.CENTER);
		lblDiasAluguel.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblDiasAluguel.setBounds(10, 326, 260, 24);
		panel_1_1.add(lblDiasAluguel);
	}

	/**
	 * Fecha a janela
	 */
	public static void Encerrar() {
		if(frame != null)
			frame.dispose();
	}

}
