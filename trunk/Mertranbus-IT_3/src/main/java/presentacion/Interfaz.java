package presentacion;
import java.util.ArrayList;

import javax.swing.JComboBox;
import javax.swing.JTextField;

import presentacion.Interfaz_Usuario;
import dominio.Autenticar;
import dominio.GestorPedidos;

public class Interfaz {
	public Interfaz() {
	}

	public static boolean comprobar(String login, String password) {
		return Autenticar.comprobar(login,password);
		
		// TODO Auto-generated method stub
		
	}

	public static boolean comprobar(ArrayList<JTextField> informacion) {
		boolean completo=true;
		int i=0;
		while(i<informacion.size()){
			if(informacion.get(i).getText().isEmpty()){
				completo=false;
			}
			i++;
		}
		return completo;
	}

	public static boolean insertarcliente(String login, String pass) {

		return Autenticar.insertar(login,pass);
	}

	public static boolean insertarPedido(ArrayList<JTextField> informacionOrigen, ArrayList<JTextField> informacionDestino, JComboBox TipoPaquete) {
		
		ArrayList<String> informacion = new ArrayList<String>();
		for(int i=0;i<informacionOrigen.size();i++){
			informacion.add(informacionOrigen.get(i).getText());
		}
		for(int i=0;i<informacionDestino.size();i++){
			informacion.add(informacionDestino.get(i).getText());
		}
		informacion.add(TipoPaquete.getSelectedItem().toString());
		return GestorPedidos.insertar(informacion);
	}

	public static boolean comprobarPedido(
			ArrayList<JTextField> informacionOrigen,
			ArrayList<JTextField> informacionDestino) {
		boolean completo=true;
		int i=0;
		while(i<(informacionOrigen.size()-2)){
			if(informacionOrigen.get(i).getText().isEmpty()){
				completo=false;
			}
			i++;
		}
		i=0;
		while(i<(informacionOrigen.size()-1)){
			if(informacionOrigen.get(i).getText().isEmpty()){
				completo=false;
			}
			i++;
		}
		
		return completo;
	}

	public static boolean existe(String login) {
		return Autenticar.comprobarlogin(login);
		
	}

	public static ArrayList obtenerusuarios() {
		GestorPedidos.obtenerPedido(Autenticar.getUsuarios());
		ArrayList Id = new ArrayList();
		for(int j=0;j<GestorPedidos.getPedidoscreados().size();j++){
			Id.add(GestorPedidos.getPedidoscreados().get(j).getiD());
		}
		
		return Id;
	}

	public static ArrayList obtenerelementos(String IDpedido) {
		return GestorPedidos.obtenerelementos(Integer.parseInt(IDpedido));
		
		
	}

	public static int obtenertipodepaquete(String IDpedido) {
		return GestorPedidos.obtenertipopaquete(Integer.parseInt(IDpedido));
		
	}

	public static boolean actualizarPedido(
			ArrayList<JTextField> informacionOrigen,
			ArrayList<JTextField> informacionDestino, JComboBox tipo_paquete, int id) {
		
		ArrayList<String> informacion = new ArrayList<String>();
		for(int i=0;i<informacionOrigen.size();i++){
			informacion.add(informacionOrigen.get(i).getText());
		}
		for(int i=0;i<informacionDestino.size();i++){
			informacion.add(informacionDestino.get(i).getText());
		}
		informacion.add(tipo_paquete.getSelectedItem().toString());
		return GestorPedidos.actualizar(informacion,id);

	}

	public static void cambiarusuario(ArrayList<JTextField> modificar) {
		
		Autenticar.modificarusuarios(modificar.get(0).getText(),modificar.get(1).getText());
		
	}

	public static void cambiarusuario(String login, String pass) {
		Autenticar.modificarusuarios(login,pass);

		
	}

	

}
