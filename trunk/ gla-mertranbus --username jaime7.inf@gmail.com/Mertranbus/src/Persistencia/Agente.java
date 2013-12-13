package Persistencia;
import java.sql.ResultSet;
import java.sql.SQLException;
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
	public int verificar_login(String usuario,String pass) throws SQLException{
		Persistencia.agenteBd agente1 = new Persistencia.agenteBd();
		agente1.conectar();
		String SQL_select="SELECT DISTINCT Usuario.NOMBRE,Usuario.PASS,Usuario.Tipo FROM USUARIO;";
		ResultSet resul2=agente1.select(SQL_select);

		
        while(resul2.next()){

        	if(usuario.equals(resul2.getString(1)) && pass.equals(resul2.getString(2))){
        		System.out.println("Acceso Concedido");

        		if("Administrador".equals(resul2.getString(3))){
        			agente1.desconectar();
        			return 0;
        		}
        		else if("Conductor".equals(resul2.getString(3))){
        			agente1.desconectar();
        			return 1;
        		}
        	}	  	
        }
        agente1.desconectar();
        return -1;
	}
	public void cambiar_pass()throws SQLException{
		
	}

}
