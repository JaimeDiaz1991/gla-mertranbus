package Persistencia;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import Dominio.Ruta;

public class Agente {
	
	public static void crear_ruta(Ruta r)throws SQLException{
		double kilometros=r.getKm();
		String origen=r.getOrigen();
		String destino=r.getDestino();
		String descripcion=r.getDescripcion();
		
		String SQL_select="SELECT Max(Id) FROM Ruta;";
        ResultSet resultado=agenteBd.select(SQL_select);
		int ID_max = 0;
        while(resultado.next()){
        	ID_max = (resultado.getInt(1));
        }
        //YA TENEMOS LA MAXIMA ID
        int ID = ID_max+1;
        Ruta r1 = new Ruta(ID,kilometros,origen,destino,descripcion);
        String SQL_insert="INSERT INTO Ruta (km, Origen, Destino,Descripcion) VALUES (" + kilometros + ",'" 
        		+ origen + "' ," + "'" + destino + "','" + descripcion + "');";
        agenteBd.create(SQL_insert);
		
	}
	public static int verificar_login(String usuario,String pass){
		
		if(usuario.equals("Jaime") && pass.equals("Jaime") )
			return 0;
		else if(usuario.equals("Isi") && pass.equals("Isi"))
			return 1;
		else
			return -1;
				
	}

}
