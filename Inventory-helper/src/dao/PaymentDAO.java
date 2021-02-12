package dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import objs.Payment;

public class PaymentDAO {
	// CRUD

	/*CREATE*/
	public static void create(Payment obj){
		Connection conn = null;
		try {
			//get connection
			conn = AdminDAO.getConnection();
			PreparedStatement prest = conn.prepareStatement(
				 "INSERT INTO payment ( credit, moment, price) VALUES ( ?, ?, ?) ");
//			prest.setInt(1, obj.getId());
			prest.setInt(1, obj.getCredit());
			prest.setDate(2, tools.Utils.dateUtlToSql( obj.getMoment()));
			prest.setDouble(3, obj.getPrice());

			if(prest.executeUpdate() > 0) {
				System.out.println("payment register successfully");			}
		} catch (Exception e) {
			System.out.println("error to try register payment");
			e.printStackTrace();
		}
	}

	/*read select*/
	public static ArrayList<Payment> read(String queryopption){
		ArrayList<Payment> allobjts=null;
		Connection conn = null;
		try {
			//get Connection
			conn = AdminDAO.getConnection();
			//put sql
			ResultSet rs =null;
			if(queryopption.equals("")) {
				rs = conn.createStatement().executeQuery("select * from payment " );
			}else {
				rs = conn.createStatement().executeQuery(queryopption);
			}

			allobjts= new ArrayList<Payment>();
			while (rs.next()) {
				allobjts.add( new Payment(rs.getInt(1), rs.getInt(2), tools.Utils.dateSqlToUtl( rs.getDate(3)), rs.getDouble(4)));
			}
		} catch (Exception e) {
			System.out.println("error to select into payment " + e);
			e.printStackTrace();
		}
		return allobjts;
	}

	/*UPDATE*/
	public static int update(Payment obj){
		Connection conn = null;
		int registro =0;
		try {
			conn = AdminDAO.getConnection();
			PreparedStatement prepatest = conn.prepareStatement("UPDATE payment SET credit=?, moment=?, price=? WHERE id=?");
			prepatest.setInt(1,obj.getId());
			prepatest.setInt(2,obj.getCredit());
			prepatest.setDate(3,tools.Utils.dateUtlToSql( obj.getMoment()));
			prepatest.setDouble(4,obj.getPrice());
			registro = prepatest.executeUpdate();
			if(registro > 0) {
				System.out.println(" payment update successfully");
			}
		} catch (Exception e) {
			System.out.println("error to update payment" + e);
			e.printStackTrace();
		}
		return registro;
	}


	/*DELETE*/
	public static int delete(Payment obj){
		Connection conn = null;
		int re=0;
		try {
			conn = AdminDAO.getConnection();
			ResultSet rs = conn.createStatement().executeQuery("DELETE FROM payment WHERE id='" + obj.getId()+ "'" );
			if (rs.next())
				re = 1;

		} catch (Exception e) {
			System.out.println("erroe to delete payment " + e);
			e.printStackTrace();
		}

		return re;
	}
}
