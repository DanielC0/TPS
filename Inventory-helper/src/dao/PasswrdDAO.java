package dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import objs.Passwrd;

public class PasswrdDAO {
	// CRUD

	/*CREATE*/
	public static void create(Passwrd obj){
		Connection conn = null;
		try {
			//get connection
			conn = AdminDAO.getConnection();
			PreparedStatement prest = conn.prepareStatement(
				 "INSERT INTO passwrd (wordkwy) VALUES (?) ");
			prest.setString(1, obj.getWordkwy());

			if(prest.executeUpdate() > 0) {
				System.out.println("passwrd register successfully");			}
		} catch (Exception e) {
			System.out.println("error to try register passwrd");
			e.printStackTrace();
		}
	}

	/*read select*/
	public static ArrayList<Passwrd> read(String queryopption){
		ArrayList<Passwrd> allobjts=null;
		Connection conn = null;
		try {
			//get Connection
			conn = AdminDAO.getConnection();
			//put sql
			ResultSet rs =null;
			if(queryopption.equals("")) {
				rs = conn.createStatement().executeQuery("select * from passwrd " );
			}else {
				rs = conn.createStatement().executeQuery(queryopption);
			}

			allobjts= new ArrayList<Passwrd>();
			while (rs.next()) {
				allobjts.add( new Passwrd(rs.getString(1)));
			}
		} catch (Exception e) {
			System.out.println("error to select into passwrd " + e);
			e.printStackTrace();
		}
		return allobjts;
	}

	/*UPDATE*/
	public static int update(Passwrd obj){
		Connection conn = null;
		int registro =0;
		try {
			conn = AdminDAO.getConnection();
			PreparedStatement prepatest = conn.prepareStatement("UPDATE passwrd SET 			prepatest.setString(1,obj.getWordkwy());
			registro = prepatest.executeUpdate();
			if(registro > 0) {
				System.out.println(" passwrd update successfully");
			}
		} catch (Exception e) {
			System.out.println("error to update passwrd" + e);
			e.printStackTrace();
		}
		return registro;
	}


	/*DELETE*/
	public static int delete(Passwrd obj){
		Connection conn = null;
		int re=0;
		try {
			conn = AdminDAO.getConnection();
			ResultSet rs = conn.createStatement().executeQuery("DELETE FROM passwrd WHERE wordkwy='" + obj.getWordkwy()+ "'" );
			if (rs.next())
				re = 1;

		} catch (Exception e) {
			System.out.println("erroe to delete passwrd " + e);
			e.printStackTrace();
		}

		return re;
	}
}
