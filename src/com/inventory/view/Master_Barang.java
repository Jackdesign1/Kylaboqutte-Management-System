
package com.inventory.view;

import com.formdev.flatlaf.FlatClientProperties;
import com.inventory.config.Koneksi;
import com.inventory.dao.DAO_Barang;
import java.sql.Connection;
import java.util.List;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.TableColumnModel;
import com.inventory.model.Model_Barang;
import com.inventory.model.Model_JenisBarang;
import com.inventory.service.Service_Barang;
import com.inventory.tablemodel.TableMod_Barang;
import java.awt.Color;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class Master_Barang extends javax.swing.JPanel {

    private Service_Barang servis = new DAO_Barang();
    private TableMod_Barang tblModel = new TableMod_Barang();
    
    private Connection conn;
    
    
    public Master_Barang() {
        initComponents();
        tblData.setModel(tblModel);
        conn = Koneksi.getConnection();
        
        loadData();
        setColumnWidth();
        setLayoutForm();
    }
    
    private void setLayoutForm(){
        txtCari.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "Pencarian");
        txtKodeBarang.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "Kode Barang");
        txtKodeJenisBarang.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "Kode Jenis Barang");
        txtNamaJenisBarang.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "Nama Jenis Barang");
        txtNamaBarang.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "Nama Barang");
        txtHarga.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "Harga");
        txtStok.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "Stok");
        
        cbxSatuan.setForeground(new Color(153, 153, 153)); // Set initial color
        cbxSatuan.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (e.getStateChange() == ItemEvent.SELECTED) {
                    if (cbxSatuan.getSelectedItem().equals("- Jenis Satuan -")) {
                        cbxSatuan.setForeground(new Color(153, 153, 153)); // Set to grey if "Pilih Role" is selected
                    } else {
                        cbxSatuan.setForeground(new Color(0, 0, 0)); // Set to black if other item is selected
                    }
                }
            }
        });

        cbxSatuan.addFocusListener(new FocusAdapter() {
            @Override
            public void focusLost(FocusEvent e) {
                if (cbxSatuan.getSelectedItem().equals("- Jenis Satuan -")) {
                    cbxSatuan.setForeground(new Color(153, 153, 153)); // Set to grey if "Pilih Role" is selected
                } else {
                    cbxSatuan.setForeground(new Color(0, 0, 0)); // Set to black if other item is selected
                }
            }
        });
    }
    
    private void setColumnWidth() {
        TableColumnModel columnModel = tblData.getColumnModel();
        columnModel.getColumn(0).setPreferredWidth(50);
        columnModel.getColumn(0).setMaxWidth(50);
        columnModel.getColumn(0).setMinWidth(50);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPanel = new javax.swing.JPanel();
        tampilData = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
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
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btn_jenisBarang = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtKodeBarang = new javax.swing.JTextField();
        txtStok = new javax.swing.JTextField();
        txtHarga = new javax.swing.JTextField();
        cbxSatuan = new javax.swing.JComboBox<>();
        txtNamaBarang = new javax.swing.JTextField();
        txtNamaJenisBarang = new javax.swing.JTextField();
        txtKodeJenisBarang = new javax.swing.JTextField();
        btnTambah1 = new javax.swing.JButton();
        btnBatal1 = new javax.swing.JButton();

        setLayout(new java.awt.CardLayout());

        mainPanel.setLayout(new java.awt.CardLayout());

        tampilData.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        jLabel1.setText("Data Barang");

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
                        .addComponent(jLabel1)
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
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 802, Short.MAX_VALUE))
                .addContainerGap())
        );
        tampilDataLayout.setVerticalGroup(
            tampilDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tampilDataLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(tampilDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
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
                .addComponent(jScrollPane3)
                .addContainerGap())
        );

        mainPanel.add(tampilData, "card3");

        tambahData.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        jLabel2.setText("Tambah Data Barang");

        jPanel1.setBackground(new java.awt.Color(250, 250, 250));

        jLabel3.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel3.setText("Kode Barang");

        jLabel4.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel4.setText("Jenis Barang");

        btn_jenisBarang.setBackground(new java.awt.Color(175, 99, 154));
        btn_jenisBarang.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        btn_jenisBarang.setText("...");
        btn_jenisBarang.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_jenisBarang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_jenisBarangActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel5.setText("Nama Jenis Barang");

        jLabel6.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel6.setText("Satuan");

        jLabel7.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel7.setText("Harga");

        jLabel8.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel8.setText("Stok");

        jLabel9.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel9.setText("Nama Barang");

        txtKodeBarang.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N

        txtStok.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N

        txtHarga.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N

        cbxSatuan.setBackground(new java.awt.Color(175, 99, 154));
        cbxSatuan.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        cbxSatuan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "- Jenis Satuan -", "pcs", "lusin", " " }));

        txtNamaBarang.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N

        txtNamaJenisBarang.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N

        txtKodeJenisBarang.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(txtKodeJenisBarang, javax.swing.GroupLayout.DEFAULT_SIZE, 710, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_jenisBarang, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtStok)
                    .addComponent(txtHarga)
                    .addComponent(cbxSatuan, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtNamaBarang)
                    .addComponent(txtNamaJenisBarang)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(txtKodeBarang))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtKodeBarang, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtKodeJenisBarang, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_jenisBarang, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNamaJenisBarang, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel9)
                .addGap(11, 11, 11)
                .addComponent(txtNamaBarang, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbxSatuan, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtHarga, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtStok, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jScrollPane2.setViewportView(jPanel1);

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
                    .addComponent(jScrollPane2)
                    .addGroup(tambahDataLayout.createSequentialGroup()
                        .addGroup(tambahDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
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
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(tambahDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnTambah1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBatal1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2)
                .addContainerGap())
        );

        mainPanel.add(tambahData, "card4");

        add(mainPanel, "card2");
    }// </editor-fold>//GEN-END:initComponents

    private void btn_jenisBarangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_jenisBarangActionPerformed
        boolean closable = true;
        Data_JenisBarang djb = new Data_JenisBarang(null, closable);
        djb.setVisible(true);

        txtKodeJenisBarang.setText(djb.jb.getKode_jenis());
        txtNamaJenisBarang.setText(djb.jb.getNama_jenis());

        txtKodeJenisBarang.setEnabled(false);
        txtKodeBarang.setEnabled(false);
        txtNamaBarang.requestFocus();
        aktif();
    }//GEN-LAST:event_btn_jenisBarangActionPerformed

    private void btnTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTambahActionPerformed
        mainPanel.removeAll();
        mainPanel.repaint();
        mainPanel.revalidate();

        mainPanel.add(tambahData);
        mainPanel.repaint();
        mainPanel.revalidate();

        btnTambah1.setText("SIMPAN");
        btn_jenisBarang.setEnabled(true);
        txtKodeBarang.setEnabled(false);
        txtKodeBarang.setText(servis.nomor());

        if(btnTambah.getText().equals("UBAH"))
        {
            dataTabel();
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
            //txtKodeBarang.setText(servis.nomor());

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
    private javax.swing.JButton btn_jenisBarang;
    private javax.swing.JComboBox<String> cbxSatuan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lb_id;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JPanel tambahData;
    private javax.swing.JPanel tampilData;
    private javax.swing.JTable tblData;
    private javax.swing.JTextField txtCari;
    private javax.swing.JTextField txtHarga;
    private javax.swing.JTextField txtKodeBarang;
    private javax.swing.JTextField txtKodeJenisBarang;
    private javax.swing.JTextField txtNamaBarang;
    private javax.swing.JTextField txtNamaJenisBarang;
    private javax.swing.JTextField txtStok;
    // End of variables declaration//GEN-END:variables

    private void dataTabel(){
            tampilData.setVisible(false);
            tambahData.setVisible(true);

            int row = tblData.getSelectedRow();
            jLabel2.setText("Perbarui Data Barang");

            txtKodeBarang.setEnabled(false);
            txtKodeJenisBarang.setEnabled(true);
            txtKodeBarang.setEnabled(true);

            txtKodeBarang.setText        (tblData.getModel().getValueAt(row, 1).toString());
            txtKodeJenisBarang.setText       (tblData.getModel().getValueAt(row, 2).toString());
            txtNamaJenisBarang.setText   (tblData.getModel().getValueAt(row, 3).toString());
            txtNamaBarang.setText        (tblData.getModel().getValueAt(row, 4).toString());
            cbxSatuan.setSelectedItem  (tblData.getModel().getValueAt(row, 5).toString());
            txtHarga.setText             (tblData.getModel().getValueAt(row, 6).toString());
            txtStok.setText              (tblData.getModel().getValueAt(row, 7).toString());

            aktif();
            btnTambah1.setText("PERBARUI");
            btnBatal.setVisible(true);
        }
    
    private void aktif(){
        txtNamaBarang.setEnabled(true);
        cbxSatuan.setEnabled(true);
        txtHarga.setEnabled(true);
        txtStok.setEnabled(true);
    }

    private void loadData() {
        btnHapus.setVisible(false);
        btnBatal.setVisible(false);
        btnCetak.setVisible(false);
        List<Model_Barang> list = servis.getData();
        tblModel.setData(list);
    }

    private void hapusData() {
        int index = tblData.getSelectedRow();
        if (index!=-1) {
            Model_Barang brg = tblModel.getData(tblData.convertRowIndexToModel(index));
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
        txtKodeBarang.setText("");
        txtKodeJenisBarang.setText("");
        txtKodeBarang.setText("");
        txtNamaBarang.setText("");
        cbxSatuan.setSelectedItem(0);
        txtHarga.setText("");
        txtStok.setText("");
    }

    private void tampilPanel() {
        mainPanel.removeAll();
        String id = lb_id.getText();
        mainPanel.add(new Master_Barang());
        mainPanel.repaint();
        mainPanel.revalidate();
    }

    private void simpanData() {
        if(validasiInput()==true){
            String kode_barang   = txtKodeBarang.getText();
            String kode_jenis    = txtKodeJenisBarang.getText();
            String nama_jenisbarang   = txtKodeBarang.getText();
            String nama_barang   = txtNamaBarang.getText();
            String satuan        = cbxSatuan.getSelectedItem().toString();
            Long harga           = Long.parseLong(txtHarga.getText());
            int stok         = Integer.parseInt(txtStok.getText());

            Model_Barang brg = new Model_Barang();
            Model_JenisBarang jbr = new Model_JenisBarang();

            brg.setKode_barang(kode_barang);
            jbr.setKode_jenis(kode_jenis);
            jbr.setNama_jenis(nama_jenisbarang);
            brg.setNama_barang(nama_barang);
            brg.setSatuan(satuan);
            brg.setHarga(harga);
            brg.setStok(stok);

            brg.setJns_barang(jbr);

            servis.tambahData(brg);
            tblModel.tambahData(brg);
            loadData();
            resetForm();
            tampilPanel();
            btnTambah1.setText("TAMBAH");
        }
    }

    private void perbaruiData() {
        int index = tblData.getSelectedRow();
        if (index!=-1) {
            Model_Barang mobar = tblModel.getData(tblData.convertRowIndexToModel(index));
             
            if(validasiInput()==true){
                String kode_barang  = txtKodeBarang.getText();
                String kode_jenis   = txtKodeJenisBarang.getText();
                //String nama_jenis   = txtNamaJenisBarang.getText();
                String nama_barang  = txtNamaBarang.getText();
                String satuan       = cbxSatuan.getSelectedItem().toString();
                Long harga          = Long.parseLong(txtHarga.getText());
                int stok         = Integer.parseInt(txtStok.getText());

                Model_Barang brg = new Model_Barang();
                Model_JenisBarang jbr = new Model_JenisBarang();

                jbr.setKode_jenis(kode_jenis);
                //jbr.setNama_jenis(nama_jenis);
                brg.setKode_barang(kode_barang);
                brg.setNama_barang(nama_barang);
                brg.setSatuan(satuan);
                brg.setHarga(harga);
                brg.setStok(stok);

                brg.setJns_barang(jbr);

                servis.perbaruiData(brg);
                tblModel.perbaruiData(index, brg);
                loadData();
                resetForm();
                tampilPanel();
                
            }   
        }
    }

    private boolean validasiInput() {
        boolean valid = false;
        if (txtKodeBarang.getText().trim().isEmpty() ){
            JOptionPane.showMessageDialog(null, "Kode Barang tidak boleh kosong");
        }else if (txtKodeJenisBarang.getText().trim().isEmpty() ){
            JOptionPane.showMessageDialog(null, "Kode Jenis Barang tidak boleh kosong");
        }else if (txtNamaJenisBarang.getText().trim().isEmpty() ){
            JOptionPane.showMessageDialog(null, "Nama Jenis Barang tidak boleh kosong");
        }else if (txtNamaBarang.getText().trim().isEmpty() ){
            JOptionPane.showMessageDialog(null, "Nama Barang tidak boleh kosong");
        }else if (cbxSatuan.getSelectedItem().equals(null) ){
            JOptionPane.showMessageDialog(null, "Satuan tidak boleh kosong");
        }else if (txtHarga.getText().trim().isEmpty() ){
            JOptionPane.showMessageDialog(null, "Harga tidak boleh kosong");
        }else if (txtStok.getText().trim().isEmpty() ){
            JOptionPane.showMessageDialog(null, "Stok tidak boleh kosong");
        }else{
            valid = true;
        }
        return valid;
    }

    private void pencarian() {
        List<Model_Barang> list = servis.pencarian(txtCari.getText());
        tblModel.setData(list);
    }

    
}
