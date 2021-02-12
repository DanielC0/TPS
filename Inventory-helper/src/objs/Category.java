package objs;
import java.util.ArrayList; 
/*CREATE TABLE category  (
  id INTEGER PRIMARY KEY AUTOINCREMENT,
  name STRING ( 1 , 50 ) NOT NULL,
  description STRING ( 1 , 50 )
  
);
*/
public class Category {  
	private int id;
	private String name;
	private String description;

	/* constructor*/
	public Category(int id, String name, String description ){ 
		this.id = id;
		this.name = name;
		this.description = description;
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

	public String getDescription(){
		return description;
	}

	public void setDescription(String description ){
		this.description = description;
	}

	@Override
	public String toString(){
		return "Category ["+"id= "+ id + "name= "+ name + "description= "+ description +  "]";
	}

	public static void print( ArrayList<Category> obj ){
		for (int i = 0; i < obj.size(); i++) {
			System.out.println(obj.get(i).toString());
		}
	}
}
