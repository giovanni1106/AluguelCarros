package viewAdmin;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.border.LineBorder;
import java.awt.Color;

import veiculo.Carro;
import java.awt.SystemColor;

public class CarroExcluir extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void Construtor(Carro car) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CarroExcluir frame = new CarroExcluir(car);
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
	public CarroExcluir(Carro car) {
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
		
		JLabel lblCarro = new JLabel(car.getModelo());
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
				if(Carro.Excluir(car) == true)
					JOptionPane.showMessageDialog(null, "Carro excluido com sucesso");
				else
					JOptionPane.showMessageDialog(null, "Carro não encontrado");
			}
		});
	}

}
