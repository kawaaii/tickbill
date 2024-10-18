/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.hridaya.tickbill.view;

import com.hridaya.tickbill.database.DbConnection;
import com.hridaya.tickbill.session.SessionManager;

import java.sql.Connection;

/**
 *
 * @author hridaya
 */
public class MainFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainFrame
     */
    public MainFrame() {
        initComponents();

        this.setExtendedState(MainFrame.MAXIMIZED_BOTH);

        checkDbConnectionStatus();
        loadUserInfo();
        userAccess();
    }

    private void loadUserInfo() {
        String username = SessionManager.getInstance().getUserName();
        int userId = SessionManager.getInstance().getUserId();

        showUserIdLabel.setText(String.valueOf(userId));
        showUserNameLabel.setText(username);
    }

    private void userAccess() {
        SessionManager.userRoleEnum userRole = SessionManager.getInstance().getUserRole();

        if (userRole != SessionManager.userRoleEnum.ADMIN) {
            showUsersButton.setEnabled(false);
            showProductsButton.setEnabled(false);
        }
    }

    private void checkDbConnectionStatus() {
        Connection conn = DbConnection.getConnection();
        if (conn != null) {
            dbConnectionShowStatusLabel.setText("CONNECTED");
        } else {
            dbConnectionShowStatusLabel.setText("DISCONNECTED");
        }
    }

    JPanelLoader jPanelLoader = new JPanelLoader();

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        sideBarButtonGroup = new javax.swing.ButtonGroup();
        sidebarPanel = new javax.swing.JPanel();
        showUsersButton = new javax.swing.JToggleButton();
        showProductsButton = new javax.swing.JToggleButton();
        showInvoiceButton = new javax.swing.JToggleButton();
        showSalesButton = new javax.swing.JToggleButton();
        showReportsButton = new javax.swing.JToggleButton();
        exportImportButton = new javax.swing.JToggleButton();
        panelLoader = new javax.swing.JPanel();
        headerPanel = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        userIdLabel = new javax.swing.JLabel();
        userNameLabel = new javax.swing.JLabel();
        showUserIdLabel = new javax.swing.JLabel();
        showUserNameLabel = new javax.swing.JLabel();
        dbConnectionStatusLabel = new javax.swing.JLabel();
        dbConnectionShowStatusLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        sidebarPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        sideBarButtonGroup.add(showUsersButton);
        showUsersButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        showUsersButton.setText("Users");
        showUsersButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showUsersButtonActionPerformed(evt);
            }
        });

        sideBarButtonGroup.add(showProductsButton);
        showProductsButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        showProductsButton.setText("Products");
        showProductsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showProductsButtonActionPerformed(evt);
            }
        });

        sideBarButtonGroup.add(showInvoiceButton);
        showInvoiceButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        showInvoiceButton.setText("Invoice");
        showInvoiceButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showInvoiceButtonActionPerformed(evt);
            }
        });

        sideBarButtonGroup.add(showSalesButton);
        showSalesButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        showSalesButton.setText("Sales");
        showSalesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showSalesButtonActionPerformed(evt);
            }
        });

        sideBarButtonGroup.add(showReportsButton);
        showReportsButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        showReportsButton.setText("Report");
        showReportsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showReportsButtonActionPerformed(evt);
            }
        });

        sideBarButtonGroup.add(exportImportButton);
        exportImportButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        exportImportButton.setText("Export / Import");
        exportImportButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exportImportButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout sidebarPanelLayout = new javax.swing.GroupLayout(sidebarPanel);
        sidebarPanel.setLayout(sidebarPanelLayout);
        sidebarPanelLayout.setHorizontalGroup(
            sidebarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, sidebarPanelLayout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addGroup(sidebarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(showProductsButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(showInvoiceButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(showSalesButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(exportImportButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(showReportsButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(showUsersButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(20, 20, 20))
        );
        sidebarPanelLayout.setVerticalGroup(
            sidebarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sidebarPanelLayout.createSequentialGroup()
                .addGap(107, 107, 107)
                .addComponent(showUsersButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(showProductsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(showInvoiceButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(showReportsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(showSalesButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(exportImportButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(201, Short.MAX_VALUE))
        );

        getContentPane().add(sidebarPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 199, -1, -1));

        panelLoader.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout panelLoaderLayout = new javax.swing.GroupLayout(panelLoader);
        panelLoader.setLayout(panelLoaderLayout);
        panelLoaderLayout.setHorizontalGroup(
            panelLoaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1502, Short.MAX_VALUE)
        );
        panelLoaderLayout.setVerticalGroup(
            panelLoaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 699, Short.MAX_VALUE)
        );

        getContentPane().add(panelLoader, new org.netbeans.lib.awtextra.AbsoluteConstraints(268, 199, -1, 703));

        headerPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        userIdLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        userIdLabel.setText("User ID:");

        userNameLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        userNameLabel.setText("Username:");

        showUserIdLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        showUserIdLabel.setText("0000");

        showUserNameLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        showUserNameLabel.setText("placeholder");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(userNameLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(showUserNameLabel))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(userIdLabel)
                        .addGap(32, 32, 32)
                        .addComponent(showUserIdLabel)))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(userIdLabel)
                    .addComponent(showUserIdLabel))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(userNameLabel)
                    .addComponent(showUserNameLabel))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout headerPanelLayout = new javax.swing.GroupLayout(headerPanel);
        headerPanel.setLayout(headerPanelLayout);
        headerPanelLayout.setHorizontalGroup(
            headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headerPanelLayout.createSequentialGroup()
                .addContainerGap(1407, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(86, 86, 86))
        );
        headerPanelLayout.setVerticalGroup(
            headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headerPanelLayout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );

        getContentPane().add(headerPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, 1714, -1));

        dbConnectionStatusLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        dbConnectionStatusLabel.setText("Database Connection Status:");
        getContentPane().add(dbConnectionStatusLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(1275, 920, -1, -1));

        dbConnectionShowStatusLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        dbConnectionShowStatusLabel.setText("STATUS");
        getContentPane().add(dbConnectionShowStatusLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(1482, 920, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void showProductsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showProductsButtonActionPerformed
        ProductUI productUI = new ProductUI();
        jPanelLoader.JPanelLoader(panelLoader, productUI);
    }//GEN-LAST:event_showProductsButtonActionPerformed

    private void showInvoiceButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showInvoiceButtonActionPerformed
        InvoiceUI invoiceUI = new InvoiceUI();
        jPanelLoader.JPanelLoader(panelLoader, invoiceUI);
    }//GEN-LAST:event_showInvoiceButtonActionPerformed

    private void showSalesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showSalesButtonActionPerformed
        SaleUI saleUI = new SaleUI();
        jPanelLoader.JPanelLoader(panelLoader, saleUI);
    }//GEN-LAST:event_showSalesButtonActionPerformed

    private void showUsersButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showUsersButtonActionPerformed
        UserUI userUI = new UserUI();
        jPanelLoader.JPanelLoader(panelLoader, userUI);
    }//GEN-LAST:event_showUsersButtonActionPerformed

    private void showReportsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showReportsButtonActionPerformed
        ReportUI reportUI = new ReportUI();
        jPanelLoader.JPanelLoader(panelLoader, reportUI);
    }//GEN-LAST:event_showReportsButtonActionPerformed

    private void exportImportButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exportImportButtonActionPerformed
        ImportExportUI importExportUI = new ImportExportUI();
        jPanelLoader.JPanelLoader(panelLoader, importExportUI);
    }//GEN-LAST:event_exportImportButtonActionPerformed

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
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new MainFrame().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel dbConnectionShowStatusLabel;
    private javax.swing.JLabel dbConnectionStatusLabel;
    private javax.swing.JToggleButton exportImportButton;
    private javax.swing.JPanel headerPanel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel panelLoader;
    private javax.swing.JToggleButton showInvoiceButton;
    private javax.swing.JToggleButton showProductsButton;
    private javax.swing.JToggleButton showReportsButton;
    private javax.swing.JToggleButton showSalesButton;
    private javax.swing.JLabel showUserIdLabel;
    private javax.swing.JLabel showUserNameLabel;
    private javax.swing.JToggleButton showUsersButton;
    private javax.swing.ButtonGroup sideBarButtonGroup;
    private javax.swing.JPanel sidebarPanel;
    private javax.swing.JLabel userIdLabel;
    private javax.swing.JLabel userNameLabel;
    // End of variables declaration//GEN-END:variables
}
