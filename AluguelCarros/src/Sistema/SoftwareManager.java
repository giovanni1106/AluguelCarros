package Sistema;

import view.TelaLogin;
import view.MenuUsuario;
import view.MostrarCarro;
import view.UsuarioAlugar;
import view.CadastrarUsuario;
import view.UsuarioPerfil;
import view.CadastrarAdmin;
import view.MostrarAgencia;
import view.MostrarCadeira;
import view.MostrarRevisao;
import view.MostrarSeguro;
import view.UsuarioAlugar2;
import view.UsuarioEditar;
import view.UsuarioHistorico;

import viewAdmin.MenuAdmin;
import viewAdmin.AgenciaCadastrar;
import viewAdmin.AgenciaDetalhar;
import viewAdmin.AgenciaEditar;
import viewAdmin.AgenciaExcluir;
import viewAdmin.CarroCadastrar;
import viewAdmin.CarroEditar;
import viewAdmin.CarroExcluir;
import viewAdmin.ClasseCadastrar;
import viewAdmin.ClasseDetalhar;
import viewAdmin.ClasseEditar;
import viewAdmin.ClasseExcluir;
import viewAdmin.MenuAgencias;
import viewAdmin.MenuCarros;
import viewAdmin.MenuClasses;
import viewAdmin.MenuUsuarios;
import viewAdmin.UsuarioExcluir;

import java.awt.EventQueue;

import javax.swing.JFrame;



public class SoftwareManager {
	
	private static TelaLogin frame;

	/**
	 * Organiza os primeiros comandos do software
	 * @param args
	 */
	public static void main(String[] args) {
		
		BancoDados.DadosPreCadastrados();
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					OpenLogin();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public static void CloseLogin() {
		frame.dispose();
	}
	
	public static void OpenLogin() {
		frame = new TelaLogin();
		frame.setVisible(true);
	}
	
	/**
	 * Encerra todas as janelas
	 */
	public static void Encerrar() {
		BancoDados.Logado = false;
		
		// view
		MenuUsuario.Encerrar();
		MostrarCarro.Encerrar();
		UsuarioAlugar.Encerrar();
		CadastrarUsuario.Encerrar();
		UsuarioPerfil.Encerrar();
		CadastrarAdmin.Encerrar();
		MostrarAgencia.Encerrar();
		MostrarCadeira.Encerrar();
		MostrarRevisao.Encerrar();
		MostrarSeguro.Encerrar();
		UsuarioAlugar2.Encerrar();
		UsuarioEditar.Encerrar();
		UsuarioHistorico.Encerrar();

		
		// viewAdmin
		MenuAdmin.Encerrar();
		AgenciaCadastrar.Encerrar();
		AgenciaDetalhar.Encerrar();
		AgenciaEditar.Encerrar();
		AgenciaExcluir.Encerrar();
		CarroCadastrar.Encerrar();
		CarroEditar.Encerrar();
		CarroExcluir.Encerrar();
		ClasseCadastrar.Encerrar();
		ClasseDetalhar.Encerrar();
		ClasseEditar.Encerrar();
		ClasseExcluir.Encerrar();
		MenuAgencias.Encerrar();
		MenuCarros.Encerrar();
		MenuClasses.Encerrar();
		MenuUsuarios.Encerrar();
		UsuarioExcluir.Encerrar();
		
		OpenLogin();
	}

}
