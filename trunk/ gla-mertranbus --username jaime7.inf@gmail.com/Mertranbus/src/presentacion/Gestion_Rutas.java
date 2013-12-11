package presentacion;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JTabbedPane;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JFormattedTextField;
import javax.swing.JTextArea;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.TitledBorder;
import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.AbstractListModel;

public class Gestion_Rutas {

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
		textFieldBuscar.setColumns(10);
		textArea.setBorder(new TitledBorder(null, "Descripci\u00F3n", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		textField_1.setColumns(10);
		textField.setColumns(10);
		textAreaDescripcion.setBorder(new TitledBorder(null, "Descripci\u00F3n", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		textFieldDestino.setColumns(10);
		textFieldOrigen.setColumns(10);
		frame = new JFrame();
		frame.setBounds(100, 100, 573, 338);
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
						.addGroup(gl_NuevaRuta.createSequentialGroup()
							.addGroup(gl_NuevaRuta.createParallelGroup(Alignment.LEADING)
								.addComponent(lblOrigen)
								.addComponent(lblKms))
							.addGap(18)
							.addGroup(gl_NuevaRuta.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_NuevaRuta.createSequentialGroup()
									.addComponent(textFieldOrigen, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
									.addGap(59)
									.addComponent(lblDestino))
								.addComponent(formattedTextFieldKMS, GroupLayout.PREFERRED_SIZE, 67, GroupLayout.PREFERRED_SIZE))
							.addGap(18)
							.addGroup(gl_NuevaRuta.createParallelGroup(Alignment.TRAILING)
								.addComponent(btnGuardar_1, Alignment.LEADING)
								.addComponent(textFieldDestino, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
						.addComponent(textAreaDescripcion, GroupLayout.DEFAULT_SIZE, 398, Short.MAX_VALUE))
					.addContainerGap())
		);
		gl_NuevaRuta.setVerticalGroup(
			gl_NuevaRuta.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_NuevaRuta.createSequentialGroup()
					.addGap(22)
					.addGroup(gl_NuevaRuta.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblOrigen)
						.addComponent(textFieldOrigen, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblDestino)
						.addComponent(textFieldDestino, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(43)
					.addGroup(gl_NuevaRuta.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblKms)
						.addComponent(formattedTextFieldKMS, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnGuardar_1))
					.addPreferredGap(ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
					.addComponent(textAreaDescripcion, GroupLayout.PREFERRED_SIZE, 89, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		NuevaRuta.setLayout(gl_NuevaRuta);
		
		tabbedPane.addTab("Modificar Ruta", null, ModificarRuta, null);
		GroupLayout gl_ModificarRuta = new GroupLayout(ModificarRuta);
		gl_ModificarRuta.setHorizontalGroup(
			gl_ModificarRuta.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_ModificarRuta.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_ModificarRuta.createParallelGroup(Alignment.LEADING)
						.addComponent(textArea, GroupLayout.PREFERRED_SIZE, 409, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_ModificarRuta.createSequentialGroup()
							.addComponent(label_2, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(formattedTextField, GroupLayout.PREFERRED_SIZE, 67, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED, 312, Short.MAX_VALUE)
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
		gl_ModificarRuta.setVerticalGroup(
			gl_ModificarRuta.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_ModificarRuta.createSequentialGroup()
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
}
