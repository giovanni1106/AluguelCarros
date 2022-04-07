package Sistema;

import view.TelaLogin;

import java.awt.EventQueue;

import view.CadastrarUsuario;
import view.MenuUsuario;
import view.UsuarioPerfil;



public class SoftwareManager {

	/**
	 * Organiza os primeiros comandos do software
	 * @param args
	 */
	public static void main(String[] args) {
		
		BancoDados.DadosPreCadastrados();
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaLogin frame = new TelaLogin();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

}
