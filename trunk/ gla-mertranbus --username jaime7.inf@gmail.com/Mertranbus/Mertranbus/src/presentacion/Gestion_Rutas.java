package presentacion;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
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
import javax.swing.AbstractListModel;
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

public class Gestion_Rutas{

	/**
	 * 
	 */
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
	private final JList list_1 = new JList();
	private final JLabel label_6 = new JLabel("*");
	private final JLabel label_7 = new JLabel("*");
	private final JLabel label_8 = new JLabel("*");
	private final JLabel lblRuta = new JLabel("Ruta:");
	private final JComboBox comboBox = new JComboBox();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Gestion_Rutas window = new Gestion_Rutas();
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
	public Gestion_Rutas() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		textArea_1.setBorder(new TitledBorder(null, "Descripci\u00F3n", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		textField_3.setColumns(10);
		textField_2.setColumns(10);
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
		frame = new JFrame();
		frame.setBounds(100, 100, 625, 450);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.getContentPane().add(panel, BorderLayout.CENTER);
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
		list.addListSelectionListener(new ListListSelectionListener());
		formattedTextField.setEnabled(false);
		btnGuardar.setEnabled(false);
		btnBuscar.setEnabled(false);
		list.setBorder(new TitledBorder(null, "Selecciona:", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		ModificarRuta.setLayout(gl_ModificarRuta);
		
		tabbedPane.addTab("Eliminar Ruta", null, EliminarRuta, null);
		GroupLayout gl_EliminarRuta = new GroupLayout(EliminarRuta);
		gl_EliminarRuta.setHorizontalGroup(
			gl_EliminarRuta.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_EliminarRuta.createSequentialGroup()
					.addGroup(gl_EliminarRuta.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_EliminarRuta.createSequentialGroup()
							.addGap(361)
							.addComponent(buttonEliminar, GroupLayout.PREFERRED_SIZE, 71, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_EliminarRuta.createSequentialGroup()
							.addGap(10)
							.addComponent(textArea_1, GroupLayout.PREFERRED_SIZE, 532, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_EliminarRuta.createSequentialGroup()
							.addGap(10)
							.addGroup(gl_EliminarRuta.createParallelGroup(Alignment.TRAILING)
								.addGroup(Alignment.LEADING, gl_EliminarRuta.createSequentialGroup()
									.addComponent(label_5)
									.addGap(18)
									.addComponent(formattedTextField_1, GroupLayout.PREFERRED_SIZE, 67, GroupLayout.PREFERRED_SIZE))
								.addComponent(label_3, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 101, GroupLayout.PREFERRED_SIZE)
								.addGroup(Alignment.LEADING, gl_EliminarRuta.createSequentialGroup()
									.addGap(41)
									.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, 184, GroupLayout.PREFERRED_SIZE)))
							.addGap(48)
							.addComponent(label_4)
							.addGap(10)
							.addComponent(textField_3, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_EliminarRuta.createSequentialGroup()
							.addGap(80)
							.addComponent(list_1, GroupLayout.PREFERRED_SIZE, 1, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(10, Short.MAX_VALUE))
		);
		gl_EliminarRuta.setVerticalGroup(
			gl_EliminarRuta.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_EliminarRuta.createSequentialGroup()
					.addGap(70)
					.addGroup(gl_EliminarRuta.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_EliminarRuta.createSequentialGroup()
							.addGap(3)
							.addComponent(label_3))
						.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_EliminarRuta.createSequentialGroup()
							.addGap(3)
							.addComponent(label_4))
						.addComponent(textField_3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(6)
					.addGroup(gl_EliminarRuta.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_EliminarRuta.createSequentialGroup()
							.addGap(3)
							.addComponent(label_5))
						.addComponent(formattedTextField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGroup(gl_EliminarRuta.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_EliminarRuta.createSequentialGroup()
							.addGap(15)
							.addComponent(buttonEliminar))
						.addGroup(gl_EliminarRuta.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(list_1, GroupLayout.PREFERRED_SIZE, 1, GroupLayout.PREFERRED_SIZE)))
					.addGap(21)
					.addComponent(textArea_1, GroupLayout.PREFERRED_SIZE, 89, GroupLayout.PREFERRED_SIZE))
		);
		EliminarRuta.setLayout(gl_EliminarRuta);
		
		
	}
	private class BtnGuardar_1ActionListener implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {
			if(textFieldOrigen.getText().equals("") || textFieldDestino.getText().equals("") || formattedTextFieldKMS.getText().equals("")){
			    JOptionPane.showMessageDialog(frame,"Debes de rellenar los campos con *", "Error, Falta argumentos", JOptionPane.ERROR_MESSAGE);
			}
			else{
				Dominio.Gestor_Rutas gestor_r = new Dominio.Gestor_Rutas();
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

				Dominio.Gestor_Rutas gestor_r = new Dominio.Gestor_Rutas();
			ArrayList<Dominio.Ruta> resul_rutas = new ArrayList<Dominio.Ruta>();
			
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
				int id_sel=Integer.parseInt("" + (comboBox.getSelectedItem().toString().charAt(4)));
				Dominio.Gestor_Rutas gestor_r = new Dominio.Gestor_Rutas();
				try {
					Dominio.Ruta ruta_selec=gestor_r.cargar_ruta(id_sel);
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
	private class BtnGuardarActionListener implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {
		    //int respuesta =(JOptionPane.showMessageDialog(frame,"¿Estas seguro que deseas modificar esta ruta?", "Modificar Ruta", JOptionPane.YES_NO_CANCEL_OPTION));
		    int opcion = JOptionPane.showOptionDialog(null, "¿Estás seguro de que quieres guardar los cambios?", "Modificación Ruta", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE, null, null, null);	
		    if(opcion==0){ //SI
		    	Dominio.Gestor_Rutas gestor_r = new Dominio.Gestor_Rutas();
		    	int id_sel=Integer.parseInt("" + (comboBox.getSelectedItem().toString().charAt(4)));
		    	try {
					gestor_r.modificar_ruta(id_sel, textField.getText(), textField_1.getText(), Double.parseDouble(formattedTextField.getText()), textArea.getText());
				    JOptionPane.showMessageDialog(frame,"RUTA MODIFICADA EN LA BASE DE DATOS CORRECTAMENTE", "Ruta modificada", JOptionPane.INFORMATION_MESSAGE);

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
	}
