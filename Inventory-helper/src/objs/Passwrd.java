package objs;
import java.util.ArrayList; 
/*CREATE TABLE passwrd  (
  wordkwy STRING
  
);
*/
public class Passwrd {  
	private String wordkwy;

	/* constructor*/
	public Passwrd(String wordkwy ){ 
		this.wordkwy = wordkwy;
	}

	/* GETTERS AND SETTERS */

	public String getWordkwy(){
		return wordkwy;
	}

	public void setWordkwy(String wordkwy ){
		this.wordkwy = wordkwy;
	}

	@Override
	public String toString(){
		return "Passwrd ["+"wordkwy= "+ wordkwy +  "]";
	}

	public static void print( ArrayList<Passwrd> obj ){
		for (int i = 0; i < obj.size(); i++) {
			System.out.println(obj.get(i).toString());
		}
	}
}
