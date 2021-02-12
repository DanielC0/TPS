package dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import objs.Credit;

public class CreditDAO {
	// CRUD

	/*CREATE*/
	public static void create(Credit obj){
		Connection conn = null;
		try {
			//get connection
			conn = AdminDAO.getConnection();
			PreparedStatement prest = conn.prepareStatement(
				 "INSERT INTO credit (id, client, movement) VALUES (?, ?, ?) ");
			prest.setInt(1, obj.getId());
			prest.setInt(2, obj.getClient());
			prest.setInt(3, obj.getMovement());

			if(prest.executeUpdate() > 0) {
				System.out.println("credit register successfully");			}
		} catch (Exception e) {
			System.out.println("error to try register credit");
			e.printStackTrace();
		}
	}

	/*read select*/
	public static ArrayList<Credit> read(String queryopption){
		ArrayList<Credit> allobjts=null;
		Connection conn = null;
		try {
			//get Connection
			conn = AdminDAO.getConnection();
			//put sql
			ResultSet rs =null;
			if(queryopption.equals("")) {
				rs = conn.createStatement().executeQuery("select * from credit " );
			}else {
				rs = conn.createStatement().executeQuery(queryopption);
			}

			allobjts= new ArrayList<Credit>();
			while (rs.next()) {
				allobjts.add( new Credit(rs.getInt(1), rs.getInt(2), rs.getInt(3)));
			}
		} catch (Exception e) {
			System.out.println("error to select into credit " + e);
			e.printStackTrace();
		}
		return allobjts;
	}

	/*UPDATE*/
	public static int update(Credit obj){
		Connection conn = null;
		int registro =0;
		try {
			conn = AdminDAO.getConnection();
			PreparedStatement prepatest = conn.prepareStatement("UPDATE credit SET client=?, movement=? WHERE id=?");
			prepatest.setInt(1,obj.getId());
			prepatest.setInt(2,obj.getClient());
			prepatest.setInt(3,obj.getMovement());
			registro = prepatest.executeUpdate();
			if(registro > 0) {
				System.out.println(" credit update successfully");
			}
		} catch (Exception e) {
			System.out.println("error to update credit" + e);
			e.printStackTrace();
		}
		return registro;
	}


	/*DELETE*/
	public static int delete(Credit obj){
		Connection conn = null;
		int re=0;
		try {
			conn = AdminDAO.getConnection();
			ResultSet rs = conn.createStatement().executeQuery("DELETE FROM credit WHERE id='" + obj.getId()+ "'" );
			if (rs.next())
				re = 1;

		} catch (Exception e) {
			System.out.println("erroe to delete credit " + e);
			e.printStackTrace();
		}

		return re;
	}
}
