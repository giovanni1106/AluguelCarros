package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import veiculo.Carro;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.SwingConstants;

public class MostrarCarro extends JFrame {

	private JPanel contentPane;
	private static MostrarCarro frame;

	public static void Construtor(Carro carro) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame = new MostrarCarro(carro);
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
	public MostrarCarro(Carro carro) {
		setTitle("Carro");
		
		String Classe = carro.getClasse().getNome();
		String Marca = carro.getMarca();
		String Modelo = carro.getModelo();
		String Cor = carro.getCor();
		String Km = String.valueOf(carro.getKm());
		String Placa = carro.getPlaca();
		String Assentos = String.valueOf(carro.getAssentos());
		
		String Direcao = null;
		
		switch(carro.getDirecao()) {
		case 1:
			Direcao = "HIDRÁULICA";
			break;
		case 2:
			Direcao = "ELÉTRICA";
			break;
			default:
				Direcao = "Desconhecida";
		}
		
		String Embreagem = null;
		
		switch(carro.getEmbreagem()) {
		case 1:
			Embreagem = "AUTOMÁTICO";
			break;
		case 2:
			Embreagem = "MANUAL";
			break;
			default:
				Embreagem = "Desconhecida";
				
		}
		
		
		String PortaMalas = carro.getPortaMalas() + " Malas pequenas";
		String Carga = null;
		
		if (carro.getCarga() == 0)
			Carga = "0";
		else
			Carga = String.valueOf(carro.getCarga());
		
		String Combustivel = null;
		
		switch(carro.getCombustivel()) {
		case 1:
			Combustivel = "GASOLINA";
			break;
		case 2:
			Combustivel = "FLEX";
			break;
		case 3:
			Combustivel = "DISEL";
			break;
		case 4:
			Combustivel = "ELÉTRICO";
			default:
				Combustivel = "Desconhecido";
		}
		
		setBounds(100, 100, 300, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblClasse = new JLabel("Classe");
		lblClasse.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblClasse.setBounds(10, 11, 125, 18);
		contentPane.add(lblClasse);

		JLabel classe = new JLabel(Classe);
		classe.setBounds(10, 40, 125, 18);
		contentPane.add(classe);
		
		JLabel marca = new JLabel(Marca);
		marca.setBounds(10, 98, 125, 18);
		contentPane.add(marca);

		JLabel modelo = new JLabel(Modelo);
		modelo.setBounds(10, 156, 125, 18);
		contentPane.add(modelo);

		JLabel cor = new JLabel(Cor);
		cor.setBounds(10, 214, 125, 18);
		contentPane.add(cor);

		JLabel km = new JLabel(Km);
		km.setBounds(10, 272, 125, 18);
		contentPane.add(km);

		JLabel placa = new JLabel(Placa);
		placa.setBounds(10, 330, 125, 18);
		contentPane.add(placa);

		JLabel assentos = new JLabel(Assentos);
		assentos.setBounds(145, 156, 125, 18);
		contentPane.add(assentos);

		JLabel direcao = new JLabel(Direcao);
		direcao.setBounds(145, 40, 125, 18);
		contentPane.add(direcao);

		JLabel embreagem = new JLabel(Embreagem);
		embreagem.setBounds(145, 214, 125, 18);
		contentPane.add(embreagem);

		JLabel portaMalas = new JLabel(PortaMalas);
		portaMalas.setBounds(145, 272, 125, 18);
		contentPane.add(portaMalas);

		JLabel carga = new JLabel(Carga);
		carga.setBounds(145, 330, 125, 18);
		contentPane.add(carga);

		JLabel combustivel = new JLabel(Combustivel);
		combustivel.setBounds(145, 98, 125, 18);
		contentPane.add(combustivel);
		
		JLabel lblMarca = new JLabel("Marca");
		lblMarca.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblMarca.setBounds(10, 69, 125, 18);
		contentPane.add(lblMarca);
		
		JLabel lblModelo = new JLabel("Modelo");
		lblModelo.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblModelo.setBounds(10, 127, 125, 18);
		contentPane.add(lblModelo);
		
		JLabel lblCor_1 = new JLabel("Cor");
		lblCor_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblCor_1.setBounds(10, 185, 125, 18);
		contentPane.add(lblCor_1);
		
		JLabel lblClasse_1 = new JLabel("Km");
		lblClasse_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblClasse_1.setBounds(10, 243, 125, 18);
		contentPane.add(lblClasse_1);
		
		JLabel lblClasse_1_1 = new JLabel("Placa");
		lblClasse_1_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblClasse_1_1.setBounds(10, 301, 125, 18);
		contentPane.add(lblClasse_1_1);
		
		JLabel lblClasse_1_2 = new JLabel("Assentos");
		lblClasse_1_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblClasse_1_2.setBounds(145, 127, 125, 18);
		contentPane.add(lblClasse_1_2);
		
		JLabel lblClasse_1_3 = new JLabel("Dire\u00E7\u00E3o");
		lblClasse_1_3.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblClasse_1_3.setBounds(145, 11, 125, 18);
		contentPane.add(lblClasse_1_3);
		
		JLabel lblClasse_1_4 = new JLabel("Embreagem");
		lblClasse_1_4.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblClasse_1_4.setBounds(145, 185, 125, 18);
		contentPane.add(lblClasse_1_4);
		
		JLabel lblClasse_1_5 = new JLabel("Porta Malas");
		lblClasse_1_5.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblClasse_1_5.setBounds(145, 243, 125, 18);
		contentPane.add(lblClasse_1_5);
		
		JLabel lblClasse_1_6 = new JLabel("Carga");
		lblClasse_1_6.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblClasse_1_6.setBounds(145, 301, 125, 18);
		contentPane.add(lblClasse_1_6);
		
		JLabel lblClasse_1_7 = new JLabel("Combustivel");
		lblClasse_1_7.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblClasse_1_7.setBounds(145, 69, 125, 18);
		contentPane.add(lblClasse_1_7);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(175, 238, 238));
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		panel.setBounds(10, 372, 260, 78);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("R$" + carro.getClasse().getValorDia());
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel.setBounds(60, 11, 140, 56);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("/Dia");
		lblNewLabel_1.setBounds(210, 53, 46, 14);
		panel.add(lblNewLabel_1);
	}

	/**
	 * Fecha a janela
	 */
	public static void Encerrar() {
		if(frame != null)
			frame.dispose();
	}
}
