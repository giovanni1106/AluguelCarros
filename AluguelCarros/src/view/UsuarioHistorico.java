package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

import java.awt.SystemColor;
import java.text.SimpleDateFormat;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JList;

import Pessoas.Usuario;
import Sistema.BancoDados;
import Sistema.Aluguel;

public class UsuarioHistorico extends JFrame {

	private JPanel contentPane;
	private static UsuarioHistorico frame;
	private static String[] alugueis = new String[BancoDados.MAX];
	private static JList<String[]> list;

	/**
	 * Launch the application.
	 */
	public static void Construtor() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame = new UsuarioHistorico();
					AtualizaList();
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
	public UsuarioHistorico() {
		setBounds(100, 100, 700, 500);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.activeCaption);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel(BancoDados.cadastrarUsuario[BancoDados.pos].getNome());
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel.setBounds(10, 11, 664, 30);
		contentPane.add(lblNewLabel);

		JPanel panel = new JPanel();
		panel.setBounds(10, 52, 664, 398);
		contentPane.add(panel);
		panel.setLayout(null);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 11, 644, 376);
		panel.add(scrollPane);

		list = new JList(alugueis);
		list.setFont(new Font("Tahoma", Font.PLAIN, 15));
		scrollPane.setViewportView(list);
	}

	public static void AtualizaList() {
		Aluguel[] al = BancoDados.cadastrarUsuario[BancoDados.pos].getAlugueis();

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MMM/YYYY");

		for (int i = 0; i < BancoDados.MAX; i++)
			if (al[i] != null) {
				alugueis[i] = al[i].getCarro().getModelo() + "  || Retirada: "
						+ sdf.format(al[i].getDataRetirada().getTime()) + "  || Entrega: "
						+ sdf.format(al[i].getDataEntrega().getTime()) + "  || Valor total: R$" + al[i].getValorTotal()
						+ ",00";
			}
		ResetList();
	}

	public static void ResetList() {

		list.setSelectedIndex(0);
		list.setFont(new Font("Tahoma", Font.PLAIN, 15));
		list.setBorder(new LineBorder(new Color(0, 0, 0)));
		list.setForeground(new Color(0, 0, 0));
		list.setBackground(Color.WHITE);

	}

	/**
	 * Fecha a janela
	 */
	public static void Encerrar() {
		if(frame != null)
			frame.dispose();
	}
}
