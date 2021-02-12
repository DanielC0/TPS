package objs;
import java.util.ArrayList;
import java.util.Date; 
/*CCREATE TABLE payment  (
  id INTEGER PRIMARY KEY AUTOINCREMENT,
  credit INTEGER NOT NULL,
  moment DATETIME NOT NULL,
  price DOUBLE NOT NULL
  
);
*/
public class Payment {  
	private int id;
	private int credit;
	private Date moment;
	private double price;

	/* constructor*/
	public Payment(int id, int credit, Date moment, double price ){ 
		this.id = id;
		this.credit = credit;
		this.moment = moment;
		this.price = price;
	}

	/* GETTERS AND SETTERS */

	public int getId(){
		return id;
	}

	public void setId(int id ){
		this.id = id;
	}

	public int getCredit(){
		return credit;
	}

	public void setCredit(int credit ){
		this.credit = credit;
	}

	public Date getMoment(){
		return moment;
	}

	public void setMoment(Date moment ){
		this.moment = moment;
	}

	public double getPrice(){
		return price;
	}

	public void setPrice(double price ){
		this.price = price;
	}

	@Override
	public String toString(){
		return "Payment ["+"id= "+ id + "credit= "+ credit + "moment= "+ moment + "price= "+ price +  "]";
	}

	public static void print( ArrayList<Payment> obj ){
		for (int i = 0; i < obj.size(); i++) {
			System.out.println(obj.get(i).toString());
		}
	}
}
