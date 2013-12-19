package dominio;

import java.util.ArrayList;

import persistencia.Agente;
import dominio.Autenticar;

public class GestorPedidos {
	private static  ArrayList<Pedido> pedidoscreados ;

	public static boolean insertar(ArrayList<String> informacion) {
		Pedido p =new Pedido(0,informacion.get(0),informacion.get(1),Integer.parseInt(informacion.get(2)),informacion.get(3),informacion.get(4),informacion.get(5),Integer.parseInt(informacion.get(6)),
				informacion.get(7),informacion.get(8),Autenticar.getUsuarios().getiD());
		
		return Agente.insertarPedidos(p);
	}

	

	

	public static ArrayList<Pedido> getPedidoscreados() {
		return pedidoscreados;
	}

	public static void setPedidoscreados(ArrayList<Pedido> pedidoscreados) {
		GestorPedidos.pedidoscreados = pedidoscreados;
	}

	public static int obtenertipopaquete(int iDPedido) {
		int tipo=0;
		for(int i=0;i<pedidoscreados.size();i++){
			if(pedidoscreados.get(i).getiD()==iDPedido){
				if(pedidoscreados.get(i).getTipodePaquete().equalsIgnoreCase("paquete")){
					tipo=0;
				}
				else{
					tipo=1;
				}
				
			}
	
	}
		return tipo;
	}

	public static boolean actualizar(ArrayList<String> informacion, int id) {
		
		Pedido p =new Pedido(id,informacion.get(0),informacion.get(1),Integer.parseInt(informacion.get(2)),informacion.get(3),informacion.get(4),informacion.get(5),Integer.parseInt(informacion.get(6)),
				informacion.get(7),informacion.get(8),Autenticar.getUsuarios().getiD());
		
		return Agente.insertarModificarpedido(p);
		
	}

	
	

}

