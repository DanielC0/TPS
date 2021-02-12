package objs;
import java.util.ArrayList; 
/*CREATE TABLE credit  (
  id INTEGER PRIMARY KEY AUTOINCREMENT,
  client INTEGER NOT NULL,
  movement INTEGER NOT NULL
  
);
*/
public class Credit {  
	private int id;
	private int client;
	private int movement;

	/* constructor*/
	public Credit(int id, int client, int movement ){ 
		this.id = id;
		this.client = client;
		this.movement = movement;
	}

	/* GETTERS AND SETTERS */

	public int getId(){
		return id;
	}

	public void setId(int id ){
		this.id = id;
	}

	public int getClient(){
		return client;
	}

	public void setClient(int client ){
		this.client = client;
	}

	public int getMovement(){
		return movement;
	}

	public void setMovement(int movement ){
		this.movement = movement;
	}

	@Override
	public String toString(){
		return "Credit ["+"id= "+ id + "client= "+ client + "movement= "+ movement +  "]";
	}

	public static void print( ArrayList<Credit> obj ){
		for (int i = 0; i < obj.size(); i++) {
			System.out.println(obj.get(i).toString());
		}
	}
}
