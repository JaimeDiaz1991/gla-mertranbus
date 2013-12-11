package Dominio;

public class Autenticar {
	
	
	public static int login(String usuario,String pass){
		return Persistencia.Agente.verificar_login(usuario, pass); //0 es Administrador
				  //1 es Conductor
				  //-1 es no encontrado	
	}
	
	public void modificar_pass(String usuario,String pass, String pass2){

	}
	

}
