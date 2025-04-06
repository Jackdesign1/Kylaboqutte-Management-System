
package com.inventory.dao;

import com.inventory.main.Menu_Utama;
import com.inventory.config.Koneksi;
import java.awt.Image;
import java.io.ByteArrayInputStream;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import com.inventory.model.Model_Login;
import com.inventory.service.Service_Login;
import com.inventory.view.Form_Login;

public class DAO_Login implements Service_Login{

    private Connection conn;
    
    public DAO_Login() {
        conn = Koneksi.getConnection();
    }

    @Override
    public void prosesLogin(Model_Login mod_login) {
        PreparedStatement st = null;
        ResultSet rs        = null;
        String Id           = null;
        String Nama         = null;
        String Level2       = null;
        String Username     = null;
        String sql = "SELECT * FROM pengguna WHERE(id_pengguna='"+mod_login.getId_user()+"'OR username='"+mod_login.getUsername()+"') AND password='"+Encrypt.getmd5java(mod_login.getPass_user())+"'";
         
        try{
            st = conn.prepareStatement(sql);
            rs = st.executeQuery();
            if(rs.next()){
                Id   = rs.getString("id_pengguna");
                Nama = rs.getString("nama_pengguna");
                Level2 = rs.getString("level");
                Username = rs.getString("username");
                Blob gambarBlob = rs.getBlob("gambar");
                
                Model_Login mod = new Model_Login();
                mod.setId_user(Id);
                mod.setNama_pengguna(Nama);
                mod.setUsername(Username);
                mod.setLevel(Level2);
                mod.setGambar(gambarBlob);
                
                Menu_Utama menu = new Menu_Utama(mod);
                menu.setVisible(true);
                menu.revalidate();
                
                Form_Login lg = new Form_Login();
                lg.tutup = true;
            }else{
                JOptionPane.showMessageDialog(null, "Username dan Password salah", "Pesan", JOptionPane.INFORMATION_MESSAGE);
                Form_Login lg = new Form_Login();
                lg.tutup = false;
            }
        }catch(SQLException ex) {
            Logger.getLogger(DAO_Login.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            if(st!=null){
                try{
                    st.close();
                }catch(SQLException ex){
                    Logger.getLogger(DAO_Login.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    } 

}
