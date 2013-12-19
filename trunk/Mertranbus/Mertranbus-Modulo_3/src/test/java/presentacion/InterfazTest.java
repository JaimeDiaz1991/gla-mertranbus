package presentacion;

import static org.junit.Assert.assertTrue;
import java.sql.SQLException;
import org.junit.Test;


public class InterfazTest {
	@Test
	public void test31() throws SQLException { //Prueba visualizarRuta numero en destino
		Interfaz.insertarcliente("Fran", "maquina");
	}
	@Test
	public void test32() throws SQLException { //Prueba visualizarRuta numero en destino
		boolean optenido = Interfaz.existe("Isi");
		boolean esperado = true;
		assertTrue(optenido == esperado); 
	}
	@Test
	public void test34() throws SQLException { //Prueba visualizarRuta numero en destino
		boolean optenido = Interfaz.comprobar("Fran", "maquina");
		boolean esperado = true;
		assertTrue(optenido == esperado);
	}
}
