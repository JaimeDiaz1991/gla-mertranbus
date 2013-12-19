package presentacion;

import java.awt.EventQueue;
import java.awt.CardLayout;

import javax.swing.JPanel;

import java.awt.BorderLayout;

import javax.swing.JFormattedTextField;
import javax.swing.JFormattedTextField.AbstractFormatter;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.SwingConstants;


import javax.swing.JLabel;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPasswordField;

import java.awt.EventQueue;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;

import javax.swing.JTextField;
import javax.swing.JOptionPane;
import javax.swing.text.MaskFormatter;


import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

import java.awt.FlowLayout;
import java.text.ParseException;
import java.util.ArrayList;

import javax.swing.ImageIcon;


import javax.swing.border.TitledBorder;
import javax.swing.UIManager;
import javax.swing.JScrollPane;
import javax.swing.JList;
import javax.swing.event.ListSelectionListener;
import javax.swing.event.ListSelectionEvent;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Color;

import javax.swing.AbstractAction;
import javax.swing.Action;

import presentacion.Interfaz;
import javax.swing.JFrame;

public class Interfaz_Usuario {

	private JFrame frame;
	private JPanel pnlContenido = new JPanel();
	private JTextField login;
	private JPasswordField passwordField;
	private JTextField textNombrenuevo;
	private JTextField textApellidonuevo;
	
	
	private boolean selectionTipodePaquete=false;
	private int seleccion;
	private JTextField textPoblacionRealizarPedido;
	private JTextField textPoblacionDestinoR_P;
	private JTextField textCalleRealizarPedido;
	private JTextField textCalleDestinoR_P;
	private JTextField textnumeroRealizarPedido;
	private JTextField textnumeroDestinoR_P;
	private JTextField textPisoRealizarPedido;
	private JTextField textPisoDestinoR_P;
	private ArrayList<JTextField> informacionOrigen;
	private ArrayList<JTextField> informacionOrigenVisualizar;
	private ArrayList<JTextField> informacionDestinoVisualizar;
	private ArrayList<JTextField> informacionDestino;
	private ArrayList<JTextField> informacionregistro;
	private ArrayList<JTextField> visualizar;
	private ArrayList<JTextField> modificar;
	private JFormattedTextField textpassnuevo;
	private JFormattedTextField textLoginnuevo;
	private JComboBox tipo_paquete;
	private JComboBox TipodePaquetedestino;
	private JList List;
	private JTextField POrigen;
	private JTextField COrigen;
	private JTextField NOrigen;
	private JTextField EOrigen;
	private JTextField PDestino;
	private JTextField CDestino;
	private JTextField NDestino;
	private JTextField EDestino;
	private JTextField textloginnuevo;
	private JTextField textpasswordnuevo;
	/**
	 * Launch the application.
	 */
	public static void main(String[]args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Interfaz_Usuario window = new Interfaz_Usuario();
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
	public Interfaz_Usuario() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 668, 447);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().add(pnlContenido);
		pnlContenido.setLayout(new CardLayout(0, 0));
		
		JPanel Inicio = new JPanel();
		pnlContenido.add(Inicio, "Inicio");
		Inicio.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBounds(195, 11, 468, 269);
		Inicio.add(lblNewLabel_1);
		lblNewLabel_1.setIcon(new ImageIcon(Interfaz_Usuario.class.getResource("/imagenes/fotoMetranbus.png")));
		
		JLabel lblEligeUnaOpcion = new JLabel("Elige una opcion");
		lblEligeUnaOpcion.setBounds(258, 346, 194, 26);
		lblEligeUnaOpcion.setFont(new Font("Tahoma", Font.PLAIN, 21));
		Inicio.add(lblEligeUnaOpcion);
		
		JButton btnEmpleado = new JButton("Empleado");
		btnEmpleado.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

			
				IEmpleado.main();
				frame.setVisible(false);
			}
		});
		btnEmpleado.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnEmpleado.setIcon(new ImageIcon(Interfaz_Usuario.class.getResource("/imagenes/idioma.png")));
	
		btnEmpleado.setBounds(10, 272, 175, 53);
		Inicio.add(btnEmpleado);
		
		JButton btnRealizarPedido = new JButton("Realizar Pedido ");
		btnRealizarPedido.setBounds(10, 11, 175, 53);
		Inicio.add(btnRealizarPedido);
		btnRealizarPedido.setIcon(new ImageIcon(Interfaz_Usuario.class.getResource("/imagenes/cargarComentarios.png")));
		
		JButton btnSiguetupedido = new JButton("Sigue tu Pedido");
		btnSiguetupedido.setBounds(10, 75, 175, 53);
		Inicio.add(btnSiguetupedido);
		btnSiguetupedido.addActionListener(new BtnSeguirPedido());
		btnSiguetupedido.setIcon(new ImageIcon(Interfaz_Usuario.class.getResource("/imagenes/abrir.png")));
		
		JButton btnRegistrate = new JButton("Registrate");
		btnRegistrate.setBounds(10, 139, 175, 53);
		Inicio.add(btnRegistrate);
		btnRegistrate.addActionListener(new BtnPanelRegistrarseActionListener());
		
			btnRegistrate.setIcon(new ImageIcon(Interfaz_Usuario.class.getResource("/imagenes/registrate.png")));
			
			JButton btnModificarUsuario = new JButton("ModificarUsuario");
			btnModificarUsuario.setHorizontalAlignment(SwingConstants.LEFT);
			btnModificarUsuario.setBounds(10, 208, 175, 53);
			Inicio.add(btnModificarUsuario);
			btnModificarUsuario.setIcon(new ImageIcon(Interfaz_Usuario.class.getResource("/imagenes/modificar-nuevo.png")));
			btnModificarUsuario.addActionListener(new BtnPanelModificarusuario());
		btnRealizarPedido.addActionListener(new BtnPanelAutenticarActionListener());
		
		JPanel Autenticar = new JPanel();
		pnlContenido.add(Autenticar, "Autenticar");
		Autenticar.setLayout(null);
		
		JLabel lblLdasf = new JLabel("Login y Password");
		lblLdasf.setBounds(219, 60, 108, 15);
		lblLdasf.setFont(new Font("Tahoma", Font.BOLD, 12));
		Autenticar.add(lblLdasf);
		
		JLabel lblLogin = new JLabel("Login :");
		lblLogin.setBounds(151, 137, 42, 17);
		lblLogin.setFont(new Font("Tahoma", Font.PLAIN, 14));
		Autenticar.add(lblLogin);
		
		login = new JTextField();
		login.setBounds(249, 134, 191, 20);
		Autenticar.add(login);
		login.setColumns(10);
		
		JLabel lblPassword = new JLabel("Password:");
		lblPassword.setBounds(138, 195, 63, 17);
		lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 14));
		Autenticar.add(lblPassword);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(249, 192, 191, 20);
		Autenticar.add(passwordField);
		
		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.setBounds(167, 249, 111, 39);
		btnAceptar.setIcon(new ImageIcon(Interfaz_Usuario.class.getResource("/imagenes/tick.PNG")));
		btnAceptar.addActionListener(new BtnAutenticarse()) ;
		Autenticar.add(btnAceptar);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(302, 249, 124, 39);
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(frame, "Gracias por utilizar nuestra aplicaci�n", "Cerrar la aplicaci�n", JOptionPane.PLAIN_MESSAGE);
				CardLayout cl = (CardLayout)(pnlContenido.getLayout());
				cl.show(pnlContenido, "Inicio");
			}
		});
		btnCancelar.setIcon(new ImageIcon(Interfaz_Usuario.class.getResource("/imagenes/cross.PNG")));
		Autenticar.add(btnCancelar);
	
		JPanel RealizarPedido = new JPanel();
		RealizarPedido.setBorder(new TitledBorder(null, "Introduce los datos de tu pedido", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		pnlContenido.add(RealizarPedido, "Realizar Pedido");
		RealizarPedido.setLayout(null);
		
		JLabel lblNumpedido = new JLabel("Num.Pedido:");
		lblNumpedido.setBounds(10, 30, 73, 14);
		RealizarPedido.add(lblNumpedido);
		
		JLabel lblOrigen = new JLabel("Origen: ");
		lblOrigen.setBounds(23, 85, 46, 14);
		RealizarPedido.add(lblOrigen);
		
		JLabel lblDestino = new JLabel("Destino: ");
		lblDestino.setBounds(23, 138, 46, 14);
		RealizarPedido.add(lblDestino);
		
		JLabel lblTipoDePaquete = new JLabel("Tipo: ");
		lblTipoDePaquete.setBounds(23, 190, 46, 14);
		RealizarPedido.add(lblTipoDePaquete);
		informacionOrigen=new ArrayList<JTextField>();
		
		textPoblacionRealizarPedido = new JTextField();
		informacionOrigen.add(textPoblacionRealizarPedido);
		textPoblacionRealizarPedido.setBounds(79, 82, 86, 20);
		RealizarPedido.add(textPoblacionRealizarPedido);
		textPoblacionRealizarPedido.setColumns(10);
		
		textCalleRealizarPedido = new JTextField();
		informacionOrigen.add(textCalleRealizarPedido);
		textCalleRealizarPedido.setBounds(183, 82, 86, 20);
		RealizarPedido.add(textCalleRealizarPedido);
		textCalleRealizarPedido.setColumns(10);
		
		textnumeroRealizarPedido = new JTextField();
		informacionOrigen.add(textnumeroRealizarPedido);
		textnumeroRealizarPedido.setBounds(279, 82, 33, 20);
		RealizarPedido.add(textnumeroRealizarPedido);
		textnumeroRealizarPedido.setColumns(10);
		
		textPisoRealizarPedido = new JTextField();
		informacionOrigen.add(textPisoRealizarPedido);
		textPisoRealizarPedido.setBounds(322, 82, 86, 20);
		RealizarPedido.add(textPisoRealizarPedido);
		textPisoRealizarPedido.setColumns(10);
		
		informacionDestino=new ArrayList<JTextField>();
		textPoblacionDestinoR_P = new JTextField();
		informacionDestino.add(textPoblacionDestinoR_P);
		textPoblacionDestinoR_P.setBounds(79, 135, 86, 20);
		RealizarPedido.add(textPoblacionDestinoR_P);
		textPoblacionDestinoR_P.setColumns(10);
		
		textCalleDestinoR_P = new JTextField();
		informacionDestino.add(textCalleDestinoR_P);
		textCalleDestinoR_P.setBounds(183, 135, 86, 20);
		RealizarPedido.add(textCalleDestinoR_P);
		textCalleDestinoR_P.setColumns(10);
		
		textnumeroDestinoR_P = new JTextField();
		informacionDestino.add(textnumeroDestinoR_P);
		textnumeroDestinoR_P.setBounds(279, 135, 33, 20);
		RealizarPedido.add(textnumeroDestinoR_P);
		textnumeroDestinoR_P.setColumns(10);
		
		textPisoDestinoR_P = new JTextField();
		informacionDestino.add(textPisoDestinoR_P);
		textPisoDestinoR_P.setBounds(322, 135, 86, 20);
		RealizarPedido.add(textPisoDestinoR_P);
		textPisoDestinoR_P.setColumns(10);
	
		
		
		JLabel lblPoblacion = new JLabel("Poblacion");
		lblPoblacion.setHorizontalAlignment(SwingConstants.CENTER);
		lblPoblacion.setBounds(79, 110, 86, 14);
		RealizarPedido.add(lblPoblacion);
		
		JLabel lblCalle = new JLabel("Calle");
		lblCalle.setHorizontalAlignment(SwingConstants.CENTER);
		lblCalle.setBounds(183, 110, 86, 14);
		RealizarPedido.add(lblCalle);
		
		JLabel lblNumero = new JLabel("Numero");
		lblNumero.setBounds(276, 110, 46, 14);
		RealizarPedido.add(lblNumero);
		
		JLabel lblPisoescalera = new JLabel("Piso/Escalera");
		lblPisoescalera.setBounds(332, 110, 76, 14);
		RealizarPedido.add(lblPisoescalera);
		
		JButton btnAceptarR_P = new JButton("Aceptar");
		btnAceptarR_P.addActionListener(new BtnPanelRealizarPedidoActionListener());
		btnAceptarR_P.setIcon(new ImageIcon(Interfaz_Usuario.class.getResource("/imagenes/tick.PNG")));
		btnAceptarR_P.setBounds(140, 257, 112, 37);
		RealizarPedido.add(btnAceptarR_P);
		
		JButton btnCancelarR_P = new JButton("Cancelar\r\n");
		btnCancelarR_P.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(frame, "Gracias por utilizar nuestra aplicaci�n", "Cerrar la aplicaci�n", JOptionPane.PLAIN_MESSAGE);
				CardLayout cl = (CardLayout)(pnlContenido.getLayout());
				cl.show(pnlContenido, "Inicio");
			}
		});
		btnCancelarR_P.setIcon(new ImageIcon(Interfaz_Usuario.class.getResource("/imagenes/cross.PNG")));
		btnCancelarR_P.setBounds(351, 257, 118, 37);
		RealizarPedido.add(btnCancelarR_P);
		
		
		
		
		tipo_paquete = new JComboBox();
		tipo_paquete.addActionListener(new selectionTipodepaquete());
		tipo_paquete.setModel(new DefaultComboBoxModel(new String[] {"PAQUETE", "SOBRE"}));
		tipo_paquete.setBounds(96, 187, 86, 20);
		RealizarPedido.add(tipo_paquete);
		
		
		
		JPanel Registro = new JPanel();
		pnlContenido.add(Registro, "Registro");
		Registro.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Ficha Cliente", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		Registro.setLayout(null);
		
		JLabel label_1 = new JLabel("");
		label_1.setBounds(0, 0, 0, 0);
		Registro.add(label_1);
		
		JLabel label_2 = new JLabel("Nombre:");
		label_2.setBounds(98, 82, 50, 14);
		label_2.setVerticalAlignment(SwingConstants.BOTTOM);
		Registro.add(label_2);
		informacionregistro=new ArrayList<JTextField>();
		textNombrenuevo = new JTextField();
		informacionregistro.add(textNombrenuevo);
		textNombrenuevo.setBounds(204, 79, 110, 20);
		textNombrenuevo.setColumns(10);
		Registro.add(textNombrenuevo);
		
		JLabel label_3 = new JLabel("Apellidos:");
		label_3.setBounds(98, 107, 55, 14);
		Registro.add(label_3);
		
		textApellidonuevo = new JTextField();
		informacionregistro.add(textApellidonuevo);
		textApellidonuevo.setBounds(204, 109, 110, 20);
		textApellidonuevo.setColumns(10);
		Registro.add(textApellidonuevo);
		
		JLabel label_4 = new JLabel("DNI:");
		label_4.setBounds(98, 135, 50, 20);
		Registro.add(label_4);
		
		JFormattedTextField formattedDNInuevo = new JFormattedTextField((AbstractFormatter) null);
		

		MaskFormatter formatoDNI;
		try {
			formatoDNI = new MaskFormatter("########'-U");
			formatoDNI.setPlaceholderCharacter('_');
			formattedDNInuevo = new JFormattedTextField(formatoDNI);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		formattedDNInuevo.setBounds(204, 135, 110, 20);
		informacionregistro.add(formattedDNInuevo);
		Registro.add(formattedDNInuevo);
		
		JLabel label_5 = new JLabel("Telefono:");
		label_5.setBounds(98, 161, 50, 25);
		Registro.add(label_5);
		
		JFormattedTextField formattedTelefononuevo = new JFormattedTextField((AbstractFormatter) null);
		MaskFormatter formatoTlfno;
		try {
			formatoTlfno = new MaskFormatter("'(###')' ###' ###' ###");
			formatoTlfno.setPlaceholderCharacter('*');
			formattedTelefononuevo = new JFormattedTextField(formatoTlfno);
		} catch (ParseException e) {
		
			e.printStackTrace();
		}
		formattedTelefononuevo.setBounds(204, 163, 110, 19);
		informacionregistro.add(formattedTelefononuevo);
		Registro.add(formattedTelefononuevo);
		
		JLabel lblLogin_1 = new JLabel("Login:");
		lblLogin_1.setBounds(98, 226, 43, 14);
		Registro.add(lblLogin_1);
		
		textLoginnuevo = new JFormattedTextField();
		informacionregistro.add(textLoginnuevo);
		textLoginnuevo.setBounds(204, 223, 110, 20);
		Registro.add(textLoginnuevo);
		
		JButton button_2 = new JButton("Guardar");
		button_2.addActionListener(new BtnPanelRealizarRegistro());
		
		button_2.setIcon(new ImageIcon(Interfaz_Usuario.class.getResource("/imagenes/registrate.png")));
		button_2.setBounds(413, 153, 125, 41);
		Registro.add(button_2);
		
		JLabel lblPassword_1 = new JLabel("Password:");
		lblPassword_1.setBounds(98, 251, 50, 14);
		Registro.add(lblPassword_1);
		
		textpassnuevo = new JFormattedTextField();
		informacionregistro.add(textpassnuevo);
		textpassnuevo.setBounds(204, 248, 110, 20);
		Registro.add(textpassnuevo);
		
		JButton btnCancelarnuevo = new JButton("Cancelar");
		btnCancelarnuevo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				CardLayout cl = (CardLayout)(pnlContenido.getLayout());
				cl.show(pnlContenido, "Inicio");
			}
		});
		btnCancelarnuevo.setIcon(new ImageIcon(Interfaz_Usuario.class.getResource("/imagenes/cross.PNG")));
		btnCancelarnuevo.setBounds(413, 219, 125, 41);
		Registro.add(btnCancelarnuevo);
		
		JPanel SeguirPedido = new JPanel();
		pnlContenido.add(SeguirPedido, "Seguir Pedio");
		SeguirPedido.setLayout(null);
		SeguirPedido.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Seguir Pedido", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		
		JLabel label = new JLabel("Num.Pedido:");
		label.setBounds(10, 30, 73, 14);
		SeguirPedido.add(label);
		
		JLabel label_6 = new JLabel("Origen: ");
		label_6.setBounds(125, 85, 46, 14);
		SeguirPedido.add(label_6);
		
		JLabel label_7 = new JLabel("Destino: ");
		label_7.setBounds(125, 138, 46, 14);
		SeguirPedido.add(label_7);
		
		JLabel label_8 = new JLabel("Tipo: ");
		label_8.setBounds(125, 190, 46, 14);
		SeguirPedido.add(label_8);
		
		visualizar=new ArrayList<JTextField>();
		informacionOrigenVisualizar=new ArrayList<JTextField>();
		POrigen = new JTextField();
		POrigen.setColumns(10);
		POrigen.setBounds(181, 82, 86, 20);
		informacionOrigenVisualizar.add(POrigen);
		visualizar.add(POrigen);
		SeguirPedido.add(POrigen);
		
		COrigen = new JTextField();
		COrigen.setColumns(10);
		COrigen.setBounds(285, 82, 86, 20);
		visualizar.add(COrigen);
		informacionOrigenVisualizar.add(COrigen);
		SeguirPedido.add(COrigen);
		
		NOrigen = new JTextField();
		NOrigen.setColumns(10);
		visualizar.add(NOrigen);
		NOrigen.setBounds(381, 82, 33, 20);
		informacionOrigenVisualizar.add(NOrigen);
		SeguirPedido.add(NOrigen);
		
		EOrigen = new JTextField();
		EOrigen.setColumns(10);
		EOrigen.setBounds(424, 82, 86, 20);
		visualizar.add(EOrigen);
		informacionOrigenVisualizar.add(EOrigen);
		SeguirPedido.add(EOrigen);
		
		informacionDestinoVisualizar=new ArrayList<JTextField>();
		PDestino = new JTextField();
		PDestino.setColumns(10);
		PDestino.setBounds(181, 135, 86, 20);
		visualizar.add(PDestino);
		informacionDestinoVisualizar.add(PDestino);
		SeguirPedido.add(PDestino);
		
		CDestino = new JTextField();
		CDestino.setColumns(10);
		CDestino.setBounds(285, 135, 86, 20);
		visualizar.add(CDestino);
		informacionDestinoVisualizar.add(CDestino);
		SeguirPedido.add(CDestino);
		
		NDestino = new JTextField();
		NDestino.setColumns(10);
		NDestino.setBounds(381, 135, 33, 20);
		visualizar.add(NDestino);
		informacionDestinoVisualizar.add(NDestino);
		SeguirPedido.add(NDestino);
		
		EDestino = new JTextField();
		EDestino.setColumns(10);
		EDestino.setBounds(424, 135, 86, 20);
		visualizar.add(EDestino);
		informacionDestinoVisualizar.add(EDestino);
		SeguirPedido.add(EDestino);
		
		JLabel label_9 = new JLabel("Poblacion");
		label_9.setBounds(198, 110, 46, 14);
		SeguirPedido.add(label_9);
		
		JLabel label_10 = new JLabel("Calle");
		label_10.setBounds(295, 110, 46, 14);
		SeguirPedido.add(label_10);
		
		JLabel label_11 = new JLabel("Numero");
		label_11.setBounds(378, 110, 46, 14);
		SeguirPedido.add(label_11);
		
		JLabel label_12 = new JLabel("Piso/Escalera");
		label_12.setBounds(434, 110, 76, 14);
		SeguirPedido.add(label_12);
		
		JButton btnModificar = new JButton("Modificar");
		btnModificar.addActionListener(new BtnModificar());
		
		btnModificar.setBounds(176, 281, 108, 35);
		SeguirPedido.add(btnModificar);
		
		JButton btnCancelar_1 = new JButton("Cancelar");
		btnCancelar_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				CardLayout cl = (CardLayout)(pnlContenido.getLayout());
				cl.show(pnlContenido, "Inicio");
			}
		});
		btnCancelar_1.setBounds(344, 281, 118, 35);
		SeguirPedido.add(btnCancelar_1);
		
		TipodePaquetedestino = new JComboBox();
		TipodePaquetedestino.setModel(new DefaultComboBoxModel(new String[] {"PAQUETE", "SOBRE"}));
		TipodePaquetedestino.setBounds(198, 187, 86, 20);
		SeguirPedido.add(TipodePaquetedestino);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setViewportBorder(new TitledBorder(null, "Elige tu Pedido", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		scrollPane.setBounds(313, 166, 197, 68);
		SeguirPedido.add(scrollPane);
		
		List = new JList();
		List.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent arg0) {
				elementoseleccionado();
			}

		});
		//List.addMouseMotionListener(new Seleccion());
		DefaultListModel modeloLista = new DefaultListModel();
		List.setModel(modeloLista);
		scrollPane.setViewportView(List);
		
		JPanel Modificar_Usuario = new JPanel();
		Modificar_Usuario.setBorder(new TitledBorder(null, "Cambiar Usuario", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		pnlContenido.add(Modificar_Usuario, "Modificar Usuario");
		Modificar_Usuario.setLayout(null);
		
		modificar=new ArrayList<JTextField>();
		textloginnuevo = new JTextField();
		textloginnuevo.setBounds(210, 79, 202, 20);
		modificar.add(textloginnuevo);
		Modificar_Usuario.add(textloginnuevo);
		textloginnuevo.setColumns(10);
		
		textpasswordnuevo = new JTextField();
		textpasswordnuevo.setBounds(210, 133, 202, 20);
		modificar.add(textloginnuevo);
		Modificar_Usuario.add(textpasswordnuevo);
		textpasswordnuevo.setColumns(10);
		
		JLabel lblLogin_2 = new JLabel("Login: ");
		lblLogin_2.setBounds(117, 82, 46, 14);
		Modificar_Usuario.add(lblLogin_2);
		
		JLabel lblPassword_2 = new JLabel("Password:");
		lblPassword_2.setBounds(117, 136, 83, 14);
		Modificar_Usuario.add(lblPassword_2);
		
		JButton btnAceptar_1 = new JButton("Aceptar");
		btnAceptar_1.addActionListener(new BtnModificarusuario());

		btnAceptar_1.setBounds(172, 201, 101, 37);
		Modificar_Usuario.add(btnAceptar_1);
		
		JButton btnCancelar_2 = new JButton("Cancelar");
		btnCancelar_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(frame, "Gracias por utilizar nuestra aplicaci�n", "Cerrar la aplicaci�n", JOptionPane.PLAIN_MESSAGE);
				CardLayout cl = (CardLayout)(pnlContenido.getLayout());
				cl.show(pnlContenido, "Inicio");
			}
		});
		btnCancelar_2.setBounds(347, 201, 113, 37);
		Modificar_Usuario.add(btnCancelar_2);

	}
	
	
	
	private class BtnPanelAutenticarActionListener implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {
			login.setText(null);
			passwordField.setText(null);
			seleccion=1;
			CardLayout cl = (CardLayout)(pnlContenido.getLayout());
			cl.show(pnlContenido, "Autenticar");
		}

		
	}
	
	private class BtnPanelModificarusuario implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {
			login.setText(null);
			passwordField.setText(null);
			seleccion=3;
			CardLayout cl = (CardLayout)(pnlContenido.getLayout());
			cl.show(pnlContenido, "Autenticar");
		}

		
	}
	
	private class BtnPanelRealizarPedidoActionListener implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {
			if(Interfaz.comprobarPedido(informacionOrigen,informacionDestino)==true  && selectionTipodePaquete==true){
				if(Interfaz.insertarPedido(informacionOrigen,informacionDestino,tipo_paquete)){
					JOptionPane.showMessageDialog(frame, "Pedido Obtenido", "Pedido", JOptionPane.PLAIN_MESSAGE);
					CardLayout cl = (CardLayout)(pnlContenido.getLayout());
					cl.show(pnlContenido, "Inicio");
				}
				else{
					JOptionPane.showMessageDialog(frame, "Datos 1incorrectos", "ERROR DATOS", JOptionPane.PLAIN_MESSAGE);	

				}
			}
			
			else{
				JOptionPane.showMessageDialog(frame, "Datos 2incorrectos", "ERROR DATOS", JOptionPane.PLAIN_MESSAGE);	
				}
		}

		
	}
	
	
	private class BtnAutenticarse implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {
			if(login.getText().isEmpty()||passwordField.getText().isEmpty()){
				JOptionPane.showMessageDialog(frame, "Datos incorrectos", "ERROR DATOS", JOptionPane.PLAIN_MESSAGE);	
				login.setText(null);
				passwordField.setText(null);
			}
		
			else if(Interfaz.comprobar(login.getText(), passwordField.getText())){
						JOptionPane.showMessageDialog(frame, "Login y password Correctos", "Correcto", JOptionPane.PLAIN_MESSAGE);
						CardLayout cl = (CardLayout)(pnlContenido.getLayout());
						switch (seleccion){
							case 1:
								for(int i=0;i<informacionOrigen.size();i++){
									informacionOrigen.get(i).setText(null);
									informacionDestino.get(i).setText(null);
								}
								tipo_paquete.setSelectedIndex(-1);
								cl.show(pnlContenido, "Realizar Pedido");
							break;
							case 2:
								
								for(int i=0;i<informacionOrigen.size();i++){
									informacionOrigenVisualizar.get(i).setText(null);
									informacionDestinoVisualizar.get(i).setText(null);
								}
								TipodePaquetedestino.setSelectedIndex(-1);
								introducirelementos();
								cl.show(pnlContenido, "Seguir Pedio");
							break;
							case 3:
								textloginnuevo.setText(login.getText());
								textpasswordnuevo.setText(passwordField.getText());
								cl.show(pnlContenido, "Modificar Usuario");
								break;
							
						}
						
					}
			else{
				JOptionPane.showMessageDialog(frame, "Datos incorrectos", "ERROR DATOS", JOptionPane.PLAIN_MESSAGE);	
				login.setText(null);
				passwordField.setText(null);
			}
			}

		private void introducirelementos() {
			DefaultListModel modeloLista= (DefaultListModel) List.getModel();
			modeloLista.removeAllElements();
			ArrayList elementos=Interfaz.obtenerusuarios();
			for(int i=0;i<elementos.size();i++){
				modeloLista.addElement(elementos.get(i));
				int indice = modeloLista.getSize();
				List.setSelectedIndex(indice);
				List.ensureIndexIsVisible(indice);
			}
			
			

			
		}
			
		}
		
	
	
	private class BtnPanelRegistrarseActionListener implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {
			CardLayout cl = (CardLayout)(pnlContenido.getLayout());
			cl.show(pnlContenido, "Registro");
		}

		
	}
	
	private class selectionTipodepaquete implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {
			selectionTipodePaquete=true;
		}
	}
	
	private class BtnPanelRealizarRegistro implements ActionListener{
		public void actionPerformed(ActionEvent arg0) {
				if(Interfaz.comprobar(informacionregistro)){
					if(!Interfaz.existe(textLoginnuevo.getText())){
						if(Interfaz.insertarcliente(textLoginnuevo.getText(),textpassnuevo.getText())){
							JOptionPane.showMessageDialog(frame, "Datos Introducidos Correctamente", "Correcto", JOptionPane.PLAIN_MESSAGE);	
						}
						else{
							JOptionPane.showMessageDialog(frame, "Datos incorrectos", "ERROR DATOS", JOptionPane.PLAIN_MESSAGE);	
						}
					}
					else{
						JOptionPane.showMessageDialog(frame, "Ya existe un usuario con ese login y password", "ERROR", JOptionPane.PLAIN_MESSAGE);	

					}
					
				}
				else{
					JOptionPane.showMessageDialog(frame, "Campos Vacios", "ERROR DATOS", JOptionPane.PLAIN_MESSAGE);	

				}
			}
			
			
			
		
	}
	
	private class BtnModificar implements ActionListener{
		public void actionPerformed(ActionEvent arg0) {
			if(Interfaz.comprobarPedido(informacionOrigenVisualizar,informacionDestinoVisualizar)==true ){
				int id=Integer.parseInt(List.getSelectedValue().toString());
			
				if(Interfaz.actualizarPedido(informacionOrigenVisualizar,informacionDestinoVisualizar,TipodePaquetedestino,id)){
					JOptionPane.showMessageDialog(frame, "Pedido Obtenido", "Pedido", JOptionPane.PLAIN_MESSAGE);
					CardLayout cl = (CardLayout)(pnlContenido.getLayout());
					cl.show(pnlContenido, "Inicio");
				}
				else{
					JOptionPane.showMessageDialog(frame, "Datos incorrectos", "ERROR DATOS", JOptionPane.PLAIN_MESSAGE);	

				}
			}
			
			else{
				JOptionPane.showMessageDialog(frame, "Datos incorrectos", "ERROR DATOS", JOptionPane.PLAIN_MESSAGE);	
				}
		}

			
	}
		
	private class BtnModificarusuario implements ActionListener{
		public void actionPerformed(ActionEvent arg0) {
			if(Interfaz.comprobar(modificar)){
				Interfaz.cambiarusuario(textloginnuevo.getText(),textpasswordnuevo.getText());
				JOptionPane.showMessageDialog(frame, "Usuario Modificado Correctamente", "Modificar Usuario", JOptionPane.PLAIN_MESSAGE);
				CardLayout cl = (CardLayout)(pnlContenido.getLayout());
				cl.show(pnlContenido, "Inicio");
			}
			else{
				JOptionPane.showMessageDialog(frame, "Hay campos vacios", "ERROR DATOS", JOptionPane.PLAIN_MESSAGE);	

			}
		}
	}

	private class BtnSeguirPedido implements ActionListener{
		public void actionPerformed(ActionEvent arg0) {
			seleccion=2;
			login.setText(null);
			passwordField.setText(null);
			CardLayout cl = (CardLayout)(pnlContenido.getLayout());
			cl.show(pnlContenido, "Autenticar");
		}
	}
	
	private void elementoseleccionado() {
		String Id=List.getSelectedValue().toString();
		ArrayList elementos=Interfaz.obtenerelementos(Id);
		for(int i=0;i<elementos.size();i++){
			visualizar.get(i).setText(elementos.get(i).toString());
		}
		
		TipodePaquetedestino.setSelectedIndex(Interfaz.obtenertipodepaquete(Id));
		
	}
	
	

	

	
	

}
