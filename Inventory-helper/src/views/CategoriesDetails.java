/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import dao.AdminDAO;
import dao.CategoryDAO;
import objs.Category;
import uistyle.WDefaultTableModel;

/**
 *
 * @author Daniel
 */
@SuppressWarnings("serial")
public class CategoriesDetails extends javax.swing.JFrame {

	/**
	 * Creates new form Categories
	 */
	public CategoriesDetails() {
		initComponents();
		//        this.setSize(400,600);
		this.setLocationRelativeTo(null);
	}

	/**
	 * This method is called from within the constructor to initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is always
	 * regenerated by the Form Editor.
	 */
	
	// <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
	private void initComponents() {

		jPanel1 = new javax.swing.JPanel();
		jPanel2 = new javax.swing.JPanel();
		jScrollPane1 = new javax.swing.JScrollPane();
		jTableCats = new javax.swing.JTable();
		jPanel3 = new javax.swing.JPanel();
		btnAdd = new javax.swing.JButton();
		btnModify = new javax.swing.JButton();
		btnDelete = new javax.swing.JButton();
		btnClose = new javax.swing.JButton();

		setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
		getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.LINE_AXIS));

		jPanel1.setLayout(new javax.swing.BoxLayout(jPanel1, javax.swing.BoxLayout.LINE_AXIS));

		javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
		jPanel2.setLayout(jPanel2Layout);
		jPanel2Layout.setHorizontalGroup(
				jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGap(0, 0, Short.MAX_VALUE)
				);
		jPanel2Layout.setVerticalGroup(
				jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGap(0, 300, Short.MAX_VALUE)
				);

		jPanel1.add(jPanel2);
		
		// call construct witch query 
		this.getData();
		
//		jTableCats.setModel(new javax.swing.table.DefaultTableModel(
//				new Object [][] {
//					{null},
//					{null},
//					{null},
//					{null}
//				},
//				new String [] {
//						"Nombre"
//				}
//				) {
//			Class[] types = new Class [] {
//					java.lang.String.class
//			};
//			boolean[] canEdit = new boolean [] {
//					false
//			};
//
//			public Class getColumnClass(int columnIndex) {
//				return types [columnIndex];
//			}
//
//			public boolean isCellEditable(int rowIndex, int columnIndex) {
//				return canEdit [columnIndex];
//			}
//		});
		
		jScrollPane1.setViewportView(jTableCats);
		if (jTableCats.getColumnModel().getColumnCount() > 0) {
			jTableCats.getColumnModel().getColumn(0).setResizable(false);
		}

		jPanel1.add(jScrollPane1);

		btnAdd.setText("Agregar");
		btnAdd.addActionListener(new ActionListener() {	
			@Override
			public void actionPerformed(ActionEvent arg0) {
				showCreateDialog();
			}
		});;

		btnModify.setText("Modificar");
		btnModify.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				modificateDialog();
			}
		});

		btnDelete.setText("Eliminar");
		btnDelete.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				deleteCateDialog();
			}
		});

		btnClose.setText("Cerrar");
		btnClose.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				btnCloseActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
		jPanel3.setLayout(jPanel3Layout);
		jPanel3Layout.setHorizontalGroup(
				jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel3Layout.createSequentialGroup()
						.addGap(0, 0, Short.MAX_VALUE)
						.addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
								.addComponent(btnModify, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(btnAdd, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(btnDelete, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
				.addGroup(jPanel3Layout.createSequentialGroup()
						.addContainerGap()
						.addComponent(btnClose)
						.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
				);
		jPanel3Layout.setVerticalGroup(
				jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel3Layout.createSequentialGroup()
						.addGap(43, 43, 43)
						.addComponent(btnAdd)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
						.addComponent(btnModify)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
						.addComponent(btnDelete)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 99, Short.MAX_VALUE)
						.addComponent(btnClose)
						.addContainerGap())
				);

		jPanel1.add(jPanel3);

		getContentPane().add(jPanel1);

		pack();
	}// </editor-fold>//GEN-END:initComponents

	private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed
		// TODO add your handling code here:
		this.dispose();
	}//GEN-LAST:event_btnCloseActionPerformed

	/**
	 * @param args the command line arguments
	 */
	public static void main(String args[]) {
		/* Set the Nimbus look and feel */
		//<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
		/* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
		 * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
		 */
		try {
			for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
				if ("Nimbus".equals(info.getName())) {
					javax.swing.UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (ClassNotFoundException ex) {
			java.util.logging.Logger.getLogger(CategoriesDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(CategoriesDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(CategoriesDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(CategoriesDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
		//</editor-fold>
		//</editor-fold>

		/* Create and dis	play the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new CategoriesDetails().setVisible(true);
			}
		});
		
		
	}

	// Variables declaration - do not modify//GEN-BEGIN:variables
	private javax.swing.JButton btnAdd;
	private javax.swing.JButton btnClose;
	private javax.swing.JButton btnDelete;
	private javax.swing.JButton btnModify;
	private javax.swing.JPanel jPanel1;
	private javax.swing.JPanel jPanel2;
	private javax.swing.JPanel jPanel3;
	private javax.swing.JScrollPane jScrollPane1;
	private javax.swing.JTable jTableCats;
	// End of variables declaration//GEN-END:variables


	///////////////////////// BACKEND ////////////////////////////////////////////////

	/***
	 * Update the category table 
	 */
	public void getData() {
		ArrayList<objs.Category> cats =  dao.CategoryDAO.read();
		AdminDAO.closeConnection();
		//oad talbe model
		WDefaultTableModel modeltb = new WDefaultTableModel(new String [] {"id", "Nombre", "description"});
		// load categories
		for (int i = 0; i < cats.size(); i++) {
			Category catTemp = cats.get(i);
			modeltb.addRow(new Object[] {catTemp.getId(), catTemp.getName(), catTemp.getDescription()});
		}
		// change calls and sizes
		jTableCats.setModel(modeltb);
		WDefaultTableModel.setJTableColumnsWidth(jTableCats, 500, 100,200,200);
		WDefaultTableModel.wrapCell(jTableCats, 2);
		
	}
	
	/**
	 * allow iteractue, and add diferents categories
	 */
	public void showCreateDialog() {
		JTextField txfName = new JTextField(7);
		JTextArea txaDescr = new JTextArea();
		txaDescr.setColumns(20);
		txaDescr.setRows(8);
		JPanel containerC = new JPanel(), containerB = new JPanel(), containerF = new JPanel();
		JLabel alert =  new JLabel("");
		containerC.setLayout(new GridLayout(2,2,12,8));
		containerC.add(new JLabel("Name"));
		containerC.add(txfName);
		containerC.add(new JLabel("Description"));
		containerC.add(alert);
		containerB.add(txaDescr);
		
		containerF.setLayout(new BorderLayout());
		containerF.add(containerC,BorderLayout.CENTER);
		containerF.add(containerB,BorderLayout.SOUTH);
		
		// start input infrmation
		while (true) {
			// input dialog
			int result = JOptionPane.showConfirmDialog(
					this, 
					containerF,
					"Ingrese la informacion necesaria",
					JOptionPane.OK_CANCEL_OPTION
					);
			// validations
			if (result == JOptionPane.OK_OPTION) {
				
				// start insert trasaction
				// probe the name content
				if (tools.Utils.noempryString(txfName.getText(), 3)) {
					// start inset
					if (CategoryDAO.create(new Category(0, txfName.getText(), txaDescr.getText())) > 0) {
						AdminDAO.closeConnection();
						alert.setForeground(Color.green);
						alert.setText("Categoria guardada con exito!!");
						txfName.setText("");
						txaDescr.setText("");
						this.getData();
					}else {
						alert.setForeground(Color.red);
						alert.setText("Ocurrio un error inesperado, intentelo luego");
						break;
					}
					
				}else {
					JOptionPane.showMessageDialog(null, "El campo de nombre debe de estar diligenciado y con más de 3 caracteres","No se ha podido guardar",JOptionPane.ERROR_MESSAGE);
					alert.setForeground(Color.red);
					alert.setText("El campo de nombre es obligatorio");
				}
			}else {
				break;
			}
		}
		
		
	}
	
	/***
	 * allow modificate the category
	 */
	public void modificateDialog() {
		// try get table values
		int rwselect = jTableCats.getSelectedRow();
		// exsit selection
		if (rwselect >= 0){
			// generate the posible edit
			JTextField txfName = new JTextField(7);
			JTextArea txaDescr = new JTextArea();
			// get tble value
			int idCategory = (Integer) jTableCats.getValueAt(rwselect, 0);
			txfName.setText(jTableCats.getValueAt(rwselect, 1).toString());
			txaDescr.setText(jTableCats.getValueAt(rwselect, 2).toString());
			txaDescr.setColumns(20);
			txaDescr.setRows(8);
			JPanel containerC = new JPanel(), containerB = new JPanel(), containerF = new JPanel();
			JLabel alert =  new JLabel("");
			containerC.setLayout(new GridLayout(2,2,12,8));
			containerC.add(new JLabel("Name"));
			containerC.add(txfName);
			containerC.add(new JLabel("Description"));
			containerC.add(alert);
			containerB.add(txaDescr);
			
			containerF.setLayout(new BorderLayout());
			containerF.add(containerC,BorderLayout.CENTER);
			containerF.add(containerB,BorderLayout.SOUTH);
			// start input infrmation
			while (true) {
				// input dialog
				int result = JOptionPane.showConfirmDialog(
						this, 
						containerF,
						"Ingrese la informacion necesaria",
						JOptionPane.OK_CANCEL_OPTION
						);
				// validations
				if (result == JOptionPane.OK_OPTION) {
					
					// start update trasactiion
					// probe the name content
					if (tools.Utils.noempryString(txfName.getText(), 3)) {
						// start update
						
						CategoryDAO.update(new Category(idCategory, txfName.getText(), txaDescr.getText()));
						AdminDAO.closeConnection();
						alert.setForeground(Color.green);
						alert.setText("Categoria guardada con exito!!");
						this.getData();
						break;
						
					}else {
						JOptionPane.showMessageDialog(null, "El campo de nombre debe de estar diligenciado y con más de 3 caracteres","No se ha podido guardar",JOptionPane.ERROR_MESSAGE);
						alert.setForeground(Color.red);
						alert.setText("El campo de nombre es obligatorio");
					}
				}else {
					break;
				}
			}
		}else {
			// not select row
			JOptionPane.showMessageDialog(null, "Selecciones un regustro para modificarlo", "No ha seleccionado ",JOptionPane.WARNING_MESSAGE);
		}
		 
	}
	
	/**
	 * allow delete the selected category
	 */
	public void deleteCateDialog() {
		int rwselect = jTableCats.getSelectedRow();
		// exsit selection
		if (rwselect >= 0) {
			// get information of table
			String nameCd = jTableCats.getValueAt(rwselect, 1).toString() , descDc = jTableCats.getValueAt(rwselect, 2).toString();
			int idDc = (Integer) jTableCats.getValueAt(rwselect, 0);
			int rsp = JOptionPane.showConfirmDialog(null, "¿Esta seguro de eliminar la categoria ' "+nameCd+"'?", "Alerta!", JOptionPane.YES_NO_OPTION);
			if (rsp == JOptionPane.OK_OPTION) {
				CategoryDAO.delete(new Category(idDc, nameCd, descDc));
				AdminDAO.closeConnection();
				this.getData();
			}
		}else {
			JOptionPane.showMessageDialog(null, "Selecciones un regustro para modificarlo", "No ha seleccionado ",JOptionPane.WARNING_MESSAGE);
		}
	}
	
	
	
	
	
	
}
