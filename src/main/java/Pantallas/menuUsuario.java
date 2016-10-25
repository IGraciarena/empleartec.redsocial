package Pantallas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;

public class menuUsuario {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					menuUsuario window = new menuUsuario();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public menuUsuario() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnVerMuro = new JButton("Ver Muro");
		btnVerMuro.setBounds(167, 11, 131, 32);
		frame.getContentPane().add(btnVerMuro);
		
		JButton btnPublicar = new JButton("Publicar");
		btnPublicar.setBounds(167, 54, 131, 32);
		frame.getContentPane().add(btnPublicar);
		
		JButton btnCrearGrupos = new JButton("Crear Grupos");
		btnCrearGrupos.setBounds(167, 97, 131, 32);
		frame.getContentPane().add(btnCrearGrupos);
		
		JButton btnBuscarAmigo = new JButton("Buscar Amigo");
		btnBuscarAmigo.setBounds(167, 140, 131, 32);
		frame.getContentPane().add(btnBuscarAmigo);
		
		JButton btnModificarCuenta = new JButton("Modificar Cuenta");
		btnModificarCuenta.setBounds(167, 180, 131, 32);
		frame.getContentPane().add(btnModificarCuenta);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.setBounds(335, 227, 89, 23);
		frame.getContentPane().add(btnSalir);
	}

}
