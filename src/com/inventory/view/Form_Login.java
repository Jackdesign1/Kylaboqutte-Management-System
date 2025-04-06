package com.inventory.view;

import com.formdev.flatlaf.FlatClientProperties;
import com.formdev.flatlaf.FlatLightLaf;
import com.inventory.dao.DAO_Login;
import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import com.inventory.model.Model_Login;
import org.jdesktop.swingx.border.DropShadowBorder;
import com.inventory.service.Service_Login;

public class Form_Login extends javax.swing.JFrame {
    int xx, xy;
        
    private Service_Login servis = new DAO_Login();
    
    public static boolean tutup = false;
    
    public Form_Login() {
        initComponents();
        
        bt_login.requestFocus();
        lb_hidePassword.setVisible(false);
        txtUsername.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "Masukkan username");
        txtPassword.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "Masukkan password");
    }

    
    void bersih(){
        txtUsername.setText("username");
        txtPassword.setText("password");
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        lb_showPassword = new javax.swing.JLabel();
        lb_hidePassword = new javax.swing.JLabel();
        lbUsername = new javax.swing.JLabel();
        lbPassword = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        txtPassword = new javax.swing.JPasswordField();
        bt_login = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CV Kyla Bouquet");
        setIconImage(new javax.swing.ImageIcon(getClass().getResource("/com/inventory/img/Logo_CV Kyla Bouquet.png")).getImage());
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                formMouseDragged(evt);
            }
        });
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                formMousePressed(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lb_showPassword.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_showPassword.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/inventory/img/icons8_eye_20px.png"))); // NOI18N
        lb_showPassword.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lb_showPasswordMouseClicked(evt);
            }
        });
        jPanel2.add(lb_showPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 160, 40, 40));

        lb_hidePassword.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_hidePassword.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/inventory/img/icons8_invisible_20px.png"))); // NOI18N
        lb_hidePassword.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lb_hidePasswordMouseClicked(evt);
            }
        });
        jPanel2.add(lb_hidePassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 160, 40, 40));

        lbUsername.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbUsername.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/inventory/img/Username.png"))); // NOI18N
        jPanel2.add(lbUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 100, 40, 40));

        lbPassword.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbPassword.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/inventory/img/Password.png"))); // NOI18N
        jPanel2.add(lbPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 160, 40, 40));

        txtUsername.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        txtUsername.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtUsername.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(228, 205, 222)));
        txtUsername.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtUsernameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtUsernameFocusLost(evt);
            }
        });
        jPanel2.add(txtUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 100, 220, 40));

        txtPassword.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        txtPassword.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtPassword.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(228, 205, 222)));
        txtPassword.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtPasswordFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtPasswordFocusLost(evt);
            }
        });
        txtPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPasswordKeyPressed(evt);
            }
        });
        jPanel2.add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 160, 220, 40));

        bt_login.setBackground(new java.awt.Color(228, 205, 222));
        bt_login.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        bt_login.setForeground(new java.awt.Color(0, 0, 0));
        bt_login.setText("LOGIN");
        bt_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_loginActionPerformed(evt);
            }
        });
        jPanel2.add(bt_login, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 230, 220, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\ASUS\\Downloads\\Group 1 (6).png")); // NOI18N
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 650, 370));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        xx = evt.getX();
        xy = evt.getY();
    }//GEN-LAST:event_formMousePressed

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xx, y - xy);
    }//GEN-LAST:event_formMouseDragged

    private void txtUsernameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtUsernameFocusGained
        String user=txtUsername.getText();
        if(user.equals("username")){
            txtUsername.setText("");
        }
    }//GEN-LAST:event_txtUsernameFocusGained

    private void txtUsernameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtUsernameFocusLost
        String user=txtUsername.getText();
        if(user.equals("")||user.equals("username")){
            txtUsername.setText("username");

        }
    }//GEN-LAST:event_txtUsernameFocusLost

    private void txtPasswordFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPasswordFocusGained
        String pass=txtPassword.getText();
        if(pass.equals("password")){
            txtPassword.setText("");

        }
    }//GEN-LAST:event_txtPasswordFocusGained

    private void txtPasswordFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPasswordFocusLost
        String pass=txtPassword.getText();
        if(pass.equals("")||pass.equals("password")){
            txtPassword.setText("password");

        }
    }//GEN-LAST:event_txtPasswordFocusLost

    private void txtPasswordKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPasswordKeyPressed
        if (evt.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER) {
            bt_login.doClick();
        }
    }//GEN-LAST:event_txtPasswordKeyPressed

    private void bt_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_loginActionPerformed
        prosesLogin();
    }//GEN-LAST:event_bt_loginActionPerformed

    private void lb_hidePasswordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_hidePasswordMouseClicked
        lb_showPassword.setVisible(true);
        lb_hidePassword.setVisible(false);
        txtPassword.setEchoChar('*');
    }//GEN-LAST:event_lb_hidePasswordMouseClicked

    private void lb_showPasswordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_showPasswordMouseClicked
        lb_showPassword.setVisible(false);
        lb_hidePassword.setVisible(true);
        txtPassword.setEchoChar((char)0);
    }//GEN-LAST:event_lb_showPasswordMouseClicked

    public static void main(String args[]) {
        FlatLightLaf.setup();
        UIManager.put("Button.arc", 10);
        UIManager.put("TextComponent.arc", 10);
        UIManager.put("Component.arc", 10);
        
        UIManager.put("TableHeader.background", new Color(0,112,192));
        UIManager.put("TableHeader.foreground", new Color(255,255,255));
        UIManager.put("Table.alternateRowColor", new Color(240,240,240));
        
        UIManager.put("Button.background", new Color(0,112,192));
        UIManager.put("Button.focusedBackground", new Color(0,112,192));
        UIManager.put("Button.foreground", new Color(255,255,255));
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Form_Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_login;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lbPassword;
    private javax.swing.JLabel lbUsername;
    private javax.swing.JLabel lb_hidePassword;
    private javax.swing.JLabel lb_showPassword;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables

    
    private void prosesLogin(){
        if(validasiInput()==true){
            String id = txtUsername.getText();
            String user = txtUsername.getText();
            String pass = txtPassword.getText();
            
            Model_Login mod_log = new Model_Login();
            
            mod_log.setId_user(id);
            mod_log.setUsername(user);
            mod_log.setPass_user(pass);
            
            servis.prosesLogin(mod_log);
            if(tutup){
                dispose();
            }
        }
    }

    private boolean validasiInput() {
        boolean valid = false;
        if(txtUsername.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(null, "Username tidak boleh kosong");
        }else if(txtPassword.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(null, "Password tidak boleh kosong");
        }else{
            valid = true;
        }
        return valid;
    }


}
