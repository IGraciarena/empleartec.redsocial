package Pantallas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;

public class crearGrupo {

	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					crearGrupo window = new crearGrupo();
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
	public crearGrupo() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 171);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblIngreseNombreGrupo = new JLabel("Ingrese Nombre Grupo");
		lblIngreseNombreGrupo.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblIngreseNombreGrupo.setBounds(47, 49, 154, 35);
		frame.getContentPane().add(lblIngreseNombreGrupo);
		
		textField = new JTextField();
		textField.setBounds(184, 57, 192, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnCrear = new JButton("Crear");
		btnCrear.setBounds(159, 95, 89, 23);
		frame.getContentPane().add(btnCrear);
	}
}
