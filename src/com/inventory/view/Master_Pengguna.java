
package com.inventory.view;

import com.formdev.flatlaf.FlatClientProperties;
import com.inventory.dao.DAO_Pengguna;
import java.awt.Image;
import java.awt.Window;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.TableColumnModel;
import com.inventory.model.Model_Pengguna;
import com.inventory.service.Service_Pengguna;
import com.inventory.tablemodel.TableMod_Pengguna;
import java.awt.Color;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;


public class Master_Pengguna extends javax.swing.JPanel {

    private Service_Pengguna servis = new DAO_Pengguna();
    private TableMod_Pengguna tblModel = new TableMod_Pengguna();
    private ImageIcon imageIcon;
    
    private final int noColumnIndex = 0;
    private final int noColumnWidth = 50;
    
    public Master_Pengguna() {
        initComponents();
        
        tblData.setModel(tblModel);    
        loadData();
        setColumnWidth();
        setLayoutForm();
    }
    
    private void setLayoutForm(){
        txtCari.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "Pencarian");
        txtId.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "ID Pengguna");
        txtNama.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "Nama Pengguna");
        txtUsername.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "Username");
        txtPassword.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "Password");
        txtTelepon.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "Telepon");
        txtAlamat.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "Alamat");
        txtImagePath.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "Image Path");
        
        cbxLevel.setForeground(new Color(153, 153, 153)); // Set initial color
        cbxLevel.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (e.getStateChange() == ItemEvent.SELECTED) {
                    if (cbxLevel.getSelectedItem().equals("- Pilih Akses Level -")) {
                        cbxLevel.setForeground(new Color(153, 153, 153)); // Set to grey if "Pilih Role" is selected
                    } else {
                        cbxLevel.setForeground(new Color(0, 0, 0)); // Set to black if other item is selected
                    }
                }
            }
        });

        cbxLevel.addFocusListener(new FocusAdapter() {
            @Override
            public void focusLost(FocusEvent e) {
                if (cbxLevel.getSelectedItem().equals("- Pilih Akses Level -")) {
                    cbxLevel.setForeground(new Color(153, 153, 153)); // Set to grey if "Pilih Role" is selected
                } else {
                    cbxLevel.setForeground(new Color(0, 0, 0)); // Set to black if other item is selected
                }
            }
        });
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
        jLabel10 = new javax.swing.JLabel();
        lb_id = new javax.swing.JLabel();
        btnTambah = new javax.swing.JButton();
        btnHapus = new javax.swing.JButton();
        btnBatal = new javax.swing.JButton();
        btnCetak = new javax.swing.JButton();
        txtCari = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblData = new javax.swing.JTable();
        tambahData = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        txtUsername = new javax.swing.JTextField();
        txtNama = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        txtTelepon = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        txtAlamat = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        cbxLevel = new javax.swing.JComboBox<>();
        txtImagePath = new javax.swing.JTextField();
        lb_gambar = new javax.swing.JLabel();
        btn_gambar = new javax.swing.JButton();
        jLabel20 = new javax.swing.JLabel();
        btnTambah1 = new javax.swing.JButton();
        btnBatal1 = new javax.swing.JButton();

        setLayout(new java.awt.CardLayout());

        mainPanel.setLayout(new java.awt.CardLayout());

        tampilData.setBackground(new java.awt.Color(255, 255, 255));

        jLabel10.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        jLabel10.setText("Data Pengguna");

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

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/inventory/img/icons8_search_property_30px_1.png"))); // NOI18N

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
                        .addComponent(jLabel10)
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
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addComponent(txtCari, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel11))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 766, Short.MAX_VALUE))
                .addContainerGap())
        );
        tampilDataLayout.setVerticalGroup(
            tampilDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tampilDataLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(tampilDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(lb_id, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(tampilDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnTambah, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnHapus, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBatal, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCetak, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCari, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3)
                .addContainerGap())
        );

        mainPanel.add(tampilData, "card3");

        tambahData.setBackground(new java.awt.Color(255, 255, 255));

        jLabel12.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        jLabel12.setText("Tambah Data Pengguna");

        jPanel2.setBackground(new java.awt.Color(250, 250, 250));

        jLabel13.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel13.setText("ID");

        jLabel14.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel14.setText("Nama");

        jLabel15.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel15.setText("Password");

        jLabel16.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel16.setText("Username");

        txtId.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N

        txtUsername.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N

        txtNama.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N

        jLabel17.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel17.setText("Telepon");

        txtTelepon.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N

        jLabel18.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel18.setText("Alamat");

        txtAlamat.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N

        jLabel19.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel19.setText("Level");

        txtPassword.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N

        cbxLevel.setBackground(new java.awt.Color(175, 99, 154));
        cbxLevel.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        cbxLevel.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "- Pilih Akses Level -", "Owner", "Staff" }));

        txtImagePath.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N

        lb_gambar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_gambar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        btn_gambar.setBackground(new java.awt.Color(175, 99, 154));
        btn_gambar.setText("...");
        btn_gambar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_gambarActionPerformed(evt);
            }
        });

        jLabel20.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel20.setText("Photo");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtId)
                    .addComponent(txtNama)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel19)
                            .addComponent(jLabel13)
                            .addComponent(jLabel14)
                            .addComponent(jLabel15)
                            .addComponent(jLabel16)
                            .addComponent(jLabel17)
                            .addComponent(jLabel18)
                            .addComponent(jLabel20)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lb_gambar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtImagePath, javax.swing.GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_gambar, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(txtUsername)
                    .addComponent(txtPassword)
                    .addComponent(txtTelepon)
                    .addComponent(txtAlamat)
                    .addComponent(cbxLevel, 0, 752, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNama, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtTelepon, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel18)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtAlamat, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel19)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbxLevel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel20)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lb_gambar, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtImagePath, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_gambar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
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
                    .addComponent(jScrollPane2)
                    .addComponent(jLabel12)
                    .addGroup(tambahDataLayout.createSequentialGroup()
                        .addComponent(btnTambah1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnBatal1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        tambahDataLayout.setVerticalGroup(
            tambahDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tambahDataLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12)
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
        txtId.setText(servis.nomor());
        txtId.setEnabled(false);

        if(btnTambah.getText().equals("UBAH"))
        {
            dataTabel();
            txtTelepon.setLocation(txtTelepon.getX(), txtPassword.getY());
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
            txtId.setText(servis.nomor());

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

    private void btn_gambarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_gambarActionPerformed
        JFileChooser fileChooser = new JFileChooser();
        int option = fileChooser.showSaveDialog(null);
        if (option == JFileChooser.APPROVE_OPTION) {
            System.out.println(fileChooser.getSelectedFile());
            File selectedFile = fileChooser.getSelectedFile();
            String path = selectedFile.getAbsolutePath();
            txtImagePath.setText(path);

            try {
                // Konversi blob gambar ke ImageIcon
                byte[] img = Files.readAllBytes(selectedFile.toPath());
                ImageIcon imageIcon = new ImageIcon(img);

                // Ukuran JLabel yang diinginkan
                int labelWidth = 200;
                int labelHeight = 400;

                // Ukuran gambar asli
                int imageWidth = imageIcon.getIconWidth();
                int imageHeight = imageIcon.getIconHeight();

                // Hitung skala untuk ukuran gambar yang baru
                double scaleX = (double) labelWidth / (double) imageWidth;
                double scaleY = (double) labelHeight / (double) imageHeight;
                double scale = Math.min(scaleX, scaleY);

                // Ubah ukuran gambar dengan skala yang sudah dihitung
                Image scaledImage = imageIcon.getImage().getScaledInstance((int) (scale * imageWidth), (int) (scale * imageHeight), Image.SCALE_SMOOTH);

                // Tampilkan ImageIcon pada JLabel
                lb_gambar.setIcon(new ImageIcon(scaledImage));
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }//GEN-LAST:event_btn_gambarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBatal;
    private javax.swing.JButton btnBatal1;
    private javax.swing.JButton btnCetak;
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnTambah;
    private javax.swing.JButton btnTambah1;
    private javax.swing.JButton btn_gambar;
    private javax.swing.JComboBox<String> cbxLevel;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lb_gambar;
    private javax.swing.JLabel lb_id;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JPanel tambahData;
    private javax.swing.JPanel tampilData;
    private javax.swing.JTable tblData;
    private javax.swing.JTextField txtAlamat;
    private javax.swing.JTextField txtCari;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtImagePath;
    private javax.swing.JTextField txtNama;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtTelepon;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables

    private void dataTabel(){
            tampilData.setVisible(false);
            tambahData.setVisible(true);

            int row = tblData.getSelectedRow();
            jLabel12.setText("Perbarui Data Pengguna");

            txtId.setEnabled(false);
            txtNama.setEnabled(true);

            String id = tblData.getModel().getValueAt(row, 1).toString();
            txtId.setText            (tblData.getModel().getValueAt(row, 1).toString());
            txtNama.setText          (tblData.getModel().getValueAt(row, 2).toString());
            txtUsername.setText      (tblData.getModel().getValueAt(row, 3).toString());
            //txtPassword.setText    (tblData.getModel().getValueAt(row, 3).toString());
            txtTelepon.setText          (tblData.getModel().getValueAt(row, 4).toString());
            txtAlamat.setText        (tblData.getModel().getValueAt(row, 5).toString());
            cbxLevel.setSelectedItem(tblData.getModel().getValueAt(row, 6).toString());
            
            servis.tampilGambar(lb_gambar, id);
            
            jLabel15.setVisible(false);
            txtPassword.setVisible(false);
            
            btnTambah1.setText("PERBARUI");
            btnBatal.setVisible(true);
        }
    
    private void aktif(){
        txtId.setEnabled(true);
        txtNama.setEnabled(true);
    }

    private void loadData() {
        btnHapus.setVisible(false);
        btnBatal.setVisible(false);
        btnCetak.setVisible(false);
        List<Model_Pengguna> list = servis.getData();
        tblModel.setData(list);
    }

    private void hapusData() {
        int index = tblData.getSelectedRow();
        if (index!=-1) {
            Model_Pengguna model = tblModel.getData(tblData.convertRowIndexToModel(index));
            if (JOptionPane.showConfirmDialog(null, "Yakin data akan dihapus?","Konfirmasi", JOptionPane.OK_CANCEL_OPTION)== JOptionPane.OK_OPTION) {
                servis.hapusData(model);
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
        txtId.setText("");
        txtNama.setText("");
    }

    private void tampilPanel() {
        mainPanel.removeAll();
        mainPanel.add(new Master_Pengguna());
        mainPanel.repaint();
        mainPanel.revalidate();
    }

    private void simpanData() {
        if(validasiInput()==true){
            String ID = txtId.getText();
            String nama = txtNama.getText();
            String username = txtUsername.getText();
            String password = txtPassword.getText();
            String telepon = txtTelepon.getText();
            String alamat = txtAlamat.getText();
            String level = cbxLevel.getSelectedItem().toString();
            String imagePath = txtImagePath.getText();
            
            Model_Pengguna model = new Model_Pengguna();
            model.setId_pengguna(ID);
            model.setNama_pengguna(nama);
            model.setUsername(username);
            model.setPassword(password);
            model.setTelp_pengguna(telepon);
            model.setAlamat_pengguna(alamat);
            model.setLevel(level);
            model.setImagePath(imagePath);
            
            servis.tambahData(model);
            tblModel.tambahData(model);
            tampilPanel();
            loadData();
            resetForm();
            btnTambah.setText("TAMBAH");
        }    
    }

    private void perbaruiData() {
        int index = tblData.getSelectedRow();
        if (index!=-1) {
            Model_Pengguna mod_pen = tblModel.getData(tblData.convertRowIndexToModel(index));
            
            if(validasiInputPerbarui()==true){
                String ID = txtId.getText();
                String nama = txtNama.getText();
                String username = txtUsername.getText();
                String telepon = txtTelepon.getText();
                String alamat = txtAlamat.getText();
                String level = cbxLevel.getSelectedItem().toString();
                String imagePath = txtImagePath.getText();
                
                Model_Pengguna model = new Model_Pengguna();
                model.setId_pengguna(ID);
                model.setNama_pengguna(nama);
                model.setUsername(username);
                //model.setPassword(password);
                model.setTelp_pengguna(telepon);
                model.setAlamat_pengguna(alamat);
                model.setLevel(level);
                model.setImagePath(imagePath);
                 
                servis.perbaruiData(model);
                tblModel.perbaruiData(index, model);
                loadData();
                resetForm();
                tampilPanel();
            }
        }
    }

    private boolean validasiInput() {
        boolean valid = false;
        if (txtId.getText().trim().isEmpty() ){
            JOptionPane.showMessageDialog(null, "ID tidak boleh kosong");
        }else if (txtNama.getText().trim().isEmpty() ){
            JOptionPane.showMessageDialog(null, "Nama tidak boleh kosong");
        }else if (txtUsername.getText().trim().isEmpty() ){
            JOptionPane.showMessageDialog(null, "Username tidak boleh kosong");
        }else if (txtPassword.getText().trim().isEmpty() ){
            JOptionPane.showMessageDialog(null, "Password tidak boleh kosong");
        }else if (txtTelepon.getText().trim().isEmpty() ){
            JOptionPane.showMessageDialog(null, "No Telepon tidak boleh kosong");
        }else if (txtAlamat.getText().trim().isEmpty() ){
            JOptionPane.showMessageDialog(null, "Alamat tidak boleh kosong");
        }else if (cbxLevel.getSelectedItem().equals("- Pilih Akses Level -")){
            JOptionPane.showMessageDialog(null, "Level harus dipilih");
        }else{
            valid = true;
        }
        return valid;
    }
    
    private boolean validasiInputPerbarui() {
        boolean valid = false;
        if (txtId.getText().trim().isEmpty() ){
            JOptionPane.showMessageDialog(null, "ID tidak boleh kosong");
        }else if (txtNama.getText().trim().isEmpty() ){
            JOptionPane.showMessageDialog(null, "Nama tidak boleh kosong");
        }else if (txtUsername.getText().trim().isEmpty() ){
            JOptionPane.showMessageDialog(null, "Username tidak boleh kosong");
        }else if (txtTelepon.getText().trim().isEmpty() ){
            JOptionPane.showMessageDialog(null, "No Telepon tidak boleh kosong");
        }else if (txtAlamat.getText().trim().isEmpty() ){
            JOptionPane.showMessageDialog(null, "Alamat tidak boleh kosong");
        }else if (cbxLevel.getSelectedItem().equals("- Pilih Akses Level -")){
            JOptionPane.showMessageDialog(null, "Level harus dipilih");
        }else{
            valid = true;
        }
        return valid;
    }

    private void pencarian() {
        List<Model_Pengguna> list = servis.pencarian(txtCari.getText());
        tblModel.setData(list);
    }
}
