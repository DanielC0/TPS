package views;

import java.sql.Statement;

/** 
 *
 * @author Daniel
 */
public class Window extends javax.swing.JFrame {

    /**
     * Creates new form inicio
     */
    
    //Conexion con = new Conexion();
    public Window() {
        initComponents();
        openHome(); 
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        //con.conectar();
    }
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelWindow = new javax.swing.JTabbedPane();
        panelMenu = new javax.swing.JPanel();
        labelTitle = new javax.swing.JLabel();
        btnHome = new javax.swing.JButton();
        btnReports = new javax.swing.JButton();
        btnMovements = new javax.swing.JButton();
        btnProducts = new javax.swing.JButton();
        brtnCredits = new javax.swing.JButton();
        btnClients = new javax.swing.JButton();
        btnSettings = new javax.swing.JButton();
        btnExit = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1200, 600));
        setResizable(false);

        panelWindow.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        panelWindow.setToolTipText("");
        panelWindow.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        panelWindow.setMaximumSize(new java.awt.Dimension(1200, 400));

        labelTitle.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        labelTitle.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        labelTitle.setText("STORE HELPER");
        panelMenu.add(labelTitle);

        btnHome.setText("HOME");
        btnHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHomeActionPerformed(evt);
            }
        });
        panelMenu.add(btnHome);

        btnReports.setText("REPORTS");
        btnReports.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReportsActionPerformed(evt);
            }
        });
        panelMenu.add(btnReports);

        btnMovements.setText("MOVEMENTS");
        btnMovements.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMovementsActionPerformed(evt);
            }
        });
        panelMenu.add(btnMovements);

        btnProducts.setText("PRODUCTS");
        btnProducts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProductsActionPerformed(evt);
            }
        });
        panelMenu.add(btnProducts);

        brtnCredits.setText("CREDITS");
        brtnCredits.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                brtnCreditsActionPerformed(evt);
            }
        });
        panelMenu.add(brtnCredits);

        btnClients.setText("CLIENTS");
        btnClients.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClientsActionPerformed(evt);
            }
        });
        panelMenu.add(btnClients);

        btnSettings.setText("SETTINGS");
        btnSettings.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSettingsActionPerformed(evt);
            }
        });
        panelMenu.add(btnSettings);

        btnExit.setText("EXIT");
        btnExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnExitMouseClicked(evt);
            }
        });
        panelMenu.add(btnExit);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelWindow, javax.swing.GroupLayout.DEFAULT_SIZE, 918, Short.MAX_VALUE)
                    .addComponent(panelMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelWindow, javax.swing.GroupLayout.DEFAULT_SIZE, 357, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(panelMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    views.PanelHome panelHome;            
    public String vpHome="0";
    public void openHome(){
         if(vpHome=="0"){
        panelHome = new views.PanelHome();
        panelWindow.addTab("Caja", panelHome);
        panelWindow.setSelectedComponent(panelHome);
        }else{
            panelWindow.setSelectedComponent(panelHome);
        }
        vpHome="1";
    } 
    views.PanelProducts panelProducts;
    public String vpProducts="0";
    public void openProducts(){ 
        if(vpProducts=="0"){
            panelProducts = new views.PanelProducts();
            panelWindow.addTab("Productos", panelProducts);
            panelWindow.setSelectedComponent(panelProducts);
        }else{
            panelWindow.setSelectedComponent(panelProducts);
        }
        vpProducts="1";
    }
    views.PanelClients panelClients;
    public String vpClients="0";
    public void openClients(){ 
        if(vpClients=="0"){
            panelClients = new views.PanelClients();
            panelWindow.addTab("Clientes", panelClients);
            panelWindow.setSelectedComponent(panelClients);
        }else{
            panelWindow.setSelectedComponent(panelClients);
        }
        vpClients="1";
    }
    views.PanelCredits panelCredits;
    public String vpCredits="0";
    public void openCredits(){ 
        if(vpCredits=="0"){
            panelCredits = new views.PanelCredits();
            panelWindow.addTab("Creditos", panelCredits);
            panelWindow.setSelectedComponent(panelCredits);
        }else{
            panelWindow.setSelectedComponent(panelCredits);
        }
        vpCredits="1";
    }
    views.PanelMovement panelDealings;
    public String vpDealings="0";
    public void openDealings(){ 
        if(vpDealings=="0"){
            panelDealings = new views.PanelMovement();
            panelWindow.addTab("Transacciones", panelDealings);
            panelWindow.setSelectedComponent(panelDealings);
        }else{
            panelWindow.setSelectedComponent(panelDealings);
        }
        vpDealings="1";
    } 
    
    views.PanelSettings panelSettings;
    public String vpSettings="0";
    public void openSettings(){ 
        if(vpSettings=="0"){
            panelSettings = new views.PanelSettings();
            panelWindow.addTab("Ajustes", panelSettings);
            panelWindow.setSelectedComponent(panelSettings);
        }else{
            panelWindow.setSelectedComponent(panelSettings);
        }
        vpSettings="1";
    }

    views.PanelReports panelReports;
    public String vpReports="0";
    public void openReports(){ 
        if(vpReports=="0"){
            panelReports = new views.PanelReports();
            panelWindow.addTab("Informes", panelReports);
            panelWindow.setSelectedComponent(panelReports);
        }else{
            panelWindow.setSelectedComponent(panelReports);
        }
        vpReports="1";
    }
     
    
    
    
    
    
    private void btnHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHomeActionPerformed
        // TODO add your handling code here:
        openHome();
    }//GEN-LAST:event_btnHomeActionPerformed
    
    private void btnProductsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProductsActionPerformed
        // TODO add your handling code here:
        openProducts();
        
    }//GEN-LAST:event_btnProductsActionPerformed

    private void btnReportsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReportsActionPerformed
        // TODO add your handling code here:
        openReports();
    }//GEN-LAST:event_btnReportsActionPerformed

    private void brtnCreditsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_brtnCreditsActionPerformed
        // TODO add your handling code here:
        openCredits();
    }//GEN-LAST:event_brtnCreditsActionPerformed

    private void btnSettingsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSettingsActionPerformed
        // TODO add your handling code here:
        openSettings();
    }//GEN-LAST:event_btnSettingsActionPerformed

    private void btnClientsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClientsActionPerformed
        // TODO add your handling code here:
        openClients();
    }//GEN-LAST:event_btnClientsActionPerformed

    private void btnExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExitMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btnExitMouseClicked

    private void btnMovementsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMovementsActionPerformed
        // TODO add your handling code here:
        openDealings();
    }//GEN-LAST:event_btnMovementsActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Window().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton brtnCredits;
    private javax.swing.JButton btnClients;
    private javax.swing.JLabel btnExit;
    private javax.swing.JButton btnHome;
    private javax.swing.JButton btnMovements;
    private javax.swing.JButton btnProducts;
    private javax.swing.JButton btnReports;
    private javax.swing.JButton btnSettings;
    private javax.swing.JLabel labelTitle;
    private javax.swing.JPanel panelMenu;
    private javax.swing.JTabbedPane panelWindow;
    // End of variables declaration//GEN-END:variables
}
