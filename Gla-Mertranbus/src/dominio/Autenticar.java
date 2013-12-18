package dominio;

import java.sql.SQLException;
import persistencia.Agente;

public class Autenticar {
	private static  Cliente usuarios;

	public static boolean comprobar(String login, String password)  {
		return Agente.comporobar(login,password);
			
	}
	public static void nuevousuario(int iD, String login, String password) {
		usuarios=new Cliente(iD,login,password);
		
	}
	public static Cliente getUsuarios() {
		return usuarios;
	}
	public static void setUsuarios(Cliente usuarios) {
		Autenticar.usuarios = usuarios;
	}
	public static boolean insertar(String login, String pass) {
		Cliente c =new Cliente(0,login,pass);
		boolean correcto=Agente.insertar(c);
		return correcto;
	}
	public static boolean comprobarlogin(String login) {
		return Agente.comporobarlogin(login);
	}
	public static void modificarusuarios(String login,
			String pass) {
		Agente.actualizar(usuarios.getiD(),login,pass);
		
	}
	
	public static Empleado login(String usuario,String pass) throws SQLException{

		persistencia.Agente agente_gestor = new persistencia.Agente();
		return agente_gestor.verificar_login(usuario, pass); //0 es Administrador
				  //1 es Conductor
				  //-1 es no encontrado	
	}
	public Empleado cargar_usu(int ID) throws SQLException{
		persistencia.Agente agente_gestor = new persistencia.Agente();
		return agente_gestor.cargar_usu(ID);			  	
	}
	
	public void modificar_pass(int ID,String pass_new) throws SQLException{
		persistencia.Agente agente_gestor = new persistencia.Agente();
		agente_gestor.cambiar_pass(ID,pass_new);
	}
	


	
}
