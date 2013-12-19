package dominio;

import java.sql.SQLException;
import org.junit.Test;


public class AutenticarTest {
	@Test
	public void test7() throws SQLException { //Prueba Autenticacion Existe
		Autenticar.login("Jaime","admin");
	}
	@Test
	public void test8() throws SQLException { //Prueba Autenticacion No Existe
		Autenticar.login("Isi","pass");
	}
	@Test
	public void test222() throws SQLException { //Prueba Autenticacion No Existe
		Autenticar.login("","pass");
	}
	@Test
	public void test9() throws SQLException { //Prueba ModificarPass
		Autenticar.modificar_pass(0,"holahola");
	}
	
	@Test
	public void test10() throws SQLException {  //Prueba Cargar Usuario
		Autenticar.cargar_usu(1);
	}
	@Test
	public void test11() throws SQLException { //Prueba ModificarPass Contrasena en blanco
		Autenticar.modificar_pass(0,"");
	}
}
