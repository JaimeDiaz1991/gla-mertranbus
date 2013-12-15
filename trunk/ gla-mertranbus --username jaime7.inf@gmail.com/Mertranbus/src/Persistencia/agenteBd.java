package Persistencia;



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
        public static void conectar2() throws SQLException{
        	try {
        		 Class.forName("com.mysql.jdbc.Driver");
        		 String bd = "jdbc:mysql://db506590436.db.1and1.com:3306/db506590436";
        		 Connection cn = DriverManager.getConnection(bd,"dbo506590436","11Aa22Bb");
        		}
        		catch (Exception e){
        		  e.printStackTrace(); //imprime los errores si los hay
        		}
        	
        }
        public void conectar() throws SQLException{
		try{
			//Class.forName("sun.jdbc.odbc.JdbcOdbcDriver"); 
			Class.forName("com.mysql.jdbc.Driver");
		}catch(Exception e){ 
		System.out.println("No se ha podido cargar el Driver JDBC"); 
		}
		//con=DriverManager.getConnection("jdbc:odbc:MS Access Database", "", "");
		//31.170.160.86
		con=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/jaime" , "root" , "");
		//con=DriverManager.getConnection("jdbc:mysql://mysql5.000webhost.com:3306/a7136278_mertran" , "a7136278_admin" , "mertranbus1");
		//Statement stat = con.createStatement();	
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
