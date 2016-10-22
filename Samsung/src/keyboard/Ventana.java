package keyboard;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.KeyListener;
import java.awt.event.ActionEvent;
import javax.swing.border.TitledBorder;

public class Ventana extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ventana frame = new Ventana();
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
	public Ventana() {
		setTitle("Granate");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 672, 425);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(165, 42, 42));
		contentPane.setBorder(new TitledBorder(null, "SAMS4's Granate", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(218, 131, 255, 27);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel labelResultado = new JLabel("");
		labelResultado.setForeground(new Color(255, 255, 255));
		labelResultado.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 14));
		labelResultado.setBounds(50, 200, 499, 71);
		contentPane.add(labelResultado);
		
		JButton btnNewButton = new JButton("Convertir");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 11));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent tomarTxt) {
				if(tomarTxt.getSource()==btnNewButton){
					labelResultado.setText("");
					String cadena = textField.getText();
					char caracter;
					String nvaCad = "";
					
	        		/*cadena = cadena.toUpperCase().replace("A", "65.").replace("B", "66.").replace("C", "67.")
	                		.replace("D", "68.").replace("E", "69.").replace("F", "70.")
	                		.replace("G", "71.").replace("H", "72.").replace("I", "73.")
	                		.replace("J", "74.").replace("K", "75.").replace("L", "76.")
	                		.replace("M", "77.").replace("N", "78.").replace("O", "79.")
	                		.replace("P", "80.").replace("Q", "81.").replace("R", "82.")
	                		.replace("S", "83.").replace("T", "84.").replace("U", "85.")
	                		.replace("V", "86.").replace("W", "87.").replace("X", "88.")
	                		.replace("Y", "89.").replace("Z", "90.").replace(" ", "32.")
	                		.replace("-", "45.");
	        		labelResultado.setText(cadena);*/
	        		for(int i = 0; i<cadena.length(); i++){
	        			caracter = cadena.charAt(i);
	        			int nro = (int)caracter;
	        			nvaCad = nvaCad + Integer.toString(nro)+'.';
	        		}
	        		
	        		labelResultado.setText(nvaCad);
				}
			}
		});
		btnNewButton.setBounds(502, 133, 122, 23);
		contentPane.add(btnNewButton);
		
		JLabel lblIngreseTextoA = new JLabel("Ingrese texto a convertir:");
		lblIngreseTextoA.setFont(new Font("Tempus Sans ITC", Font.BOLD, 12));
		lblIngreseTextoA.setBounds(20, 131, 188, 27);
		contentPane.add(lblIngreseTextoA);
		
		JLabel lblConversinDeTexto = new JLabel("Conversor de texto de SAM4'S");
		lblConversinDeTexto.setForeground(new Color(240, 248, 255));
		lblConversinDeTexto.setFont(new Font("Agency FB", Font.PLAIN, 40));
		lblConversinDeTexto.setHorizontalAlignment(SwingConstants.CENTER);
		lblConversinDeTexto.setBounds(90, 11, 450, 84);
		contentPane.add(lblConversinDeTexto);
		
		JLabel lblResultado = new JLabel("Resultado:");
		lblResultado.setFont(new Font("Tempus Sans ITC", Font.BOLD, 12));
		lblResultado.setBounds(20, 192, 85, 14);
		contentPane.add(lblResultado);
		
		JLabel lblDesarrolladoPorNahuel = new JLabel("Desarrollado por Nahuel Lavrut para SEC");
		lblDesarrolladoPorNahuel.setBounds(20, 362, 286, 14);
		contentPane.add(lblDesarrolladoPorNahuel);
		
		JButton btnLimpiar = new JButton("Limpiar");
		btnLimpiar.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 11));
		btnLimpiar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent limpiar) {
				if(limpiar.getSource()==btnLimpiar){
					labelResultado.setText("");
					textField.setText("");
				}
			}
		});
		btnLimpiar.setBounds(281, 283, 89, 23);
		contentPane.add(btnLimpiar);
		
	}
}