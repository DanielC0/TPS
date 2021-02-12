package objs;
import java.util.ArrayList; 
/*CREATE TABLE client  (
  cc INTEGER NOT NULL,
  name STRING ( 1 , 50 ) NOT NULL,
  phone INTEGER ,
  address STRING 
  
);
*/
public class Client {  
	private int cc;
	private String name;
	private int phone;
	private String address;

	/* constructor*/
	public Client(int cc, String name, int phone, String address ){ 
		this.cc = cc;
		this.name = name;
		this.phone = phone;
		this.address = address;
	}

	/* GETTERS AND SETTERS */

	public int getCc(){
		return cc;
	}

	public void setCc(int cc ){
		this.cc = cc;
	}

	public String getName(){
		return name;
	}

	public void setName(String name ){
		this.name = name;
	}

	public int getPhone(){
		return phone;
	}

	public void setPhone(int phone ){
		this.phone = phone;
	}

	public String getAddress(){
		return address;
	}

	public void setAddress(String address ){
		this.address = address;
	}

	@Override
	public String toString(){
		return "Client ["+"cc= "+ cc + "name= "+ name + "phone= "+ phone + "address= "+ address +  "]";
	}

	public static void print( ArrayList<Client> obj ){
		for (int i = 0; i < obj.size(); i++) {
			System.out.println(obj.get(i).toString());
		}
	}
}
