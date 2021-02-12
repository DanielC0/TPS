package objs;
import java.util.ArrayList; 
/*CREATE TABLE product  (
  id INTEGER PRIMARY KEY AUTOINCREMENT,
  name STRING ( 1 , 50 ) NOT NULL,
  stock DOUBLE NOT NULL,
  description STRING ( 0 , 50 ),
  cpp DOUBLE NOT NULL,
  price DOUBLE NOT NULL,
  category INTEGER 
  
);
*/
public class Product {  
	private int id;
	private String name;
	private double stock;
	private String description;
	private double cpp;
	private double price;
	private int category;

	/* constructor*/
	public Product(int id, String name, double stock, String description, double cpp, double price, int category ){ 
		this.id = id;
		this.name = name;
		this.stock = stock;
		this.description = description;
		this.cpp = cpp;
		this.price = price;
		this.category = category;
	}

	/* GETTERS AND SETTERS */

	public int getId(){
		return id;
	}

	public void setId(int id ){
		this.id = id;
	}

	public String getName(){
		return name;
	}

	public void setName(String name ){
		this.name = name;
	}

	public double getStock(){
		return stock;
	}

	public void setStock(double stock ){
		this.stock = stock;
	}

	public String getDescription(){
		return description;
	}

	public void setDescription(String description ){
		this.description = description;
	}

	public double getCpp(){
		return cpp;
	}

	public void setCpp(double cpp ){
		this.cpp = cpp;
	}

	public double getPrice(){
		return price;
	}

	public void setPrice(double price ){
		this.price = price;
	}

	public int getCategory(){
		return category;
	}

	public void setCategory(int category ){
		this.category = category;
	}

	@Override
	public String toString(){
		return "Product ["+"id= "+ id + "name= "+ name + "stock= "+ stock + "description= "+ description + "cpp= "+ cpp + "price= "+ price + "category= "+ category +  "]";
	}

	public static void print( ArrayList<Product> obj ){
		for (int i = 0; i < obj.size(); i++) {
			System.out.println(obj.get(i).toString());
		}
	}
}
