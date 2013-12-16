package Persistencia;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

import Dominio.Ruta;

public class Agente {
	
	public static void crear_ruta(Ruta r)throws SQLException{
		agenteBd agente1 = new agenteBd();
		agente1.conectar();
		double kilometros=r.getKm();
		String origen=r.getOrigen();
		String destino=r.getDestino();
		String descripcion=r.getDescripcion();
		System.out.println(r.toString());

        String SQL_insert="INSERT INTO Ruta (ORIGEN, DESTINO,KMS,DESCRIPCION) VALUES ("+"'" + origen + "','" 
        		+ destino + "'," + kilometros + ",'" + descripcion + "');";
        System.out.println(SQL_insert);
        agente1.create(SQL_insert);
		agente1.desconectar();

	}
	public void mostrar_rutas(String busqueda,String cadena, ArrayList<Ruta> rutas_busqueda) throws SQLException{
		agenteBd agente1 = new agenteBd();
		agente1.conectar();
		String SQL_select="SELECT * FROM RUTA WHERE "+busqueda+" LIKE " +"'"+cadena+"' ;";
		System.out.println(SQL_select);
		ResultSet resul =agente1.select(SQL_select);
		while(resul.next()){
			System.out.println("1: "+ resul.getString(2));
			System.out.println("2: "+ resul.getString(3));
			System.out.println("3: "+ resul.getString(4));
			System.out.println("4: "+ resul.getString(5));

			Ruta ruta_aux =new Ruta(Integer.parseInt(resul.getString(1)),resul.getString(2),resul.getString(3),Double.parseDouble(resul.getString(4)),resul.getString(5));
			rutas_busqueda.add(ruta_aux);
		}
		agente1.desconectar();
	}
	public Ruta cargar_ruta(int ID) throws SQLException{
		agenteBd agente1 = new agenteBd();
		agente1.conectar();
		String SQL_select="SELECT * FROM RUTA WHERE ID LIKE " + ID+ ";";
		System.out.println(SQL_select);
		ResultSet resul_carga =agente1.select(SQL_select);
		resul_carga.next();
		System.out.println(Integer.parseInt(resul_carga.getString(1))+ resul_carga.getString(2)+ resul_carga.getString(3)+ Double.parseDouble(resul_carga.getString(4))+ resul_carga.getString(5));
		Ruta ruta_aux =new Ruta(Integer.parseInt(resul_carga.getString(1)),resul_carga.getString(2),resul_carga.getString(3),Double.parseDouble(resul_carga.getString(4)),resul_carga.getString(5));
		System.out.println("sss1212s");
		agente1.desconectar();
		return ruta_aux;
	}
	public void modificar_ruta(Ruta ruta1) throws SQLException{
		agenteBd agente1 = new agenteBd();
		agente1.conectar();
		String SQL_update="UPDATE RUTA SET ORIGEN='"+ruta1.getOrigen()+"', DESTINO='"+ruta1.getDestino()+"', KMS="+ruta1.getKm()+", DESCRIPCION= '"+ruta1.getDescripcion()+"' WHERE Ruta.ID ="+ruta1.getID()+";";
		System.out.println(SQL_update);
		agente1.update(SQL_update);
		
	}
	public void delete_ruta(int ID) throws SQLException{
		agenteBd agente1 = new agenteBd();
		agente1.conectar();
		String SQL_delete="DELETE FROM RUTA WHERE ID="+ID+";";
		System.out.println(SQL_delete);
		agente1.delete(SQL_delete);
	}
	public Dominio.Empleado cargar_usu(int ID) throws SQLException{
		Persistencia.agenteBd agente1 = new Persistencia.agenteBd();
		agente1.conectar();
		String SQL_select="SELECT * FROM USUARIO WHERE ID LIKE " + ID+ ";";
		ResultSet resul_carga=agente1.select(SQL_select);
		resul_carga.next();
		Dominio.Empleado usu_aux =new Dominio.Empleado(Integer.parseInt(resul_carga.getString(1)),resul_carga.getString(2),resul_carga.getString(3));
		agente1.desconectar();
		return usu_aux;

	}
	public Dominio.Empleado verificar_login(String usuario,String pass) throws SQLException{
		Persistencia.agenteBd agente1 = new Persistencia.agenteBd();
		agente1.conectar();
		String SQL_select="SELECT DISTINCT Usuario.ID,Usuario.NOMBRE,Usuario.PASS,Usuario.Tipo FROM USUARIO;";
		ResultSet resul2=agente1.select(SQL_select);

		
        while(resul2.next()){

        	if(usuario.equals(resul2.getString(2)) && pass.equals(resul2.getString(3))){
        		System.out.println("Acceso Concedido");

        		if("Administrador".equals(resul2.getString(4))){
        			Dominio.Administrador admin = new Dominio.Administrador(Integer.parseInt(resul2.getString(1)),resul2.getString(2),resul2.getString(3));
        			agente1.desconectar();
        			return admin;
        			//return 0;
        		}
        		else if("Conductor".equals(resul2.getString(4))){
        			Dominio.Conductor condu = new Dominio.Conductor(Integer.parseInt(resul2.getString(1)),resul2.getString(2),resul2.getString(3));

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
		String SQL_update="UPDATE USUARIO SET PASS='"+pass_new+"' WHERE USUARIO.ID ="+ID+";";
		System.out.println(SQL_update);
		agente1.update(SQL_update);
	}

}

