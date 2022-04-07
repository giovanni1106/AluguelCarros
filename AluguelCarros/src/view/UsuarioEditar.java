package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Sistema.BancoDados;
import Sistema.Login;

import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;

import Pessoas.Usuario;

public class UsuarioEditar extends JFrame {

	private JPanel contentPane;
	private static UsuarioEditar frame;
	private JTextField textDado;

	/**
	 * Launch the application.
	 */
	public static void Construtor(Usuario us) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame = new UsuarioEditar(us);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Cria um frame para editar o usuario
	 * @param us usuario q será editado
	 */
	public UsuarioEditar(Usuario us) {
		setTitle("Editar usuário");
		setBounds(100, 100, 400, 200);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JComboBox comboDado = new JComboBox();
		comboDado.setBounds(10, 44, 364, 22);
		contentPane.add(comboDado);
		comboDado.addItem("Nome");
		comboDado.addItem("E-mail");
		comboDado.addItem("Celular");
		comboDado.addItem("Logradouro");
		comboDado.addItem("Numero da casa");
		comboDado.addItem("Bairro");
		comboDado.addItem("Cidade");
		comboDado.addItem("Estado");
		comboDado.addItem("País");

		JLabel lblNewLabel = new JLabel("Dado que deseja alterar");
		lblNewLabel.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setBounds(10, 11, 364, 22);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Novo Dado");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1.setBounds(10, 77, 184, 14);
		contentPane.add(lblNewLabel_1);
		
		textDado = new JTextField();
		textDado.setBounds(10, 102, 364, 20);
		contentPane.add(textDado);
		textDado.setColumns(10);
		
		JButton btnNewButton = new JButton("Alterar");
		btnNewButton.setBounds(148, 133, 89, 23);
		contentPane.add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String texto = textDado.getText();
				int index = comboDado.getSelectedIndex();
				
				if (texto.length() <= 0)
					JOptionPane.showMessageDialog(null, "Favor inserir um dado valido");
				else {
					Usuario.Editar(index, texto, us);
					JOptionPane.showMessageDialog(null, "Dado Alterado com sucesso!");
					textDado.setText("");
				}
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
