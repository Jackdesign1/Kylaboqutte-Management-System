package com.inventory.view;

import com.inventory.dao.DAO_Laporan;
import com.inventory.service.Service_Laporan;

public class Laporan_Barang extends javax.swing.JPanel {

    private final Service_Laporan servis_lap = new DAO_Laporan();
    private String id;
    
    public Laporan_Barang(String id) {
        initComponents();
        this.id = id;
        pn_main.setVisible(true);
        pn_dataBarang.setVisible(false);
        pn_transaksiBarang.setVisible(false);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPanel = new javax.swing.JPanel();
        tampilData = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        pn_pilihLaporan = new javax.swing.JPanel();
        cbxLaporan = new javax.swing.JComboBox<>();
        pn_main = new javax.swing.JPanel();
        pn_dataBarang = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        btnCetak = new javax.swing.JButton();
        pn_transaksiBarang = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        btnCetak1 = new javax.swing.JButton();
        btnBatal = new javax.swing.JButton();
        pn_tampilLaporan = new javax.swing.JPanel();

        setLayout(new java.awt.CardLayout());

        mainPanel.setLayout(new java.awt.CardLayout());

        tampilData.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Poppins", 0, 24)); // NOI18N
        jLabel1.setText("Laporan Barang");

        pn_pilihLaporan.setBackground(new java.awt.Color(255, 255, 255));
        pn_pilihLaporan.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cbxLaporan.setBackground(new java.awt.Color(175, 99, 154));
        cbxLaporan.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        cbxLaporan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-- Pilih Jenis Laporan --", "Laporan Data Barang", "Laporan Transaksi Barang" }));
        cbxLaporan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxLaporanActionPerformed(evt);
            }
        });
        pn_pilihLaporan.add(cbxLaporan, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 270, 30));

        javax.swing.GroupLayout pn_mainLayout = new javax.swing.GroupLayout(pn_main);
        pn_main.setLayout(pn_mainLayout);
        pn_mainLayout.setHorizontalGroup(
            pn_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 274, Short.MAX_VALUE)
        );
        pn_mainLayout.setVerticalGroup(
            pn_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 160, Short.MAX_VALUE)
        );

        pn_pilihLaporan.add(pn_main, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 274, 160));

        jLabel4.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Laporan Data Barang");

        btnCetak.setBackground(new java.awt.Color(175, 99, 154));
        btnCetak.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        btnCetak.setText("CETAK");
        btnCetak.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCetakActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pn_dataBarangLayout = new javax.swing.GroupLayout(pn_dataBarang);
        pn_dataBarang.setLayout(pn_dataBarangLayout);
        pn_dataBarangLayout.setHorizontalGroup(
            pn_dataBarangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_dataBarangLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pn_dataBarangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 262, Short.MAX_VALUE)
                    .addGroup(pn_dataBarangLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnCetak, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pn_dataBarangLayout.setVerticalGroup(
            pn_dataBarangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_dataBarangLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(btnCetak, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pn_pilihLaporan.add(pn_dataBarang, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 274, 160));

        jLabel6.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Laporan Transaksi Barang");

        btnCetak1.setBackground(new java.awt.Color(175, 99, 154));
        btnCetak1.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        btnCetak1.setText("CETAK");
        btnCetak1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCetak1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pn_transaksiBarangLayout = new javax.swing.GroupLayout(pn_transaksiBarang);
        pn_transaksiBarang.setLayout(pn_transaksiBarangLayout);
        pn_transaksiBarangLayout.setHorizontalGroup(
            pn_transaksiBarangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_transaksiBarangLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pn_transaksiBarangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pn_transaksiBarangLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnCetak1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pn_transaksiBarangLayout.setVerticalGroup(
            pn_transaksiBarangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_transaksiBarangLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addComponent(btnCetak1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pn_pilihLaporan.add(pn_transaksiBarang, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 274, 160));

        btnBatal.setBackground(new java.awt.Color(175, 99, 154));
        btnBatal.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        btnBatal.setText("BATAL");
        btnBatal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBatalActionPerformed(evt);
            }
        });
        pn_pilihLaporan.add(btnBatal, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, -1, -1));

        pn_tampilLaporan.setBackground(new java.awt.Color(228, 205, 222));

        javax.swing.GroupLayout pn_tampilLaporanLayout = new javax.swing.GroupLayout(pn_tampilLaporan);
        pn_tampilLaporan.setLayout(pn_tampilLaporanLayout);
        pn_tampilLaporanLayout.setHorizontalGroup(
            pn_tampilLaporanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 632, Short.MAX_VALUE)
        );
        pn_tampilLaporanLayout.setVerticalGroup(
            pn_tampilLaporanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout tampilDataLayout = new javax.swing.GroupLayout(tampilData);
        tampilData.setLayout(tampilDataLayout);
        tampilDataLayout.setHorizontalGroup(
            tampilDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tampilDataLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(tampilDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(tampilDataLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(tampilDataLayout.createSequentialGroup()
                        .addComponent(pn_pilihLaporan, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(pn_tampilLaporan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        tampilDataLayout.setVerticalGroup(
            tampilDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tampilDataLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(tampilDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pn_tampilLaporan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pn_pilihLaporan, javax.swing.GroupLayout.DEFAULT_SIZE, 605, Short.MAX_VALUE))
                .addContainerGap())
        );

        mainPanel.add(tampilData, "card3");

        add(mainPanel, "card2");
    }// </editor-fold>//GEN-END:initComponents

    private void cbxLaporanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxLaporanActionPerformed
        if(cbxLaporan.getSelectedItem()=="-- Pilih Jenis Laporan --"){
            pn_main.setVisible(true);
            pn_dataBarang.setVisible(false);
            pn_transaksiBarang.setVisible(false);
        }else if(cbxLaporan.getSelectedItem()=="Laporan Data Barang"){
            pn_main.setVisible(false);
            pn_dataBarang.setVisible(true);
            pn_transaksiBarang.setVisible(false);
        }else if(cbxLaporan.getSelectedItem()=="Laporan Transaksi Barang"){
            pn_main.setVisible(false);
            pn_dataBarang.setVisible(false);
            pn_transaksiBarang.setVisible(true);
        }
    }//GEN-LAST:event_cbxLaporanActionPerformed

    private void btnBatalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBatalActionPerformed
        mainPanel.removeAll();
        mainPanel.add(new Laporan_Barang(id));
        mainPanel.repaint();
        mainPanel.revalidate();
    }//GEN-LAST:event_btnBatalActionPerformed

    private void btnCetakActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCetakActionPerformed
        pn_tampilLaporan.removeAll();
        servis_lap.lapDataBarang(pn_tampilLaporan);
    }//GEN-LAST:event_btnCetakActionPerformed

    private void btnCetak1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCetak1ActionPerformed
        pn_tampilLaporan.removeAll();
        servis_lap.lapTransaksiBarang(pn_tampilLaporan);
    }//GEN-LAST:event_btnCetak1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBatal;
    private javax.swing.JButton btnCetak;
    private javax.swing.JButton btnCetak1;
    private javax.swing.JComboBox<String> cbxLaporan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JPanel pn_dataBarang;
    private javax.swing.JPanel pn_main;
    private javax.swing.JPanel pn_pilihLaporan;
    private javax.swing.JPanel pn_tampilLaporan;
    private javax.swing.JPanel pn_transaksiBarang;
    private javax.swing.JPanel tampilData;
    // End of variables declaration//GEN-END:variables

    
    
}
