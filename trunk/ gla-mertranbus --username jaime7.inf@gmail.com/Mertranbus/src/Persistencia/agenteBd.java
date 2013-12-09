package isi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class agenteBd {
        
        protected static agenteBd mInstancia = null;
	protected static Connection con;
	
        //GETTER
	public static agenteBd getagenteBd() throws Exception {
		if (mInstancia == null) {
			mInstancia = new agenteBd();
		}
		return mInstancia;
	}
        
        public static void conectar() throws SQLException{
		try{
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver"); 
		}catch(Exception e){ 
		System.out.println("No se ha podido cargar el Driver JDBC-ODBC"); 
		}
		con=DriverManager.getConnection("jdbc:odbc:MS Access Database", "", "");
		//Statement stat = con.createStatement();	
	}
	
        public static void desconectar() throws SQLException{
		con.close();
	}
		
	public static void create(String SQL) throws SQLException{
		
                //stat.executeUpdate("INSERT INTO Ruta (km, Origen, Destino,Descripcion) VALUES (" + kilometros + ",'" 
        	//	+ origen + "' ," + "'" + destino + "','" + descripcion + "');");
		Statement stat = con.createStatement();
                stat.executeUpdate(SQL);
	}
	
	
	public static void delete(String SQL) throws SQLException{
		//return stat.executeUpdate("delete from Ruta where ID="+opcion);
                Statement stat = con.createStatement();
                stat.executeUpdate(SQL);
        }
	
	public static ResultSet select(String SQL) throws SQLException{
		//return stat.executeQuery("SELECT * FROM Ruta;");
               //return stat.executeQuery("SELECT Max(Id) FROM Ruta;");
                Statement stat = con.createStatement();
                return stat.executeQuery(SQL);
	}
	
}
