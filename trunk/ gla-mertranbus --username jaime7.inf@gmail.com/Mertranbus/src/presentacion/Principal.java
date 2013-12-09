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

public class Principal {

	private JFrame frame;
	private final JPanel panel = new JPanel();
	private final JLabel lblUsuario = new JLabel("Usuario");
	private final JButton btnS = new JButton("s");

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
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		
		panel.add(lblUsuario);
		btnS.addActionListener(new BtnSActionListener());
		
		panel.add(btnS);
	}
	private class BtnSActionListener implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {
			 Gestor_Rutas gestor_Rutas = new Gestor_Rutas();
		}
	}
}
