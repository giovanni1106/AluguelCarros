package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class MostrarCarro extends JFrame {

	private JPanel contentPane;

	String Classe = null;
	String Marca = null;
	String Modelo = null;
	String Cor = null;
	String Km = null;
	String Placa = null;
	String Assentos = null;
	String Direcao = null;
	String Embreagem = null;
	String PortaMalas = null;
	String Carga = null;
	String Combustivel = null;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MostrarCarro frame = new MostrarCarro();
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
	public MostrarCarro() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblClasse = new JLabel("Classe");
		lblClasse.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblClasse.setBounds(10, 11, 46, 17);
		contentPane.add(lblClasse);

		JLabel classe = new JLabel(Classe);
		classe.setBounds(103, 11, 125, 18);
		contentPane.add(classe);

		JLabel lblMarca = new JLabel("Marca");
		lblMarca.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblMarca.setBounds(10, 40, 46, 14);
		contentPane.add(lblMarca);
		
		JLabel marca = new JLabel(Marca);
		marca.setBounds(103, 39, 125, 14);
		contentPane.add(marca);

		JLabel lblModelo = new JLabel("Modelo");
		lblModelo.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblModelo.setBounds(10, 65, 56, 21);
		contentPane.add(lblModelo);

		JLabel modelo = new JLabel(Modelo);
		modelo.setBounds(103, 71, 125, 14);
		contentPane.add(modelo);

		JLabel lblCor = new JLabel("Cor");
		lblCor.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblCor.setBounds(10, 98, 46, 14);
		contentPane.add(lblCor);

		JLabel cor = new JLabel(Cor);
		cor.setBounds(103, 97, 125, 14);
		contentPane.add(cor);

		JLabel lblKm = new JLabel("Km");
		lblKm.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblKm.setBounds(10, 123, 46, 21);
		contentPane.add(lblKm);

		JLabel km = new JLabel(Km);
		km.setBounds(103, 124, 125, 20);
		contentPane.add(km);

		JLabel lblPlaca = new JLabel("Placa");
		lblPlaca.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblPlaca.setBounds(10, 155, 46, 23);
		contentPane.add(lblPlaca);

		JLabel placa = new JLabel(Placa);
		placa.setBounds(103, 156, 125, 22);
		contentPane.add(placa);

		JLabel lblNewLabel_6_1 = new JLabel("Assentos");
		lblNewLabel_6_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_6_1.setBounds(10, 189, 70, 14);
		contentPane.add(lblNewLabel_6_1);

		JLabel assentos = new JLabel(Assentos);
		assentos.setBounds(103, 190, 125, 14);
		contentPane.add(assentos);

		JLabel lblNewLabel_6_1_1 = new JLabel("Dire\u00E7\u00E3o");
		lblNewLabel_6_1_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_6_1_1.setBounds(10, 214, 70, 21);
		contentPane.add(lblNewLabel_6_1_1);

		JLabel direcao = new JLabel(Direcao);
		direcao.setBounds(103, 215, 125, 14);
		contentPane.add(direcao);

		JLabel lblNewLabel_6_1_1_1 = new JLabel("Embreagem");
		lblNewLabel_6_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_6_1_1_1.setBounds(10, 246, 83, 19);
		contentPane.add(lblNewLabel_6_1_1_1);

		JLabel embreagem = new JLabel(Embreagem);
		embreagem.setBounds(103, 247, 125, 18);
		contentPane.add(embreagem);

		JLabel lblNewLabel_6_1_1_2 = new JLabel("Porta Malas");
		lblNewLabel_6_1_1_2.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_6_1_1_2.setBounds(10, 276, 83, 17);
		contentPane.add(lblNewLabel_6_1_1_2);

		JLabel portaMalas = new JLabel(PortaMalas);
		portaMalas.setBounds(103, 277, 125, 16);
		contentPane.add(portaMalas);

		JLabel lblNewLabel_6_1_1_3 = new JLabel("Carga");
		lblNewLabel_6_1_1_3.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_6_1_1_3.setBounds(10, 304, 70, 21);
		contentPane.add(lblNewLabel_6_1_1_3);

		JLabel carga = new JLabel(Carga);
		carga.setBounds(103, 308, 125, 14);
		contentPane.add(carga);

		JLabel lblNewLabel_6_1_1_4 = new JLabel("Combustivel");
		lblNewLabel_6_1_1_4.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_6_1_1_4.setBounds(10, 332, 83, 14);
		contentPane.add(lblNewLabel_6_1_1_4);

		JLabel combustivel = new JLabel(Combustivel);
		combustivel.setBounds(103, 333, 125, 13);
		contentPane.add(combustivel);
	}
}
