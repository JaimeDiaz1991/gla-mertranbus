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

	public static void obtenerPedido(Cliente usuarios) {
		ArrayList<String[]> pedidos=Agente.obtenerPedido(usuarios.getiD());
		pedidoscreados=new ArrayList<Pedido>();
		for(int i=0;i<pedidos.size();i++){
			Pedido p=new Pedido(Integer.parseInt(pedidos.get(i)[0]),pedidos.get(i)[1],pedidos.get(i)[3],Integer.parseInt(pedidos.get(i)[5]),pedidos.get(i)[7],//ORGIEN
					pedidos.get(i)[2],pedidos.get(i)[4],Integer.parseInt(pedidos.get(i)[6]),pedidos.get(i)[8],//DESTINO
					pedidos.get(i)[9],Integer.parseInt(pedidos.get(i)[10]));
			pedidoscreados.add(p);
		}
	}

	public static ArrayList obtenerelementos(int iDpedido) {
		ArrayList elementos=new ArrayList();

		for(int i=0;i<pedidoscreados.size();i++){
			if(pedidoscreados.get(i).getiD()==iDpedido){
				elementos.add(pedidoscreados.get(i).getPoblacionOrigen());
				elementos.add(pedidoscreados.get(i).getCalleOrigen());
				elementos.add(pedidoscreados.get(i).getNumeroOrigen());
				elementos.add(pedidoscreados.get(i).getEscaleraOrigen());
				elementos.add(pedidoscreados.get(i).getPoblacionDestino());
				elementos.add(pedidoscreados.get(i).getCalleDestino());
				elementos.add(pedidoscreados.get(i).getNumeroDestino());
				elementos.add(pedidoscreados.get(i).getEscaleraDestino());
			}
		}
		return elementos;
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

