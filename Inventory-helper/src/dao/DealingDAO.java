package dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import objs.Dealing;

public class DealingDAO {
	// CRUD

	/*CREATE*/
	public static void create(Dealing obj){
		Connection conn = null;
		try {
			//get connection
			conn = AdminDAO.getConnection();
			PreparedStatement prest = conn.prepareStatement(
				 "INSERT INTO dealing ( product, quantity, unit_price, movement) VALUES ( ?, ?, ?, ?) ");
//			prest.setInt(1, obj.getId());
			prest.setInt(1, obj.getProduct());
			prest.setDouble(2, obj.getQuantity());
			prest.setDouble(3, obj.getUnit_price());
			prest.setInt(4, obj.getMovement());

			if(prest.executeUpdate() > 0) {
				System.out.println("dealing register successfully");			}
		} catch (Exception e) {
			System.out.println("error to try register dealing");
			e.printStackTrace();
		}
	}

	/*read select*/
	public static ArrayList<Dealing> read(String queryopption){
		ArrayList<Dealing> allobjts=null;
		Connection conn = null;
		try {
			//get Connection
			conn = AdminDAO.getConnection();
			//put sql
			ResultSet rs =null;
			if(queryopption.equals("")) {
				rs = conn.createStatement().executeQuery("select * from dealing " );
			}else {
				rs = conn.createStatement().executeQuery(queryopption);
			}

			allobjts= new ArrayList<Dealing>();
			while (rs.next()) {
				allobjts.add( new Dealing(rs.getInt(1), rs.getInt(2), rs.getDouble(3), rs.getDouble(4), rs.getInt(5)));
			}
		} catch (Exception e) {
			System.out.println("error to select into dealing " + e);
			e.printStackTrace();
		}
		return allobjts;
	}
	public static ArrayList<Dealing> read(){
		return DealingDAO.read("");
	}
	
	/*UPDATE*/
	public static int update(Dealing obj){
		Connection conn = null;
		int registro =0;
		try {
			conn = AdminDAO.getConnection();
			PreparedStatement prepatest = conn.prepareStatement("UPDATE dealing SET product=?, quantity=?, unit_price=?, movement=? WHERE id=?");
			prepatest.setInt(1,obj.getId());
			prepatest.setInt(2,obj.getProduct());
			prepatest.setDouble(3,obj.getQuantity());
			prepatest.setDouble(4,obj.getUnit_price());
			prepatest.setInt(5,obj.getMovement());
			registro = prepatest.executeUpdate();
			if(registro > 0) {
				System.out.println(" dealing update successfully");
			}
		} catch (Exception e) {
			System.out.println("error to update dealing" + e);
			e.printStackTrace();
		}
		return registro;
	}


	/*DELETE*/
	public static int delete(Dealing obj){
		Connection conn = null;
		int re=0;
		try {
			conn = AdminDAO.getConnection();
			ResultSet rs = conn.createStatement().executeQuery("DELETE FROM dealing WHERE id='" + obj.getId()+ "'" );
			if (rs.next())
				re = 1;

		} catch (Exception e) {
			System.out.println("erroe to delete dealing " + e);
			e.printStackTrace();
		}

		return re;
	}
	
	public static void main(String[] args) {
		
	}
}
