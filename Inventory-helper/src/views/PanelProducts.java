/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import java.sql.Connection;
import java.sql.ResultSet;
import java.util.Date;

import javax.swing.JOptionPane;

import dao.AdminDAO;
import dao.DealingDAO;
import dao.MovementDAO;
import dao.ProductDAO;
import objs.Dealing;
import objs.Movement;
import objs.Product;
import uistyle.ComprarProducto;
import uistyle.WDefaultTableModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

/**
 *
 * @author Daniel
 */
@SuppressWarnings("serial")
public class PanelProducts extends javax.swing.JPanel {

    /**
     * Creates new form panelInicio
     */
    public PanelProducts() {
        initComponents();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
   
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        scrollPaneProducts = new javax.swing.JScrollPane();
        tableProducts = new javax.swing.JTable();
        panelButtons = new javax.swing.JPanel();
        btnRegisterProduct = new javax.swing.JButton();
        btnModifyProduct = new javax.swing.JButton();
        btnDeleteProduct = new javax.swing.JButton();
        btnCategories = new javax.swing.JButton();

        setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        setMaximumSize(new java.awt.Dimension(1200, 400));
        setMinimumSize(new java.awt.Dimension(2, 4));
        setPreferredSize(new java.awt.Dimension(600, 200));
        setLayout(new java.awt.BorderLayout());
        
        this.getData();
        /*tableProducts.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Nombre", "Cantidad", "Descripción", "Fecha de compra", "Precio de compra", "Precio de venta"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, true, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        */
        scrollPaneProducts.setViewportView(tableProducts);
        if (tableProducts.getColumnModel().getColumnCount() > 0) {
            tableProducts.getColumnModel().getColumn(0).setResizable(false);
            tableProducts.getColumnModel().getColumn(1).setResizable(false);
            tableProducts.getColumnModel().getColumn(2).setResizable(false);
            tableProducts.getColumnModel().getColumn(3).setResizable(false);
            tableProducts.getColumnModel().getColumn(4).setResizable(false);
            tableProducts.getColumnModel().getColumn(5).setResizable(false);
            tableProducts.getColumnModel().getColumn(6).setResizable(false);
        }

        add(scrollPaneProducts, java.awt.BorderLayout.CENTER);

        panelButtons.setLayout(new java.awt.GridLayout(0, 1));

        btnRegisterProduct.setText("Registrar Producto");
        btnRegisterProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterProductActionPerformed(evt);
            }
        });
        
        btnagregarCatidad = new JButton("Agregar compra");
        btnagregarCatidad.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent arg0) {
        		addQuantity();
        	}
        });
        panelButtons.add(btnagregarCatidad);
        panelButtons.add(btnRegisterProduct);

        btnModifyProduct.setText("Modificar Producto");
        btnModifyProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModifyProductActionPerformed(evt);
            }
        });
        panelButtons.add(btnModifyProduct);

        btnDeleteProduct.setText("Eliminar Producto");
        btnDeleteProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteProductActionPerformed(evt);
            }
        });
        panelButtons.add(btnDeleteProduct);

        btnCategories.setText("Categorias");
        btnCategories.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCategoriesActionPerformed(evt);
            }
        });
        panelButtons.add(btnCategories);

        add(panelButtons, java.awt.BorderLayout.LINE_END);
    }// </editor-fold>//GEN-END:initComponents

 

	private void btnModifyProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModifyProductActionPerformed
    	int rwSelect = tableProducts.getSelectedRow();
    	if (rwSelect >= 0) {
    		Product ptmp = new Product(
        			(Integer)tableProducts.getValueAt(rwSelect, 0),
        			tableProducts.getValueAt(rwSelect, 1).toString(),
        			Double.valueOf(tableProducts.getValueAt(rwSelect, 2).toString()), 
        			tableProducts.getValueAt(rwSelect, 3).toString(), 
        			Double.valueOf(tableProducts.getValueAt(rwSelect, 4).toString()), 
        			Double.valueOf(tableProducts.getValueAt(rwSelect, 5).toString()), 
        			Integer.valueOf(tableProducts.getValueAt(rwSelect, 6).toString()));
    		ptmp.categoryname = tableProducts.getValueAt(rwSelect, 7).toString();
//    		Product prd = new Product(id, name, stock, desc, cpp, price, catid);
//    		System.out.println(tableProducts.getValueAt(rwSelect, 0));
//    		Product prd = new Product((Integer)tableProducts.getValueAt(rwSelect, 1),"", 0, "", 0, 0, 1);
    		new ModifyProduct(ptmp).pnlProd = this;
    	}else {
    		JOptionPane.showMessageDialog(null, "Selecione una fila de resitro a modificar", "Alerta", JOptionPane.WARNING_MESSAGE);
    	}
    	 
    	
        
    }//GEN-LAST:event_btnModifyProductActionPerformed

    private void btnDeleteProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteProductActionPerformed
    	int selectr = tableProducts.getSelectedRow();
    	if(selectr >=0) { 
    		if (JOptionPane.showConfirmDialog(null, "¿Desea elimnar el producto" +tableProducts.getValueAt(selectr, 1).toString() + "?") == JOptionPane.OK_OPTION) {
    			ProductDAO.delete(new Product((Integer)tableProducts.getValueAt(selectr, 0),
        				"", 0, "", 0, 0, 0));
    			this.getData();
    		}
    	}else {
    		JOptionPane.showMessageDialog(null, "Seleccione un registro a eliminar", "Alerta", JOptionPane.WARNING_MESSAGE);
    	}
    }//GEN-LAST:event_btnDeleteProductActionPerformed

    private void btnRegisterProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterProductActionPerformed
    	
        new AddProduct().panlPrd = this;
    }//GEN-LAST:event_btnRegisterProductActionPerformed

    private void btnCategoriesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCategoriesActionPerformed
    	System.out.println("");
        CategoriesDetails category = new CategoriesDetails();
        category.setVisible(true);
    }//GEN-LAST:event_btnCategoriesActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCategories;
    private javax.swing.JButton btnDeleteProduct;
    private javax.swing.JButton btnModifyProduct;
    private javax.swing.JButton btnRegisterProduct;
    private javax.swing.JPanel panelButtons;
    private javax.swing.JScrollPane scrollPaneProducts;
    private javax.swing.JTable tableProducts;
    private JButton btnagregarCatidad;
    // End of variables declaration//GEN-END:variables
    
    
    
    /////////////////////////////////BACKEND /////////////////////////////////
    /***
	 * Update the category table 
	 */
	public void getData() {
//		ArrayList<objs.Product> products = dao.ProductDAO.read();
//		ArrayList<objs.Product> products = dao.ProductDAO.read("select ");
//		select product.id, product.name, product.stock, product.description, product.cpp, product.price, product.category,
//		category.name from product join categry on product.category = category.id
		
		// lod table model
		WDefaultTableModel modeltb = new WDefaultTableModel(
				new String [] {"id", "Nombre","cantidad" ,"description", "costo P.P.","Precio","idCat","Categoria"});
		Connection conn = null;
		try {
			//get Connection
			conn = AdminDAO.getConnection();
			//put sql
			ResultSet rs =null;
			rs = conn.createStatement().executeQuery(
					"select product.id, product.name, product.stock, product.description, product.cpp, product.price, product.category, category.name from product join category on product.category = category.id" );
			
			// load products
			while (rs.next()) {
				modeltb.addRow( new Object[] {rs.getInt(1), rs.getString(2), rs.getDouble(3), rs.getString(4), rs.getDouble(5), rs.getDouble(6), rs.getInt(7),rs.getString(8)});
			}
			AdminDAO.closeConnection();
		} catch (Exception e) {
			System.out.println("error to select into product " + e);
			e.printStackTrace();
		}
		
		tableProducts.setModel(modeltb);
		// change calls and sizes
		
		WDefaultTableModel.setJTableColumnsWidth(tableProducts, 800, 10,200,200,200,200,200,200,200);
//		WDefaultTableModel.wrapCell(tableProducts, 4);
	}
	
	
	/**
	 * add quantity to product
	 */
	private void addQuantity() {
		int slctR = tableProducts.getSelectedRow();
		if (slctR >= 0) {
			showAddDialog(slctR);
		}else {
			JOptionPane.showMessageDialog(null, "Seleccione el producto al que le desea agregar existencias", "Alert", JOptionPane.WARNING_MESSAGE);
		}
	}

	private void showAddDialog(int row) {
		ComprarProducto panelComp = new ComprarProducto();
		// load data
		Product prodGet = new Product(
				Integer.valueOf( tableProducts.getValueAt(row, 0).toString()),
				tableProducts.getValueAt(row, 1).toString(), 
				Double.valueOf( tableProducts.getValueAt(row, 2).toString()),
				tableProducts.getValueAt(row, 3).toString(),
				Double.valueOf(tableProducts.getValueAt(row, 4).toString()), 
				Double.valueOf(tableProducts.getValueAt(row, 5).toString()), 
				Integer.valueOf( tableProducts.getValueAt(row, 6).toString())
				);
		panelComp.txfProductName.setText(prodGet.getName());
		panelComp.txfProductQuant.setText(String.valueOf( prodGet.getStock()));
		while (true) {
			int result = JOptionPane.showConfirmDialog(
					this, 
					panelComp,
					"Ingrese los datos necesarios para agregar una compra",
					JOptionPane.OK_CANCEL_OPTION
					);
			
			if (result == JOptionPane.OK_OPTION) {
				
				if(tools.Utils.noempryString(panelComp.txfPuncharsePrice.getText(), 1) &&
						tools.Utils.noempryString(panelComp.txfNewQuantity.getText(), 1) &&
						tools.Utils.noempryString(panelComp.txfUnitPrice.getText(), 1) &&
						panelComp.dCFechaCompra.getDate() != null
						) {
					try {
						double cant = Double.valueOf(panelComp.txfNewQuantity.getText());
						double precioT = Double.valueOf(panelComp.txfPuncharsePrice.getText());
						
						Date fecha = panelComp.dCFechaCompra.getDate();
						
						// create movement and delai
						MovementDAO.create(new Movement(0, "in", precioT, fecha));
						int lastM = MovementDAO.readLastM();
						
						// calculate CPP
						double costoCPP = (prodGet.getCpp() * prodGet.getStock() +  precioT) / (prodGet.getStock() + cant);
						
						DealingDAO.create(new Dealing(0, prodGet.getId(), cant, costoCPP, lastM));
						break;
						
					} catch (Exception e) {
						JOptionPane.showMessageDialog(null, "Alguno de los campos no son validos, verifique el contenido", "Alert", JOptionPane.WARNING_MESSAGE);
					}
					
				}else {
					JOptionPane.showMessageDialog(null, "Alguno de los campos no son validos, verifique el contenido", "Alert", JOptionPane.ERROR_MESSAGE);
				}
			}else {
				break;
			}
		}
		
		
		
	}
}
