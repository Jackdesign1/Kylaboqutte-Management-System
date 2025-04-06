
package com.inventory.view;

import com.formdev.flatlaf.FlatClientProperties;
import com.inventory.dao.DAO_JenisBarang;
import java.util.List;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.TableColumnModel;
import com.inventory.model.Model_JenisBarang;
import com.inventory.service.Service_JenisBarang;
import com.inventory.tablemodel.TableMod_JenisBarang;


public class Master_JenisBarang extends javax.swing.JPanel {

    private Service_JenisBarang servis = new DAO_JenisBarang();
    private TableMod_JenisBarang tblModel = new TableMod_JenisBarang();
    
    private final int noColumnIndex = 0;
    private final int noColumnWidth = 50;
    
    public Master_JenisBarang() {
        initComponents();
        
        tblData.setModel(tblModel);
        setColumnWidth();
        loadData();
        setLayoutForm();
    }
    
    private void setLayoutForm(){
        txtCari.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "Pencarian");
        txtKode.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "Kode Jenis Barang");
        txtNama.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "Nama Jenis Barang");
    }
    
    
    private void setColumnWidth() {
        TableColumnModel columnModel = tblData.getColumnModel();
        columnModel.getColumn(noColumnIndex).setPreferredWidth(noColumnWidth);
        columnModel.getColumn(noColumnIndex).setMaxWidth(noColumnWidth);
        columnModel.getColumn(noColumnIndex).setMinWidth(noColumnWidth);
    }
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPanel = new javax.swing.JPanel();
        tampilData = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        lb_id = new javax.swing.JLabel();
        btnTambah = new javax.swing.JButton();
        btnHapus = new javax.swing.JButton();
        btnBatal = new javax.swing.JButton();
        btnCetak = new javax.swing.JButton();
        txtCari = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblData = new javax.swing.JTable();
        tambahData = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtKode = new javax.swing.JTextField();
        txtNama = new javax.swing.JTextField();
        btnTambah1 = new javax.swing.JButton();
        btnBatal1 = new javax.swing.JButton();

        setLayout(new java.awt.CardLayout());

        mainPanel.setLayout(new java.awt.CardLayout());

        tampilData.setBackground(new java.awt.Color(255, 255, 255));

        jLabel7.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        jLabel7.setText("Data Jenis Barang");

        lb_id.setForeground(new java.awt.Color(255, 255, 255));
        lb_id.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lb_id.setText("ID");

        btnTambah.setBackground(new java.awt.Color(175, 99, 154));
        btnTambah.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        btnTambah.setForeground(new java.awt.Color(255, 255, 255));
        btnTambah.setText("TAMBAH");
        btnTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTambahActionPerformed(evt);
            }
        });

        btnHapus.setBackground(new java.awt.Color(175, 99, 154));
        btnHapus.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        btnHapus.setForeground(new java.awt.Color(255, 255, 255));
        btnHapus.setText("HAPUS");
        btnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusActionPerformed(evt);
            }
        });

        btnBatal.setBackground(new java.awt.Color(175, 99, 154));
        btnBatal.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        btnBatal.setForeground(new java.awt.Color(255, 255, 255));
        btnBatal.setText("BATAL");
        btnBatal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBatalActionPerformed(evt);
            }
        });

        btnCetak.setBackground(new java.awt.Color(175, 99, 154));
        btnCetak.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        btnCetak.setForeground(new java.awt.Color(255, 255, 255));
        btnCetak.setText("CETAK");
        btnCetak.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCetakActionPerformed(evt);
            }
        });

        txtCari.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        txtCari.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCariKeyReleased(evt);
            }
        });

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/inventory/img/icons8_search_property_30px_1.png"))); // NOI18N

        tblData.setBackground(new java.awt.Color(228, 205, 222));
        tblData.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        tblData.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblData.setRowHeight(30);
        tblData.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblDataMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tblData);

        javax.swing.GroupLayout tampilDataLayout = new javax.swing.GroupLayout(tampilData);
        tampilData.setLayout(tampilDataLayout);
        tampilDataLayout.setHorizontalGroup(
            tampilDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tampilDataLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(tampilDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(tampilDataLayout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lb_id, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(tampilDataLayout.createSequentialGroup()
                        .addComponent(btnTambah, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnHapus, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnBatal, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnCetak, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtCari, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel10))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 748, Short.MAX_VALUE))
                .addContainerGap())
        );
        tampilDataLayout.setVerticalGroup(
            tampilDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tampilDataLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(tampilDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(lb_id, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(tampilDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnTambah, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnHapus, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBatal, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCetak, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCari, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 434, Short.MAX_VALUE)
                .addContainerGap())
        );

        mainPanel.add(tampilData, "card3");

        tambahData.setBackground(new java.awt.Color(255, 255, 255));

        jLabel8.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        jLabel8.setText("Tambah Data Jenis Barang");

        jPanel2.setBackground(new java.awt.Color(250, 250, 250));

        jLabel9.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel9.setText("Kode Jenis Barang");

        jLabel12.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel12.setText("Nama Jenis Barang");

        txtKode.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N

        txtNama.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel12))
                        .addGap(0, 602, Short.MAX_VALUE))
                    .addComponent(txtNama)
                    .addComponent(txtKode, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtKode, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNama, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(568, Short.MAX_VALUE))
        );

        jScrollPane2.setViewportView(jPanel2);

        btnTambah1.setBackground(new java.awt.Color(175, 99, 154));
        btnTambah1.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        btnTambah1.setText("TAMBAH");
        btnTambah1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTambah1ActionPerformed(evt);
            }
        });

        btnBatal1.setBackground(new java.awt.Color(175, 99, 154));
        btnBatal1.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        btnBatal1.setText("BATAL");
        btnBatal1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBatal1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout tambahDataLayout = new javax.swing.GroupLayout(tambahData);
        tambahData.setLayout(tambahDataLayout);
        tambahDataLayout.setHorizontalGroup(
            tambahDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tambahDataLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(tambahDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 748, Short.MAX_VALUE)
                    .addGroup(tambahDataLayout.createSequentialGroup()
                        .addGroup(tambahDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addGroup(tambahDataLayout.createSequentialGroup()
                                .addComponent(btnTambah1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnBatal1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        tambahDataLayout.setVerticalGroup(
            tambahDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tambahDataLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addGap(18, 18, 18)
                .addGroup(tambahDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnTambah1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBatal1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 434, Short.MAX_VALUE)
                .addContainerGap())
        );

        mainPanel.add(tambahData, "card4");

        add(mainPanel, "card2");
    }// </editor-fold>//GEN-END:initComponents

    private void tbl_dataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_dataMouseClicked
        if(btnTambah.getText().equals("TAMBAH"))
        {
            btnTambah.setText("UBAH");

        }
        btnHapus.setVisible(true);
        btnBatal.setVisible(true);
    }//GEN-LAST:event_tbl_dataMouseClicked

    private void btnTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTambahActionPerformed
        mainPanel.removeAll();
        mainPanel.repaint();
        mainPanel.revalidate();

        mainPanel.add(tambahData);
        mainPanel.repaint();
        mainPanel.revalidate();

        btnTambah1.setText("SIMPAN");
        txtKode.setText(servis.nomor());
        txtKode.setEnabled(false);

        if(btnTambah.getText().equals("UBAH"))
        {
            dataTabel();
            //lb_nb.setVisible(false);

        }
    }//GEN-LAST:event_btnTambahActionPerformed

    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed
        hapusData();
    }//GEN-LAST:event_btnHapusActionPerformed

    private void btnBatalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBatalActionPerformed
        tampilPanel();
        loadData();
    }//GEN-LAST:event_btnBatalActionPerformed

    private void btnCetakActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCetakActionPerformed
        JFileChooser fileChooser = new JFileChooser();
        int option = fileChooser.showSaveDialog(null);
        if (option == JFileChooser.APPROVE_OPTION) {
            String filePath = fileChooser.getSelectedFile().getAbsolutePath() + ".xlsx";
            servis.exportToExcel(tblData, filePath);
        }
    }//GEN-LAST:event_btnCetakActionPerformed

    private void txtCariKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCariKeyReleased
        pencarian();
    }//GEN-LAST:event_txtCariKeyReleased

    private void tblDataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDataMouseClicked
        if(btnTambah.getText().equals("TAMBAH"))
        {
            btnTambah.setText("UBAH");

        }
        btnHapus.setVisible(true);
        btnBatal.setVisible(true);
        btnCetak.setVisible(true);
    }//GEN-LAST:event_tblDataMouseClicked

    private void btnTambah1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTambah1ActionPerformed
        if(btnTambah1.getText().equals("TAMBAH"))
        {
            btnTambah1.setText("SIMPAN");
            txtKode.setText(servis.nomor());
            
        }
        else if(btnTambah1.getText().equals("SIMPAN"))
        {
            simpanData();
            
        }
        else if(btnTambah1.getText().equals("PERBARUI"))
        {
            perbaruiData();
            
        }
    }//GEN-LAST:event_btnTambah1ActionPerformed

    private void btnBatal1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBatal1ActionPerformed
        tampilPanel();
        loadData();
        resetForm();
    }//GEN-LAST:event_btnBatal1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBatal;
    private javax.swing.JButton btnBatal1;
    private javax.swing.JButton btnCetak;
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnTambah;
    private javax.swing.JButton btnTambah1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lb_id;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JPanel tambahData;
    private javax.swing.JPanel tampilData;
    private javax.swing.JTable tblData;
    private javax.swing.JTextField txtCari;
    private javax.swing.JTextField txtKode;
    private javax.swing.JTextField txtNama;
    // End of variables declaration//GEN-END:variables

    private void dataTabel(){
            tampilData.setVisible(false);
            tambahData.setVisible(true);

            int row = tblData.getSelectedRow();
            jLabel8.setText("Perbarui Data Jenis Barang");

            txtKode.setEnabled(false);
            txtNama.setEnabled(true);

            txtKode.setText   (tblData.getModel().getValueAt(row, 1).toString());
            txtNama.setText   (tblData.getModel().getValueAt(row, 2).toString());

            btnTambah1.setText("PERBARUI");
            btnBatal.setVisible(true);
        }
    
    private void aktif(){
        txtKode.setEnabled(true);
        txtNama.setEnabled(true);
    }

    private void loadData() {
        btnHapus.setVisible(false);
        btnBatal.setVisible(false);
        btnCetak.setVisible(false);
        List<Model_JenisBarang> list = servis.getData();
        tblModel.setData(list);
    }

    private void hapusData() {
        int index = tblData.getSelectedRow();
        if (index!=-1) {
            Model_JenisBarang brg = tblModel.getData(tblData.convertRowIndexToModel(index));
            if (JOptionPane.showConfirmDialog(null, "Yakin data akan dihapus?","Konfirmasi", JOptionPane.OK_CANCEL_OPTION)== JOptionPane.OK_OPTION) {
                servis.hapusData(brg);
                tblModel.hapusData(index);
                loadData();
                resetForm();
            }
        }else{
            JOptionPane.showMessageDialog(null, "Pilih dahulu record yang akan diupdate");
        
        }
    }

    private void resetForm() {
        btnTambah.requestFocus();
        btnTambah.setText("TAMBAH");
        txtKode.setText("");
        txtNama.setText("");
    }

    private void tampilPanel() {
        mainPanel.removeAll();
        mainPanel.add(new Master_JenisBarang());
        mainPanel.repaint();
        mainPanel.revalidate();
    }

    private void simpanData() {
        String kode = txtKode.getText();
        String nama = txtNama.getText();
        
        Model_JenisBarang jb = new Model_JenisBarang();
        jb.setKode_jenis(kode);
        jb.setNama_jenis(nama);
        
        if(servis.validasiNamaJenisBarang(jb)==true)
        {
            if(validasiInput()==true){
                String kode_jenis   = txtKode.getText();
                String nama_jenis = txtNama.getText();

                Model_JenisBarang jbg = new Model_JenisBarang();
                jbg.setKode_jenis(kode_jenis);
                jbg.setNama_jenis(nama_jenis);

                servis.tambahData(jb);
                tblModel.tambahData(jb);
                tampilPanel();
                loadData();
                resetForm();
                btnTambah.setText("TAMBAH");
            }
        }else
        {
            txtNama.requestFocus();
        }
    }

    private void perbaruiData() {
        int index = tblData.getSelectedRow();
        if (index!=-1) {
            Model_JenisBarang mobar = tblModel.getData(tblData.convertRowIndexToModel(index));
            
            String kode = txtKode.getText();
            String nama = txtNama.getText();
            
            Model_JenisBarang jb = new Model_JenisBarang();
            jb.setKode_jenis(kode);
            jb.setNama_jenis(nama);
            
            if(servis.validasiNamaJenisBarang(jb)==true)
            {
                if(validasiInput()==true){
                    String kode_jenis  = txtKode.getText();
                    String nama_jenis   = txtNama.getText();

                    Model_JenisBarang jbr = new Model_JenisBarang();

                    jbr.setKode_jenis(kode_jenis);
                    jbr.setNama_jenis(nama_jenis);

                    servis.perbaruiData(jbr);
                    tblModel.perbaruiData(index, jbr);
                    loadData();
                    resetForm();
                    tampilPanel();

                }}
            else
            {
                txtNama.requestFocus();
            }   
        }
    }

    private boolean validasiInput() {
        boolean valid = false;
        if (txtKode.getText().trim().isEmpty() ){
            JOptionPane.showMessageDialog(null, "Kode Jenis Barang tidak boleh kosong");
        }else if (txtNama.getText().trim().isEmpty() ){
            JOptionPane.showMessageDialog(null, "Nama Jenis Barang tidak boleh kosong");
        }else{
            valid = true;
        }
        return valid;
    }

    private void pencarian() {
        List<Model_JenisBarang> list = servis.pencarian(txtCari.getText());
        tblModel.setData(list);
    }
}
