/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.hridaya.tickbill.view;

import com.hridaya.tickbill.database.DbConnection;
import jdk.jshell.execution.Util;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;

/**
 *
 * @author hridaya
 */
public class UserUI extends javax.swing.JPanel {

    /**
     * Creates new form UserUI
     */
    public UserUI() {
        initComponents();
        userLoad();
    }

    public void userLoad() {
        try {
            DefaultTableModel dtm = (DefaultTableModel) userTable.getModel();
            dtm.setRowCount(0);

            Statement st = DbConnection.getConnection().createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM user");
            while (rs.next()) {
                Vector v = new Vector();
                v.add(rs.getString(1));
                v.add(rs.getString(2));
                v.add(rs.getString(3));
                v.add(rs.getString(4));

                dtm.addRow(v);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        userTable = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        userUpdateButton = new javax.swing.JButton();
        userLabel = new javax.swing.JLabel();
        userPasswordTextField = new javax.swing.JTextField();
        userSearchButton = new javax.swing.JButton();
        userPasswordLabel = new javax.swing.JLabel();
        userIdLabel = new javax.swing.JLabel();
        userTextField = new javax.swing.JTextField();
        userSaveButton = new javax.swing.JButton();
        userIdTextField = new javax.swing.JTextField();
        userDeleteButton = new javax.swing.JButton();
        userRoleLabel = new javax.swing.JLabel();
        userRoleComboBox = new javax.swing.JComboBox<>();

        setPreferredSize(new java.awt.Dimension(1506, 4));

        userTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "Username", "Role", "Password"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(userTable);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        userUpdateButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        userUpdateButton.setText("Update");
        userUpdateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userUpdateButtonActionPerformed(evt);
            }
        });

        userLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        userLabel.setText("Username:");

        userSearchButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        userSearchButton.setText("Search");
        userSearchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userSearchButtonActionPerformed(evt);
            }
        });

        userPasswordLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        userPasswordLabel.setText("Password:");

        userIdLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        userIdLabel.setText("Search ID:");

        userSaveButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        userSaveButton.setText("Create");
        userSaveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userSaveButtonActionPerformed(evt);
            }
        });

        userDeleteButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        userDeleteButton.setText("Delete");
        userDeleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userDeleteButtonActionPerformed(evt);
            }
        });

        userRoleLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        userRoleLabel.setText("Role:");

        userRoleComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Admin", "Employee" }));
        userRoleComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userRoleComboBoxActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addComponent(userSaveButton)
                            .addGap(18, 18, 18)
                            .addComponent(userSearchButton)
                            .addGap(18, 18, 18)
                            .addComponent(userUpdateButton)
                            .addGap(18, 18, 18)
                            .addComponent(userDeleteButton))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(userPasswordLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(userLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(userIdLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(userIdTextField)
                                .addComponent(userTextField)
                                .addComponent(userPasswordTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(userRoleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(userRoleComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(userIdLabel)
                    .addComponent(userIdTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(59, 59, 59)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(userLabel)
                    .addComponent(userTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(userPasswordLabel)
                    .addComponent(userPasswordTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(userRoleLabel)
                    .addComponent(userRoleComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(userSaveButton)
                    .addComponent(userSearchButton)
                    .addComponent(userUpdateButton)
                    .addComponent(userDeleteButton))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(100, 100, 100)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(493, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 431, Short.MAX_VALUE))
                .addContainerGap(168, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void userSearchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userSearchButtonActionPerformed
        String userId = userIdTextField.getText();
        String sql = "SELECT name, password, role_id FROM user WHERE id = ?";

        try (PreparedStatement ps = DbConnection.getConnection().prepareStatement(sql)) {
            ps.setString(1, userId);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                String username = rs.getString("name");
                String password = rs.getString("password");
                int role = rs.getInt("role_id");

                userTextField.setText(username);
                userPasswordTextField.setText(password);
                userRoleComboBox.setSelectedItem(role);
            } else {
                Utils.showError("User not found", null);
            }
        } catch (SQLException sqle) {
            Utils.showError("Error searching user", sqle, null);
        }
    }//GEN-LAST:event_userSearchButtonActionPerformed

    private void userSaveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userSaveButtonActionPerformed
        String username = userTextField.getText();
        String password = userPasswordTextField.getText();
        int role = userRoleComboBox.getSelectedIndex() + 1;
        String sql = "INSERT INTO user(name, password, role_id) VALUES (?, ?, ?)";

        try (PreparedStatement ps = DbConnection.getConnection().prepareStatement(sql)) {
            ps.setString(1, username);
            ps.setString(2, password);
            ps.setInt(3, role);
            ps.executeUpdate();
            Utils.showInfo("User created successfully", null);
        } catch (SQLException sqle) {
            Utils.showError("Error saving user", sqle, null);
        }
        userLoad();
    }//GEN-LAST:event_userSaveButtonActionPerformed

    private void userUpdateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userUpdateButtonActionPerformed
        String userId = userIdTextField.getText();
        String username = userTextField.getText();
        String password = userPasswordTextField.getText();
        int role = userRoleComboBox.getSelectedIndex() + 1;
        String sql = "UPDATE user SET name = ?, password = ?, role_id = ? WHERE id = ?";

        try (PreparedStatement ps = DbConnection.getConnection().prepareStatement(sql)) {
            ps.setString(1, username);
            ps.setString(2, password);
            ps.setInt(3, role);
            ps.setString(4, userId);
            ps.executeUpdate();
            Utils.showInfo("User updated successfully", null);
        } catch (SQLException sqle) {
            Utils.showError("Error updating user", sqle, null);
        }
        userLoad();
    }//GEN-LAST:event_userUpdateButtonActionPerformed

    private void userDeleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userDeleteButtonActionPerformed
        String userId = userIdTextField.getText().trim();
        String sql = "DELETE FROM user WHERE id = ?";

        if (userId.isEmpty()) {
            Utils.showError("Enter userId", null);
            return;
        }

        try (PreparedStatement ps = DbConnection.getConnection().prepareStatement(sql)) {
            ps.setString(1, userId);
            ps.executeUpdate();
            Utils.showInfo("User deleted successfully", null);
        } catch (SQLException sqle) {
            Utils.showError("Error deleting user", sqle, null);
        }
        userLoad();
    }//GEN-LAST:event_userDeleteButtonActionPerformed

    private void userRoleComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userRoleComboBoxActionPerformed
        // TODO
    }//GEN-LAST:event_userRoleComboBoxActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton userDeleteButton;
    private javax.swing.JLabel userIdLabel;
    private javax.swing.JTextField userIdTextField;
    private javax.swing.JLabel userLabel;
    private javax.swing.JLabel userPasswordLabel;
    private javax.swing.JTextField userPasswordTextField;
    private javax.swing.JComboBox<String> userRoleComboBox;
    private javax.swing.JLabel userRoleLabel;
    private javax.swing.JButton userSaveButton;
    private javax.swing.JButton userSearchButton;
    private javax.swing.JTable userTable;
    private javax.swing.JTextField userTextField;
    private javax.swing.JButton userUpdateButton;
    // End of variables declaration//GEN-END:variables
}
