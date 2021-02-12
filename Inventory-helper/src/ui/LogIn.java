package ui;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

import uistyle.WJButton;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Graphics;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Color;
import javax.swing.border.EmptyBorder;
import javax.swing.border.MatteBorder;
import javax.swing.JPasswordField;
import javax.swing.SwingConstants;

public class LogIn {

	private JFrame frame;
	private JPasswordField passwordFieldKye;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LogIn window = new LogIn();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public LogIn() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setUndecorated(true);
//		frame.setBounds(100, 100);
		frame.setSize( 700, 490);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panelContainer = new JPanel() {
			@Override
			public void paint(Graphics gr) {
				gr.drawImage(new ImageIcon("resources/img/images/backgr.jpg").getImage(), 0, 0, 550, 493, this);
				super.paint(gr);
			}
		};
		panelContainer.setOpaque(false);
		frame.getContentPane().add(panelContainer, BorderLayout.CENTER);
		panelContainer.setLayout(new BorderLayout(0, 0));
		
		JPanel panellog = new JPanel();
		panellog.setBackground(new Color(43, 78, 80));
		panelContainer.add(panellog, BorderLayout.EAST);
		panellog.setPreferredSize(new Dimension(290,500));
		
		WJButton btnEnter = new WJButton("Enter");
		btnEnter.setRequestFocusEnabled(false);
		btnEnter.setFont(tools.Utils.loadFont("Roboto/Roboto-Medium.ttf").deriveFont(Font.PLAIN,20f));
		btnEnter.setBgNorma(new Color(229, 247, 247));
		btnEnter.setBgMouse(new Color(124, 182, 186));
		btnEnter.setBgPress(new Color(182, 237, 203));
		
		JLabel lblTittle = new JLabel("Inventory");
//		lblTittle.setFont(tools.Utils.loadFont("Righteous-Regular.ttf").deriveFont(Font.PLAIN,20f));
		lblTittle.setFont(tools.Utils.loadFont("Sarina-Regular.ttf").deriveFont(Font.PLAIN,40f));
		lblTittle.setForeground(new Color(239, 242, 243));
		
		JLabel lblHelper = new JLabel("Helper");
		lblHelper.setForeground(new Color(239, 242, 243));
		lblHelper.setFont(tools.Utils.loadFont("Righteous-Regular.ttf").deriveFont(Font.PLAIN,20f));
		
		passwordFieldKye = new JPasswordField();
		passwordFieldKye.setHorizontalAlignment(SwingConstants.CENTER);
		passwordFieldKye.setOpaque(false);
		passwordFieldKye.setFont(passwordFieldKye.getFont().deriveFont(23f));
		passwordFieldKye.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(84, 138, 155)));
		passwordFieldKye.setForeground(new Color(248, 252, 253));
		
		GroupLayout gl_panellog = new GroupLayout(panellog);
		gl_panellog.setHorizontalGroup(
			gl_panellog.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panellog.createSequentialGroup()
					.addGap(28)
					.addComponent(passwordFieldKye, GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
					.addGap(29))
				.addGroup(gl_panellog.createSequentialGroup()
					.addContainerGap(38, Short.MAX_VALUE)
					.addComponent(btnEnter, GroupLayout.PREFERRED_SIZE, 74, GroupLayout.PREFERRED_SIZE)
					.addGap(34))
				.addGroup(gl_panellog.createSequentialGroup()
					.addContainerGap(59, Short.MAX_VALUE)
					.addComponent(lblHelper, GroupLayout.PREFERRED_SIZE, 75, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
				.addGroup(Alignment.LEADING, gl_panellog.createSequentialGroup()
					.addGap(43)
					.addComponent(lblTittle)
					.addContainerGap(50, Short.MAX_VALUE))
		);
		gl_panellog.setVerticalGroup(
			gl_panellog.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panellog.createSequentialGroup()
					.addGap(94)
					.addComponent(lblTittle)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblHelper)
					.addGap(40)
					.addComponent(passwordFieldKye, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(btnEnter, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(232, Short.MAX_VALUE))
		);
		panellog.setLayout(gl_panellog);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(43, 78, 80));
		panelContainer.add(panel, BorderLayout.NORTH);
		panel.setLayout(new BorderLayout(0, 0));
		
		// closed button
		WJButton btnClose = new WJButton("");
		btnClose.setMinimumSize(new Dimension(32, 32));
		btnClose.setMaximumSize(new Dimension(32, 32));
		btnClose.setPreferredSize(new Dimension(32, 32));
		btnClose.setIconNormal(new ImageIcon("resources/img/pngicons/x30.png"));
		btnClose.setIconfocus(new ImageIcon("resources/img/pngicons/x32.png"));
		btnClose.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		panel.add(btnClose, BorderLayout.EAST);
	}
	
	private void paintComBack() {
		
	}
}
