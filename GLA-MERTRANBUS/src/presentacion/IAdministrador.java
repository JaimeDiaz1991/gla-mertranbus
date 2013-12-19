package presentacion;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTabbedPane;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JFormattedTextField;
import javax.swing.JTextArea;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.TitledBorder;
import javax.swing.JButton;
import javax.swing.JList;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.sql.SQLException;
import java.util.ArrayList;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.event.ListSelectionEvent;
import javax.swing.JComboBox;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JPasswordField;
import java.awt.Font;
import presentacion.Interfaz_Usuario;


public class IAdministrador extends JFrame {

	private JPanel contentPane;
	private JFrame frame;
	private final JPanel panel = new JPanel();
	private final JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
	private final JPanel NuevaRuta = new JPanel();
	private final JPanel ModificarRuta = new JPanel();
	private final JPanel EliminarRuta = new JPanel();
	private final JLabel lblOrigen = new JLabel("Origen:");
	private final JTextField textFieldOrigen = new JTextField();
	private final JLabel lblDestino = new JLabel("Destino:");
	private final JTextField textFieldDestino = new JTextField();
	private final JLabel lblKms = new JLabel("KMs:");
	private final JFormattedTextField formattedTextFieldKMS = new JFormattedTextField();
	private final JTextArea textAreaDescripcion = new JTextArea();
	private final JLabel label = new JLabel("Origen:");
	private final JTextField textField = new JTextField();
	private final JLabel label_1 = new JLabel("Destino:");
	private final JTextField textField_1 = new JTextField();
	private final JLabel label_2 = new JLabel("KMs:");
	private final JFormattedTextField formattedTextField = new JFormattedTextField();
	private final JTextArea textArea = new JTextArea();
	private final JButton btnGuardar = new JButton("Guardar");
	private final JButton btnGuardar_1 = new JButton("Guardar");
	private final JButton btnBuscar = new JButton("buscar");
	private final JTextField textFieldBuscar = new JTextField();
	String [] datos={"Origen","Destino"};
	private final JList list = new JList(datos);
	private final JLabel label_3 = new JLabel("Origen:");
	private final JTextField textField_2 = new JTextField();
	private final JTextField textField_3 = new JTextField();
	private final JLabel label_4 = new JLabel("Destino:");
	private final JLabel label_5 = new JLabel("KMs:");
	private final JFormattedTextField formattedTextField_1 = new JFormattedTextField();
	private final JButton buttonEliminar = new JButton("Eliminar");
	private final JTextArea textArea_1 = new JTextArea();
	String[] datos1 = {"Origen", "Destino"};
	private final JLabel label_6 = new JLabel("*");
	private final JLabel label_7 = new JLabel("*");
	private final JLabel label_8 = new JLabel("*");
	private final JLabel lblRuta = new JLabel("Ruta:");
	private final JComboBox comboBox = new JComboBox();
	private final JComboBox comboBox_1 = new JComboBox();
	private final JLabel label_9 = new JLabel("Ruta:");
	private final JTextField textField_4 = new JTextField();
	private final JButton button_buscarEliminar = new JButton("buscar");
	private final JList list_1 = new JList(datos);
	private final JPanel Panel_Control = new JPanel();
	private final JLabel lblUsuario = new JLabel("Usuario:");
	final JTextField textField_5 = new JTextField();
	private final JLabel lblContrasea = new JLabel("Contrasena");
	final JPasswordField passwordField = new JPasswordField();
	private final JButton btnCambiar = new JButton("Cambiar");
	final JTextField textFieldID_usu = new JTextField();
	private boolean nofuncion=true;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					IAdministrador frame = new IAdministrador();
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
	public IAdministrador() {
		textFieldID_usu.setVisible(false);
		textFieldID_usu.setEnabled(false);
		textFieldID_usu.setBounds(365, 11, 86, 20);
		textFieldID_usu.setColumns(10);
		textField_5.setEditable(false);
		textField_5.setFont(new Font("Tahoma", Font.BOLD, 11));
		textField_5.setBounds(260, 116, 86, 20);
		textField_5.setColumns(10);
		addWindowListener(new ThisWindowListener());
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 625, 450);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		textFieldBuscar.addActionListener(new BtnBuscarActionListener());
		textFieldBuscar.setEnabled(false);
		textFieldBuscar.setColumns(10);
		textArea.setEnabled(false);
		textArea.setBorder(new TitledBorder(null, "Descripci\u00F3n", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		textField_1.setEnabled(false);
		textField_1.setColumns(10);
		textField.setEnabled(false);
		textField.setColumns(10);
		textAreaDescripcion.setBorder(new TitledBorder(null, "Descripci\u00F3n", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		textFieldDestino.setColumns(10);
		textFieldOrigen.setColumns(10);
		
		getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(new BorderLayout(0, 0));
		
		panel.add(tabbedPane);
		
		tabbedPane.addTab("Nueva Ruta", null, NuevaRuta, null);
		GroupLayout gl_NuevaRuta = new GroupLayout(NuevaRuta);
		gl_NuevaRuta.setHorizontalGroup(
			gl_NuevaRuta.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_NuevaRuta.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_NuevaRuta.createParallelGroup(Alignment.LEADING)
						.addComponent(textAreaDescripcion, GroupLayout.DEFAULT_SIZE, 584, Short.MAX_VALUE)
						.addGroup(gl_NuevaRuta.createSequentialGroup()
							.addGroup(gl_NuevaRuta.createParallelGroup(Alignment.LEADING)
								.addComponent(lblOrigen)
								.addComponent(lblKms))
							.addGap(18)
							.addGroup(gl_NuevaRuta.createParallelGroup(Alignment.LEADING, false)
								.addGroup(gl_NuevaRuta.createSequentialGroup()
									.addComponent(textFieldOrigen, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(label_6))
								.addGroup(gl_NuevaRuta.createSequentialGroup()
									.addComponent(formattedTextFieldKMS, GroupLayout.PREFERRED_SIZE, 67, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
									.addComponent(label_8)))
							.addGap(18)
							.addComponent(lblDestino)
							.addGap(18)
							.addGroup(gl_NuevaRuta.createParallelGroup(Alignment.LEADING)
								.addComponent(btnGuardar_1)
								.addGroup(gl_NuevaRuta.createSequentialGroup()
									.addComponent(textFieldDestino, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(label_7)))))
					.addContainerGap())
		);
		gl_NuevaRuta.setVerticalGroup(
			gl_NuevaRuta.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_NuevaRuta.createSequentialGroup()
					.addContainerGap(112, Short.MAX_VALUE)
					.addGroup(gl_NuevaRuta.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblOrigen)
						.addComponent(textFieldOrigen, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblDestino)
						.addComponent(textFieldDestino, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(label_6)
						.addComponent(label_7))
					.addGap(43)
					.addGroup(gl_NuevaRuta.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblKms)
						.addComponent(formattedTextFieldKMS, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnGuardar_1)
						.addComponent(label_8))
					.addGap(86)
					.addComponent(textAreaDescripcion, GroupLayout.PREFERRED_SIZE, 89, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		btnGuardar_1.addActionListener(new BtnGuardar_1ActionListener());
		NuevaRuta.setLayout(gl_NuevaRuta);
		
		tabbedPane.addTab("Modificar Ruta", null, ModificarRuta, null);
		GroupLayout gl_ModificarRuta = new GroupLayout(ModificarRuta);
		gl_ModificarRuta.setHorizontalGroup(
			gl_ModificarRuta.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_ModificarRuta.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_ModificarRuta.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_ModificarRuta.createSequentialGroup()
							.addComponent(lblRuta, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, 518, GroupLayout.PREFERRED_SIZE))
						.addComponent(textArea, GroupLayout.PREFERRED_SIZE, 409, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_ModificarRuta.createSequentialGroup()
							.addComponent(label_2, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(formattedTextField, GroupLayout.PREFERRED_SIZE, 67, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED, 395, Short.MAX_VALUE)
							.addComponent(btnGuardar))
						.addGroup(gl_ModificarRuta.createSequentialGroup()
							.addGroup(gl_ModificarRuta.createParallelGroup(Alignment.LEADING, false)
								.addGroup(gl_ModificarRuta.createSequentialGroup()
									.addComponent(list, GroupLayout.PREFERRED_SIZE, 126, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(textFieldBuscar, GroupLayout.PREFERRED_SIZE, 169, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_ModificarRuta.createSequentialGroup()
									.addComponent(label, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
									.addComponent(textField, GroupLayout.PREFERRED_SIZE, 169, GroupLayout.PREFERRED_SIZE)
									.addGap(34)
									.addComponent(label_1)))
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addGroup(gl_ModificarRuta.createParallelGroup(Alignment.LEADING)
								.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, 174, GroupLayout.PREFERRED_SIZE)
								.addComponent(btnBuscar))
							.addGap(16)))
					.addContainerGap())
		);
		comboBox.addItemListener(new ComboBoxItemListener());
		btnGuardar.addActionListener(new BtnGuardarActionListener());
		gl_ModificarRuta.setVerticalGroup(
			gl_ModificarRuta.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_ModificarRuta.createSequentialGroup()
					.addGap(73)
					.addGroup(gl_ModificarRuta.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblRuta)
						.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
					.addGroup(gl_ModificarRuta.createParallelGroup(Alignment.BASELINE)
						.addComponent(list)
						.addComponent(textFieldBuscar, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnBuscar))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_ModificarRuta.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_ModificarRuta.createParallelGroup(Alignment.BASELINE)
							.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addComponent(label)
							.addComponent(label_1))
						.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_ModificarRuta.createParallelGroup(Alignment.BASELINE)
						.addComponent(formattedTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(label_2)
						.addComponent(btnGuardar))
					.addGap(29)
					.addComponent(textArea, GroupLayout.PREFERRED_SIZE, 89, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		btnBuscar.addActionListener(new BtnBuscarActionListener());
		button_buscarEliminar.addActionListener(new button_buscarEliminarActionListener());
		list.addListSelectionListener(new ListListSelectionListener());
		formattedTextField.setEnabled(false);
		btnGuardar.setEnabled(false);
		btnBuscar.setEnabled(false);
		list.setBorder(new TitledBorder(null, "Selecciona:", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		ModificarRuta.setLayout(gl_ModificarRuta);
		textArea_1.setEditable(false);
		textArea_1.setFont(new Font("Monospaced", Font.BOLD, 13));
		textArea_1.setBounds(10, 265, 532, 89);
		textArea_1.setBorder(new TitledBorder(null, "Descripci\u00F3n", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		textField_3.setEditable(false);
		textField_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		textField_3.setBounds(355, 153, 150, 20);
		textField_3.setColumns(10);
		textField_2.setEditable(false);
		textField_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		textField_2.setBounds(51, 153, 184, 20);
		textField_2.setColumns(10);
		
		tabbedPane.addTab("Eliminar Ruta", null, EliminarRuta, null);
		label_3.setBounds(10, 156, 101, 14);
		label_5.setBounds(10, 197, 49, 14);
		formattedTextField_1.setEditable(false);
		formattedTextField_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		formattedTextField_1.setBounds(51, 194, 67, 20);
		label_4.setBounds(309, 156, 89, 14);
		EliminarRuta.setLayout(null);
		EliminarRuta.add(textArea_1);
		buttonEliminar.addActionListener(new ButtonEliminarActionListener());
		buttonEliminar.setEnabled(false);
		buttonEliminar.setBounds(370, 224, 119, 23);
		EliminarRuta.add(buttonEliminar);
		EliminarRuta.add(label_5);
		EliminarRuta.add(label_3);
		EliminarRuta.add(textField_2);
		EliminarRuta.add(textField_3);
		EliminarRuta.add(formattedTextField_1);
		EliminarRuta.add(label_4);
		comboBox_1.addItemListener(new ComboBox_1ItemListener());
		comboBox_1.setBounds(63, 30, 518, 20);
		
		EliminarRuta.add(comboBox_1);
		label_9.setBounds(10, 33, 49, 14);
		
		EliminarRuta.add(label_9);
		textField_4.addActionListener(new button_buscarEliminarActionListener());
		textField_4.setEnabled(false);
		textField_4.setColumns(10);
		textField_4.setBounds(191, 94, 169, 20);
		
		EliminarRuta.add(textField_4);
		button_buscarEliminar.setEnabled(false);
		button_buscarEliminar.setBounds(370, 93, 119, 23);
		
		EliminarRuta.add(button_buscarEliminar);
		list_1.addListSelectionListener(new List_1ListSelectionListener());
		list_1.setBorder(new TitledBorder(null, "Busqueda", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		list_1.setBounds(20, 68, 150, 74);
		
		EliminarRuta.add(list_1);
		Panel_Control.setFont(new Font("Tahoma", Font.PLAIN, 14));
		Panel_Control.addFocusListener(new Panel_ControlFocusListener());
		
		tabbedPane.addTab("Panel de Control", null, Panel_Control, null);
		Panel_Control.setLayout(null);
		lblUsuario.setBounds(172, 119, 78, 14);
		
		Panel_Control.add(lblUsuario);
		
		Panel_Control.add(textField_5);
		lblContrasea.setBounds(172, 162, 78, 14);
		
		Panel_Control.add(lblContrasea);
		passwordField.setFont(new Font("Tahoma", Font.BOLD, 11));
		passwordField.setEnabled(false);
		passwordField.setBounds(260, 159, 86, 20);
		
		Panel_Control.add(passwordField);
		btnCambiar.addActionListener(new BtnCambiarActionListener());
		btnCambiar.setBounds(365, 158, 89, 23);
		
		Panel_Control.add(btnCambiar);
		
		Panel_Control.add(textFieldID_usu);
		
		//cargar_datos();
		
	}
	public void cargar_datos(){
		dominio.Autenticar gestor_login = new dominio.Autenticar();
		
		try {
			dominio.Empleado usuario1=gestor_login.cargar_usu(Integer.parseInt(textFieldID_usu.getText()));
			textField_5.setText(usuario1.getNombre());
			passwordField.setText((usuario1.getPass()));
			
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	private class BtnGuardar_1ActionListener implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {
			if(textFieldOrigen.getText().equals("") || textFieldDestino.getText().equals("") || formattedTextFieldKMS.getText().equals("")){
			    JOptionPane.showMessageDialog(frame,"Debes de rellenar los campos con *", "Error, Falta argumentos", JOptionPane.ERROR_MESSAGE);
			}
			else{
				dominio.Gestor_Rutas gestor_r = new dominio.Gestor_Rutas();
				try {
					gestor_r.crear_ruta(textFieldOrigen.getText(), textFieldDestino.getText(),Double.parseDouble(formattedTextFieldKMS.getText()), textAreaDescripcion.getText());
				} catch (NumberFormatException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				    JOptionPane.showMessageDialog(frame,"ERROR EN LA INSERCION EN LA BASE DE DATOS", "Error, BBDD", JOptionPane.ERROR_MESSAGE);
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				    JOptionPane.showMessageDialog(frame,"ERROR EN LA INSERCION EN LA BASE DE DATOS", "Error, BBDD", JOptionPane.ERROR_MESSAGE);

				}
			    JOptionPane.showMessageDialog(frame,"RUTA AÑADIDA A LA BASE DE DATOS CORRECTAMENTE", "Ruta insertada", JOptionPane.INFORMATION_MESSAGE);
			    textFieldOrigen.setText("");
			    textFieldDestino.setText("");
			    formattedTextFieldKMS.setText("");
			    textAreaDescripcion.setText("");
			}
		}
	}
	private class ListListSelectionListener implements ListSelectionListener {
		public void valueChanged(ListSelectionEvent arg0) {
			textFieldBuscar.setEnabled(true);
			btnBuscar.setEnabled(true);
		}
	}
	private class BtnBuscarActionListener implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {

				dominio.Gestor_Rutas gestor_r = new dominio.Gestor_Rutas();
			ArrayList<dominio.Ruta> resul_rutas = new ArrayList<dominio.Ruta>();
			
			try {
				resul_rutas.clear();
				resul_rutas=gestor_r.visualizar_ruta(list.getSelectedValue().toString(), textFieldBuscar.getText());
				
				if(resul_rutas.isEmpty()){
				    JOptionPane.showMessageDialog(frame,"No se han encontrado coincidencias", "Ruta no encontrada", JOptionPane.ERROR_MESSAGE);
				}
				else{
					for (int i=0;i<resul_rutas.size();i++){
					comboBox.addItem(resul_rutas.get(i).toString1());
					if(i==0){ //REINICIAR COMBOBOX
						while (comboBox.getItemCount()!=1)
							comboBox.removeItemAt(i);
					}
					}
			}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	private class ComboBoxItemListener implements ItemListener {
		public void itemStateChanged(ItemEvent arg0) {
			
				//System.out.println(comboBox.getSelectedItem().toString());
			if(comboBox.getSelectedIndex()!=-1){
				int i=4;
				String num="";
				while(comboBox.getSelectedItem().toString().charAt(i) != ' '){
					num=num+comboBox.getSelectedItem().toString().charAt(i);
					i++;
				}
			int id_sel=Integer.parseInt("" + num);
				dominio.Gestor_Rutas gestor_r = new dominio.Gestor_Rutas();
				try {
					dominio.Ruta ruta_selec=gestor_r.cargar_ruta(id_sel);
					textField.setEnabled(true);
					textField_1.setEnabled(true);
					formattedTextField.setEnabled(true);
					textArea.setEnabled(true);
					btnGuardar.setEnabled(true);
					textField.setText(ruta_selec.getOrigen());
					textField_1.setText(ruta_selec.getDestino());
					formattedTextField.setText(String.valueOf(ruta_selec.getKm()));
					textArea.setText(ruta_selec.getDescripcion());
					
					
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
	private class BtnGuardarActionListener implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {
		    //int respuesta =(JOptionPane.showMessageDialog(frame,"¿Estas seguro que deseas modificar esta ruta?", "Modificar Ruta", JOptionPane.YES_NO_CANCEL_OPTION));
		    int opcion = JOptionPane.showOptionDialog(null, "¿Estás seguro de que quieres guardar los cambios?", "Modificación Ruta", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE, null, null, null);	
		    if(opcion==0){ //SI
		    	dominio.Gestor_Rutas gestor_r = new dominio.Gestor_Rutas();
		    	int id_sel=Integer.parseInt("" + (comboBox.getSelectedItem().toString().charAt(4)));
		    	try {
					gestor_r.modificar_ruta(id_sel, textField.getText(), textField_1.getText(), Double.parseDouble(formattedTextField.getText()), textArea.getText());
					System.out.println(Double.parseDouble(formattedTextField.getText()));
				    JOptionPane.showMessageDialog(frame,"RUTA MODIFICADA EN LA BASE DE DATOS CORRECTAMENTE", "Ruta modificada", JOptionPane.INFORMATION_MESSAGE);
				    textField.setText("");
					textField_1.setText("");
					formattedTextField.setText("");
					textArea.setText("");
					textField.setEnabled(false);
					textField_1.setEnabled(false);
					formattedTextField.setEnabled(false);
					textArea.setEnabled(false);
					btnGuardar.setEnabled(false);
					textFieldBuscar.setText("");
				    comboBox.removeAllItems();
				    
		    	} catch (NumberFormatException e) {
					// TODO Auto-generated catch block
				    JOptionPane.showMessageDialog(frame,"Ocurrió un error al modificar la ruta en la Base de Datos", "Error al modificar", JOptionPane.ERROR_MESSAGE);
					e.printStackTrace();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
				    JOptionPane.showMessageDialog(frame,"Ocurrió un error al modificar la ruta en la Base de Datos", "Error al modificar", JOptionPane.ERROR_MESSAGE);
					e.printStackTrace();
				}
		    }

		    		}

		}
	private class ComboBox_1ItemListener implements ItemListener {
		public void itemStateChanged(ItemEvent arg0) {
			
			//System.out.println(comboBox.getSelectedItem().toString());
			if(comboBox_1.getSelectedIndex()!=-1){
				int i=4;
				String num="";
				while(comboBox_1.getSelectedItem().toString().charAt(i) != ' '){
					num=num+comboBox_1.getSelectedItem().toString().charAt(i);
					i++;
				}
			int id_sel=Integer.parseInt("" + num);
			dominio.Gestor_Rutas gestor_r = new dominio.Gestor_Rutas();
			try {
				dominio.Ruta ruta_selec=gestor_r.cargar_ruta(id_sel);
				buttonEliminar.setEnabled(true);
				textField_2.setText(ruta_selec.getOrigen());
				textField_3.setText(ruta_selec.getDestino());
				formattedTextField_1.setText(String.valueOf(ruta_selec.getKm()));
				textArea_1.setText(ruta_selec.getDescripcion());
				 
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		}
	}
	private class button_buscarEliminarActionListener implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {

				dominio.Gestor_Rutas gestor_r = new dominio.Gestor_Rutas();
			ArrayList<dominio.Ruta> resul_rutas = new ArrayList<dominio.Ruta>();
			
			try {
				resul_rutas.clear();
				resul_rutas=gestor_r.visualizar_ruta(list_1.getSelectedValue().toString(), textField_4.getText());
				
				if(resul_rutas.isEmpty()){
				    JOptionPane.showMessageDialog(frame,"No se han encontrado coincidencias", "Ruta no encontrada", JOptionPane.ERROR_MESSAGE);
				}
				else{
					for (int i=0;i<resul_rutas.size();i++){
					comboBox_1.addItem(resul_rutas.get(i).toString1());
					if(i==0){ //REINICIAR COMBOBOX
						while (comboBox_1.getItemCount()!=1)
							comboBox_1.removeItemAt(i);
					}
					}
			}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	private class List_1ListSelectionListener implements ListSelectionListener {
		public void valueChanged(ListSelectionEvent arg0) {
			textField_4.setEnabled(true);
			button_buscarEliminar.setEnabled(true);
		}
	}
	private class ButtonEliminarActionListener implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {
		    int opcion = JOptionPane.showOptionDialog(null, "¿Estás seguro de que quieres borrar esta ruta?", "Eliminación Ruta", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE, null, null, null);	
		    if(opcion==0){ //SI
			dominio.Gestor_Rutas gestor_r = new dominio.Gestor_Rutas();
	    	int id_sel=Integer.parseInt("" + (comboBox_1.getSelectedItem().toString().charAt(4)));
	    	try {
				gestor_r.eliminar_ruta(id_sel);
			    JOptionPane.showMessageDialog(frame,"RUTA ELIMINADA DE LA BASE DE DATOS CORRECTAMENTE", "Ruta eliminada", JOptionPane.INFORMATION_MESSAGE);
			    textField_2.setText("");
			    textField_3.setText("");
			    textField_4.setText("");
			    formattedTextField_1.setText("");
				textArea_1.setText("");
			    comboBox_1.removeAllItems();

			} catch (SQLException e) {
				// TODO Auto-generated catch block
			    JOptionPane.showMessageDialog(frame,"Ocurrió un error al borrar la ruta en la Base de Datos", "Error al Elimnar", JOptionPane.ERROR_MESSAGE);
				e.printStackTrace();
			}
		    }

		}
	}
	private class ThisWindowListener extends WindowAdapter {
		@Override
		public void windowClosing(WindowEvent arg0) {
            JOptionPane.showMessageDialog(frame,"Gracias por utilizar nuestro software. Hasta la proxima", "Salir", JOptionPane.CLOSED_OPTION);
            Interfaz_Usuario.main(null);
            frame.setVisible(false);
		}
	}
	private class Panel_ControlFocusListener extends FocusAdapter {
		@Override
		public void focusGained(FocusEvent arg0) {
			cargar_datos();
		}
	}
	private class BtnCambiarActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if(isNofuncion()){
				setNofuncion(false);
				Cambiopass dialog = new Cambiopass();
				dialog.setVisible(true);
				dialog.textFieldID_usu.setText(textFieldID_usu.getText());
				dialog.passwordFieldcorrecta.setText(new String (passwordField.getPassword()));
				
			}
			
			
			
		}
	}
	public boolean isNofuncion() {
		return nofuncion;
	}

	public void setNofuncion(boolean nofuncion) {
		this.nofuncion = nofuncion;
	}
	
	}

