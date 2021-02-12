package dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexion {
	
	private static String url = "resources/database/InventoryHelperDBs.db";
	private static Connection connect = null;
	
	/***
	 * this method returns the connection to the database 
	 * @return
	 */
	public static Connection getConnection() {
		try {
			if (connect == null) {
				connect.close();
			}
			Class.forName("org.sqlite.JDBC");
			connect = DriverManager.getConnection("jdbc:sqlite:"+url);
			if (connect != null ) {
				System.out.println("connection succes");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return connect;
	}
	
	/***
	 * this method closes the connection
	 */
	public static void closeConnection() {
		try {
			connect.close();
			connect = null;
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		Conexion.getConnection();
	}

}

