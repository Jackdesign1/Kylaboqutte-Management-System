package com.inventory.dao;

import com.inventory.config.Koneksi;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import com.inventory.model.Model_Barang;
import com.inventory.model.Model_DetBarangMasuk;
import com.inventory.model.Model_SemBarangMasuk;
import com.inventory.service.Service_SemBarangMasuk;

public class DAO_SemBarangMasuk implements Service_SemBarangMasuk{

    private Connection conn;
    
    public DAO_SemBarangMasuk() {
        conn = Koneksi.getConnection();
    }
    
    @Override
    public void tambahData(Model_SemBarangMasuk mod_masuk) {
        PreparedStatement st = null;
        String sql = "INSERT INTO sementara_barang_masuk (kode_barang, nama_barang, satuan, harga, stok, jml_masuk, subtotal_masuk) VALUES (?,?,?,?,?,?,?)";
        try{
            st = conn.prepareStatement(sql);
            
            st.setString(1, mod_masuk.getMod_barang().getKode_barang());
            st.setString(2, mod_masuk.getMod_barang().getNama_barang());
            st.setString(3, mod_masuk.getMod_barang().getSatuan());
            st.setLong  (4, mod_masuk.getMod_barang().getHarga());
            st.setInt   (5, mod_masuk.getMod_barang().getStok());
            st.setLong  (6, mod_masuk.getMod_detmasuk().getJml_masuk());
            st.setLong  (7, mod_masuk.getMod_detmasuk().getSubtotal_masuk());
            
            st.executeUpdate();
        }catch (SQLException ex) {
            Logger.getLogger(DAO_SemBarangMasuk.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            if (st!=null) {
                try {
                    st.close();
                } catch (SQLException ex) {
                    Logger.getLogger(DAO_SemBarangMasuk.class.getName()).log(Level.SEVERE, null, ex);
                }
                      
            }
        }
    }

    @Override
    public void perbaruiData(Model_SemBarangMasuk mod_masuk) {
        PreparedStatement st = null;
        String sql = "UPDATE sementara_barang_masuk SET nama_barang=?, satuan=?, harga=?, stok=?, jml_masuk=?, subtotal_masuk=? WHERE kode_barang='"+mod_masuk.getMod_barang().getKode_barang()+"'";
        try{
            st = conn.prepareStatement(sql);
            
            st.setString(1, mod_masuk.getMod_barang().getNama_barang());
            st.setString(2, mod_masuk.getMod_barang().getSatuan());
            st.setLong  (3, mod_masuk.getMod_barang().getHarga());
            st.setInt   (4, mod_masuk.getMod_barang().getStok());
            st.setLong  (5, mod_masuk.getMod_detmasuk().getJml_masuk());
            st.setLong  (6, mod_masuk.getMod_detmasuk().getSubtotal_masuk());
            
            st.executeUpdate();
        }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Perbarui Data Gagal");
            Logger.getLogger(DAO_SemBarangMasuk.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            if (st!=null) {
                try {
                    st.close();
                } catch (SQLException ex) {
                    Logger.getLogger(DAO_SemBarangMasuk.class.getName()).log(Level.SEVERE, null, ex);
                }
                
            }
        }
    }

    @Override
    public void hapusData(Model_SemBarangMasuk mod_masuk) {
        PreparedStatement st = null;
        String sql = "DELETE FROM sementara_barang_masuk WHERE kode_barang=? AND nama_barang=? AND satuan=? AND harga=? AND stok=? AND jml_masuk=? AND subtotal_masuk=?";
        try{
            st = conn.prepareStatement(sql);
            st.setString(1, mod_masuk.getMod_barang().getKode_barang());
            st.setString(2, mod_masuk.getMod_barang().getNama_barang());
            st.setString(3, mod_masuk.getMod_barang().getSatuan());
            st.setLong  (4, mod_masuk.getMod_barang().getHarga());
            st.setInt   (5, mod_masuk.getMod_barang().getStok());
            st.setLong  (6, mod_masuk.getMod_detmasuk().getJml_masuk());
            st.setLong  (7, mod_masuk.getMod_detmasuk().getSubtotal_masuk());
            
            
            st.executeUpdate();
        }catch (SQLException ex) {
            java.util.logging.Logger.getLogger(DAO_SemBarangMasuk.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            if (st!=null) {
                try {
                    st.close();
                } catch (SQLException ex) {
                    java.util.logging.Logger.getLogger(DAO_SemBarangMasuk.class.getName()).log(Level.SEVERE, null, ex);
                }
                
            }
        }
    }

    @Override
    public List<Model_SemBarangMasuk> getData() {
        PreparedStatement st = null;
        List list = new ArrayList();
        ResultSet rs = null;
        String sql ="SELECT * FROM sementara_barang_masuk";
        try {
            st = conn.prepareStatement(sql);
            rs = st.executeQuery();
            while(rs.next()) {
                Model_SemBarangMasuk smt = new Model_SemBarangMasuk();
                Model_Barang brg = new Model_Barang();
                Model_DetBarangMasuk det_masuk = new Model_DetBarangMasuk();
                
                brg.setKode_barang          (rs.getString ("kode_barang"));
                brg.setNama_barang          (rs.getString ("nama_barang"));
                brg.setSatuan               (rs.getString ("satuan"));
                brg.setHarga                (rs.getLong ("harga"));
                brg.setStok                 (rs.getInt ("stok"));
                
                det_masuk.setJml_masuk      (rs.getInt    ("jml_masuk"));
                det_masuk.setSubtotal_masuk (rs.getLong   ("subtotal_masuk"));
                
                smt.setMod_barang(brg);
                smt.setMod_detmasuk(det_masuk);
                
                list.add(smt);
            }
          return list;
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(DAO_SemBarangMasuk.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }finally{
            if (st!=null) {
                try {
                    st.close();
                } catch (SQLException ex) {
                    java.util.logging.Logger.getLogger(DAO_SemBarangMasuk.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (rs!=null) {
                try {
                    rs.close();
                } catch (SQLException ex) {
                    java.util.logging.Logger.getLogger(DAO_SemBarangMasuk.class.getName()).log(Level.SEVERE, null, ex);
            }
            }
        }
    }
    
}
