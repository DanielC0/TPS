package uistyle;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JTextField;

public class WJTextFieldNumber extends JTextField{
	
	private String stateJust = "";
	
	public WJTextFieldNumber(String str) {
		super(str);
		this.addKeyListener(new KeyAdapter() {
	         public void keyPressed(KeyEvent ke) {
	        	 valid(ke);
	         }
	      });
	}
	
	/**
	 * validate numbers
	 */
	private void valid(KeyEvent ke) {
        if (((ke.getKeyChar() >= '0' && ke.getKeyChar() <= '9') || ke.getKeyCode() == 8)|| ke.getKeyCode() == 46) {
           this.setEditable(true);
        } else {
           this.setEditable(false);
        }
	}
	
}
