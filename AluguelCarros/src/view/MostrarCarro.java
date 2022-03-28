package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import veiculo.Carro;

public class MostrarCarro extends JFrame {

	private JPanel contentPane;

	public static void Construtor(Carro carro) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MostrarCarro frame = new MostrarCarro(carro);
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
				
		}
		String PortaMalas = null;
		String Carga = null;
		String Combustivel = null;
		
		setBounds(100, 100, 600, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblClasse = new JLabel("Classe");
		lblClasse.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblClasse.setBounds(10, 35, 125, 18);
		contentPane.add(lblClasse);

		JLabel classe = new JLabel(Classe);
		classe.setBounds(10, 64, 125, 18);
		contentPane.add(classe);
		
		JLabel marca = new JLabel(Marca);
		marca.setBounds(10, 122, 125, 14);
		contentPane.add(marca);

		JLabel modelo = new JLabel(Modelo);
		modelo.setBounds(10, 176, 125, 14);
		contentPane.add(modelo);

		JLabel lblCor = new JLabel("Cor");
		lblCor.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblCor.setBounds(491, 11, 46, 14);
		contentPane.add(lblCor);

		JLabel cor = new JLabel(Cor);
		cor.setBounds(10, 230, 125, 14);
		contentPane.add(cor);

		JLabel lblKm = new JLabel("Km");
		lblKm.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblKm.setBounds(491, 36, 46, 21);
		contentPane.add(lblKm);

		JLabel km = new JLabel(Km);
		km.setBounds(103, 124, 125, 20);
		contentPane.add(km);

		JLabel lblPlaca = new JLabel("Placa");
		lblPlaca.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblPlaca.setBounds(491, 68, 46, 23);
		contentPane.add(lblPlaca);

		JLabel placa = new JLabel(Placa);
		placa.setBounds(103, 156, 125, 22);
		contentPane.add(placa);

		JLabel lblNewLabel_6_1 = new JLabel("Assentos");
		lblNewLabel_6_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_6_1.setBounds(491, 102, 70, 14);
		contentPane.add(lblNewLabel_6_1);

		JLabel assentos = new JLabel(Assentos);
		assentos.setBounds(103, 190, 125, 14);
		contentPane.add(assentos);

		JLabel lblNewLabel_6_1_1 = new JLabel("Dire\u00E7\u00E3o");
		lblNewLabel_6_1_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_6_1_1.setBounds(491, 127, 70, 21);
		contentPane.add(lblNewLabel_6_1_1);

		JLabel direcao = new JLabel(Direcao);
		direcao.setBounds(103, 215, 125, 14);
		contentPane.add(direcao);

		JLabel lblNewLabel_6_1_1_1 = new JLabel("Embreagem");
		lblNewLabel_6_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_6_1_1_1.setBounds(491, 159, 83, 19);
		contentPane.add(lblNewLabel_6_1_1_1);

		JLabel embreagem = new JLabel(Embreagem);
		embreagem.setBounds(103, 247, 125, 18);
		contentPane.add(embreagem);

		JLabel lblNewLabel_6_1_1_2 = new JLabel("Porta Malas");
		lblNewLabel_6_1_1_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_6_1_1_2.setBounds(491, 189, 83, 17);
		contentPane.add(lblNewLabel_6_1_1_2);

		JLabel portaMalas = new JLabel(PortaMalas);
		portaMalas.setBounds(103, 277, 125, 16);
		contentPane.add(portaMalas);

		JLabel lblNewLabel_6_1_1_3 = new JLabel("Carga");
		lblNewLabel_6_1_1_3.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_6_1_1_3.setBounds(491, 217, 70, 21);
		contentPane.add(lblNewLabel_6_1_1_3);

		JLabel carga = new JLabel(Carga);
		carga.setBounds(103, 308, 125, 14);
		contentPane.add(carga);

		JLabel lblNewLabel_6_1_1_4 = new JLabel("Combustivel");
		lblNewLabel_6_1_1_4.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_6_1_1_4.setBounds(491, 245, 83, 14);
		contentPane.add(lblNewLabel_6_1_1_4);

		JLabel combustivel = new JLabel(Combustivel);
		combustivel.setBounds(103, 333, 125, 13);
		contentPane.add(combustivel);
		
		JLabel lblMarca = new JLabel("Marca");
		lblMarca.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblMarca.setBounds(10, 93, 125, 18);
		contentPane.add(lblMarca);
		
		JLabel lblModelo = new JLabel("Modelo");
		lblModelo.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblModelo.setBounds(10, 147, 125, 18);
		contentPane.add(lblModelo);
		
		JLabel lblCor_1 = new JLabel("Cor");
		lblCor_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblCor_1.setBounds(10, 201, 125, 18);
		contentPane.add(lblCor_1);
		
		JLabel lblClasse_1 = new JLabel("Classe");
		lblClasse_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblClasse_1.setBounds(10, 255, 125, 18);
		contentPane.add(lblClasse_1);
	}
}
