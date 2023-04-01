/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.madhur;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author 91940
 */
public class Bill extends javax.swing.JFrame {

    /**
     * Creates new form Debit
     */
    Connection connection;
    PreparedStatement preparedStatement;
    private int id;
    private String pinVerify;
    private String s;
    private double balance;
    private double x;

    public Bill() throws ClassNotFoundException, SQLException, FileNotFoundException, IOException {
        initComponents();
        Class.forName("com.mysql.cj.jdbc.Driver");
        connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bms", "root", "1234");
        File file = new File("filename.txt");
        BufferedReader br = new BufferedReader(new FileReader(file));
        String st;
        ArrayList<String> arrayList = new ArrayList<String>();
        while ((st = br.readLine()) != null) {
            arrayList.add(st);
        }
        s = arrayList.get(0);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        home_page = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        bill_amount = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        home_page2 = new javax.swing.JLabel();
        cancel = new javax.swing.JButton();
        confrim = new javax.swing.JButton();
        dropdown = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        pin = new javax.swing.JPasswordField();

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jButton1.setText("Debit");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        home_page.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        home_page.setText("Bill Payment");

        jSeparator2.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator2.setAlignmentX(1.0F);
        jSeparator2.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N

        bill_amount.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        bill_amount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bill_amountActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/madhur/rupee.png"))); // NOI18N

        home_page2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        home_page2.setText("Amount:-");

        cancel.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        cancel.setText("Cancel");
        cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelActionPerformed(evt);
            }
        });

        confrim.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        confrim.setText("Confrim");
        confrim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confrimActionPerformed(evt);
            }
        });

        dropdown.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        dropdown.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Electricity", "Water", "Telephone", "LPG gas" }));
        dropdown.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dropdownActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setText("Bill Type:-");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setText("Pin:-");

        pin.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(confrim)
                                .addGap(31, 31, 31)
                                .addComponent(cancel))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(home_page2)
                                    .addComponent(jLabel3))
                                .addGap(26, 26, 26)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(pin, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel1))
                                    .addComponent(bill_amount, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(49, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(dropdown, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(105, 105, 105)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(home_page))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(home_page)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(dropdown, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bill_amount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(home_page2))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(jLabel3)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(pin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cancel)
                            .addComponent(confrim))
                        .addContainerGap(40, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bill_amountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bill_amountActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bill_amountActionPerformed

    private void cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelActionPerformed
        Menu menu = new Menu();
        menu.show();
        dispose();
    }//GEN-LAST:event_cancelActionPerformed

    public void findUserId() throws ClassNotFoundException, SQLException {
        try {
            preparedStatement = connection.prepareStatement("select id from user where username = ?");
            preparedStatement.setString(1, s);
            ResultSet rs = preparedStatement.executeQuery();

            if (rs.next()) {
                id = rs.getInt("id");
            } else {
                JOptionPane.showMessageDialog(this, "Incorrect username");
            }

        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }

    public void balanceCheck() throws SQLException {
        preparedStatement = connection.prepareStatement("select account_balance from user where username = ?");
        preparedStatement.setString(1, s);
        ResultSet rs = preparedStatement.executeQuery();

        if (rs.next()) {
            balance = rs.getDouble("account_balance");
            try {
                String amt = bill_amount.getText();
                x = Double.parseDouble(amt);
                if (balance - x >= 0) {
                    balance = balance - x;
                    preparedStatement = connection.prepareStatement("update user set account_balance = ? where username = ?");
                    preparedStatement.setDouble(1, balance);
                    preparedStatement.setString(2, s);
                    preparedStatement.executeUpdate();
                } else {
                    JOptionPane.showMessageDialog(this, "insufficient balance");
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Amount number must be integer");
            }

        }
    }

    public void pinVerification() throws SQLException {
        preparedStatement = connection.prepareStatement("select pin from user where username = ?");
        preparedStatement.setString(1, s);
        ResultSet rs = preparedStatement.executeQuery();

        if (rs.next()) {
            pinVerify = rs.getString("pin");
        } else {
            JOptionPane.showMessageDialog(this, "Incorrect username");
        }
    }

    private void confrimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confrimActionPerformed
        try {
            findUserId();
            pinVerification();
            balanceCheck();

            String s = (String.valueOf(dropdown.getSelectedItem()));
            preparedStatement = connection.prepareStatement("insert into transaction(reciever_name,amount,userid,type) values(?,?,?,?)");
            preparedStatement.setString(1, s);
            if (balance - x >= 0) {
                preparedStatement.setString(2, bill_amount.getText());
                preparedStatement.setInt(3, id);
                try {
                    Integer.parseInt(pin.getText());
                    if (pin.getText().length() == 4) {
                        if (pinVerify.equals(pin.getText())) {
                            preparedStatement.setString(4, "bill");
                            preparedStatement.executeUpdate();
                            JOptionPane.showMessageDialog(this, "Bill Payment Successfully");
                            Menu menu = new Menu();
                            menu.show();
                            dispose();
                        } else {
                            JOptionPane.showMessageDialog(this, "Incorrect pin");
                        }
                    } else {
                        JOptionPane.showMessageDialog(this, "Pin contains only 4 digits");
                    }
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(this, "Pin  number must be integer");
                }
            }
        } catch (SQLException | ClassNotFoundException ex) {
            System.out.println(ex);
        }
    }//GEN-LAST:event_confrimActionPerformed

    private void dropdownActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dropdownActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dropdownActionPerformed

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
            java.util.logging.Logger.getLogger(Bill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Bill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Bill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Bill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Bill().setVisible(true);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(Bill.class.getName()).log(Level.SEVERE, null, ex);
                } catch (SQLException ex) {
                    Logger.getLogger(Bill.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IOException ex) {
                    Logger.getLogger(Bill.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField bill_amount;
    private javax.swing.JButton cancel;
    private javax.swing.JButton confrim;
    private javax.swing.JComboBox<String> dropdown;
    private javax.swing.JLabel home_page;
    private javax.swing.JLabel home_page2;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JPasswordField pin;
    // End of variables declaration//GEN-END:variables
}
