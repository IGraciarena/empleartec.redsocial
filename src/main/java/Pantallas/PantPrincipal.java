package Pantallas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class PantPrincipal {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PantPrincipal window = new PantPrincipal();
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
	public PantPrincipal() {
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
		
		JButton btnInicieSesion = new JButton("Iniciar Sesion");
		btnInicieSesion.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
			}
		});
		btnInicieSesion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				IniciarSesion vent = new IniciarSesion();
				vent.getFrame().setVisible(true);
			}

		});
		btnInicieSesion.setBounds(37, 93, 105, 22);
		frame.getContentPane().add(btnInicieSesion);
		
		JButton btnRegistrarse = new JButton("Registrarse");
		btnRegistrarse.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Registrar reg = new Registrar();
				reg.getFrame().setVisible(true);
			}
		});
		btnRegistrarse.setBounds(292, 93, 89, 23);
		frame.getContentPane().add(btnRegistrarse);
	}

}
