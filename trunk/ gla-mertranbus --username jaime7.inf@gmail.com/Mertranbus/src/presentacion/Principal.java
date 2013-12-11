package presentacion;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;

import Dominio.Gestor_Rutas;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.GridLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import javax.swing.JTextField;
import javax.swing.JPasswordField;

public class Principal {

	private JFrame frame;
	private final JPanel panel = new JPanel();
	private final JPanel panel_1 = new JPanel();
	private final JLabel lblUsuario = new JLabel("Usuario:");
	private final JTextField textFieldUsuario = new JTextField();
	private final JLabel lblPass = new JLabel("Contraseña:");
	private final JPasswordField passwordField = new JPasswordField();
	private final JButton btnEntrar = new JButton("Entrar");
	private final JButton btnSalir = new JButton("Salir");
	private final JPanel panel_2 = new JPanel();
	private final JLabel labelLogo = new JLabel("");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal window = new Principal();
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
	public Principal() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		textFieldUsuario.setBounds(207, 96, 86, 20);
		textFieldUsuario.setColumns(10);
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(new BorderLayout(0, 0));
		
		panel.add(panel_1, BorderLayout.CENTER);
		panel_1.setLayout(null);
		lblUsuario.setBounds(143, 99, 46, 14);
		
		panel_1.add(lblUsuario);
		
		panel_1.add(textFieldUsuario);
		lblPass.setBounds(122, 139, 67, 14);
		
		panel_1.add(lblPass);
		passwordField.setBounds(207, 136, 86, 20);
		
		panel_1.add(passwordField);
		btnEntrar.setBounds(112, 184, 89, 23);
		
		panel_1.add(btnEntrar);
		btnSalir.setBounds(229, 184, 89, 23);
		
		panel_1.add(btnSalir);
		
		panel.add(panel_2, BorderLayout.NORTH);
		
		panel_2.add(labelLogo);
	}
}
