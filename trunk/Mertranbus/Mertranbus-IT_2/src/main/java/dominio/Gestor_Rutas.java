package dominio;

import java.sql.SQLException;
import java.util.ArrayList;

public class Gestor_Rutas {	
	
	public Gestor_Rutas() {
		
	}
	public Gestor_Rutas(int id) {
		
	}

	public void crear_ruta(String origen, String destino,double kms, String descripcion) throws SQLException{
		Ruta ruta1 =new Ruta(origen, destino,kms,descripcion);
		persistencia.Agente.crear_ruta(ruta1);
	}
	public void modificar_ruta(int ID,String origen, String destino,double kms, String descripcion) throws SQLException{
		Ruta ruta1 =new Ruta(ID,origen, destino,kms,descripcion);
		persistencia.Agente agente1 = new persistencia.Agente();
		agente1.modificar_ruta(ruta1);
	}
	public void eliminar_ruta(int ID) throws SQLException{
		persistencia.Agente agente1 = new persistencia.Agente();
		agente1.delete_ruta(ID);
	}
	public ArrayList<Ruta> visualizar_ruta(String busqueda,String cadena) throws SQLException{
		persistencia.Agente agente1 = new persistencia.Agente();
		ArrayList<Ruta> rutas_busqueda=new ArrayList<Ruta>();
		agente1.mostrar_rutas(busqueda, cadena,rutas_busqueda);
		return rutas_busqueda;
	}
	public Ruta cargar_ruta(int ID) throws SQLException{
		persistencia.Agente agente1 = new persistencia.Agente();
		Ruta ruta_sel= agente1.cargar_ruta(ID);
		return ruta_sel;
	}

}
