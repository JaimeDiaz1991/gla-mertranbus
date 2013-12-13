package Dominio;

import java.sql.*;

public class Autenticar {
	
	
	public static int login(String usuario,String pass) throws SQLException{
		//Persistencia.agenteBd.conectar2();
		//Persistencia.agenteBd.desconectar();
		Persistencia.Agente agente_gestor = new Persistencia.Agente();
		return agente_gestor.verificar_login(usuario, pass); //0 es Administrador
				  //1 es Conductor
				  //-1 es no encontrado	
	}
	 
	
	public void modificar_pass(String usuario,String pass, String pass2){
		Persistencia.Agente agente_gestor = new Persistencia.Agente();
		
	}
	

}
