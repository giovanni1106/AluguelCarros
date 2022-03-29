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
				Embreagem = "Desconhecida";
				
		}
		
		
		String PortaMalas = carro.getPortaMalas() + " Malas pequenas";
		
		System.out.println(carro.getPortaMalas());
		
		String Carga = null;
		
		if (carro.getCarga() == 0)
			Carga = "0";
		else
			Carga = String.valueOf(carro.getCarga());
		
		String Combustivel = null;
		
		switch(carro.getCombustivel()) {
		case 1:
			Combustivel = "Gasolina";
			break;
		case 2:
			Combustivel = "Flex";
			break;
		case 3:
			Combustivel = "Disel";
			break;
			default:
				Combustivel = "Desconhecido";
		}
		
		setBounds(100, 100, 420, 420);
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

		JLabel cor = new JLabel(Cor);
		cor.setBounds(10, 230, 125, 14);
		contentPane.add(cor);

		JLabel km = new JLabel(Km);
		km.setBounds(10, 284, 125, 20);
		contentPane.add(km);

		JLabel placa = new JLabel(Placa);
		placa.setBounds(10, 344, 125, 22);
		contentPane.add(placa);

		JLabel assentos = new JLabel(Assentos);
		assentos.setBounds(281, 348, 125, 14);
		contentPane.add(assentos);

		JLabel direcao = new JLabel(Direcao);
		direcao.setBounds(281, 64, 125, 14);
		contentPane.add(direcao);

		JLabel embreagem = new JLabel(Embreagem);
		embreagem.setBounds(281, 122, 125, 18);
		contentPane.add(embreagem);

		JLabel portaMalas = new JLabel(PortaMalas);
		portaMalas.setBounds(281, 176, 125, 14);
		contentPane.add(portaMalas);

		JLabel carga = new JLabel(Carga);
		carga.setBounds(281, 230, 125, 14);
		contentPane.add(carga);

		JLabel combustivel = new JLabel(Combustivel);
		combustivel.setBounds(281, 284, 125, 13);
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
		
		JLabel lblClasse_1 = new JLabel("Km");
		lblClasse_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblClasse_1.setBounds(10, 255, 125, 18);
		contentPane.add(lblClasse_1);
		
		JLabel lblClasse_1_1 = new JLabel("Placa");
		lblClasse_1_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblClasse_1_1.setBounds(10, 315, 125, 18);
		contentPane.add(lblClasse_1_1);
		
		JLabel lblClasse_1_2 = new JLabel("Assentos");
		lblClasse_1_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblClasse_1_2.setBounds(281, 308, 125, 18);
		contentPane.add(lblClasse_1_2);
		
		JLabel lblClasse_1_3 = new JLabel("Dire\u00E7\u00E3o");
		lblClasse_1_3.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblClasse_1_3.setBounds(281, 35, 125, 18);
		contentPane.add(lblClasse_1_3);
		
		JLabel lblClasse_1_4 = new JLabel("Embreagem");
		lblClasse_1_4.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblClasse_1_4.setBounds(281, 89, 125, 18);
		contentPane.add(lblClasse_1_4);
		
		JLabel lblClasse_1_5 = new JLabel("Porta Malas");
		lblClasse_1_5.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblClasse_1_5.setBounds(281, 151, 125, 18);
		contentPane.add(lblClasse_1_5);
		
		JLabel lblClasse_1_6 = new JLabel("Carga");
		lblClasse_1_6.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblClasse_1_6.setBounds(281, 201, 125, 18);
		contentPane.add(lblClasse_1_6);
		
		JLabel lblClasse_1_7 = new JLabel("Combustivel");
		lblClasse_1_7.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblClasse_1_7.setBounds(281, 255, 125, 18);
		contentPane.add(lblClasse_1_7);
	}
}
