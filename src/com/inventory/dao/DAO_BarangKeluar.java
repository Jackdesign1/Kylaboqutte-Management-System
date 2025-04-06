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
import com.inventory.model.Model_BarangKeluar;
import com.inventory.model.Model_Distributor;
import com.inventory.model.Model_Pengguna;
import com.inventory.service.Service_BarangKeluar;

public class DAO_BarangKeluar implements Service_BarangKeluar{
    
    private Connection conn;
    
    public DAO_BarangKeluar() {
        conn = Koneksi.getConnection();
    }

    @Override
    public void tambahData(Model_BarangKeluar mod_keluar) {
        PreparedStatement st = null;
        String sql = "INSERT INTO barang_keluar (no_keluar, tgl_keluar, total_keluar, id_pengguna) VALUES (?,?,?,?)";
        try{
            st = conn.prepareStatement(sql);
            
            st.setString(1, mod_keluar.getNo_keluar());
            st.setString(2, mod_keluar.getTgl_keluar());
            st.setLong  (3, mod_keluar.getTotal_keluar());
            st.setString(4, mod_keluar.getMod_pengguna().getId_pengguna());
            
            st.executeUpdate();
        }catch (SQLException ex) {
            Logger.getLogger(DAO_BarangKeluar.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            if (st!=null) {
                try {
                    st.close();
                } catch (SQLException ex) {
                    Logger.getLogger(DAO_BarangKeluar.class.getName()).log(Level.SEVERE, null, ex);
                }
                      
            }
        }
    }

    @Override
    public void hapusData(Model_BarangKeluar mod_keluar) {
        PreparedStatement st = null;
        String sql = "DELETE FROM barang_keluar WHERE no_keluar=?";
        try{
            st = conn.prepareStatement(sql);
            st.setString(1, mod_keluar.getNo_keluar());
            
            
            st.executeUpdate();
        }catch (SQLException ex) {
            java.util.logging.Logger.getLogger(DAO_BarangKeluar.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            if (st!=null) {
                try {
                    st.close();
                } catch (SQLException ex) {
                    java.util.logging.Logger.getLogger(DAO_BarangKeluar.class.getName()).log(Level.SEVERE, null, ex);
                }
                
            }
        }
    }
    
    @Override
    public List<Model_BarangKeluar> getData() {
        PreparedStatement st = null;
        List list = new ArrayList();
        ResultSet rs = null;
        String sql ="SELECT * FROM barang_keluar";
        try {
            st = conn.prepareStatement(sql);
            rs = st.executeQuery();
            while(rs.next()) {
                Model_BarangKeluar keluar = new Model_BarangKeluar();
                Model_Pengguna pgn = new Model_Pengguna();
                
                keluar.setNo_keluar       (rs.getString ("no_keluar"));
                keluar.setTgl_keluar      (rs.getString ("tgl_keluar"));
                keluar.setTotal_keluar    (rs.getLong("total_keluar"));
                pgn.setId_pengguna      (rs.getString("id_pengguna"));
                                
                keluar.setMod_pengguna(pgn);
                list.add(keluar);
            }
          return list;
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(DAO_BarangKeluar.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }finally{
            if (st!=null) {
                try {
                    st.close();
                } catch (SQLException ex) {
                    java.util.logging.Logger.getLogger(DAO_BarangKeluar.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (rs!=null) {
                try {
                    rs.close();
                } catch (SQLException ex) {
                    java.util.logging.Logger.getLogger(DAO_BarangKeluar.class.getName()).log(Level.SEVERE, null, ex);
            }
            }
        }
    }

    @Override
    public List<Model_BarangKeluar> pencarian(String id) {
        PreparedStatement st = null;
        List list = new ArrayList();
        ResultSet rs = null;
        String sql ="SELECT * FROM barang_keluar WHERE no_keluar LIKE '%"+id+"%' OR tgl_keluar LIKE '%"+id+"%' OR total_keluar LIKE '%"+id+"%'";
        try {
            st = conn.prepareStatement(sql);
            rs = st.executeQuery();
            while(rs.next()) {
                Model_BarangKeluar keluar = new Model_BarangKeluar();
                Model_Pengguna pgn = new Model_Pengguna();
                
                keluar.setNo_keluar       (rs.getString ("no_keluar"));
                keluar.setTgl_keluar      (rs.getString ("tgl_keluar"));
                keluar.setTotal_keluar    (rs.getLong("total_keluar"));
                pgn.setId_pengguna      (rs.getString("id_pengguna"));
                                
                keluar.setMod_pengguna(pgn);
                list.add(keluar);
            }
          return list;
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(DAO_BarangKeluar.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }finally{
            if (st!=null) {
                try {
                    st.close();
                } catch (SQLException ex) {
                    java.util.logging.Logger.getLogger(DAO_BarangKeluar.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (rs!=null) {
                try {
                    rs.close();
                } catch (SQLException ex) {
                    java.util.logging.Logger.getLogger(DAO_BarangKeluar.class.getName()).log(Level.SEVERE, null, ex);
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

        String sql = "SELECT RIGHT(no_keluar, 3) AS Nomor " +
                     "FROM barang_keluar " +
                     "WHERE no_keluar LIKE 'BK" + no + "%' " +
                     "ORDER BY no_keluar DESC " +
                     "LIMIT 1";

        try {
            st = conn.prepareStatement(sql);
            rs = st.executeQuery();

            if (rs.next()) {
                int nomor = Integer.parseInt(rs.getString("Nomor"));
                nomor++;
                urutan = "BK" + no + String.format("%03d", nomor);
            } else {
                urutan = "BK" + no + "001";
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
