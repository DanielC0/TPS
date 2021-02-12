package objs;
import java.util.ArrayList; 
/*CREATE TABLE external_payment  (
  id INTEGER PRIMARY KEY AUTOINCREMENT,
  description STRING NOT NULL,
  price_total DOUBLE NOT NULL,
  movement INTEGER NOT NULL
  
);
*/
public class External_payment {  
	private int id;
	private String description;
	private double price_total;
	private int movement;

	/* constructor*/
	public External_payment(int id, String description, double price_total, int movement ){ 
		this.id = id;
		this.description = description;
		this.price_total = price_total;
		this.movement = movement;
	}

	/* GETTERS AND SETTERS */

	public int getId(){
		return id;
	}

	public void setId(int id ){
		this.id = id;
	}

	public String getDescription(){
		return description;
	}

	public void setDescription(String description ){
		this.description = description;
	}

	public double getPrice_total(){
		return price_total;
	}

	public void setPrice_total(double price_total ){
		this.price_total = price_total;
	}

	public int getMovement(){
		return movement;
	}

	public void setMovement(int movement ){
		this.movement = movement;
	}

	@Override
	public String toString(){
		return "External_payment ["+"id= "+ id + "description= "+ description + "price_total= "+ price_total + "movement= "+ movement +  "]";
	}

	public static void print( ArrayList<External_payment> obj ){
		for (int i = 0; i < obj.size(); i++) {
			System.out.println(obj.get(i).toString());
		}
	}
}
