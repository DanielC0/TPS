package dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import objs.External_payment;

public class External_paymentDAO {
	// CRUD

	/*CREATE*/
	public static void create(External_payment obj){
		Connection conn = null;
		try {
			//get connection
			conn = AdminDAO.getConnection();
			PreparedStatement prest = conn.prepareStatement(
				 "INSERT INTO external_payment (description, price_total, movement) VALUES ( ?, ?, ?) ");
//			prest.setInt(1, obj.getId());
			prest.setString(1, obj.getDescription());
			prest.setDouble(2, obj.getPrice_total());
			prest.setInt(3, obj.getMovement());

			if(prest.executeUpdate() > 0) {
				System.out.println("external_payment register successfully");			}
		} catch (Exception e) {
			System.out.println("error to try register external_payment");
			e.printStackTrace();
		}
	}

	/*read select*/
	public static ArrayList<External_payment> read(String queryopption){
		ArrayList<External_payment> allobjts=null;
		Connection conn = null;
		try {
			//get Connection
			conn = AdminDAO.getConnection();
			//put sql
			ResultSet rs =null;
			if(queryopption.equals("")) {
				rs = conn.createStatement().executeQuery("select * from external_payment " );
			}else {
				rs = conn.createStatement().executeQuery(queryopption);
			}

			allobjts= new ArrayList<External_payment>();
			while (rs.next()) {
				allobjts.add( new External_payment(rs.getInt(1), rs.getString(2), rs.getDouble(3), rs.getInt(4)));
			}
		} catch (Exception e) {
			System.out.println("error to select into external_payment " + e);
			e.printStackTrace();
		}
		return allobjts;
	}
	public static ArrayList<External_payment> read(){
		return External_paymentDAO.read("");
	}
	
	/*UPDATE*/
	public static int update(External_payment obj){
		Connection conn = null;
		int registro =0;
		try {
			conn = AdminDAO.getConnection();
			PreparedStatement prepatest = conn.prepareStatement("UPDATE external_payment SET description=?, price_total=?, movement=? WHERE id=?");
			prepatest.setInt(1,obj.getId());
			prepatest.setString(2,obj.getDescription());
			prepatest.setDouble(3,obj.getPrice_total());
			prepatest.setInt(4,obj.getMovement());
			registro = prepatest.executeUpdate();
			if(registro > 0) {
				System.out.println(" external_payment update successfully");
			}
		} catch (Exception e) {
			System.out.println("error to update external_payment" + e);
			e.printStackTrace();
		}
		return registro;
	}


	/*DELETE*/
	public static int delete(External_payment obj){
		Connection conn = null;
		int re=0;
		try {
			conn = AdminDAO.getConnection();
			ResultSet rs = conn.createStatement().executeQuery("DELETE FROM external_payment WHERE id='" + obj.getId()+ "'" );
			if (rs.next())
				re = 1;

		} catch (Exception e) {
			System.out.println("erroe to delete external_payment " + e);
			e.printStackTrace();
		}

		return re;
	}
}
