package objs;
import java.util.ArrayList; 
/*CREATE TABLE dealing (
  id  INTEGER PRIMARY KEY AUTOINCREMENT,
  product INTEGER NOT NULL,
  quantity DOUBLE NOT NULL,
  unit_price DOUBLE NOT NULL,
  movement INTEGER NOT NULL
  
);
*/
public class Dealing {  
	private int id;
	private int product;
	private double quantity;
	private double unit_price;
	private int movement;

	/* constructor*/
	public Dealing(int id, int product, double quantity, double unit_price, int movement ){ 
		this.id = id;
		this.product = product;
		this.quantity = quantity;
		this.unit_price = unit_price;
		this.movement = movement;
	}

	/* GETTERS AND SETTERS */

	public int getId(){
		return id;
	}

	public void setId(int id ){
		this.id = id;
	}

	public int getProduct(){
		return product;
	}

	public void setProduct(int product ){
		this.product = product;
	}

	public double getQuantity(){
		return quantity;
	}

	public void setQuantity(double quantity ){
		this.quantity = quantity;
	}

	public double getUnit_price(){
		return unit_price;
	}

	public void setUnit_price(double unit_price ){
		this.unit_price = unit_price;
	}

	public int getMovement(){
		return movement;
	}

	public void setMovement(int movement ){
		this.movement = movement;
	}

	@Override
	public String toString(){
		return "Dealing ["+"id= "+ id + "product= "+ product + "quantity= "+ quantity + "unit_price= "+ unit_price + "movement= "+ movement +  "]";
	}

	public static void print( ArrayList<Dealing> obj ){
		for (int i = 0; i < obj.size(); i++) {
			System.out.println(obj.get(i).toString());
		}
	}
}
