package Pantallas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;

public class buscarUsuario {

	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					buscarUsuario window = new buscarUsuario();
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
	public buscarUsuario() {
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
		
		JLabel lblIngreseNombreA = new JLabel("Ingrese nombre \r\na buscar");
		lblIngreseNombreA.setHorizontalAlignment(SwingConstants.CENTER);
		lblIngreseNombreA.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblIngreseNombreA.setBounds(23, 25, 156, 81);
		frame.getContentPane().add(lblIngreseNombreA);
		
		textField = new JTextField();
		textField.setBounds(195, 54, 201, 27);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("Buscar");
		btnNewButton.setBounds(137, 105, 117, 34);
		frame.getContentPane().add(btnNewButton);
	}

}
