/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.hridaya.tickbill.view;

import com.hridaya.tickbill.database.CSVConverter;
import com.hridaya.tickbill.database.DbConnection;

import java.io.File;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author hridaya
 */
public class ImportExportUI extends javax.swing.JPanel {

    /**
     * Creates new form ImportExportUI
     */
    public ImportExportUI() {
        initComponents();
        fileChooser.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        exportButton = new javax.swing.JButton();
        importButton = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        invoiceDetailCheckBox = new javax.swing.JCheckBox();
        userDetailCheckBox = new javax.swing.JCheckBox();
        inventoryDetailCheckBox = new javax.swing.JCheckBox();
        fileChooser = new javax.swing.JFileChooser();
        jLabel1 = new javax.swing.JLabel();

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        exportButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        exportButton.setText("Export");
        exportButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exportButtonActionPerformed(evt);
            }
        });

        importButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        importButton.setText("Import");
        importButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                importButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(importButton, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(exportButton, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(importButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(exportButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        buttonGroup1.add(invoiceDetailCheckBox);
        invoiceDetailCheckBox.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        invoiceDetailCheckBox.setText("Invoice Details");

        buttonGroup1.add(userDetailCheckBox);
        userDetailCheckBox.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        userDetailCheckBox.setText("User Details");

        buttonGroup1.add(inventoryDetailCheckBox);
        inventoryDetailCheckBox.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        inventoryDetailCheckBox.setText("Inventory");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(userDetailCheckBox)
                .addGap(18, 18, 18)
                .addComponent(inventoryDetailCheckBox)
                .addGap(18, 18, 18)
                .addComponent(invoiceDetailCheckBox)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(userDetailCheckBox)
                    .addComponent(inventoryDetailCheckBox)
                    .addComponent(invoiceDetailCheckBox))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(107, 107, 107))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Export can be done one at a time");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jLabel1)))
                .addGap(18, 18, 18)
                .addComponent(fileChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(66, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(fileChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1)))
                .addContainerGap(342, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void exportButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exportButtonActionPerformed
        CSVConverter csvExporter = new CSVConverter();
        if (userDetailCheckBox.isSelected()
                || invoiceDetailCheckBox.isSelected()
                || inventoryDetailCheckBox.isSelected()) {
            fileChooser.setVisible(true);
            fileChooser.showSaveDialog(this);

            try {
                File selectedFile = fileChooser.getSelectedFile();
                String filePath = selectedFile.getAbsolutePath();

                if (!filePath.toLowerCase().endsWith(".csv")) {
                    filePath += ".csv";
                }

                List<String> sqlQueries = new ArrayList<>();
                if (userDetailCheckBox.isSelected()) {
                    sqlQueries.add("SELECT * FROM user");
                }
                if (invoiceDetailCheckBox.isSelected()) {
                    sqlQueries.add("SELECT * FROM sales_history");
                }
                if (inventoryDetailCheckBox.isSelected()) {
                    sqlQueries.add("SELECT * FROM inventory");
                }

                for (String sql : sqlQueries) {
                    csvExporter.exportAsCSV(sql, filePath);
                }
            } catch (Exception e) {
                Utils.showError("Operation cancelled by user.");
            }
        } else {
            Utils.showError("Select at least one option from above checkboxes.");
        }
    }//GEN-LAST:event_exportButtonActionPerformed

    private void importButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_importButtonActionPerformed
        CSVConverter csvImporter = new CSVConverter();
        if (userDetailCheckBox.isSelected() || invoiceDetailCheckBox.isSelected() || inventoryDetailCheckBox.isSelected()) {
            fileChooser.setVisible(true);
            fileChooser.showOpenDialog(this);
            try {
                File selectedFile = fileChooser.getSelectedFile();
                String filePath = selectedFile.getAbsolutePath();

                if (filePath.toLowerCase().endsWith(".csv")) {
                    List<String> sqlQueries = new ArrayList<>();
                    if (userDetailCheckBox.isSelected()) {
                        // delete existing data from user table
                        try (Statement st = DbConnection.getConnection().createStatement()){
                            st.executeUpdate("DELETE FROM user");
                            st.close();
                        } catch (SQLException e) {
                            Utils.showError(e.getMessage());
                        }
                        sqlQueries.add("INSERT INTO user (user_id, first_name, last_name, username, password, "
                                + "user_role, user_address, user_email, phone_no) VALUES "
                                + "(?,?,?,?,?,?,?,?,?)");
                    }
                    if (invoiceDetailCheckBox.isSelected()) {
                        // delete existing data from sales_history table
                        try (Statement st = DbConnection.getConnection().createStatement()) {
                            st.executeUpdate("DELETE FROM sales_history");
                            st.close();
                        } catch (SQLException e) {
                            Utils.showError(e.getMessage());
                        }
                        sqlQueries.add("INSERT INTO sales_history (id, user_id, SN, invoice_id, customer_name, product_name, "
                                + "product_rate, product_quantity, product_price, total_bill) VALUES "
                                + "(?,?,?,?,?,?,?,?,?,?)");
                    }
                    if (inventoryDetailCheckBox.isSelected()) {
                        // delete existing data from inventory table
                        try (Statement st = DbConnection.getConnection().createStatement()) {
                            st.executeUpdate("DELETE FROM inventory");
                            st.close();
                        } catch (SQLException e) {
                            Utils.showError(e.getMessage());
                        }
                        sqlQueries.add("INSERT INTO inventory (product_id, product_name, product_rate, "
                                + "product_quantity) VALUES (?,?,?,?)");
                    }

                    for (String sql : sqlQueries) {
                        csvImporter.importCSV(sql, filePath);
                    }
                }
            } catch (Exception ex) {
                Utils.showError("Operation cancelled by user.");
            }
        } else {
            Utils.showError("Select at least one option from above checkboxes.");
        }
    }//GEN-LAST:event_importButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton exportButton;
    private javax.swing.JFileChooser fileChooser;
    private javax.swing.JButton importButton;
    private javax.swing.JCheckBox inventoryDetailCheckBox;
    private javax.swing.JCheckBox invoiceDetailCheckBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JCheckBox userDetailCheckBox;
    // End of variables declaration//GEN-END:variables
}
