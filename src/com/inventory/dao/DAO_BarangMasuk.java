package com.inventory.dao;

import com.inventory.config.Koneksi;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import com.inventory.model.Model_BarangMasuk;
import com.inventory.model.Model_Distributor;
import com.inventory.model.Model_Pemesanan;
import com.inventory.model.Model_Pengguna;
import com.inventory.service.Service_BarangMasuk;

public class DAO_BarangMasuk implements Service_BarangMasuk{

    private Connection conn;
    
    public DAO_BarangMasuk() {
        conn = Koneksi.getConnection();
    }

    
    
    @Override
    public void tambahData(Model_BarangMasuk mod_masuk) {
        PreparedStatement st = null;
        String sql = "INSERT INTO barang_masuk (no_masuk, tgl_masuk, total_masuk, id_distributor, id_pengguna) VALUES (?,?,?,?,?)";
        try{
            st = conn.prepareStatement(sql);
            
            st.setString(1, mod_masuk.getNo_masuk());
            st.setString(2, mod_masuk.getTgl_masuk());
            st.setLong  (3, mod_masuk.getTotal_masuk());
            st.setString(4, mod_masuk.getMod_distributor().getId_distributor());
            st.setString(5, mod_masuk.getMod_pengguna().getId_pengguna());
            
            st.executeUpdate();
        }catch (SQLException ex) {
            Logger.getLogger(DAO_BarangMasuk.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            if (st!=null) {
                try {
                    st.close();
                } catch (SQLException ex) {
                    Logger.getLogger(DAO_BarangMasuk.class.getName()).log(Level.SEVERE, null, ex);
                }
                      
            }
        }
    }
    
    @Override
    public void hapusData(Model_BarangMasuk mod_masuk) {
        PreparedStatement st = null;
        String sql = "DELETE FROM barang_masuk WHERE no_masuk=?";
        try{
            st = conn.prepareStatement(sql);
            st.setString(1, mod_masuk.getNo_masuk());
            
            
            st.executeUpdate();
        }catch (SQLException ex) {
            java.util.logging.Logger.getLogger(DAO_BarangMasuk.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            if (st!=null) {
                try {
                    st.close();
                } catch (SQLException ex) {
                    java.util.logging.Logger.getLogger(DAO_BarangMasuk.class.getName()).log(Level.SEVERE, null, ex);
                }
                
            }
        }
    }

    @Override
    public void perbaruiStatus(String kode_barang) {
        PreparedStatement st = null;
        String sql = "UPDATE detail_pemesanan SET status='Barang Telah Datang' WHERE kode_barang='"+kode_barang+"'";
    
        try{
            st = conn.prepareStatement(sql);
            st.executeUpdate();
        }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Gagal Perbarui Status Barang");
            java.util.logging.Logger.getLogger(DAO_BarangMasuk.class.getName()).log(Level.SEVERE, null, ex);
            
        }
    }

    @Override
    public List<Model_BarangMasuk> getData() {
        PreparedStatement st = null;
        List list = new ArrayList();
        ResultSet rs = null;
        String sql ="SELECT * FROM barang_masuk";
        try {
            st = conn.prepareStatement(sql);
            rs = st.executeQuery();
            while(rs.next()) {
                Model_BarangMasuk masuk = new Model_BarangMasuk();
                Model_Distributor dst = new Model_Distributor();
                Model_Pengguna pgn = new Model_Pengguna();
                
                masuk.setNo_masuk       (rs.getString ("no_masuk"));
                masuk.setTgl_masuk      (rs.getString ("tgl_masuk"));
                masuk.setTotal_masuk    (rs.getLong("total_masuk"));
                dst.setId_distributor   (rs.getString("id_distributor"));
                pgn.setId_pengguna      (rs.getString("id_pengguna"));
                                
                masuk.setMod_distributor(dst);
                masuk.setMod_pengguna(pgn);
                list.add(masuk);
            }
          return list;
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(DAO_BarangMasuk.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }finally{
            if (st!=null) {
                try {
                    st.close();
                } catch (SQLException ex) {
                    java.util.logging.Logger.getLogger(DAO_BarangMasuk.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (rs!=null) {
                try {
                    rs.close();
                } catch (SQLException ex) {
                    java.util.logging.Logger.getLogger(DAO_BarangMasuk.class.getName()).log(Level.SEVERE, null, ex);
            }
            }
        }
    }

    @Override
    public List<Model_BarangMasuk> pencarian(String id) {
        PreparedStatement st = null;
        List list = new ArrayList();
        ResultSet rs = null;
        String sql ="SELECT * FROM barang_masuk WHERE no_masuk LIKE '%"+id+"%' OR tgl_masuk LIKE '%"+id+"%' OR total_masuk LIKE '%"+id+"%' OR id_distributor LIKE '%"+id+"%'";
        try {
            st = conn.prepareStatement(sql);
            rs = st.executeQuery();
            while(rs.next()) {
                Model_Pemesanan psn = new Model_Pemesanan();
                Model_Distributor dst = new Model_Distributor();
                Model_Pengguna pgn = new Model_Pengguna();

                psn.setNo_pesan         (rs.getString ("no_masuk"));
                psn.setTgl_pesan        (rs.getString ("tgl_masuk"));
                psn.setTotal_pesan      (rs.getLong   ("total_masuk"));
                dst.setId_distributor   (rs.getString ("id_distributor"));
                pgn.setId_pengguna      (rs.getString ("id_pengguna"));
                
                psn.setMod_distributor(dst);
                psn.setMod_pengguna(pgn);
                                
                list.add(psn);
            }
          return list;
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(DAO_BarangMasuk.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }finally{
            if (st!=null) {
                try {
                    st.close();
                } catch (SQLException ex) {
                    java.util.logging.Logger.getLogger(DAO_BarangMasuk.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (rs!=null) {
                try {
                    rs.close();
                } catch (SQLException ex) {
                    java.util.logging.Logger.getLogger(DAO_BarangMasuk.class.getName()).log(Level.SEVERE, null, ex);
            }
            }
        }
    }

    @Override
    public String nomor() {
        PreparedStatement st = null;
        ResultSet rs = null;
        String urutan = null;

        Date now = new Date();
        SimpleDateFormat tanggal = new SimpleDateFormat("yyyy-MM-dd");
        SimpleDateFormat noformat = new SimpleDateFormat("yyMMdd");
        String tgl = tanggal.format(now);
        String no = noformat.format(now);

        String sql = "SELECT RIGHT(no_masuk, 3) AS Nomor " +
                     "FROM barang_masuk " +
                     "WHERE no_masuk LIKE 'BM" + no + "%' " +
                     "ORDER BY no_masuk DESC " +
                     "LIMIT 1";

        try {
            st = conn.prepareStatement(sql);
            rs = st.executeQuery();

            if (rs.next()) {
                int nomor = Integer.parseInt(rs.getString("Nomor"));
                nomor++;
                urutan = "BM" + no + String.format("%03d", nomor);
            } else {
                urutan = "BM" + no + "001";
            }

        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(DAO_Pemesanan.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (st != null) {
                try {
                    st.close();
                } catch (SQLException ex) {
                    java.util.logging.Logger.getLogger(DAO_Pemesanan.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }

        return urutan;
    }

    
    
}
