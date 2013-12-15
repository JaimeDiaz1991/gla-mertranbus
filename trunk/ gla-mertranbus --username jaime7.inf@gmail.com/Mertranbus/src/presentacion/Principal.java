package presentacion;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;

import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;

import Dominio.Gestor_Rutas;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.HeadlessException;

import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.border.LineBorder;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.sql.SQLException;
import java.sql.*;
public class Principal {

	JFrame frame;
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
	private final JTextField textFieldUsu_reg = new JTextField();

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
		textFieldUsu_reg.setVisible(false);
		textFieldUsu_reg.setEnabled(false);
		textFieldUsu_reg.setBounds(284, 11, 86, 20);
		textFieldUsu_reg.setColumns(10);
		textFieldUsuario.addFocusListener(new TextFieldUsuarioFocusListener());
		textFieldUsuario.addActionListener(new BtnEntrarActionListener());
		textFieldUsuario.setBounds(207, 96, 86, 20);
		textFieldUsuario.setColumns(10);
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(new BorderLayout(0, 0));
		
		panel.add(panel_1, BorderLayout.CENTER);
		panel_1.setLayout(null);
		lblUsuario.setBounds(112, 99, 77, 14);
		
		panel_1.add(lblUsuario);
		
		panel_1.add(textFieldUsuario);
		lblPass.setBounds(112, 139, 77, 14);
		
		panel_1.add(lblPass);
		passwordField.addFocusListener(new PasswordFieldFocusListener());
		passwordField.addActionListener(new BtnEntrarActionListener());
		passwordField.setBounds(207, 136, 86, 20);
		
		panel_1.add(passwordField);
		btnEntrar.addActionListener(new BtnEntrarActionListener());
		btnEntrar.setBounds(112, 184, 89, 23);
		
		panel_1.add(btnEntrar);
		btnSalir.addActionListener(new BtnSalirActionListener());
		btnSalir.setBounds(229, 184, 89, 23);
		
		panel_1.add(btnSalir);
		
		panel_1.add(textFieldUsu_reg);
		
		panel.add(panel_2, BorderLayout.NORTH);
		
		panel_2.add(labelLogo);
	}
	private class BtnEntrarActionListener implements ActionListener  {
		public void actionPerformed(ActionEvent arg0) {
			if ((textFieldUsuario.getText().equals("")||(new String(passwordField.getPassword())).equals(""))) {
	            
	            JOptionPane.showMessageDialog(frame,"Usuario o contraseña vacíos.", "Error", JOptionPane.ERROR_MESSAGE);
	            /*Comprobamos si hay algun dato sin introducir*/
	        
			if(textFieldUsuario.getText().equals(""))
				textFieldUsuario.setBorder(new LineBorder(Color.RED));		
			else
				textFieldUsuario.setBorder(new LineBorder(Color.BLACK));
			
			if((new String(passwordField.getPassword())).equals(""))
				passwordField.setBorder(new LineBorder(Color.RED));		
			else
				passwordField.setBorder(new LineBorder(Color.BLACK));
			}
			else{						 	
						try {
							Dominio.Empleado usu_reg = Dominio.Autenticar.login(textFieldUsuario.getText(),new String(passwordField.getPassword()));
							
							if(usu_reg.getClass().getName().equals("Dominio.Administrador")){
								textFieldUsu_reg.setText(Integer.toString(usu_reg.getID()));
							    JOptionPane.showMessageDialog(frame,"Cargamos Menu de Adminstrador", "Aceptado", JOptionPane.INFORMATION_MESSAGE);
							    frame.setVisible(false);
							    IAdministrador ventana2 = new IAdministrador(); 
							    ventana2.setVisible(true);
							    ventana2.textFieldID_usu.setText(textFieldUsu_reg.getText());
							    ventana2.textField_5.setText(textFieldUsuario.getText());
							    ventana2.passwordField.setText(new String(passwordField.getPassword()));
							    }
							else if(usu_reg.getClass().getName().equals("Dominio.Conductor")){
								textFieldUsu_reg.setText(Integer.toString(usu_reg.getID()));
								JOptionPane.showMessageDialog(frame,"Cargamos Menu de Conductor", "Aceptado", JOptionPane.INFORMATION_MESSAGE);
								frame.setVisible(false);
							    IConductor ventana2 = new IConductor(); 
							    ventana2.setVisible(true);
							    ventana2.textFieldID_usu.setText(textFieldUsu_reg.getText());
							    ventana2.textField_5.setText(textFieldUsuario.getText());
							    ventana2.passwordField.setText(new String(passwordField.getPassword()));
							    }
							
						} catch (HeadlessException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						} catch (SQLException e) {
							// TODO Auto-generated catch block
							/*LO COMENTO PORQUE SALTA ERROR Y NO SE COMO SOLUCIONARLO, ASI NO SALTA*/
							e.printStackTrace();
						}
						catch (NullPointerException e){
							//NO ENCONTRADO
							//System.out.println(usu_reg.getClass().getName());	   
							//if(Dominio.Autenticar.login(textFieldUsuario.getText(),new String(passwordField.getPassword())).equals(null))
							  //  JOptionPane.showMessageDialog(frame,"NO ENCONTRADO", "Error", JOptionPane.ERROR_MESSAGE);
						    JOptionPane.showMessageDialog(frame,"NO ENCONTRADO", "Error", JOptionPane.ERROR_MESSAGE);
						}
					
			}
			
			
			
		}
	}
	
	private class TextFieldUsuarioFocusListener extends FocusAdapter {
		@Override
		public void focusLost(FocusEvent arg0) {
			if(textFieldUsuario.getText().equals("")){
				textFieldUsuario.setBorder(new LineBorder(Color.RED));		
				}
			else
				textFieldUsuario.setBorder(new LineBorder(Color.BLACK));		

		}
	}
	private class PasswordFieldFocusListener extends FocusAdapter {
		@Override
		public void focusLost(FocusEvent e) {
			if((new String(passwordField.getPassword())).equals("")){
				passwordField.setBorder(new LineBorder(Color.RED));		
				}
			else
				passwordField.setBorder(new LineBorder(Color.BLACK));
		}
	}
	private class BtnSalirActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
            JOptionPane.showMessageDialog(frame,"Gracias por utilizar nuestro software. Hasta la proxima", "Salir", JOptionPane.CLOSED_OPTION);
            System.exit(0);

		}
	}
	}
