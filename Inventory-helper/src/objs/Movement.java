package objs;
import java.util.ArrayList; 
/*CREATE TABLE movement  (
  id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,
  kind STRING NOT NULL,
  price_total DOUBLE NOT NULL,
  moment DATETIME NOT NULL
  
);
*/
public class Movement {  
	private int id;
	private String kind;
	private double price_total;
	private Date moment;

	/* constructor*/
	public Movement(int id, String kind, double price_total, Date moment ){ 
		this.id = id;
		this.kind = kind;
		this.price_total = price_total;
		this.moment = moment;
	}

	/* GETTERS AND SETTERS */

	public int getId(){
		return id;
	}

	public void setId(int id ){
		this.id = id;
	}

	public String getKind(){
		return kind;
	}

	public void setKind(String kind ){
		this.kind = kind;
	}

	public double getPrice_total(){
		return price_total;
	}

	public void setPrice_total(double price_total ){
		this.price_total = price_total;
	}

	public Date getMoment(){
		return moment;
	}

	public void setMoment(Date moment ){
		this.moment = moment;
	}

	@Override
	public String toString(){
		return "Movement ["+"id= "+ id + "kind= "+ kind + "price_total= "+ price_total + "moment= "+ moment +  "]";
	}

	public static void print( ArrayList<Movement> obj ){
		for (int i = 0; i < obj.size(); i++) {
			System.out.println(obj.get(i).toString());
		}
	}
}
