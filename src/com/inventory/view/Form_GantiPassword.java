package com.inventory.view;

import com.inventory.dao.DAO_Pengguna;
import java.awt.Color;
import com.inventory.service.Service_Pengguna;

public class Form_GantiPassword extends javax.swing.JPanel {

    private Service_Pengguna servis = new DAO_Pengguna();
    
    public Form_GantiPassword() {
        initComponents();
        setBackground(new Color(0, 0, 0, 0));;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        t_passwordBaru = new javax.swing.JPasswordField();
        t_passwordLama = new javax.swing.JPasswordField();
        t_username = new javax.swing.JTextField();
        t_passwordBaruKonfirmasi = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        t_passwordBaru.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        t_passwordBaru.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                t_passwordBaruFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                t_passwordBaruFocusLost(evt);
            }
        });

        t_passwordLama.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        t_passwordLama.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                t_passwordLamaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                t_passwordLamaFocusLost(evt);
            }
        });

        t_username.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        t_username.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                t_usernameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                t_usernameFocusLost(evt);
            }
        });

        t_passwordBaruKonfirmasi.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        t_passwordBaruKonfirmasi.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                t_passwordBaruKonfirmasiFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                t_passwordBaruKonfirmasiFocusLost(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel1.setText("Pergantian Password");

        jLabel2.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Username");

        jLabel3.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Password Lama");

        jLabel4.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Password Baru");

        jLabel5.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Konfirmasi Password Baru");

        jButton1.setText("SUBMIT");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSeparator1))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(t_passwordBaru)
                            .addComponent(t_passwordLama, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(t_passwordBaruKonfirmasi)
                            .addComponent(t_username, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 402, Short.MAX_VALUE))))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(255, 255, 255)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(jLabel1)
                .addGap(36, 36, 36)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(t_username, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(t_passwordLama, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(t_passwordBaru, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(t_passwordBaruKonfirmasi, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(126, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void t_passwordBaruFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_t_passwordBaruFocusGained
        String user=t_passwordBaru.getText();
        if(user.equals("passsword")){
            t_passwordBaru.setText("");
        }
    }//GEN-LAST:event_t_passwordBaruFocusGained

    private void t_passwordBaruFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_t_passwordBaruFocusLost
        String user=t_passwordBaru.getText();
        if(user.equals("")||user.equals("passsword")){
            t_passwordBaru.setText("passsword");

        }
    }//GEN-LAST:event_t_passwordBaruFocusLost

    private void t_passwordLamaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_t_passwordLamaFocusGained
        String user=t_passwordLama.getText();
        if(user.equals("password")){
            t_passwordLama.setText("");
        }
    }//GEN-LAST:event_t_passwordLamaFocusGained

    private void t_passwordLamaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_t_passwordLamaFocusLost
        String user=t_passwordLama.getText();
        if(user.equals("")||user.equals("passsword")){
            t_passwordLama.setText("passsword");

        }
    }//GEN-LAST:event_t_passwordLamaFocusLost

    private void t_usernameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_t_usernameFocusGained
        String user=t_username.getText();
        if(user.equals("username")){
            t_username.setText("");
        }
    }//GEN-LAST:event_t_usernameFocusGained

    private void t_usernameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_t_usernameFocusLost
        String user=t_username.getText();
        if(user.equals("")||user.equals("username")){
            t_username.setText("username");

        }
    }//GEN-LAST:event_t_usernameFocusLost

    private void t_passwordBaruKonfirmasiFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_t_passwordBaruKonfirmasiFocusGained
        String user=t_passwordBaruKonfirmasi.getText();
        if(user.equals("password")){
            t_passwordBaruKonfirmasi.setText("");
        }
    }//GEN-LAST:event_t_passwordBaruKonfirmasiFocusGained

    private void t_passwordBaruKonfirmasiFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_t_passwordBaruKonfirmasiFocusLost
        String user=t_passwordBaruKonfirmasi.getText();
        if(user.equals("")||user.equals("password")){
            t_passwordBaruKonfirmasi.setText("password");

        }
    }//GEN-LAST:event_t_passwordBaruKonfirmasiFocusLost


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPasswordField t_passwordBaru;
    private javax.swing.JPasswordField t_passwordBaruKonfirmasi;
    private javax.swing.JPasswordField t_passwordLama;
    private javax.swing.JTextField t_username;
    // End of variables declaration//GEN-END:variables

    private void resetForm() {
        t_username.setText("username");
        t_passwordLama.setText("password");
        t_passwordBaru.setText("password");
        t_passwordBaruKonfirmasi.setText("password");
    }
}
