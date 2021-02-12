package objs;
import java.util.ArrayList; 
/*CREATE TABLE passwrd  (
  id INTEGER PRIMARY KEY AUTOINCREMENT,
  wordkey STRING
  
);
*/
public class Passwrd {  
	private int id;
	private String wordkey;

	/* constructor*/
	public Passwrd(int id, String wordkey ){ 
		this.id = id;
		this.wordkey = wordkey;
	}

	/* GETTERS AND SETTERS */

	public int getId(){
		return id;
	}

	public void setId(int id ){
		this.id = id;
	}

	public String getWordkey(){
		return wordkey;
	}

	public void setWordkey(String wordkey ){
		this.wordkey = wordkey;
	}

	@Override
	public String toString(){
		return "Passwrd ["+"id= "+ id + "wordkey= "+ wordkey +  "]";
	}

	public static void print( ArrayList<Passwrd> obj ){
		for (int i = 0; i < obj.size(); i++) {
			System.out.println(obj.get(i).toString());
		}
	}
}
