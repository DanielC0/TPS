package dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import objs.Product;

public class ProductDAO {
	// CRUD

	/*CREATE*/
	public static void create(Product obj){
		Connection conn = null;
		try {
			//get connection
			conn = AdminDAO.getConnection();
			PreparedStatement prest = conn.prepareStatement(
				 "INSERT INTO product ( name, stock, description, cpp, price, category) VALUES ( ?, ?, ?, ?, ?, ?) ");
//			prest.setInt(1, obj.getId());
			prest.setString(1, obj.getName());
			prest.setDouble(2, obj.getStock());
			prest.setString(3, obj.getDescription());
			prest.setDouble(4, obj.getCpp());
			prest.setDouble(5, obj.getPrice());
			prest.setInt(6, obj.getCategory());

			if(prest.executeUpdate() > 0) {
				System.out.println("product register successfully");			}
		} catch (Exception e) {
			System.out.println("error to try register product");
			e.printStackTrace();
		}
	}

	/*read select*/
	public static ArrayList<Product> read(String queryopption){
		ArrayList<Product> allobjts=null;
		Connection conn = null;
		try {
			//get Connection
			conn = AdminDAO.getConnection();
			//put sql
			ResultSet rs =null;
			if(queryopption.equals("")) {
				rs = conn.createStatement().executeQuery("select * from product " );
			}else {
				rs = conn.createStatement().executeQuery(queryopption);
			}

			allobjts= new ArrayList<Product>();
			while (rs.next()) {
				allobjts.add( new Product(rs.getInt(1), rs.getString(2), rs.getDouble(3), rs.getString(4), rs.getDouble(5), rs.getDouble(6), rs.getInt(7)));
			}
		} catch (Exception e) {
			System.out.println("error to select into product " + e);
			e.printStackTrace();
		}
		return allobjts;
	}
	public static ArrayList<Product> read(){
		return ProductDAO.read("");
	}
	
	public static ArrayList<Product> readLastId(){
		ArrayList<Product> allobjts=null;
		Connection conn = null;
		try {
			//get Connection
			conn = AdminDAO.getConnection();
			//put sql
			ResultSet rs =null;
			rs = conn.createStatement().executeQuery("SELECT MAX(id) FROM product" );
			allobjts= new ArrayList<Product>();
			while (rs.next()) {
				allobjts.add( new Product(rs.getInt(1),"", 0, "", 0, 0, 0));
			}
		} catch (Exception e) {
			System.out.println("error to select into product " + e);
			e.printStackTrace();
		}
		return allobjts;
	}

	/*UPDATE*/
	public static int update(Product obj){
		Connection conn = null;
		int registro =0;
		try {
			conn = AdminDAO.getConnection();
			PreparedStatement prepatest = conn.prepareStatement("UPDATE product SET name=?, stock=?, description=?, cpp=?, price=?, category=? WHERE id=?");
			prepatest.setInt(7,obj.getId());
			prepatest.setString(1,obj.getName());
			prepatest.setDouble(2,obj.getStock());
			prepatest.setString(3,obj.getDescription());
			prepatest.setDouble(4,obj.getCpp());
			prepatest.setDouble(5,obj.getPrice());
			prepatest.setInt(6,obj.getCategory());
			registro = prepatest.executeUpdate();
			if(registro > 0) {
				System.out.println(" product update successfully");
			}
		} catch (Exception e) {
			System.out.println("error to update product" + e);
			e.printStackTrace();
		}
		return registro;
	}

	/*special update*/
	public static int update(int id, double newQuant){
		Connection conn = null;
		int registro =0;
		try {
			conn = AdminDAO.getConnection();
			PreparedStatement prepatest = conn.prepareStatement("UPDATE product SET stock=? WHERE id=?");
			
			prepatest.setDouble(1,newQuant);
			prepatest.setInt(2,id);
			
			registro = prepatest.executeUpdate();
			if(registro > 0) {
				System.out.println(" product update successfully");
			}
		} catch (Exception e) {
			System.out.println("error to update product" + e);
			e.printStackTrace();
		}
		return registro;
	}


	/*DELETE*/
	public static int delete(Product obj){
		Connection conn = null;
		int re=0;
		try {
			conn = AdminDAO.getConnection();
			PreparedStatement pstm = conn.prepareStatement("DELETE FROM product WHERE id=?" );
			pstm.setInt(1, obj.getId());	
			pstm.executeUpdate();

		} catch (Exception e) {
			System.out.println("erroe to delete product " + e);
			e.printStackTrace();
		}

		return re;
	}
}
