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
public class PanelMovement extends javax.swing.JPanel {

    /**
     * Creates new form panelInicio
     */
    public PanelMovement() {
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

        jPanel2 = new javax.swing.JPanel();
        scrollPaneDealings = new javax.swing.JScrollPane();
        tableDealings = new javax.swing.JTable();
        panelButtons = new javax.swing.JPanel();
        btnSeeDetails = new javax.swing.JButton();
        btnModifyMovement = new javax.swing.JButton();
        btnRegisterMovement = new javax.swing.JButton();
        btnDeleteMovement = new javax.swing.JButton();

        setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        setMaximumSize(new java.awt.Dimension(1200, 400));
        setMinimumSize(new java.awt.Dimension(2, 4));
        setPreferredSize(new java.awt.Dimension(600, 200));
        setLayout(new javax.swing.BoxLayout(this, javax.swing.BoxLayout.LINE_AXIS));

        jPanel2.setLayout(new javax.swing.BoxLayout(jPanel2, javax.swing.BoxLayout.LINE_AXIS));

        tableDealings.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "Tipo", "Valor", "Fecha"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        scrollPaneDealings.setViewportView(tableDealings);
        if (tableDealings.getColumnModel().getColumnCount() > 0) {
            tableDealings.getColumnModel().getColumn(0).setResizable(false);
            tableDealings.getColumnModel().getColumn(1).setResizable(false);
            tableDealings.getColumnModel().getColumn(2).setResizable(false);
            tableDealings.getColumnModel().getColumn(3).setResizable(false);
        }

        jPanel2.add(scrollPaneDealings);

        add(jPanel2);

        panelButtons.setLayout(new javax.swing.BoxLayout(panelButtons, javax.swing.BoxLayout.PAGE_AXIS));

        btnSeeDetails.setText("Detallar Movimiento");
        btnSeeDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeeDetailsActionPerformed(evt);
            }
        });
        panelButtons.add(btnSeeDetails);

        btnModifyMovement.setText("Modificar Movimiento");
        btnModifyMovement.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModifyMovementActionPerformed(evt);
            }
        });
        panelButtons.add(btnModifyMovement);

        btnRegisterMovement.setText("Registrar Movimiento");
        panelButtons.add(btnRegisterMovement);

        btnDeleteMovement.setText("Eliminar Movimiento");
        panelButtons.add(btnDeleteMovement);

        add(panelButtons);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSeeDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeeDetailsActionPerformed
        // TODO add your handling code here:
        
        /*
        in = entrada (cuando compro)
        out = salida (cuando vendo)
        
        extin=entrada externa
        extout=salida externa
        
        credit=creditos
        
        if(tipo_de_movimiento_seleccionado == "in" || tipo_de_movimiento_seleccionado == "out"){
        
            DealingsDetails dealingDetails = new DealingsDetails();
            dealingDetails.setVisible(true);  
        }else if (tipo_de_movimiento_seleccionado == "extin" || tipo_de_movimiento_seleccionado == "extout"){
            ExternalPaymentDetails exDetails = new ExternalPaymentDetails();
            exDetails.setVisible(true);  
        }
        */
        ExternalPaymentDetails exDetails = new ExternalPaymentDetails();
        exDetails.setVisible(true);         
    }//GEN-LAST:event_btnSeeDetailsActionPerformed

    private void btnModifyMovementActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModifyMovementActionPerformed
        // TODO add your handling code here:
        /*
        in = entrada (cuando compro)
        out = salida (cuando vendo)
        
        extin=entrada externa
        extout=salida externa
        
        credit=creditos
        */
        /*
        if(tipo_de_movimiento==" X "){
            AbrirFrame datos de compra o ventas
        }*/
        
    }//GEN-LAST:event_btnModifyMovementActionPerformed
     

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDeleteMovement;
    private javax.swing.JButton btnModifyMovement;
    private javax.swing.JButton btnRegisterMovement;
    private javax.swing.JButton btnSeeDetails;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel panelButtons;
    private javax.swing.JScrollPane scrollPaneDealings;
    private javax.swing.JTable tableDealings;
    // End of variables declaration//GEN-END:variables
}
