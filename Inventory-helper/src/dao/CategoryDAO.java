package dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import objs.Category;

public class CategoryDAO {
	// CRUD

	/*CREATE*/
	public static int create(Category obj){
		Connection conn = null;
		try {
			//get connection
			conn = AdminDAO.getConnection();
			PreparedStatement prest = conn.prepareStatement(
				 "INSERT INTO category ( name, description) VALUES ( ?, ?) ");
//			prest.setInt(1, obj.getId());
			prest.setString(1, obj.getName());
			prest.setString(2, obj.getDescription());

			if(prest.executeUpdate() > 0) {
				System.out.println("category register successfully");			}
				return 1;
		} catch (Exception e) {
			System.out.println("error to try register category");
			e.printStackTrace();
		}
		return 0;
	}

	/*read select*/
	public static ArrayList<Category> read(String queryopption){
		ArrayList<Category> allobjts=null;
		Connection conn = null;
		try {
			//get Connection
			conn = AdminDAO.getConnection();
			//put sql
			ResultSet rs =null;
			if(queryopption.equals("")) {
				rs = conn.createStatement().executeQuery("select * from category " );
			}else {
				rs = conn.createStatement().executeQuery(queryopption);
			}

			allobjts= new ArrayList<Category>();
			while (rs.next()) {
				allobjts.add( new Category(rs.getInt(1), rs.getString(2), rs.getString(3)));
			}
		} catch (Exception e) {
			System.out.println("error to select into category " + e);
			e.printStackTrace();
		}
		return allobjts;
	}
	public static ArrayList<Category> read(){
		return CategoryDAO.read("");
	}

	/*UPDATE*/
	public static int update(Category obj){
		Connection conn = null;
		int registro =0;
		try {
			conn = AdminDAO.getConnection();
			PreparedStatement prepatest = conn.prepareStatement("UPDATE category SET name=?, description=? WHERE id=?");
			prepatest.setInt(3,obj.getId());
			prepatest.setString(1,obj.getName());
			prepatest.setString(2,obj.getDescription());
			registro = prepatest.executeUpdate();
			if(registro > 0) {
				System.out.println(" category update successfully");
			}
		} catch (Exception e) {
			System.out.println("error to update category" + e);
			e.printStackTrace();
		}
		return registro;
	}


	/*DELETE*/
	public static int delete(Category obj){
		Connection conn = null;
		int re=0;
		try {
			conn = AdminDAO.getConnection();
			PreparedStatement pstm = conn.prepareStatement("DELETE FROM category WHERE id = ? ");
			pstm.setInt(1, obj.getId());	
			pstm.executeUpdate();
//			conn.exe
//			conn.createStatement().executeQuery("DELETE FROM category WHERE id='" + obj.getId()+ "'" );
//			if (rs.next())
//				re = 1;

		} catch (Exception e) {
			System.out.println("erroe to delete category " + e);
			e.printStackTrace();
		}

		return re;
	}
	
}
