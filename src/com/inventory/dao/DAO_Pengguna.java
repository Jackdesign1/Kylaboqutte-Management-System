package com.inventory.dao;

import com.inventory.config.Koneksi;
import java.awt.Image;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.TableModel;
import com.inventory.model.Model_Pengguna;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import com.inventory.service.Service_Pengguna;

public class DAO_Pengguna implements Service_Pengguna{
    
    private Connection conn;

    public DAO_Pengguna() {
        conn = Koneksi.getConnection();
    }
    
    

    @Override
    public void tambahData(Model_Pengguna mod_pengguna) {
        PreparedStatement st = null;
        String sql = "INSERT INTO pengguna(id_pengguna,nama_pengguna,username,password,telp_pengguna,alamat_pengguna,level,gambar) VALUES (?,?,?,?,?,?,?,?)";
        try{
            st = conn.prepareStatement(sql);
            st.setString(1, mod_pengguna.getId_pengguna());
            st.setString(2, mod_pengguna.getNama_pengguna());
            st.setString(3, mod_pengguna.getUsername());
            st.setString(4, Encrypt.getmd5java(mod_pengguna.getPassword()));
            st.setString(5, mod_pengguna.getTelp_pengguna());
            st.setString(6, mod_pengguna.getAlamat_pengguna());
            st.setString(7, mod_pengguna.getLevel());
            
            // Mengubah gambar menjadi byte array
            String imagePath = mod_pengguna.getImagePath();
            if (imagePath != null) {
                File imageFile = new File(imagePath);
                FileInputStream fis = new FileInputStream(imageFile);
                byte[] imageData = new byte[(int) imageFile.length()];
                fis.read(imageData);
                fis.close();
                st.setBytes(8, imageData);
            } else {
                st.setNull(8, java.sql.Types.BLOB);
            }
            
            st.executeUpdate();
        }catch (SQLException ex) {
            Logger.getLogger(DAO_Pengguna.class.getName()).log(Level.SEVERE, null, ex);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(DAO_Pengguna.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(DAO_Pengguna.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            if (st!=null) {
                try {
                    st.close();
                } catch (SQLException ex) {
                    Logger.getLogger(DAO_Pengguna.class.getName()).log(Level.SEVERE, null, ex);
                }
                      
            }
        }
    }

    @Override
    public void perbaruiData(Model_Pengguna mod_pengguna) {
        PreparedStatement st = null;
        String sql = "UPDATE pengguna SET nama_pengguna=?,username=?,telp_pengguna=?,alamat_pengguna=?,level=?";
                    if (mod_pengguna.getImagePath() != null && !mod_pengguna.getImagePath().isEmpty()) 
                    {
                        sql += ",gambar=?";
                    }
                        sql += " WHERE id_pengguna=?";
            try{
            st = conn.prepareStatement(sql);
            st.setString(1, mod_pengguna.getNama_pengguna());
            st.setString(2, mod_pengguna.getUsername());
            //st.setString(4, Encrypt.getmd5java(mod_pengguna.getPassword()));
            st.setString(3, mod_pengguna.getTelp_pengguna());
            st.setString(4, mod_pengguna.getAlamat_pengguna());
            st.setString(5, mod_pengguna.getLevel());
            
            // Mengubah gambar menjadi byte array
            if (mod_pengguna.getImagePath() != null && !mod_pengguna.getImagePath().isEmpty()) {
                File imageFile = new File(mod_pengguna.getImagePath());
                FileInputStream fis = new FileInputStream(imageFile);
                st.setBinaryStream(6, fis, (int) imageFile.length());
                st.setString(7, mod_pengguna.getId_pengguna());
            } else {
                st.setString(6, mod_pengguna.getId_pengguna());
            }
              
            
            st.executeUpdate();
            
        }catch (SQLException ex) {
            Logger.getLogger(DAO_Pengguna.class.getName()).log(Level.SEVERE, null, ex);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(DAO_Pengguna.class.getName()).log(Level.SEVERE, null, ex);
        } finally{
            if (st!=null) {
                try {
                    st.close();
                } catch (SQLException ex) {
                    Logger.getLogger(DAO_Pengguna.class.getName()).log(Level.SEVERE, null, ex);
                }
                
            }
        }
    }

    @Override
    public void hapusData(Model_Pengguna mod_pengguna) {
        PreparedStatement st = null;
        String sql = "DELETE FROM pengguna WHERE id_pengguna=?";
        try{
            st = conn.prepareStatement(sql);
            st.setString(1, mod_pengguna.getId_pengguna());
           
            st.executeUpdate();
        }catch (SQLException ex) {
            java.util.logging.Logger.getLogger(DAO_Pengguna.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            if (st!=null) {
                try {
                    st.close();
                } catch (SQLException ex) {
                    java.util.logging.Logger.getLogger(DAO_Pengguna.class.getName()).log(Level.SEVERE, null, ex);
                }
                
            }
        }
    }

    @Override
    public List<Model_Pengguna> getData() {
        PreparedStatement st = null;
        List list = new ArrayList();
        ResultSet rs = null;
        String sql ="SELECT * FROM pengguna";
        try {
            st = conn.prepareStatement(sql);
            rs = st.executeQuery();
            while(rs.next()) {
                Model_Pengguna model = new Model_Pengguna();
                model.setId_pengguna(rs.getString ("id_pengguna"));
                model.setNama_pengguna(rs.getString ("nama_pengguna"));
                model.setUsername(rs.getString ("username"));
                model.setTelp_pengguna(rs.getString ("telp_pengguna"));
                model.setAlamat_pengguna(rs.getString ("alamat_pengguna"));
                model.setLevel(rs.getString ("level"));
                
                list.add(model);
            }
          return list;
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(DAO_Pengguna.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }finally{
            if (st!=null) {
                try {
                    st.close();
                } catch (SQLException ex) {
                    java.util.logging.Logger.getLogger(DAO_Pengguna.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (rs!=null) {
                try {
                    rs.close();
                } catch (SQLException ex) {
                    java.util.logging.Logger.getLogger(DAO_Pengguna.class.getName()).log(Level.SEVERE, null, ex);
            }
            }
        }
    }

    @Override
    public List<Model_Pengguna> pencarian(String id) {
        PreparedStatement st = null;
        List list = new ArrayList();
        ResultSet rs = null;
        String sql ="SELECT * FROM pengguna WHERE id_pengguna LIKE '%"+id+"%' OR nama_pengguna LIKE '%"+id+"%' OR username LIKE '%"+id+"%' OR telp_pengguna LIKE '%"+id+"%'";
        try {
            st = conn.prepareStatement(sql);
            rs = st.executeQuery();
            while(rs.next()) {
                Model_Pengguna model = new Model_Pengguna();
                model.setId_pengguna(rs.getString ("id_pengguna"));
                model.setNama_pengguna(rs.getString ("nama_pengguna"));
                model.setUsername(rs.getString ("username"));
                model.setTelp_pengguna(rs.getString ("telp_pengguna"));
                model.setAlamat_pengguna(rs.getString ("alamat_pengguna"));
                model.setLevel(rs.getString ("level"));
                                
                list.add(model);
            }
          return list;
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(DAO_Pengguna.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }finally{
            if (st!=null) {
                try {
                    st.close();
                } catch (SQLException ex) {
                    java.util.logging.Logger.getLogger(DAO_Pengguna.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (rs!=null) {
                try {
                    rs.close();
                } catch (SQLException ex) {
                    java.util.logging.Logger.getLogger(DAO_Pengguna.class.getName()).log(Level.SEVERE, null, ex);
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

        String sql = "SELECT RIGHT(id_pengguna, 3) AS Nomor FROM pengguna WHERE id_pengguna LIKE 'USR" + no + "%' ORDER BY id_pengguna DESC LIMIT 1";

        try {
            st = conn.prepareStatement(sql);
            rs = st.executeQuery();

            if (rs.next()) {
                int nomor = Integer.parseInt(rs.getString("Nomor"));
                nomor++;
                urutan = "USR" + no + String.format("%03d", nomor);
            } else {
                urutan = "USR" + no + "001";
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
    public boolean validateOldPassword(String username, String oldPassword) {
        
        String encryptedOldPassword = Encrypt.getmd5java(oldPassword);
        //return userDao.validateOldPassword(Koneksi.getConnection(), username, encryptedOldPassword);
        try {
            String sql = "SELECT * FROM pengguna WHERE username = ? AND password = ?";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, username);
            pstmt.setString(2, encryptedOldPassword);
            ResultSet rs = pstmt.executeQuery();
            return rs.next();
        } catch (SQLException ex) {
            ex.printStackTrace();
            return false;
        }
        
    }

    @Override
    public boolean changePassword(String username, String oldPassword, String newPassword) {
        
        String encryptedOldPassword = Encrypt.getmd5java(oldPassword);
        String encryptedNewPassword = Encrypt.getmd5java(newPassword);
        try {
            String sql = "SELECT * FROM pengguna WHERE username = ? AND password = ?";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, username);
            pstmt.setString(2, encryptedOldPassword);
            ResultSet rs = pstmt.executeQuery();
            if (rs.next()) {
                String sqlUpdate = "UPDATE pengguna SET password = ? WHERE username = ?";
                PreparedStatement pstmtUpdate = conn.prepareStatement(sqlUpdate);
                pstmtUpdate.setString(1, encryptedNewPassword);
                pstmtUpdate.setString(2, username);
                int result = pstmtUpdate.executeUpdate();
                return result > 0;
            } else {
                return false;
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            return false;
        }
        
    
    }

    @Override
    public void tampilGambar(JLabel lb_gambar, String id) {
        try {
            String sql = "SELECT * FROM pengguna WHERE id_pengguna = '" + id + "'";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);

            if (rs.next()) {
                byte[] img = rs.getBytes("gambar");
                if (img != null) {
                    ImageIcon imageIcon = new ImageIcon(new ImageIcon(img).getImage().getScaledInstance(lb_gambar.getWidth(), lb_gambar.getHeight(), Image.SCALE_SMOOTH));
                    lb_gambar.setIcon(imageIcon);
                } else {
                    ImageIcon defaultIcon = new ImageIcon(getClass().getResource("/img/icons8_worker_100px.png"));
                    lb_gambar.setIcon(defaultIcon);
                }
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
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
