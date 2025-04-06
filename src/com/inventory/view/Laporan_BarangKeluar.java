
package com.inventory.view;

import com.formdev.flatlaf.FlatClientProperties;
import com.inventory.dao.DAO_Laporan;
import java.text.SimpleDateFormat;
import com.inventory.service.Service_Laporan;

public class Laporan_BarangKeluar extends javax.swing.JPanel {

    private Service_Laporan servis_lap = new DAO_Laporan();
    private String id;
    
    public Laporan_BarangKeluar(String id) {
        initComponents();
        this.id = id;
        pn_main.setVisible(true);
        pn_perTransaksi.setVisible(false);
        pn_perPeriode.setVisible(false);
        pn_perBulan.setVisible(false);
        
        setLayoutForm();
     }
    
    private void setLayoutForm(){
        t_noTransaksi.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "No Transaksi");
        t_dateFrom.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "Tanggal Mulai");
        t_dateAfter.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "Tanggal Akhir");
     }
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dateChooser1 = new com.raven.datechooser.DateChooser();
        dateChooser2 = new com.raven.datechooser.DateChooser();
        mainPanel = new javax.swing.JPanel();
        tampilData = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        pn_pilihLaporan = new javax.swing.JPanel();
        cbx_laporan = new javax.swing.JComboBox<>();
        pn_main = new javax.swing.JPanel();
        pn_perTransaksi = new javax.swing.JPanel();
        t_noTransaksi = new javax.swing.JTextField();
        btn_pilih = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        btnCetakPerTransaksi = new javax.swing.JButton();
        pn_perPeriode = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        t_dateFrom = new javax.swing.JTextField();
        btn_dari = new javax.swing.JButton();
        t_dateAfter = new javax.swing.JTextField();
        btn_sampai = new javax.swing.JButton();
        btnCetakPerPeriode = new javax.swing.JButton();
        pn_perBulan = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        cbx_bulan = new javax.swing.JComboBox<>();
        jYearChooser1 = new com.toedter.calendar.JYearChooser();
        btnCetakPerBulan = new javax.swing.JButton();
        btnBatal = new javax.swing.JButton();
        pn_tampilLaporan = new javax.swing.JPanel();

        dateChooser1.setTextRefernce(t_dateFrom);

        dateChooser2.setTextRefernce(t_dateAfter);

        setLayout(new java.awt.CardLayout());

        mainPanel.setLayout(new java.awt.CardLayout());

        tampilData.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Poppins", 0, 24)); // NOI18N
        jLabel1.setText("Laporan Barang Keluar");

        pn_pilihLaporan.setBackground(new java.awt.Color(255, 255, 255));
        pn_pilihLaporan.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cbx_laporan.setBackground(new java.awt.Color(175, 99, 154));
        cbx_laporan.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        cbx_laporan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-- Pilih Jenis Laporan --", "Per Transaksi", "Per Periode", "Per Bulan" }));
        cbx_laporan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbx_laporanActionPerformed(evt);
            }
        });
        pn_pilihLaporan.add(cbx_laporan, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 274, 30));

        javax.swing.GroupLayout pn_mainLayout = new javax.swing.GroupLayout(pn_main);
        pn_main.setLayout(pn_mainLayout);
        pn_mainLayout.setHorizontalGroup(
            pn_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 274, Short.MAX_VALUE)
        );
        pn_mainLayout.setVerticalGroup(
            pn_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 200, Short.MAX_VALUE)
        );

        pn_pilihLaporan.add(pn_main, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 274, 200));

        t_noTransaksi.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N

        btn_pilih.setBackground(new java.awt.Color(175, 99, 154));
        btn_pilih.setText("...");
        btn_pilih.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_pilihActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Pilih Transaksi");

        btnCetakPerTransaksi.setBackground(new java.awt.Color(175, 99, 154));
        btnCetakPerTransaksi.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        btnCetakPerTransaksi.setText("CETAK");
        btnCetakPerTransaksi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCetakPerTransaksiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pn_perTransaksiLayout = new javax.swing.GroupLayout(pn_perTransaksi);
        pn_perTransaksi.setLayout(pn_perTransaksiLayout);
        pn_perTransaksiLayout.setHorizontalGroup(
            pn_perTransaksiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_perTransaksiLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pn_perTransaksiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pn_perTransaksiLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnCetakPerTransaksi, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pn_perTransaksiLayout.createSequentialGroup()
                        .addComponent(t_noTransaksi)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_pilih, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        pn_perTransaksiLayout.setVerticalGroup(
            pn_perTransaksiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_perTransaksiLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addGroup(pn_perTransaksiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(t_noTransaksi, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_pilih, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnCetakPerTransaksi, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pn_pilihLaporan.add(pn_perTransaksi, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 274, 200));

        jLabel6.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Pilih Periode Tanggal");

        t_dateFrom.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N

        btn_dari.setBackground(new java.awt.Color(175, 99, 154));
        btn_dari.setText("...");
        btn_dari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_dariActionPerformed(evt);
            }
        });

        t_dateAfter.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N

        btn_sampai.setBackground(new java.awt.Color(175, 99, 154));
        btn_sampai.setText("...");
        btn_sampai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_sampaiActionPerformed(evt);
            }
        });

        btnCetakPerPeriode.setBackground(new java.awt.Color(175, 99, 154));
        btnCetakPerPeriode.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        btnCetakPerPeriode.setText("CETAK");
        btnCetakPerPeriode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCetakPerPeriodeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pn_perPeriodeLayout = new javax.swing.GroupLayout(pn_perPeriode);
        pn_perPeriode.setLayout(pn_perPeriodeLayout);
        pn_perPeriodeLayout.setHorizontalGroup(
            pn_perPeriodeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_perPeriodeLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pn_perPeriodeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pn_perPeriodeLayout.createSequentialGroup()
                        .addComponent(t_dateAfter)
                        .addGap(18, 18, 18)
                        .addComponent(btn_sampai, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pn_perPeriodeLayout.createSequentialGroup()
                        .addComponent(t_dateFrom)
                        .addGap(18, 18, 18)
                        .addComponent(btn_dari, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pn_perPeriodeLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnCetakPerPeriode, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pn_perPeriodeLayout.setVerticalGroup(
            pn_perPeriodeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_perPeriodeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addGroup(pn_perPeriodeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(t_dateFrom, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(btn_dari, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(pn_perPeriodeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(t_dateAfter, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_sampai, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnCetakPerPeriode, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10))
        );

        pn_pilihLaporan.add(pn_perPeriode, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 274, 200));

        jLabel8.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Pilih Periode Bulan dan Tahun");

        cbx_bulan.setBackground(new java.awt.Color(175, 99, 154));
        cbx_bulan.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        cbx_bulan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-- Pilih Bulan --", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));

        btnCetakPerBulan.setBackground(new java.awt.Color(175, 99, 154));
        btnCetakPerBulan.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        btnCetakPerBulan.setText("CETAK");
        btnCetakPerBulan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCetakPerBulanActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pn_perBulanLayout = new javax.swing.GroupLayout(pn_perBulan);
        pn_perBulan.setLayout(pn_perBulanLayout);
        pn_perBulanLayout.setHorizontalGroup(
            pn_perBulanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_perBulanLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pn_perBulanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cbx_bulan, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jYearChooser1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pn_perBulanLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnCetakPerBulan, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pn_perBulanLayout.setVerticalGroup(
            pn_perBulanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_perBulanLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addGap(18, 18, 18)
                .addComponent(cbx_bulan, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jYearChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnCetakPerBulan, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pn_pilihLaporan.add(pn_perBulan, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 274, 200));

        btnBatal.setBackground(new java.awt.Color(175, 99, 154));
        btnBatal.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        btnBatal.setText("BATAL");
        btnBatal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBatalActionPerformed(evt);
            }
        });
        pn_pilihLaporan.add(btnBatal, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, -1, -1));

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

    private void btn_printDataBarangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_printDataBarangActionPerformed
        pn_tampilLaporan.removeAll();
        String no = t_noTransaksi.getText();
        servis_lap.lapBarangKeluarPerTransaksi(pn_tampilLaporan,no);
    }//GEN-LAST:event_btn_printDataBarangActionPerformed

    private void cbx_laporanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbx_laporanActionPerformed
        if(cbx_laporan.getSelectedItem()=="-- Pilih Jenis Laporan --"){
            pn_main.setVisible(true);
            pn_perTransaksi.setVisible(false);
            pn_perPeriode.setVisible(false);
            pn_perBulan.setVisible(false);
            
        }else if(cbx_laporan.getSelectedItem()=="Per Transaksi"){
            pn_main.setVisible(false);
            pn_perTransaksi.setVisible(true);
            pn_perPeriode.setVisible(false);
            pn_perBulan.setVisible(false);
            
        }else if(cbx_laporan.getSelectedItem()=="Per Periode"){
            pn_main.setVisible(false);
            pn_perTransaksi.setVisible(false);
            pn_perPeriode.setVisible(true);
            pn_perBulan.setVisible(false);
            
        }else if(cbx_laporan.getSelectedItem()=="Per Bulan"){
            pn_main.setVisible(false);
            pn_perTransaksi.setVisible(false);
            pn_perPeriode.setVisible(false);
            pn_perBulan.setVisible(true);
        } 
    }//GEN-LAST:event_cbx_laporanActionPerformed

    private void btn_printPeriodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_printPeriodeActionPerformed
        pn_tampilLaporan.removeAll();
        
        String tgl1 = t_dateFrom.getText();
        String tgl2 = t_dateAfter.getText();
                        
        servis_lap.lapBarangKeluarPerPeriode(pn_tampilLaporan,tgl1,tgl2);
    }//GEN-LAST:event_btn_printPeriodeActionPerformed

    private void btn_pilihActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_pilihActionPerformed
        boolean closable = true;
        Data_BarangKeluar data = new Data_BarangKeluar(null, closable);
        data.setVisible(true);

        t_noTransaksi.setText(data.psn.getNo_keluar());
    }//GEN-LAST:event_btn_pilihActionPerformed

    private void btn_printPerbulanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_printPerbulanActionPerformed
        pn_tampilLaporan.removeAll();
        
        String bulan = cbx_bulan.getSelectedItem().toString();
        int tahun = jYearChooser1.getYear();
        
        servis_lap.lapBarangKeluarPerBulan(pn_tampilLaporan, bulan, tahun);
    }//GEN-LAST:event_btn_printPerbulanActionPerformed

    private void btn_dariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_dariActionPerformed
        dateChooser1.showPopup();
    }//GEN-LAST:event_btn_dariActionPerformed

    private void btn_sampaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_sampaiActionPerformed
        dateChooser2.showPopup();
    }//GEN-LAST:event_btn_sampaiActionPerformed

    private void btnBatalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBatalActionPerformed
        mainPanel.removeAll();
        mainPanel.add(new Laporan_BarangKeluar(id));
        mainPanel.repaint();
        mainPanel.revalidate();
    }//GEN-LAST:event_btnBatalActionPerformed

    private void btnCetakPerTransaksiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCetakPerTransaksiActionPerformed
        pn_tampilLaporan.removeAll();
        String no = t_noTransaksi.getText();
        servis_lap.lapBarangKeluarPerTransaksi(pn_tampilLaporan,no);
    }//GEN-LAST:event_btnCetakPerTransaksiActionPerformed

    private void btnCetakPerPeriodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCetakPerPeriodeActionPerformed
        pn_tampilLaporan.removeAll();
        
        String tgl1 = t_dateFrom.getText();
        String tgl2 = t_dateAfter.getText();
                        
        servis_lap.lapBarangKeluarPerPeriode(pn_tampilLaporan,tgl1,tgl2);
    }//GEN-LAST:event_btnCetakPerPeriodeActionPerformed

    private void btnCetakPerBulanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCetakPerBulanActionPerformed
        pn_tampilLaporan.removeAll();
        
        String bulan = cbx_bulan.getSelectedItem().toString();
        int tahun = jYearChooser1.getYear();
        
        servis_lap.lapBarangKeluarPerBulan(pn_tampilLaporan, bulan, tahun);
    }//GEN-LAST:event_btnCetakPerBulanActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBatal;
    private javax.swing.JButton btnCetakPerBulan;
    private javax.swing.JButton btnCetakPerPeriode;
    private javax.swing.JButton btnCetakPerTransaksi;
    private javax.swing.JButton btn_dari;
    private javax.swing.JButton btn_pilih;
    private javax.swing.JButton btn_sampai;
    private javax.swing.JComboBox<String> cbx_bulan;
    private javax.swing.JComboBox<String> cbx_laporan;
    private com.raven.datechooser.DateChooser dateChooser1;
    private com.raven.datechooser.DateChooser dateChooser2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private com.toedter.calendar.JYearChooser jYearChooser1;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JPanel pn_main;
    private javax.swing.JPanel pn_perBulan;
    private javax.swing.JPanel pn_perPeriode;
    private javax.swing.JPanel pn_perTransaksi;
    private javax.swing.JPanel pn_pilihLaporan;
    private javax.swing.JPanel pn_tampilLaporan;
    private javax.swing.JTextField t_dateAfter;
    private javax.swing.JTextField t_dateFrom;
    private javax.swing.JTextField t_noTransaksi;
    private javax.swing.JPanel tampilData;
    // End of variables declaration//GEN-END:variables

    
    
}
