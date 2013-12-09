package Dominio;

public class Gestor_Rutas {	
	
	public Gestor_Rutas() {
		
	}
	public Gestor_Rutas(int id) {
		
	}

	public void crear_ruta(int id,double km, String origen, String destino, String descripcion){
		Ruta ruta1 =new Ruta(id, km, origen, destino,descripcion);
	}

}
