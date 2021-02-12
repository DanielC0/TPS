package uistyle;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.border.Border;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

public class WJButton extends JButton{

	private Color bgNorma = null,
			bgMouse = null,
			bgPress = null,
			fgNoral = null,
			fgMouse = null,
			fgPress = null;
	
	private ImageIcon iconNormal= null,
			Iconfocus = null;
	public WJButton(String str) {
		super(str);

		this.setBorder(null);
//		this.setBorderPainted(false);
		this.setFocusable(false);
		this.setBackground(null);
		this.setContentAreaFilled(false);
		this.setOpaque(true);
		inialice();
		exitbtn();
	}

	/***
	 * inilice the button
	 */
	private void inialice() {
		// add events
		this.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent arg0) {
				pressbtn();
			}

			@Override
			public void mouseExited(MouseEvent arg0) {
				exitbtn();
			}

			@Override
			public void mouseEntered(MouseEvent arg0) {
				enterbtn();
			}
		});


	}

	// press fintion
	private void pressbtn() {
		if(bgPress != null) {
			this.setBackground(bgPress);
		}
		if(fgPress != null) {
			this.setForeground(fgPress);
		}
	}
	// mouse enter function
	private void enterbtn() {
		if(bgMouse != null) {
			this.setBackground(bgMouse);
		}
		if(fgMouse != null) {
			this.setForeground(fgMouse);
		}
		if(Iconfocus != null) {
			this.setIcon(Iconfocus);
		}
	}
	// mouse exitef fucti
	private void exitbtn() {
		if(bgNorma != null) {
			this.setBackground(bgNorma);
		}
		if(fgNoral != null) {
			this.setForeground(fgNoral);
		}
		if(iconNormal != null) {
			this.setIcon(iconNormal);
		}
	}



	//getters and setters///////////////////// 

	public Color getBgNorma() {
		return bgNorma;
	}

	public void setBgNorma(Color bgNorma) {
		this.bgNorma = bgNorma;
		exitbtn();
	}

	public Color getBgMouse() {
		return bgMouse;
	}

	public void setBgMouse(Color bgMouse) {
		this.bgMouse = bgMouse;
	}

	public Color getBgPress() {
		return bgPress;
	}

	public void setBgPress(Color bgPress) {
		this.bgPress = bgPress;
	}

	public Color getFgNoral() {
		return fgNoral;
	}

	public void setFgNoral(Color fgNoral) {
		this.fgNoral = fgNoral;
	}

	public Color getFgMouse() {
		return fgMouse;
	}

	public void setFgMouse(Color fgMouse) {
		this.fgMouse = fgMouse;
	}

	public Color getFgPress() {
		return fgPress;
	}

	public void setFgPress(Color fgPress) {
		this.fgPress = fgPress;
	}

	public ImageIcon getIconNormal() {
		return iconNormal;
	}

	public void setIconNormal(ImageIcon iconNormal) {
		this.iconNormal = iconNormal;
		exitbtn();
	}

	public ImageIcon getIconfocus() {
		return Iconfocus;
	}

	public void setIconfocus(ImageIcon iconfocus) {
		Iconfocus = iconfocus;
	}


}
