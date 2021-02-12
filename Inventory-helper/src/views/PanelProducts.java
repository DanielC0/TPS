/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

/**
 *
 * @author Daniel
 */
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
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        scrollPaneProducts = new javax.swing.JScrollPane();
        tableProducts = new javax.swing.JTable();
        panelButtons = new javax.swing.JPanel();
        btnRegisterProduct = new javax.swing.JButton();
        btnModifyProduct = new javax.swing.JButton();
        btnDeleteProduct = new javax.swing.JButton();

        setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        setMaximumSize(new java.awt.Dimension(1200, 400));
        setMinimumSize(new java.awt.Dimension(2, 4));
        setPreferredSize(new java.awt.Dimension(600, 200));
        setLayout(new java.awt.BorderLayout());

        tableProducts.setModel(new javax.swing.table.DefaultTableModel(
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

        add(panelButtons, java.awt.BorderLayout.LINE_END);
    }// </editor-fold>//GEN-END:initComponents

    private void btnModifyProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModifyProductActionPerformed
        // TODO add your handling code here:
        new ModifyProduct();
    }//GEN-LAST:event_btnModifyProductActionPerformed

    private void btnDeleteProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteProductActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDeleteProductActionPerformed

    private void btnRegisterProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterProductActionPerformed
        // TODO add your handling code here:
        
        new AddProduct();
    }//GEN-LAST:event_btnRegisterProductActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDeleteProduct;
    private javax.swing.JButton btnModifyProduct;
    private javax.swing.JButton btnRegisterProduct;
    private javax.swing.JPanel panelButtons;
    private javax.swing.JScrollPane scrollPaneProducts;
    private javax.swing.JTable tableProducts;
    // End of variables declaration//GEN-END:variables
}
