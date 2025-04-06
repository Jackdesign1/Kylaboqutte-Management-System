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
import com.inventory.model.Model_BarangKeluar;
import com.inventory.model.Model_DetBarangKeluar;
import com.inventory.service.Service_DetBarangKeluar;

public class DAO_DetBarangKeluar implements Service_DetBarangKeluar{

    private Connection conn;

    public DAO_DetBarangKeluar() {
        conn = Koneksi.getConnection();
    }
    
    
    
    @Override
    public void tambahData(Model_DetBarangKeluar mod_detkeluar) {
        PreparedStatement st = null;
        String sql = "INSERT INTO detail_barang_keluar (no_keluar, kode_barang, jml_keluar, subtotal_keluar)SELECT '"+mod_detkeluar.getMod_keluar().getNo_keluar()+"', kode_barang, jml_keluar, subtotal_keluar FROM sementara_keluar";
        try{
            st = conn.prepareStatement(sql);
            st.executeUpdate();
        }catch (SQLException ex) {
            Logger.getLogger(DAO_DetBarangKeluar.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            if (st!=null) {
                try {
                    st.close();
                } catch (SQLException ex) {
                    Logger.getLogger(DAO_DetBarangKeluar.class.getName()).log(Level.SEVERE, null, ex);
                }
                      
            }
        }
    }

    @Override
    public void sumTotal(Model_DetBarangKeluar mod_detkeluar) {
        PreparedStatement st = null;
        ResultSet rs = null;
        String sql = "SELECT SUM(subtotal_keluar) FROM sementara_keluar";
        try{
            st = conn.prepareStatement(sql);
            rs = st.executeQuery();
            if(rs.next()){
                mod_detkeluar.setSubtotal_keluar(rs.getLong(1));
            }
        }catch (SQLException ex) {
            java.util.logging.Logger.getLogger(DAO_DetBarangKeluar.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            if (st!=null) {
                try {
                    st.close();
                } catch (SQLException ex) {
                    java.util.logging.Logger.getLogger(DAO_DetBarangKeluar.class.getName()).log(Level.SEVERE, null, ex);
                }
                
            }
        }
    }

    @Override
    public void hapusSementara(Model_DetBarangKeluar mod_detkeluar) {
        PreparedStatement st = null;
        String sql = "DELETE FROM sementara_keluar";
        try{
            st = conn.prepareStatement(sql);
            st.executeUpdate();
        }catch (SQLException ex) {
            java.util.logging.Logger.getLogger(DAO_DetBarangKeluar.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            if (st!=null) {
                try {
                    st.close();
                } catch (SQLException ex) {
                    java.util.logging.Logger.getLogger(DAO_DetBarangKeluar.class.getName()).log(Level.SEVERE, null, ex);
                }
                
            }
        }  
    }

    @Override
    public List<Model_DetBarangKeluar> getData(String id) {
        PreparedStatement st = null;
        List list = new ArrayList();
        ResultSet rs = null;
        String sql ="SELECT det_keluar.no_keluar, det_keluar.kode_barang, "
                + "brg.nama_barang, brg.harga, det_keluar.jml_keluar, "
                + "det_keluar.subtotal_keluar "
                + "FROM detail_barang_keluar det_keluar "
                + "INNER JOIN barang_keluar keluar ON keluar.no_keluar=det_keluar.no_keluar "
                + "INNER JOIN barang brg ON brg.kode_barang=det_keluar.kode_barang "
                + "WHERE det_keluar.no_keluar='"+id+"' ORDER BY no_keluar ASC";
        try {
            st = conn.prepareStatement(sql);
            rs = st.executeQuery();
            while(rs.next()) {
                Model_BarangKeluar keluar = new Model_BarangKeluar();
                Model_DetBarangKeluar det = new Model_DetBarangKeluar();
                Model_Barang brg = new Model_Barang();
                
                keluar.setNo_keluar(String.valueOf(rs.getString("det_keluar.no_keluar")));
                det.setMod_keluar(keluar);
                
                brg.setKode_barang      (rs.getString ("kode_barang"));
                brg.setNama_barang      (rs.getString ("nama_barang"));
                brg.setHarga            (rs.getLong   ("harga"));
                det.setJml_keluar       (rs.getInt("jml_keluar"));
                det.setSubtotal_keluar  (rs.getLong   ("subtotal_keluar"));
                                
                det.setMod_barang(brg);
                
                list.add(det);
            }
          return list;
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(DAO_DetBarangKeluar.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }finally{
            if (st!=null) {
                try {
                    st.close();
                } catch (SQLException ex) {
                    java.util.logging.Logger.getLogger(DAO_DetBarangKeluar.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (rs!=null) {
                try {
                    rs.close();
                } catch (SQLException ex) {
                    java.util.logging.Logger.getLogger(DAO_DetBarangKeluar.class.getName()).log(Level.SEVERE, null, ex);
            }
            }
        }
    }

    @Override
    public List<Model_DetBarangKeluar> pencarian(String id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean validasiStok(Model_DetBarangKeluar mod_detkeluar) {
        PreparedStatement st = null;
        ResultSet rs = null;
        boolean valid = false;
        String sql = "SELECT stok FROM barang WHERE kode_barang='"+mod_detkeluar.getMod_barang().getKode_barang()+"' AND (stok<'"+mod_detkeluar.getJml_keluar()+"')";
        try{
            st = conn.prepareStatement(sql);
            rs= st.executeQuery();
            if(rs.next()){
                JOptionPane.showMessageDialog(null, "Stok Barang "+mod_detkeluar.getMod_barang().getNama_barang()+" tidak tersedia !!!","Peringatan",JOptionPane.WARNING_MESSAGE);
            }else {
                valid=true;
            }
        }catch (SQLException ex) {
                java.util.logging.Logger.getLogger(DAO_DetBarangKeluar.class.getName()).log(Level.SEVERE, null, ex);
            }finally{
                if (st!=null) {
                    try {
                        st.close();
                    } catch (SQLException ex) {
                        java.util.logging.Logger.getLogger(DAO_DetBarangKeluar.class.getName()).log(Level.SEVERE, null, ex);
                    }
                
                }
            }
        return valid;
    }
    
}
