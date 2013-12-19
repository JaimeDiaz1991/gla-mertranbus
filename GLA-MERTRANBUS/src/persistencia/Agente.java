package persistencia;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JTextField;

import persistencia.agenteBd;
import dominio.Cliente;
import dominio.Autenticar;
import dominio.Pedido;

public class Agente {
	static persistencia.agenteBd agente1 = new persistencia.agenteBd();
	public static boolean comporobar(String login, String password)  {
		boolean correcto=false;
		ResultSet resul2;
		try {
			agente1.conectar();
			String SQL_select="SELECT DISTINCT usuario.ID,usuario.NOMBRE,usuario.PASS,usuario.Tipo FROM usuario;";
			System.out.print(SQL_select);
			resul2=agente1.select(SQL_select);
			while(resul2.next()){
				if("Cliente".equalsIgnoreCase(resul2.getString(4))){
					if(login.equals(resul2.getString(2))&&password.equals(resul2.getString(3))){
						correcto=true;
						int ID=Integer.parseInt(resul2.getString(1));
						String loginnuevo=resul2.getString(2);
						String passwordnuevo=resul2.getString(3);
						Autenticar.nuevousuario(ID,login,password);
					}
				}
			}
		
			
			agente1.desconectar();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return correcto;
	}

	public static boolean insertar(Cliente c) {
		agenteBd agente1 = new agenteBd();
		boolean correcto=true;
		try {
			agente1.conectar();
			String login=c.getLogin();
			String pass=c.getPassword();
			String tipo="Cliene";
			String SQL_insert="INSERT INTO usuario (NOMBRE,PASS,TIPO) VALUES ("+"'" + login + "','" 
	        		+ pass + "','" + tipo +"');";
			System.out.print(SQL_insert);

			agente1.create(SQL_insert);
			agente1.desconectar();


		}catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		correcto=false;
		}
		
		
		return correcto;
	}

	public static boolean insertarPedidos(Pedido p) {
		agenteBd agente1 = new agenteBd();
		boolean correcto=true;
		
		String PoblacionOrigen=p.getPoblacionOrigen();
		String PoblacionDestino=p.getPoblacionDestino();
		String CalleOrigen=p.getCalleOrigen();
		String CalleDestino=p.getCalleDestino();
		int numeroDestino=p.getNumeroDestino();
		int numeroOrigen=p.getNumeroOrigen();
		String TipodePaquete=p.getTipodePaquete();
		String EscaleraOrigen=p.getEscaleraOrigen();
		String EscaleraDestino=p.getEscaleraDestino();
		int IDusuario=p.getIDUsuario();

		String SQL_insert ="INSERT INTO pedido(POrigen,PDestino,COrigen,CDestino,NOrigen,NDestino,EOrigen,EDestino,TipoPaquete,IdUsuario) VALUES ("+"'" + PoblacionOrigen  + "','" +  PoblacionDestino + "','" 
				+ CalleOrigen + "','" +  CalleDestino + "'," +  numeroDestino + "," +  numeroOrigen + ",'"+  EscaleraOrigen + "','" 
				+  EscaleraDestino + "','"+  TipodePaquete + "',"+ IDusuario +");";
		System.out.print("\n"+SQL_insert);
		try{
			agente1.conectar();
			agente1.create(SQL_insert);
			agente1.desconectar();
		}catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			correcto=false;
		}
	
		
		
		return correcto;
	}

	public static boolean comporobarlogin(String login) {
		boolean correcto=false;
		ResultSet resul2;
		try {
			agente1.conectar();
			String SQL_select="SELECT usuario.NOMBRE,usuario.Tipo FROM usuario;";
			resul2=agente1.select(SQL_select);
			while(resul2.next()){
				if("Cliente".equalsIgnoreCase(resul2.getString(2))){
					if(login.equalsIgnoreCase(resul2.getString(1))){
						correcto=true;
						System.out.print("ENTRA2");
					}
				}
			}
		
			
			agente1.desconectar();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.print(correcto);
		return correcto;
	}

	public static ArrayList obtenerPedido(int getiD) {
		ResultSet resul2;
		ArrayList<String[]> pedidos = new ArrayList();
		
		try {
			agente1.conectar();
			String SQL_select="SELECT * FROM pedido WHERE IdUsuario="+getiD+";";
			System.out.print(SQL_select);
			resul2=agente1.select(SQL_select);
			while(resul2.next()){
				String[] elementoPedidos=new String[11];
				for (int i=0,j=1;i<elementoPedidos.length;i++,j++){
					elementoPedidos[i]=resul2.getString(j);
				}
				pedidos.add(elementoPedidos);
				
			}
			
			agente1.desconectar();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return pedidos;
	}

	public static boolean insertarModificarpedido(Pedido p) {
		boolean correcto=true;
		
		String PoblacionOrigen=p.getPoblacionOrigen();
		String PoblacionDestino=p.getPoblacionDestino();
		String CalleOrigen=p.getCalleOrigen();
		String CalleDestino=p.getCalleDestino();
		int numeroDestino=p.getNumeroDestino();
		int numeroOrigen=p.getNumeroOrigen();
		String TipodePaquete=p.getTipodePaquete();
		String EscaleraOrigen=p.getEscaleraOrigen();
		String EscaleraDestino=p.getEscaleraDestino();
		int IDusuario=p.getIDUsuario();

		String SQL_insert ="UPDATE pedido SET pedido.POrigen='"+ PoblacionOrigen +"',"+"pedido.PDestino='"+ PoblacionDestino +"',"
				+"pedido.COrigen='"+ CalleOrigen +"',"+"pedido.CDestino='"+ CalleDestino +"',"+"pedido.NOrigen="+ numeroOrigen +","
				+"pedido.NDestino="+ numeroDestino +","+"pedido.EOrigen='"+ EscaleraOrigen +"',"+"pedido.EDestino='"+ EscaleraDestino +"',"
				+"pedido.TipoPaquete='"+ TipodePaquete +"',"+"pedido.IDusuario='"+ IDusuario +"' WHERE pedido.ID="+p.getiD()+";";
				
		System.out.print("\n"+SQL_insert);
		try{
			agente1.conectar();
			agente1.create(SQL_insert);
			agente1.desconectar();
		}catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			correcto=false;
		}
		
		return correcto;
		
	}

	public static void actualizar(int getiD, String login, String pass) {
		String SQL_insert="UPDATE usuario SET usuario.NOMBRE='"+ login +"',"+ "usuario.PASS='"+pass+"' WHERE usuario.ID="+getiD+";";
		System.out.print("\n"+SQL_insert);

		try {
			agente1.conectar();
			agente1.create(SQL_insert);
			agente1.desconectar();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public static void crear_ruta(dominio.Ruta r)throws SQLException{
		agenteBd agente1 = new agenteBd();
		agente1.conectar();
		double kilometros=r.getKm();
		String origen=r.getOrigen();
		String destino=r.getDestino();
		String descripcion=r.getDescripcion();
		System.out.println(r.toString());

        String SQL_insert="INSERT INTO ruta (ORIGEN, DESTINO,KMS,DESCRIPCION) VALUES ("+"'" + origen + "','" 
        		+ destino + "'," + kilometros + ",'" + descripcion + "');";
        System.out.println(SQL_insert);
        agente1.create(SQL_insert);
		agente1.desconectar();

	}
	public void mostrar_rutas(String busqueda,String cadena, ArrayList<dominio.Ruta> rutas_busqueda) throws SQLException{
		agenteBd agente1 = new agenteBd();
		agente1.conectar();
		String SQL_select="SELECT * FROM ruta WHERE "+busqueda+" LIKE " +"'"+cadena+"' ;";
		System.out.println(SQL_select);
		ResultSet resul =agente1.select(SQL_select);
		while(resul.next()){
			System.out.println("1: "+ resul.getString(2));
			System.out.println("2: "+ resul.getString(3));
			System.out.println("3: "+ resul.getString(4));
			System.out.println("4: "+ resul.getString(5));

			dominio.Ruta ruta_aux =new dominio.Ruta(Integer.parseInt(resul.getString(1)),resul.getString(2),resul.getString(3),Double.parseDouble(resul.getString(4)),resul.getString(5));
			rutas_busqueda.add(ruta_aux);
		}
		agente1.desconectar();
	}
	public dominio.Ruta cargar_ruta(int ID) throws SQLException{
		agenteBd agente1 = new agenteBd();
		agente1.conectar();
		String SQL_select="SELECT * FROM ruta WHERE ID LIKE " + ID+ ";";
		System.out.println(SQL_select);
		ResultSet resul_carga =agente1.select(SQL_select);
		resul_carga.next();
		dominio.Ruta ruta_aux =new dominio.Ruta(Integer.parseInt(resul_carga.getString(1)),resul_carga.getString(2),resul_carga.getString(3),Double.parseDouble(resul_carga.getString(4)),resul_carga.getString(5));
		agente1.desconectar();
		return ruta_aux;
	}
	public void modificar_ruta(dominio.Ruta ruta1) throws SQLException{
		agenteBd agente1 = new agenteBd();
		agente1.conectar();
		String SQL_update="UPDATE ruta SET ORIGEN='"+ruta1.getOrigen()+"', DESTINO='"+ruta1.getDestino()+"', KMS="+ruta1.getKm()+", DESCRIPCION= '"+ruta1.getDescripcion()+"' WHERE ruta.ID ="+ruta1.getID()+";";
		System.out.println(SQL_update);
		agente1.update(SQL_update);
		
	}
	public void delete_ruta(int ID) throws SQLException{
		agenteBd agente1 = new agenteBd();
		agente1.conectar();
		String SQL_delete="DELETE FROM ruta WHERE ID="+ID+";";
		System.out.println(SQL_delete);
		agente1.delete(SQL_delete);
	}
	public dominio.Empleado cargar_usu(int ID) throws SQLException{
		agenteBd agente1 = new agenteBd();
		agente1.conectar();
		String SQL_select="SELECT * FROM usuario WHERE ID LIKE " + ID+ ";";
		ResultSet resul_carga=agente1.select(SQL_select);
		resul_carga.next();
		dominio.Empleado usu_aux =new dominio.Empleado(Integer.parseInt(resul_carga.getString(1)),resul_carga.getString(2),resul_carga.getString(3));
		agente1.desconectar();
		return usu_aux;

	}
	public dominio.Empleado verificar_login(String usuario,String pass) throws SQLException{
		agenteBd agente1 = new agenteBd();
		agente1.conectar();
		String SQL_select="SELECT DISTINCT usuario.ID,usuario.NOMBRE,usuario.PASS,usuario.Tipo FROM usuario;";
		ResultSet resul2=agente1.select(SQL_select);
		System.out.println(resul2.wasNull());
		
        while(resul2.next()){

        	if(usuario.equals(resul2.getString(2)) && pass.equals(resul2.getString(3))){
        		System.out.println("Acceso Concedido");

        		if("Administrador".equals(resul2.getString(4))){
        			dominio.Administrador admin = new dominio.Administrador(Integer.parseInt(resul2.getString(1)),resul2.getString(2),resul2.getString(3));
        			agente1.desconectar();
        			return admin;
        			//return 0;
        		}
        		else if("Conductor".equals(resul2.getString(4))){
        			dominio.Conductor condu = new dominio.Conductor(Integer.parseInt(resul2.getString(1)),resul2.getString(2),resul2.getString(3));

        			agente1.desconectar();
        			return condu;
        		}
        	}	  	
        }
        agente1.desconectar();
        return null;
	}
	public void cambiar_pass(int ID,String pass_new)throws SQLException{
		agenteBd agente1 = new agenteBd();
		agente1.conectar();
		String SQL_update="UPDATE usuario SET PASS='"+pass_new+"' WHERE usuario.ID ="+ID+";";
		System.out.println(SQL_update);
		agente1.update(SQL_update);
	}



	

}

