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

public class MenuAgencias extends JFrame {

	private JPanel contentPane;
	private static MenuAgencias frame;

	/**
	 * Launch the application.
	 */
	public static void Construtor() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame = new MenuAgencias();
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
	public MenuAgencias() {
		setTitle("Menu agencias");
		setBounds(100, 100, 450, 375);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.activeCaption);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		panel.setBounds(10, 11, 414, 313);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JComboBox<String> comboBox = new JComboBox<String>();
		comboBox.setBounds(10, 11, 394, 33);
		panel.add(comboBox);
		
		for(int i = 0; i < BancoDados.MAX; i ++)
			if(BancoDados.cadastrarAgencia[i] != null)
				comboBox.addItem(BancoDados.cadastrarAgencia[i].getIdentificacao());
		
		JButton btnEditar = new JButton("Editar");
		btnEditar.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnEditar.setBounds(10, 239, 185, 59);
		panel.add(btnEditar);
		btnEditar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AgenciaEditar.Construtor(BancoDados.cadastrarAgencia[comboBox.getSelectedIndex()]);
			}
		});
		
		JButton btnExcluir = new JButton("Excluir");
		btnExcluir.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnExcluir.setBounds(219, 239, 185, 59);
		panel.add(btnExcluir);
		btnExcluir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AgenciaExcluir.Construtor(BancoDados.cadastrarAgencia[comboBox.getSelectedIndex()]);
			}
		});
		
		JButton btnPerfil = new JButton("Cadastrar");
		btnPerfil.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnPerfil.setBounds(10, 99, 185, 59);
		panel.add(btnPerfil);
		btnPerfil.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AgenciaCadastrar.Construtor();
			}
		});
		
		JButton btnDetalhar = new JButton("Detalhar");
		btnDetalhar.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnDetalhar.setBounds(219, 99, 185, 59);
		panel.add(btnDetalhar);
		btnDetalhar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AgenciaDetalhar.Construtor(BancoDados.cadastrarAgencia[comboBox.getSelectedIndex()]);
			}
		});
		
		JButton btnVincularVeculo = new JButton("Vincular ve\u00EDculo");
		btnVincularVeculo.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnVincularVeculo.setBounds(10, 169, 185, 59);
		panel.add(btnVincularVeculo);
		btnVincularVeculo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AgenciaVincular.Construtor(BancoDados.cadastrarAgencia[comboBox.getSelectedIndex()]);
			}
		});
		
		JButton btnDesvincularVeculo = new JButton("Desvincular ve\u00EDculo");
		btnDesvincularVeculo.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnDesvincularVeculo.setBounds(219, 169, 185, 59);
		panel.add(btnDesvincularVeculo);
		btnDesvincularVeculo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AgenciaDesvincular.Construtor(BancoDados.cadastrarAgencia[comboBox.getSelectedIndex()]);
			}
		});
		
	}
	
	/**
	 * Fecha a janela
	 */
	public static void Encerrar() {
		if(frame != null)
			frame.dispose();
	}
}
