package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class AdminDAO {
	
	private static String url = "storehelperdb.db";
	private static Connection conexion = null;
	
	/***
	 * Genenerate the conexion to db
	 * @return
	 */
	public static Connection getConnection() {
		
		try {
//			loas driver
			Class.forName("org.sqlite.JDBC");
			conexion=DriverManager.getConnection("jdbc:sqlite:"+url);
			
			if (conexion!=null)
				System.out.println("conexion correcta");
			
		} catch (SQLException e) {

			System.out.println("error sql : "+e);

		} catch (ClassNotFoundException ex) {
			System.out.println("error de clase : "+ex);
			Logger.getLogger(conexion.class.getName()).log(Level.SEVERE, null, ex);
		}
		
		return conexion;
	}
	
	/***
	 * Close the conexion eith dbs
	 */
	public static void closeConnection() {
		if (conexion != null) {
			try {
				conexion.close();
			} catch (Exception e) {
				System.out.println("error to close connection " );
				e.printStackTrace();
			}
		}
			
	}
}


