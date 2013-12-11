package Dominio;

import java.sql.SQLException;

public class Gestor_Rutas {	
	
	public Gestor_Rutas() {
		
	}
	public Gestor_Rutas(int id) {
		
	}

	public void crear_ruta(int id,double km, String origen, String destino, String descripcion) throws SQLException{
		Ruta ruta1 =new Ruta(id, km, origen, destino,descripcion);
		Persistencia.Agente.crear_ruta(ruta1);
	}

}
