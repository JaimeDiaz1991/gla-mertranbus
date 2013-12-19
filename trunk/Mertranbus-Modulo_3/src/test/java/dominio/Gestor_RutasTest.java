package dominio;

import java.sql.SQLException;
import org.junit.Test;


public class Gestor_RutasTest {
	@Test
	public void test16() throws SQLException { //Prueba CargarRuta
		Gestor_Rutas.cargar_ruta(5);
	}
	@Test
	public void test17() throws SQLException { //Prueba ModificarRuta origen en blanco
		Gestor_Rutas.modificar_ruta(0, "", "calzada", 32, "Poco trafico");		
	}
	
	@Test
	public void test18() throws SQLException { //Prueba ModificarRuta destino en blanco
		Gestor_Rutas.modificar_ruta(1,"Villacañas", "", 32, "Poco trafico");		
	}
	
	@Test
	public void test19() throws SQLException { //Prueba modificarRuta
		Gestor_Rutas.modificar_ruta(0, "Villacañas", "calzada", 32, "Poco trafico");		
	}
	
	@Test
	public void test20() throws SQLException { //Prueba modificarRuta origen y destino Numeros
		Gestor_Rutas.modificar_ruta(1,"1234", "4321", 32, "Poco trafico");		
	}
	@Test
	public void test21() throws SQLException { //Prueba Visualizar Ruta un blanco en el nombre
		Gestor_Rutas.visualizar_ruta("origen","Ciudad Real");
	}
		
	@Test
	public void test24() throws SQLException { //Prueba visualizarRuta un blanco en el destino
		Gestor_Rutas.visualizar_ruta("destino","Ciudad Real");
	}	
	@Test
	public void test25() throws SQLException { //Prueba visualizarRuta origen en blanco
		Gestor_Rutas.visualizar_ruta("origen","");
	}
	@Test 	
	public void test26() throws SQLException { //Prueba visualizarRuta numero en origen
		Gestor_Rutas.visualizar_ruta("origen","123");
	}
	@Test
	public void test27() throws SQLException { //Prueba visualizarRuta numero en destino
		Gestor_Rutas.visualizar_ruta("destino","123");
	}
	@Test
	public void test12() throws SQLException { //Prueba CrearRuta con un Blanco en destino
		Gestor_Rutas.crear_ruta("jj del Rey", "CiudadReal", 34, "Mucho trafico"); 		
	}
	@Test
	public void test13() throws SQLException { //Prueba crearRuta origen y destino Numeros
		Gestor_Rutas.crear_ruta("1234", "4321", 32, "Poco trafico");		
	}
	
	@Test
	public void test14() throws SQLException { //Prueba origen en blanco
		Gestor_Rutas.crear_ruta("", "Ciudad Real", 32, "Poco trafico");		
	}
	
	@Test
	public void test15() throws SQLException { //Prueba destino en blanco
		Gestor_Rutas.crear_ruta("Ciudad Real", "", 32, "Poco trafico");		
	}
}
