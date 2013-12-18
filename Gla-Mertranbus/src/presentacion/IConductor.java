package presentacion;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTabbedPane;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JFormattedTextField;
import javax.swing.JTextArea;
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


public class IConductor extends JFrame {

	//Declaracion variables
	private JPanel contentPane;
	private JFrame frame;
	private final JPanel panel = new JPanel();
	private final JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
	private final JPanel VisualizarRuta = new JPanel();
	String [] datos={"Origen","Destino"};
	private final JLabel label_3 = new JLabel("Origen:");
	private final JTextField textField_2 = new JTextField();
	private final JTextField textField_3 = new JTextField();
	private final JLabel label_4 = new JLabel("Destino:");
	private final JLabel label_5 = new JLabel("KMs:");
	private final JFormattedTextField formattedTextField_1 = new JFormattedTextField();
	private final JTextArea textArea_1 = new JTextArea();
	String[] datos1 = {"Origen", "Destino"};
	private final JComboBox comboBox_1 = new JComboBox();
	private final JLabel label_9 = new JLabel("Ruta:");
	private final JTextField textField_4 = new JTextField();
	private final JButton button_buscarEliminar = new JButton("buscar");
	private final JList list_1 = new JList(datos);
	private final JPanel Panel_Control = new JPanel();
	private final JLabel lblUsuario = new JLabel("Usuario:");
	final JTextField textField_5 = new JTextField();
	private final JLabel lblContrasea = new JLabel("Contraseña:");
	final JPasswordField passwordField = new JPasswordField();
	private final JButton btnCambiar = new JButton("Cambiar");
	final JTextField textFieldID_usu = new JTextField();
	boolean nofuncion=true;
	
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
	public IConductor() {
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
		
		getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(new BorderLayout(0, 0));
		
		panel.add(tabbedPane);
		button_buscarEliminar.addActionListener(new button_buscarEliminarActionListener());
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
		
		tabbedPane.addTab("Visualizar Ruta", null, VisualizarRuta, null);
		label_3.setBounds(10, 156, 101, 14);
		label_5.setBounds(10, 197, 49, 14);
		formattedTextField_1.setEditable(false);
		formattedTextField_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		formattedTextField_1.setBounds(51, 194, 67, 20);
		label_4.setBounds(309, 156, 89, 14);
		VisualizarRuta.setLayout(null);
		VisualizarRuta.add(textArea_1);
		VisualizarRuta.add(label_5);
		VisualizarRuta.add(label_3);
		VisualizarRuta.add(textField_2);
		VisualizarRuta.add(textField_3);
		VisualizarRuta.add(formattedTextField_1);
		VisualizarRuta.add(label_4);
		comboBox_1.addItemListener(new ComboBox_1ItemListener());
		comboBox_1.setBounds(63, 30, 518, 20);
		
		VisualizarRuta.add(comboBox_1);
		label_9.setBounds(10, 33, 49, 14);
		
		VisualizarRuta.add(label_9);
		textField_4.addActionListener(new button_buscarEliminarActionListener());
		textField_4.setEnabled(false);
		textField_4.setColumns(10);
		textField_4.setBounds(191, 94, 169, 20);
		
		VisualizarRuta.add(textField_4);
		button_buscarEliminar.setEnabled(false);
		button_buscarEliminar.setBounds(370, 93, 119, 23);
		
		VisualizarRuta.add(button_buscarEliminar);
		list_1.addListSelectionListener(new List_1ListSelectionListener());
		list_1.setBorder(new TitledBorder(null, "Busqueda", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		list_1.setBounds(20, 68, 150, 74);
		
		VisualizarRuta.add(list_1);
		Panel_Control.addFocusListener(new Panel_ControlFocusListener());
		
		tabbedPane.addTab("Panel de Control", null, Panel_Control, null);
		Panel_Control.setLayout(null);
		lblUsuario.setBounds(172, 119, 78, 14);
		
		Panel_Control.add(lblUsuario);
		
		Panel_Control.add(textField_5);
		lblContrasea.setBounds(172, 162, 78, 14);
		
		Panel_Control.add(lblContrasea);
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
	private class ComboBox_1ItemListener implements ItemListener {
		public void itemStateChanged(ItemEvent arg0) {
			
			//System.out.println(comboBox.getSelectedItem().toString());
			int id_sel=Integer.parseInt("" + (comboBox_1.getSelectedItem().toString().charAt(4)));
			dominio.Gestor_Rutas gestor_r = new dominio.Gestor_Rutas();
			try {
				dominio.Ruta ruta_selec=gestor_r.cargar_ruta(id_sel);
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

	/**
	 * Launch the application.
	 */
	}

