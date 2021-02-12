package dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import objs.Movement;

public class MovementDAO {
	// CRUD

	/*CREATE*/
	public static void create(Movement obj){
		Connection conn = null;
		try {
			//get connection
			conn = AdminDAO.getConnection();
			PreparedStatement prest = conn.prepareStatement(
				 "INSERT INTO movement ( kind, price_total, moment) VALUES ( ?, ?, ?) ");
//			prest.setInt(1, obj.getId());
			prest.setString(1, obj.getKind());
			prest.setDouble(2, obj.getPrice_total());
			prest.setDate(3, tools.Utils.dateUtlToSql( obj.getMoment()));

			if(prest.executeUpdate() > 0) {
				System.out.println("movement register successfully");			}
		} catch (Exception e) {
			System.out.println("error to try register movement");
			e.printStackTrace();
		}
	}

	/*read select*/
	public static ArrayList<Movement> read(String queryopption){
		ArrayList<Movement> allobjts=null;
		Connection conn = null;
		try {
			//get Connection
			conn = AdminDAO.getConnection();
			//put sql
			ResultSet rs =null;
			if(queryopption.equals("")) {
				rs = conn.createStatement().executeQuery("select * from movement " );
			}else {
				rs = conn.createStatement().executeQuery(queryopption);
			}

			allobjts= new ArrayList<Movement>();
			while (rs.next()) {
				allobjts.add( new Movement(rs.getInt(1), rs.getString(2), rs.getDouble(3), tools.Utils.dateSqlToUtl(rs.getDate(4))) );
			}
		} catch (Exception e) {
			System.out.println("error to select into movement " + e);
			e.printStackTrace();
		}
		return allobjts;
	}
	public static ArrayList<Movement> read(){
		return MovementDAO.read("");
	}

	/*UPDATE*/
	public static int update(Movement obj){
		Connection conn = null;
		int registro =0;
		try {
			conn = AdminDAO.getConnection();
			PreparedStatement prepatest = conn.prepareStatement("UPDATE movement SET kind=?, price_total=?, moment=? WHERE id=?");
			prepatest.setInt(1,obj.getId());
			prepatest.setString(2,obj.getKind());
			prepatest.setDouble(3,obj.getPrice_total());
			prepatest.setDate(4,tools.Utils.dateUtlToSql( obj.getMoment()));
			registro = prepatest.executeUpdate();
			if(registro > 0) {
				System.out.println(" movement update successfully");
			}
		} catch (Exception e) {
			System.out.println("error to update movement" + e);
			e.printStackTrace();
		}
		return registro;
	}


	/*DELETE*/
	public static int delete(Movement obj){
		Connection conn = null;
		int re=0;
		try {
			conn = AdminDAO.getConnection();
			ResultSet rs = conn.createStatement().executeQuery("DELETE FROM movement WHERE id='" + obj.getId()+ "'" );
			if (rs.next())
				re = 1;

		} catch (Exception e) {
			System.out.println("erroe to delete movement " + e);
			e.printStackTrace();
		}

		return re;
	}
}
