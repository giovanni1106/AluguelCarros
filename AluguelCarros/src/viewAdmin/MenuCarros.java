package viewAdmin;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

import Sistema.BancoDados;
import view.UsuarioEditar;
import view.UsuarioPerfil;
import view.MostrarCarro;

public class MenuCarros extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void Construtor() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MenuCarros frame = new MenuCarros();
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
	public MenuCarros() {
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.activeCaption);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		panel.setBounds(10, 11, 414, 239);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JComboBox<String> comboBox = new JComboBox<String>();
		comboBox.setBounds(10, 11, 394, 33);
		panel.add(comboBox);
		
		for(int i = 0; i < BancoDados.MAX; i ++)
			if(BancoDados.cadastrarCarro[i] != null)
				comboBox.addItem(BancoDados.cadastrarCarro[i].getModelo());
		
		JButton btnEditar = new JButton("Editar");
		btnEditar.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnEditar.setBounds(10, 169, 185, 59);
		panel.add(btnEditar);
		btnEditar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CarroEditar.Construtor(BancoDados.cadastrarCarro[comboBox.getSelectedIndex()]);
			}
		});
		
		JButton btnExcluir = new JButton("Excluir");
		btnExcluir.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnExcluir.setBounds(219, 169, 185, 59);
		panel.add(btnExcluir);
		
		JButton btnPerfil = new JButton("Cadastrar");
		btnPerfil.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnPerfil.setBounds(10, 99, 185, 59);
		panel.add(btnPerfil);
		btnPerfil.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CarroCadastrar.Construtor();
			}
		});
		
		JButton btnDetalhar = new JButton("Detalhar");
		btnDetalhar.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnDetalhar.setBounds(219, 99, 185, 59);
		panel.add(btnDetalhar);
		btnDetalhar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MostrarCarro.Construtor(BancoDados.cadastrarCarro[comboBox.getSelectedIndex()]);
			}
		});
	}

}
