package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import veiculo.Carro;
import veiculo.Agencia;

import javax.swing.JScrollPane;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

import Sistema.BancoDados;
import Sistema.Login;

import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.ListSelectionModel;
import java.awt.SystemColor;

public class UsuarioAlugar extends JFrame {

	private JPanel contentPane;
	private static JList<String[]> list;
	private static JList<String[]> list_1;

	private static JLabel marca;

	public static int Index = 0;
	public static int IndexList1 = 0;
	public static int IndexList2 = -1;

	public static Carro[] Carros = new Carro[BancoDados.MAX];

	public static String[] Lista = new String[BancoDados.MAX];
	public static String[] Lista2 = new String[BancoDados.MAX];
	public static String ItemList1;

	public static void main(String[] args) {

		BancoDados.DadosPreCadastrados();

		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UsuarioAlugar frame = new UsuarioAlugar();
					frame.setVisible(true);

					for (int i = 0; i < BancoDados.MAX; i++)
						Lista[i] = null;

					for (int a = 0; a < BancoDados.MAX; a++)
						if (Carro.ImprimirClasse()[a] != null)
							Lista[a] = Carro.ImprimirClasse()[a];
						else
							break;
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public UsuarioAlugar() {

		for (int i = 0; i < BancoDados.MAX; i++) {
			Lista[i] = "-";
			Lista2[i] = "                          -";
		}

		setBounds(100, 100, 580, 480);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		list = new JList(Lista);
		list.setSelectedIndex(0);
		list.setFont(new Font("Tahoma", Font.PLAIN, 11));
		list.setBorder(new LineBorder(new Color(0, 0, 0)));
		list.setForeground(new Color(0, 0, 0));
		list.setBackground(Color.WHITE);

		list.addListSelectionListener(e -> {

			ItemList1 = String.valueOf(list.getSelectedValue());

			for (int i = 0; i < BancoDados.MAX; i++) {
				Lista2[i] = "-";
			}

			switch (Index) {
			case 0:
				ConstruirList2(Carro.ImprimirCarroClasse(ItemList1));
				break;
			case 1:
				ConstruirList2(Carro.ImprimirCarroMarca(ItemList1));
				break;
			case 2:
				ConstruirList2(Carro.ImprimirCarroModelo(ItemList1));
				break;
			case 3:
				ConstruirList2(Agencia.ImprimirCarrosVinculados(ItemList1));
				break;
			}

		});

		JScrollPane scrollPane = new JScrollPane(list);
		scrollPane.setBounds(10, 90, 180, 330);
		contentPane.add(scrollPane);

		list_1 = new JList(Lista2);
		list_1.setSelectedIndex(0);
		list_1.setFont(new Font("Tahoma", Font.PLAIN, 11));
		list_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		list_1.setForeground(new Color(0, 0, 0));
		list_1.setBackground(Color.WHITE);

		list_1.addListSelectionListener(e -> {
			IndexList2 = list_1.getSelectedIndex();
		});

		JScrollPane scrollPane2 = new JScrollPane(list_1);
		scrollPane2.setBounds(224, 90, 180, 330);
		contentPane.add(scrollPane2);

		JComboBox<String> Filtro = new JComboBox<String>();
		Filtro.setBounds(10, 57, 161, 22);
		contentPane.add(Filtro);
		Filtro.addItem("Classe");
		Filtro.addItem("Marca");
		Filtro.addItem("Modelo");
		Filtro.addItem("Cidade");

		Filtro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Index = Filtro.getSelectedIndex();

				switch (Index) {
				case 0:
					ConstruirList(Carro.ImprimirClasse());
					break;
				case 1:
					ConstruirList(Carro.ImprimirMarca());
					break;
				case 2:
					ConstruirList(Carro.ImprimirModelo());
					break;
				case 3:
					ConstruirList(Agencia.ImprimirCidades());
					break;
				}

				for (int i = 0; i < BancoDados.MAX; i++)
					Lista2[i] = "";

				ResetList(2);
			}
		});

		JLabel lblNewLabel_1 = new JLabel("FILTRO");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1.setBounds(10, 25, 180, 21);
		contentPane.add(lblNewLabel_1);

		JButton btnAlugar = new JButton("ALUGAR");
		btnAlugar.setForeground(new Color(0, 0, 0));
		btnAlugar.setBackground(SystemColor.activeCaptionBorder);
		btnAlugar.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnAlugar.setBounds(437, 90, 103, 37);
		contentPane.add(btnAlugar);
		
		btnAlugar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (IndexList2 != -1) {
					if (Carros[IndexList2] != null) {
						UsuarioAlugar2.Construtor(Carros[IndexList2]);
					}
				}
			}
		});

		JButton btnDetalhar = new JButton("DETALHAR");
		btnDetalhar.setForeground(Color.BLACK);
		btnDetalhar.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnDetalhar.setBackground(SystemColor.activeCaptionBorder);
		btnDetalhar.setBounds(437, 138, 103, 37);
		contentPane.add(btnDetalhar);

		btnDetalhar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (IndexList2 != -1) {
					if (Carros[IndexList2] != null) {
						MostrarCarro.Construtor(Carros[IndexList2]);
					}
				}
			}
		});

	}

	public void ConstruirList(String[] List) {

		for (int i = 0; i < BancoDados.MAX; i++)
			Lista[i] = null;

		for (int a = 0; a < BancoDados.MAX; a++)
			if (List[a] != null)
				Lista[a] = List[a];
			else
				break;
		ResetList(1);
	}

	public static void ConstruirList2(String[] Cars) {

		for (int i = 0; i < BancoDados.MAX; i++)
			Lista2[i] = null;

		for (int i = 0; i < BancoDados.MAX; i++)
			if (Cars[i] != null)
				Lista2[i] = Cars[i];
			else
				break;

		ResetList(2);
	}

	public static void ResetList(int Opc) {

		if (Opc == 1) {
			list.setSelectedIndex(0);
			list.setFont(new Font("Tahoma", Font.PLAIN, 11));
			list.setBorder(new LineBorder(new Color(0, 0, 0)));
			list.setForeground(new Color(0, 0, 0));
			list.setBackground(Color.WHITE);
		} else {
			list_1.setSelectedIndex(0);
			list_1.setFont(new Font("Tahoma", Font.PLAIN, 11));
			list_1.setBorder(new LineBorder(new Color(0, 0, 0)));
			list_1.setForeground(new Color(0, 0, 0));
			list_1.setBackground(Color.WHITE);
		}

	}
}
