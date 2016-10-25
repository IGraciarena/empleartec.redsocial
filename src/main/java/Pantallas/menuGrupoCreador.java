package Pantallas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;

public class menuGrupoCreador {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					menuGrupoCreador window = new menuGrupoCreador();
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
	public menuGrupoCreador() {
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
		btnVerMuro.setBounds(138, 30, 159, 28);
		frame.getContentPane().add(btnVerMuro);
		
		JButton btnAgregarParticipantes = new JButton("Agregar Participantes");
		btnAgregarParticipantes.setBounds(138, 108, 159, 28);
		frame.getContentPane().add(btnAgregarParticipantes);
		
		JButton btnElminarParticipantes = new JButton("Elminar grupo");
		btnElminarParticipantes.setBounds(138, 222, 159, 28);
		frame.getContentPane().add(btnElminarParticipantes);
		
		JButton btnEliminarParticipantes = new JButton("Eliminar Participantes");
		btnEliminarParticipantes.setBounds(138, 147, 159, 28);
		frame.getContentPane().add(btnEliminarParticipantes);
		
		JButton btnPublicar = new JButton("Publicar");
		btnPublicar.setBounds(138, 69, 159, 28);
		frame.getContentPane().add(btnPublicar);
		
		JButton btnAtras = new JButton("Atras");
		btnAtras.setBounds(0, 238, 89, 23);
		frame.getContentPane().add(btnAtras);
	}

}
