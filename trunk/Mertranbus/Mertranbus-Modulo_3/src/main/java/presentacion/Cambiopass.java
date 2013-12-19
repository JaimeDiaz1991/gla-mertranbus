package presentacion;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.sql.SQLException;

import javax.swing.JTextField;
import java.awt.Color;

public class Cambiopass extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JPasswordField passwordFieldant;
	private final JPasswordField passwordFieldnueva1 = new JPasswordField();
	private final JLabel lblRepiteContrasea = new JLabel("Repite contrasena");
	private final JPasswordField passwordFieldnueva2 = new JPasswordField();
	final JPasswordField passwordFieldcorrecta = new JPasswordField();
	final JTextField textFieldID_usu = new JTextField();
	private final JLabel labelPassinc = new JLabel("");
	private final JLabel lblNocoinciden = new JLabel("");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			Cambiopass dialog = new Cambiopass();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 * @param nofuncion 
	 */
	public Cambiopass() {
		textFieldID_usu.setVisible(false);
		textFieldID_usu.setEnabled(false);
		textFieldID_usu.setBounds(104, 32, 86, 20);
		textFieldID_usu.setColumns(10);
		setBounds(100, 100, 519, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JLabel lblContraseaAntigua = new JLabel("Contrasena antigua:");
			lblContraseaAntigua.setBounds(77, 72, 137, 14);
			contentPanel.add(lblContraseaAntigua);
		}
		{
			passwordFieldant = new JPasswordField();
			passwordFieldant.setBounds(219, 69, 99, 20);
			contentPanel.add(passwordFieldant);
		}
		{
			JLabel lblContraseaNueva = new JLabel("Contrasena nueva");
			lblContraseaNueva.setBounds(77, 112, 127, 14);
			contentPanel.add(lblContraseaNueva);
		}
		passwordFieldnueva1.setBounds(219, 109, 99, 20);
		
		contentPanel.add(passwordFieldnueva1);
		lblRepiteContrasea.setBounds(77, 150, 127, 14);
		
		contentPanel.add(lblRepiteContrasea);
		passwordFieldnueva2.setBounds(219, 147, 99, 20);
		
		contentPanel.add(passwordFieldnueva2);
		passwordFieldcorrecta.setVisible(false);
		passwordFieldcorrecta.setEnabled(false);
		passwordFieldcorrecta.setBounds(10, 32, 82, 20);
		
		contentPanel.add(passwordFieldcorrecta);
		{
			contentPanel.add(textFieldID_usu);
		}
		{
			labelPassinc.setForeground(Color.RED);
			labelPassinc.setBounds(317, 72, 176, 14);
			contentPanel.add(labelPassinc);
		}
		{
			lblNocoinciden.setForeground(Color.RED);
			lblNocoinciden.setBounds(317, 131, 176, 14);
			contentPanel.add(lblNocoinciden);
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("OK");
				okButton.addActionListener(new OkButtonActionListener());
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Cancel");
				cancelButton.addActionListener(new CancelButtonActionListener());
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}
	private class OkButtonActionListener implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {
			
			if(new String(passwordFieldant.getPassword()).equals(new String(passwordFieldcorrecta.getPassword()))){ //COMPROBAR CONTRASEÑA ANTIGUA
				labelPassinc.setVisible(false);
				if(new String(passwordFieldnueva1.getPassword()).equals("") || new String(passwordFieldnueva2.getPassword()).equals(""))
		            JOptionPane.showMessageDialog(contentPanel, "Contrasenas vacias", "ERROR", JOptionPane.ERROR_MESSAGE);
				
				else if(new String(passwordFieldnueva1.getPassword()).equals(new String(passwordFieldnueva2.getPassword()))){
					lblNocoinciden.setVisible(false);
					dominio.Autenticar gestor_login = new dominio.Autenticar();
					try {
					    int opcion = JOptionPane.showOptionDialog(null, "�Estas seguro de que quieres cambiar la contraseña?", "Modificación Pass", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE, null, null, null);
					    if (opcion==0){ //SI
							gestor_login.modificar_pass(Integer.parseInt(textFieldID_usu.getText()), new String(passwordFieldnueva2.getPassword()));
			            	JOptionPane.showMessageDialog(contentPanel, "Contrasenas cambiada correctamente", "Cambio Contrasena", JOptionPane.INFORMATION_MESSAGE);
			            	IAdministrador ia=new IAdministrador();
			            	IConductor ic=new IConductor();
			            	ia.setNofuncion(true);
			            	ic.setNofuncion(true);
			            	dispose();
					    }
					} catch (NumberFormatException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				else{
					//ERROR AL REPETIR LAS CONTRASEÑAS
					labelPassinc.setText("Las contraseñas no coinciden");
					lblNocoinciden.setVisible(true);
				}
			}
			else {
				labelPassinc.setText("Contraseña incorrecta");
				labelPassinc.setVisible(true);
				//ERROR AL INTRODUCIR CONTRASEÑA ANTIGUA
				
			}
		}
	}
	private class CancelButtonActionListener implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {
			dispose();
		}
	}
}
