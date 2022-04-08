package viewAdmin;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

import Sistema.BancoDados;
import veiculo.Agencia;
import view.CadastrarUsuario;
import view.MostrarCarro;

import java.awt.Color;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JButton;

public class AgenciaVincular extends JFrame {

	private JPanel contentPane;
	private static AgenciaVincular frame;

	/**
	 * Launch the application.
	 */
	public static void Construtor(Agencia ag) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame = new AgenciaVincular(ag);
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
	public AgenciaVincular(Agencia ag) {
		setTitle("Vincular veículo");
		setBounds(100, 100, 511, 282);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.activeCaption);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		panel.setBounds(10, 11, 475, 223);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Carro que deseja vincular");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(10, 11, 455, 31);
		panel.add(lblNewLabel);
		
		JComboBox<String> comboBox = new JComboBox<String>();
		comboBox.setBounds(10, 53, 455, 31);
		panel.add(comboBox);
		
		for(int i = 0; i < BancoDados.MAX; i++)
			if(BancoDados.cadastrarCarro[i] != null)
				comboBox.addItem(BancoDados.cadastrarCarro[i].getModelo());
		
		JButton btnVincular = new JButton("Vincular");
		btnVincular.setBounds(10, 181, 129, 31);
		panel.add(btnVincular);
		btnVincular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ag.setCarro(BancoDados.cadastrarCarro[comboBox.getSelectedIndex()]);
				JOptionPane.showMessageDialog(null, "Carro vinculado com sucesso");
			}
		});
		
		JButton btnDetalhar = new JButton("Detalhar");
		btnDetalhar.setBounds(336, 185, 129, 31);
		panel.add(btnDetalhar);
		btnDetalhar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MostrarCarro.Construtor(BancoDados.cadastrarCarro[comboBox.getSelectedIndex()]);
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
