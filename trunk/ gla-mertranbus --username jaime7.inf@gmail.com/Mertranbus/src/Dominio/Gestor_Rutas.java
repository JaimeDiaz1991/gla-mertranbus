package Dominio;

import java.sql.SQLException;

public class Gestor_Rutas {	
	
	public Gestor_Rutas() {
		
	}
	public Gestor_Rutas(int id) {
		
	}

	public void crear_ruta(String origen, String destino,double kms, String descripcion) throws SQLException{
		Ruta ruta1 =new Ruta(origen, destino,kms,descripcion);
		Persistencia.Agente.crear_ruta(ruta1);
	}

}
