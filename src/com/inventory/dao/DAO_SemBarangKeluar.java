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
import com.inventory.model.Model_DetBarangKeluar;
import com.inventory.model.Model_SemBarangKeluar;
import com.inventory.service.Service_SemBarangKeluar;

public class DAO_SemBarangKeluar implements Service_SemBarangKeluar{

    private Connection conn;
    
    public DAO_SemBarangKeluar() {
        conn = Koneksi.getConnection();
    }

    @Override
    public void tambahData(Model_SemBarangKeluar mod_keluar) {
        PreparedStatement st = null;
        String sql = "INSERT INTO sementara_keluar (kode_barang, nama_barang, satuan, harga, stok, jml_keluar, subtotal_keluar) VALUES (?,?,?,?,?,?,?)";
        try{
            st = conn.prepareStatement(sql);
            
            st.setString(1, mod_keluar.getMod_barang().getKode_barang());
            st.setString(2, mod_keluar.getMod_barang().getNama_barang());
            st.setString(3, mod_keluar.getMod_barang().getSatuan());
            st.setLong  (4, mod_keluar.getMod_barang().getHarga());
            st.setInt   (5, mod_keluar.getMod_barang().getStok());
            st.setLong  (6, mod_keluar.getMod_detkeluar().getJml_keluar());
            st.setLong  (7, mod_keluar.getMod_detkeluar().getSubtotal_keluar());
            
            st.executeUpdate();
        }catch (SQLException ex) {
            Logger.getLogger(DAO_SemBarangKeluar.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            if (st!=null) {
                try {
                    st.close();
                } catch (SQLException ex) {
                    Logger.getLogger(DAO_SemBarangKeluar.class.getName()).log(Level.SEVERE, null, ex);
                }
                      
            }
        }
    }

    @Override
    public void perbaruiData(Model_SemBarangKeluar mod_keluar) {
        PreparedStatement st = null;
        String sql = "UPDATE sementara_keluar SET nama_barang=?, satuan=?, harga=?, stok=?, jml_keluar=?, subtotal_keluar=? WHERE kode_barang='"+mod_keluar.getMod_barang().getKode_barang()+"'";
        try{
            st = conn.prepareStatement(sql);
            
            st.setString(1, mod_keluar.getMod_barang().getNama_barang());
            st.setString(2, mod_keluar.getMod_barang().getSatuan());
            st.setLong  (3, mod_keluar.getMod_barang().getHarga());
            st.setInt   (4, mod_keluar.getMod_barang().getStok());
            st.setLong  (5, mod_keluar.getMod_detkeluar().getJml_keluar());
            st.setLong  (6, mod_keluar.getMod_detkeluar().getSubtotal_keluar());
            
            st.executeUpdate();
        }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Perbarui Data Gagal");
            Logger.getLogger(DAO_SemBarangKeluar.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            if (st!=null) {
                try {
                    st.close();
                } catch (SQLException ex) {
                    Logger.getLogger(DAO_SemBarangKeluar.class.getName()).log(Level.SEVERE, null, ex);
                }
                
            }
        }
    }

    @Override
    public void hapusData(Model_SemBarangKeluar mod_keluar) {
        PreparedStatement st = null;
        String sql = "DELETE FROM sementara_keluar WHERE kode_barang=? AND nama_barang=? AND satuan=? AND harga=? AND stok=? AND jml_keluar=? AND subtotal_keluar=?";
        try{
            st = conn.prepareStatement(sql);
            
            st.setString(1, mod_keluar.getMod_barang().getKode_barang());
            st.setString(2, mod_keluar.getMod_barang().getNama_barang());
            st.setString(3, mod_keluar.getMod_barang().getSatuan());
            st.setLong  (4, mod_keluar.getMod_barang().getHarga());
            st.setInt   (5, mod_keluar.getMod_barang().getStok());
            st.setLong  (6, mod_keluar.getMod_detkeluar().getJml_keluar());
            st.setLong  (7, mod_keluar.getMod_detkeluar().getSubtotal_keluar());            
            
            st.executeUpdate();
        }catch (SQLException ex) {
            java.util.logging.Logger.getLogger(DAO_SemBarangKeluar.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            if (st!=null) {
                try {
                    st.close();
                } catch (SQLException ex) {
                    java.util.logging.Logger.getLogger(DAO_SemBarangKeluar.class.getName()).log(Level.SEVERE, null, ex);
                }
                
            }
        }
    }

    @Override
    public List<Model_SemBarangKeluar> getData() {
        PreparedStatement st = null;
        List list = new ArrayList();
        ResultSet rs = null;
        String sql ="SELECT * FROM sementara_keluar";
        try {
            st = conn.prepareStatement(sql);
            rs = st.executeQuery();
            while(rs.next()) {
                Model_SemBarangKeluar smt = new Model_SemBarangKeluar();
                Model_Barang brg = new Model_Barang();
                Model_DetBarangKeluar det = new Model_DetBarangKeluar();
                
                brg.setKode_barang          (rs.getString ("kode_barang"));
                brg.setNama_barang          (rs.getString ("nama_barang"));
                brg.setSatuan               (rs.getString ("satuan"));
                brg.setHarga                (rs.getLong ("harga"));
                brg.setStok                 (rs.getInt ("stok"));
                
                det.setJml_keluar           (rs.getInt    ("jml_keluar"));
                det.setSubtotal_keluar      (rs.getLong   ("subtotal_keluar"));
                
                smt.setMod_barang(brg);
                smt.setMod_detkeluar(det);
                
                list.add(smt);
            }
          return list;
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(DAO_SemBarangKeluar.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }finally{
            if (st!=null) {
                try {
                    st.close();
                } catch (SQLException ex) {
                    java.util.logging.Logger.getLogger(DAO_SemBarangKeluar.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (rs!=null) {
                try {
                    rs.close();
                } catch (SQLException ex) {
                    java.util.logging.Logger.getLogger(DAO_SemBarangKeluar.class.getName()).log(Level.SEVERE, null, ex);
            }
            }
        }
    }
    
}
