package com.inventory.dao;

import com.inventory.config.Koneksi;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
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
import javax.swing.JTable;
import javax.swing.table.TableModel;
import com.inventory.model.Model_Distributor;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import com.inventory.service.Service_Distributor;

public class DAO_Distributor implements Service_Distributor{

    private Connection connection;
    
    public DAO_Distributor() {
        connection = Koneksi.getConnection();
    }

    
    
    @Override
    public void tambahData(Model_Distributor mod_dis) {
        PreparedStatement st = null;
        String sql = "INSERT INTO distributor(id_distributor,nama_distributor,telp_distributor,alamat_distributor) VALUES (?,?,?,?)";
        try{
            st = connection.prepareStatement(sql);
            st.setString(1, mod_dis.getId_distributor());
            st.setString(2, mod_dis.getNama_distributor());
            st.setString(3, mod_dis.getTelp_distributor());
            st.setString(4, mod_dis.getAlamat_distributor());
            
            st.executeUpdate();
        }catch (SQLException ex) {
            Logger.getLogger(DAO_Distributor.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            if (st!=null) {
                try {
                    st.close();
                } catch (SQLException ex) {
                    Logger.getLogger(DAO_Distributor.class.getName()).log(Level.SEVERE, null, ex);
                }
                      
            }
        }
    }

    @Override
    public void perbaruiData(Model_Distributor mod_dis) {
        PreparedStatement st = null;
        String sql = "UPDATE distributor SET nama_distributor=?, telp_distributor=?, alamat_distributor=? WHERE id_distributor=?";
        try{
            st = connection.prepareStatement(sql);
            
            st.setString(1, mod_dis.getNama_distributor());
            st.setString(2, mod_dis.getTelp_distributor());
            st.setString(3, mod_dis.getAlamat_distributor());
            st.setString(4, mod_dis.getId_distributor());
            
            st.executeUpdate();
            
        }catch (SQLException ex) {
            Logger.getLogger(DAO_Distributor.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            if (st!=null) {
                try {
                    st.close();
                } catch (SQLException ex) {
                    Logger.getLogger(DAO_Distributor.class.getName()).log(Level.SEVERE, null, ex);
                }
                
            }
        }
    }

    @Override
    public void hapusData(Model_Distributor mod_dis) {
        PreparedStatement st = null;
        String sql = "DELETE FROM distributor WHERE id_distributor=?";
        try{
            st = connection.prepareStatement(sql);
            st.setString(1, mod_dis.getId_distributor());
            
            
            st.executeUpdate();
        }catch (SQLException ex) {
            java.util.logging.Logger.getLogger(DAO_Distributor.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            if (st!=null) {
                try {
                    st.close();
                } catch (SQLException ex) {
                    java.util.logging.Logger.getLogger(DAO_Distributor.class.getName()).log(Level.SEVERE, null, ex);
                }
                
            }
        }
    }

    @Override
    public List<Model_Distributor> getData() {
        PreparedStatement st = null;
        List list = new ArrayList();
        ResultSet rs = null;
        String sql ="SELECT * FROM distributor";
        try {
            st = connection.prepareStatement(sql);
            rs = st.executeQuery();
            while(rs.next()) {
                Model_Distributor model = new Model_Distributor();
                model.setId_distributor(rs.getString ("id_distributor"));
                model.setNama_distributor(rs.getString ("nama_distributor"));
                model.setTelp_distributor(rs.getString ("telp_distributor"));
                model.setAlamat_distributor(rs.getString ("alamat_distributor"));
                                
                list.add(model);
            }
          return list;
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(DAO_Distributor.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }finally{
            if (st!=null) {
                try {
                    st.close();
                } catch (SQLException ex) {
                    java.util.logging.Logger.getLogger(DAO_Distributor.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (rs!=null) {
                try {
                    rs.close();
                } catch (SQLException ex) {
                    java.util.logging.Logger.getLogger(DAO_Distributor.class.getName()).log(Level.SEVERE, null, ex);
            }
            }
        }
    }

    @Override
    public List<Model_Distributor> pencarian(String id) {
        PreparedStatement st = null;
        List list = new ArrayList();
        ResultSet rs = null;
        String sql ="SELECT * FROM distributor WHERE id_distributor LIKE '%"+id+"%' OR nama_distributor LIKE '%"+id+"%' OR telp_distributor LIKE '%"+id+"%' OR alamat_distributor LIKE '%"+id+"%'";
        try {
            st = connection.prepareStatement(sql);
            rs = st.executeQuery();
            while(rs.next()) {
                Model_Distributor model = new Model_Distributor();
                model.setId_distributor(rs.getString ("id_distributor"));
                model.setNama_distributor(rs.getString ("nama_distributor"));
                model.setTelp_distributor(rs.getString ("telp_distributor"));
                model.setAlamat_distributor(rs.getString ("alamat_distributor"));
                                
                list.add(model);
            }
          return list;
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(DAO_Distributor.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }finally{
            if (st!=null) {
                try {
                    st.close();
                } catch (SQLException ex) {
                    java.util.logging.Logger.getLogger(DAO_Distributor.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (rs!=null) {
                try {
                    rs.close();
                } catch (SQLException ex) {
                    java.util.logging.Logger.getLogger(DAO_Distributor.class.getName()).log(Level.SEVERE, null, ex);
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
        SimpleDateFormat noformat = new SimpleDateFormat("yyMM");
        String tgl = tanggal.format(now);
        String no = noformat.format(now);

        String sql = "SELECT RIGHT(id_distributor, 3) AS Nomor FROM distributor WHERE id_distributor LIKE 'DST" + no + "%' ORDER BY id_distributor DESC LIMIT 1";

        try {
            st = connection.prepareStatement(sql);
            rs = st.executeQuery();

            if (rs.next()) {
                int nomor = Integer.parseInt(rs.getString("Nomor"));
                nomor++;
                urutan = "DST" + no + String.format("%03d", nomor);
            } else {
                urutan = "DST" + no + "001";
            }

        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(DAO_Barang.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (st != null) {
                try {
                    st.close();
                } catch (SQLException ex) {
                    java.util.logging.Logger.getLogger(DAO_Barang.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }

        return urutan;
    }

    @Override
    public List<Model_Distributor> getData(int startIndex, int entriesPerPage) {
        PreparedStatement st = null;
        ResultSet rs = null;
        String sql = "SELECT * FROM distributor LIMIT ?, ?";
        List<Model_Distributor> list = new ArrayList<>();

        try {
            st = connection.prepareStatement(sql);
            st.setInt(1, startIndex);
            st.setInt(2, entriesPerPage);
            rs = st.executeQuery();

            while (rs.next()) {
                Model_Distributor model = new Model_Distributor();
                model.setId_distributor(rs.getString("id_distributor"));
                model.setNama_distributor(rs.getString("nama_distributor"));
                model.setTelp_distributor(rs.getString("telp_distributor"));
                model.setAlamat_distributor(rs.getString("alamat_distributor"));
                list.add(model);
            }

            return list;
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(DAO_Distributor.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        } finally {
            if (st != null) {
                try {
                    st.close();
                } catch (SQLException ex) {
                    java.util.logging.Logger.getLogger(DAO_Distributor.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException ex) {
                    java.util.logging.Logger.getLogger(DAO_Distributor.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }

    @Override
    public int getTotalEntries() {
        PreparedStatement st = null;
        ResultSet rs = null;
        String sql = "SELECT COUNT(*) AS total FROM distributor";

        try {
            st = connection.prepareStatement(sql);
            rs = st.executeQuery();

            if (rs.next()) {
                return rs.getInt("total");
            } else {
                return 0;
            }
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(DAO_Distributor.class.getName()).log(Level.SEVERE, null, ex);
            return 0;
        } finally {
            if (st != null) {
                try {
                    st.close();
                } catch (SQLException ex) {
                    java.util.logging.Logger.getLogger(DAO_Distributor.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException ex) {
                    java.util.logging.Logger.getLogger(DAO_Distributor.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }

    @Override
    public void exportToExcel(JTable table, String filePath) {
        try {
            TableModel model = table.getModel();
            XSSFWorkbook workbook = new XSSFWorkbook();
            XSSFSheet sheet = workbook.createSheet("Data");

            // Membuat header kolom
            Row headerRow = sheet.createRow(0);
            for (int i = 0; i < model.getColumnCount(); i++) {
                Cell cell = headerRow.createCell(i);
                cell.setCellValue(model.getColumnName(i));
            }

            // Membuat data baris
            for (int i = 0; i < model.getRowCount(); i++) {
                Row row = sheet.createRow(i + 1);
                for (int j = 0; j < model.getColumnCount(); j++) {
                    Cell cell = row.createCell(j);
                    cell.setCellValue(model.getValueAt(i, j).toString());
                }
            }

            // Menyimpan file Excel
            FileOutputStream fileOut = new FileOutputStream(new File(filePath));
            workbook.write(fileOut);
            fileOut.close();

            JOptionPane.showMessageDialog(null,"Data berhasil diekspor ke file Excel!");

        } catch (IOException e) {
            JOptionPane.showMessageDialog(null,"Terjadi kesalahan saat mengekspor data ke Excel: " + e.getMessage());
        }
    }
    
}
