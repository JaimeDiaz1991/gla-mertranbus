package Persistencia;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import Dominio.Ruta;

public class Agente {
	
	void crear_ruta(double kilometros,String origen,String destino,String descripcion)throws SQLException{
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

}
