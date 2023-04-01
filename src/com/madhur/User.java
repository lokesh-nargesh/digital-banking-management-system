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

/**
 *
 * @author 91940
 */
public class User extends javax.swing.JFrame {

    /**
     * Creates new form login
     */
    private Connection connection;
    private PreparedStatement preparedStatement;
    private String s;

    public User() throws ClassNotFoundException, SQLException, FileNotFoundException, IOException {
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
        getDetails();
    }

    private void getDetails() {
        try {
            // TODO add your handling code here:
            preparedStatement = connection.prepareStatement("select * from user where username = ?");
            preparedStatement.setString(1, s);
            ResultSet rs = preparedStatement.executeQuery();

            if (rs.next()) {
                enter_username.setText(rs.getString("username"));
                enter_username.setEditable(false);
                first_name.setText(rs.getString("first_name"));
                first_name.setEditable(false);
                last_name.setText(rs.getString("last_name"));
                last_name.setEditable(false);
                mobile_number.setText(rs.getString("mobile"));
                mobile_number.setEditable(false);
                email.setText(rs.getString("email"));
                email.setEditable(false);
                dob.setText(rs.getString("dob"));
                dob.setEditable(false);
                address.setText(rs.getString("address"));
                address.setEditable(false);
                adhar_card_number.setText(rs.getString("adharcard_number"));
                adhar_card_number.setEditable(false);
                gender.setText(rs.getString("gender"));
                gender.setEditable(false);
                bank_name.setText(rs.getString("bank_name"));
                bank_name.setEditable(false);
                account_num.setText(rs.getString("account_number"));
                account_num.setEditable(false);
                ifsc.setText(rs.getString("ifsc_code"));
                ifsc.setEditable(false);
            }
        } catch (SQLException ex) {
            Logger.getLogger(User.class.getName()).log(Level.SEVERE, null, ex);
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

        username = new javax.swing.JLabel();
        buttonGroup1 = new javax.swing.ButtonGroup();
        username1 = new javax.swing.JLabel();
        first_name = new javax.swing.JTextField();
        update = new javax.swing.JButton();
        back = new javax.swing.JButton();
        dob = new javax.swing.JTextField();
        username4 = new javax.swing.JLabel();
        username5 = new javax.swing.JLabel();
        last_name = new javax.swing.JTextField();
        username6 = new javax.swing.JLabel();
        email = new javax.swing.JTextField();
        username7 = new javax.swing.JLabel();
        mobile_number = new javax.swing.JTextField();
        hnufjg = new javax.swing.JLabel();
        username8 = new javax.swing.JLabel();
        address = new javax.swing.JTextField();
        username10 = new javax.swing.JLabel();
        enter_username = new javax.swing.JTextField();
        username11 = new javax.swing.JLabel();
        gender = new javax.swing.JTextField();
        username2 = new javax.swing.JLabel();
        adhar_card_number = new javax.swing.JTextField();
        username12 = new javax.swing.JLabel();
        bank_name = new javax.swing.JTextField();
        account_num = new javax.swing.JTextField();
        ifsc = new javax.swing.JTextField();
        username13 = new javax.swing.JLabel();
        username14 = new javax.swing.JLabel();
        home_page = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();

        username.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        username.setText("username:-");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 0, 51));

        username1.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
        username1.setText("Username:-");

        first_name.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        first_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                first_nameActionPerformed(evt);
            }
        });

        update.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        update.setText("Update");
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });

        back.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        back.setText("Back");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        dob.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        dob.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dobActionPerformed(evt);
            }
        });

        username4.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
        username4.setText("Mobile Number:-");

        username5.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
        username5.setText("Email Id:-");

        last_name.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        last_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                last_nameActionPerformed(evt);
            }
        });

        username6.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
        username6.setText("First Name:-");

        email.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailActionPerformed(evt);
            }
        });

        username7.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
        username7.setText("Last Name:-");

        mobile_number.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        mobile_number.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mobile_numberActionPerformed(evt);
            }
        });

        hnufjg.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        hnufjg.setText("Gender:-");

        username8.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
        username8.setText("Permanent Address:-");

        address.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        address.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addressActionPerformed(evt);
            }
        });

        username10.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
        username10.setText("Adhar Card Number:-");

        enter_username.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        enter_username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enter_usernameActionPerformed(evt);
            }
        });

        username11.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N

        gender.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        gender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                genderActionPerformed(evt);
            }
        });

        username2.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
        username2.setText("Date Of Birth:-");

        adhar_card_number.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        adhar_card_number.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adhar_card_numberActionPerformed(evt);
            }
        });

        username12.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
        username12.setText("Bank Name:-");

        bank_name.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        bank_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bank_nameActionPerformed(evt);
            }
        });

        account_num.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        account_num.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                account_numActionPerformed(evt);
            }
        });

        ifsc.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        ifsc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ifscActionPerformed(evt);
            }
        });

        username13.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
        username13.setText("IFSC Code:- ");

        username14.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
        username14.setText("Account Number:-");

        home_page.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        home_page.setText("User Details");

        jSeparator2.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator2.setAlignmentX(1.0F);
        jSeparator2.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(username6)
                            .addComponent(username12)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(hnufjg)
                                    .addComponent(username13)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(username2, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(username5)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(bank_name, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, 393, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(gender, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(dob, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(first_name, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 279, Short.MAX_VALUE)
                                        .addComponent(ifsc, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 279, Short.MAX_VALUE)))))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(57, 57, 57)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(username1)
                                            .addComponent(username7)
                                            .addComponent(username4))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(enter_username, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(mobile_number, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(last_name, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(username10)
                                                .addGap(45, 45, 45)
                                                .addComponent(adhar_card_number, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(username14))
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(account_num, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(76, 76, 76))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(613, 613, 613)
                                .addComponent(username11))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(383, 383, 383)
                                .addComponent(update)
                                .addGap(44, 44, 44)
                                .addComponent(back))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(username8)
                                .addGap(18, 18, 18)
                                .addComponent(address, javax.swing.GroupLayout.PREFERRED_SIZE, 790, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(559, 559, 559)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jSeparator2)
                    .addComponent(home_page))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(home_page)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(username12)
                    .addComponent(bank_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(account_num, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(username14))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ifsc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(username13)
                    .addComponent(username1)
                    .addComponent(enter_username, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(username6)
                    .addComponent(first_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(username7)
                    .addComponent(last_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(username4)
                    .addComponent(mobile_number, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(username2)
                    .addComponent(dob, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(hnufjg)
                        .addComponent(gender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(adhar_card_number, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(username10)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(127, 127, 127)
                        .addComponent(username11))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(username5))
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(username8)
                            .addComponent(address, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(back)
                    .addComponent(update))
                .addGap(51, 51, 51))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void first_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_first_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_first_nameActionPerformed

    private void dobActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dobActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dobActionPerformed

    private void last_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_last_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_last_nameActionPerformed

    private void emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailActionPerformed

    private void mobile_numberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mobile_numberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mobile_numberActionPerformed

    private void addressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addressActionPerformed

    private void enter_usernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enter_usernameActionPerformed
        // TODO add your handling code here:
        enter_username.setEnabled(false);
    }//GEN-LAST:event_enter_usernameActionPerformed

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
        try {
            // TODO add your handling code here:
            Modify_User updateUser = new Modify_User();
            updateUser.show();
            dispose();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(User.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(User.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(User.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_updateActionPerformed

    private void genderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_genderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_genderActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        Menu menu = new Menu();
        menu.show();
        dispose();
    }//GEN-LAST:event_backActionPerformed

    private void adhar_card_numberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adhar_card_numberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_adhar_card_numberActionPerformed

    private void bank_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bank_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bank_nameActionPerformed

    private void account_numActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_account_numActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_account_numActionPerformed

    private void ifscActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ifscActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ifscActionPerformed

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
            java.util.logging.Logger.getLogger(User.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(User.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(User.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(User.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
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
                    new User().setVisible(true);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(User.class.getName()).log(Level.SEVERE, null, ex);
                } catch (SQLException ex) {
                    Logger.getLogger(User.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IOException ex) {
                    Logger.getLogger(User.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField account_num;
    private javax.swing.JTextField address;
    private javax.swing.JTextField adhar_card_number;
    private javax.swing.JButton back;
    private javax.swing.JTextField bank_name;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextField dob;
    private javax.swing.JTextField email;
    private javax.swing.JTextField enter_username;
    private javax.swing.JTextField first_name;
    private javax.swing.JTextField gender;
    private javax.swing.JLabel hnufjg;
    private javax.swing.JLabel home_page;
    private javax.swing.JTextField ifsc;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField last_name;
    private javax.swing.JTextField mobile_number;
    private javax.swing.JButton update;
    private javax.swing.JLabel username;
    private javax.swing.JLabel username1;
    private javax.swing.JLabel username10;
    private javax.swing.JLabel username11;
    private javax.swing.JLabel username12;
    private javax.swing.JLabel username13;
    private javax.swing.JLabel username14;
    private javax.swing.JLabel username2;
    private javax.swing.JLabel username4;
    private javax.swing.JLabel username5;
    private javax.swing.JLabel username6;
    private javax.swing.JLabel username7;
    private javax.swing.JLabel username8;
    // End of variables declaration//GEN-END:variables
}