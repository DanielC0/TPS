package dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import objs.Client;

public class ClientDAO {
	// CRUD

	/*CREATE*/
	public static void create(Client obj){
		Connection conn = null;
		try {
			//get connection
			conn = AdminDAO.getConnection();
			PreparedStatement prest = conn.prepareStatement(
				 "INSERT INTO client (cc, name, phone, address) VALUES (?, ?, ?, ?) ");
			prest.setString(1, obj.getCc());
			prest.setString(2, obj.getName());
			prest.setString(3, obj.getPhone());
			prest.setString(4, obj.getAddress());

			if(prest.executeUpdate() > 0) {
				System.out.println("client register successfully");			}
		} catch (Exception e) {
			System.out.println("error to try register client");
			e.printStackTrace();
		}
	}

	/*read select*/
	public static ArrayList<Client> read(String queryopption){
		ArrayList<Client> allobjts=null;
		Connection conn = null;
		try {
			//get Connection
			conn = AdminDAO.getConnection();
			//put sql
			ResultSet rs =null;
			if(queryopption.equals("")) {
				rs = conn.createStatement().executeQuery("select * from client " );
			}else {
				rs = conn.createStatement().executeQuery(queryopption);
			}

			allobjts= new ArrayList<Client>();
			while (rs.next()) {
				allobjts.add( new Client(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4)));
			}
		} catch (Exception e) {
			System.out.println("error to select into client " + e);
			e.printStackTrace();
		}
		return allobjts;
	}
	public static ArrayList<Client> read(){
		return ClientDAO.read("");
	}

	/*UPDATE*/
	public static int update(Client obj){
		Connection conn = null;
		int registro =0;
		try {
			conn = AdminDAO.getConnection();
			PreparedStatement prepatest = conn.prepareStatement("UPDATE client SET name=?, phone=?, address=? WHERE cc=?");
			prepatest.setString(4,obj.getCc());
			prepatest.setString(1,obj.getName());
			prepatest.setString(2,obj.getPhone());
			prepatest.setString(3,obj.getAddress());
			registro = prepatest.executeUpdate();

			if(registro > 0) {
				System.out.println(" client update successfully");
			}
		} catch (Exception e) {
			System.out.println("error to update client" + e);
			e.printStackTrace();
		}
		return registro;
	}


	/*DELETE*/
	public static int delete(Client obj){
		Connection conn = null;
		int re=0;
		try {
			conn = AdminDAO.getConnection();
			PreparedStatement pstm = conn.prepareStatement("DELETE FROM client WHERE cc= ? " );
			pstm.setString(1, obj.getCc());	
			pstm.executeUpdate();
			

		} catch (Exception e) {
			System.out.println("erroe to delete client " + e);
			e.printStackTrace();
		}

		return re;
	}
}
