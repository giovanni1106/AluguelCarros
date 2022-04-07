package viewAdmin;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import veiculo.Classe;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;

public class ClasseDetalhar extends JFrame {

	private JPanel contentPane;
	private static ClasseDetalhar frame;

	/**
	 * Launch the application.
	 */
	public static void Construtor(Classe cl) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame = new ClasseDetalhar(cl);
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
	public ClasseDetalhar(Classe cl) {
		setTitle("Detalhar classe");
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
		
		JLabel lblNome = new JLabel(cl.getNome());
		lblNome.setHorizontalAlignment(SwingConstants.CENTER);
		lblNome.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNome.setBounds(10, 11, 394, 38);
		panel.add(lblNome);
		
		JLabel lblValor = new JLabel("R$" + cl.getValorDia() + ",00 /dia");
		lblValor.setHorizontalAlignment(SwingConstants.CENTER);
		lblValor.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblValor.setBounds(10, 136, 394, 57);
		panel.add(lblValor);
	}

	/**
	 * Fecha a janela
	 */
	public static void Encerrar() {
		if(frame != null)
			frame.dispose();
	}
}
