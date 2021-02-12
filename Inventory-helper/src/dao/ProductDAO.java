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
				 "INSERT INTO product (id, name, stock, description, cpp, price, category) VALUES (?, ?, ?, ?, ?, ?, ?) ");
			prest.setInt(1, obj.getId());
			prest.setString(2, obj.getName());
			prest.setDouble(3, obj.getStock());
			prest.setString(4, obj.getDescription());
			prest.setDouble(5, obj.getCpp());
			prest.setDouble(6, obj.getPrice());
			prest.setInt(7, obj.getCategory());

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

	/*UPDATE*/
	public static int update(Product obj){
		Connection conn = null;
		int registro =0;
		try {
			conn = AdminDAO.getConnection();
			PreparedStatement prepatest = conn.prepareStatement("UPDATE product SET name=?, stock=?, description=?, cpp=?, price=?, category=? WHERE id=?");
			prepatest.setInt(1,obj.getId());
			prepatest.setString(2,obj.getName());
			prepatest.setDouble(3,obj.getStock());
			prepatest.setString(4,obj.getDescription());
			prepatest.setDouble(5,obj.getCpp());
			prepatest.setDouble(6,obj.getPrice());
			prepatest.setInt(7,obj.getCategory());
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
			ResultSet rs = conn.createStatement().executeQuery("DELETE FROM product WHERE id='" + obj.getId()+ "'" );
			if (rs.next())
				re = 1;

		} catch (Exception e) {
			System.out.println("erroe to delete product " + e);
			e.printStackTrace();
		}

		return re;
	}
}
