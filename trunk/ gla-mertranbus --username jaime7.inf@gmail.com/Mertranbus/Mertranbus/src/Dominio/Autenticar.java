package Dominio;

import java.sql.*;

public class Autenticar {
	
	
	public static Empleado login(String usuario,String pass) throws SQLException{

		Persistencia.Agente agente_gestor = new Persistencia.Agente();
		return agente_gestor.verificar_login(usuario, pass); //0 es Administrador
				  //1 es Conductor
				  //-1 es no encontrado	
	}
	public Empleado cargar_usu(int ID) throws SQLException{
		Persistencia.Agente agente_gestor = new Persistencia.Agente();
		return agente_gestor.cargar_usu(ID);			  	
	}
	
	public void modificar_pass(int ID,String pass_new) throws SQLException{
		Persistencia.Agente agente_gestor = new Persistencia.Agente();
		agente_gestor.cambiar_pass(ID,pass_new);
	}
	

}
