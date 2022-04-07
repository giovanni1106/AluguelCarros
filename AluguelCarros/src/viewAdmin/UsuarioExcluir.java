package viewAdmin;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

import Pessoas.Usuario;

public class UsuarioExcluir extends JFrame {

	private JPanel contentPane;
	private static UsuarioExcluir frame;

	/**
	 * Launch the application.
	 */
	public static void Construtor(Usuario us) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame = new UsuarioExcluir(us);
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
	public UsuarioExcluir(Usuario us) {
		setTitle("Excluir usuário");
		setBounds(100, 100, 300, 250);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.activeCaption);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		panel.setBounds(10, 11, 264, 189);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblCarro = new JLabel(us.getNome());
		lblCarro.setBounds(10, 11, 244, 42);
		panel.add(lblCarro);
		lblCarro.setHorizontalAlignment(SwingConstants.CENTER);
		lblCarro.setFont(new Font("Tahoma", Font.BOLD, 20));
		
		JButton btnNewButton = new JButton("Excluir");
		btnNewButton.setBounds(10, 107, 244, 71);
		panel.add(btnNewButton);
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 22));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(Usuario.Excluir(us) == true)
					JOptionPane.showMessageDialog(null, "Usuario excluído com sucesso");
				else
					JOptionPane.showMessageDialog(null, "Carro não encontrado");
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
