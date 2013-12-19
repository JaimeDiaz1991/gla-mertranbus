package persistencia;



import java.sql.*;

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
        public void conectar() throws SQLException{
        	try {
        		 Class.forName("com.mysql.jdbc.Driver");
        		 String bd = "jdbc:mysql://sql4.freesqldatabase.com:3306/sql425077";
        		 con = DriverManager.getConnection(bd,"sql425077","xE3%dZ9*");
        		}
        		catch (Exception e){
        			System.out.println("No se ha podido cargar el Driver JDBC"); 
        		  e.printStackTrace(); //imprime los errores si los hay
        		}
        	
        }
	
        public void desconectar() throws SQLException{
		con.close();
	}
		
	public void create(String SQL) throws SQLException{
		
                //stat.executeUpdate("INSERT INTO Ruta (km, Origen, Destino,Descripcion) VALUES (" + kilometros + ",'" 
        	//	+ origen + "' ," + "'" + destino + "','" + descripcion + "');");
		Statement stat = con.createStatement();
                stat.executeUpdate(SQL);
	}
	
	
	public void delete(String SQL) throws SQLException{
		//return stat.executeUpdate("delete from Ruta where ID="+opcion);
                Statement stat = con.createStatement();
                stat.executeUpdate(SQL);
        }
	
	public ResultSet select(String SQL) throws SQLException{
		//return stat.executeQuery("SELECT * FROM Ruta;");
               //return stat.executeQuery("SELECT Max(Id) FROM Ruta;");
        System.out.println("as");
                Statement stat = con.createStatement();
                return stat.executeQuery(SQL);
	}
	public void update(String SQL) throws SQLException{
		//return stat.executeQuery("SELECT * FROM Ruta;");
               //return stat.executeQuery("SELECT Max(Id) FROM Ruta;");
                Statement stat = con.createStatement();
                stat.executeUpdate(SQL);

	}
	
}
