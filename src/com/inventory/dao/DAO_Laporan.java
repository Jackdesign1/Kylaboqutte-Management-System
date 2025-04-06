/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.inventory.dao;

import com.inventory.config.Koneksi;
import static com.inventory.config.Koneksi.getConnection;
import java.awt.BorderLayout;
import java.sql.Connection;
import java.util.HashMap;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JRViewer;
import net.sf.jasperreports.view.JasperViewer;
import com.inventory.service.Service_Laporan;

/**
 *
 * @author Uhnuy Kozuki
 */
public class DAO_Laporan implements Service_Laporan{

    private Connection conn;
    
    public DAO_Laporan(){
        conn = Koneksi.getConnection();
    }

    @Override
    public void suratJalanPemesanan(String no) {
        try {
                String reportPath = "src/com/inventory/report/SuratJalanPemesanan.jasper";
                
                HashMap<String, Object> parameters = new HashMap<>();
                parameters.put("no", no); // Menyimpan nomor pemesanan sebagai parameter

                JasperPrint print = JasperFillManager.fillReport(reportPath, parameters, conn);
                JasperViewer viewer = new JasperViewer(print, false);
                viewer.setVisible(true);
            } catch (Exception e) {
                JOptionPane.showConfirmDialog(null, e.getMessage());
        }
    }

    @Override
    public void transaksiBarangMasuk(String no) {
        try {
                String reportPath = "src/com/inventory/report/TransaksiBarangMasuk.jasper";
                
                HashMap<String, Object> parameters = new HashMap<>();
                parameters.put("no", no); // Menyimpan nomor pemesanan sebagai parameter

                JasperPrint print = JasperFillManager.fillReport(reportPath, parameters, conn);
                JasperViewer viewer = new JasperViewer(print, false);
                viewer.setVisible(true);
            } catch (Exception e) {
                JOptionPane.showConfirmDialog(null, e.getMessage());
        }
    }

    @Override
    public void transaksiBarangKeluar(String no) {
        try {
                String reportPath = "src/com/inventory/report/TransaksiBarangKeluar.jasper";
                
                HashMap<String, Object> parameters = new HashMap<>();
                parameters.put("no", no); // Menyimpan nomor pemesanan sebagai parameter

                JasperPrint print = JasperFillManager.fillReport(reportPath, parameters, conn);
                JasperViewer viewer = new JasperViewer(print, false);
                viewer.setVisible(true);
            } catch (Exception e) {
                JOptionPane.showConfirmDialog(null, e.getMessage());
        }
    }

    @Override
    public void lapDataBarang(JPanel jp) {
        try {
                String reportPath = "src/com/inventory/report/LapDataBarang.jasper";
                
                HashMap<String, Object> parameters = new HashMap<>();
               
                JasperPrint print = JasperFillManager.fillReport(reportPath, parameters, conn);
                //tampil panel
                jp.setLayout(new BorderLayout());
                jp.repaint();
                jp.add(new JRViewer(print));
                jp.revalidate();
            } catch (Exception e) {
                JOptionPane.showConfirmDialog(null, e.getMessage());
        }
    }

    @Override
    public void lapTransaksiBarang(JPanel jp) {
        try {
                String reportPath = "src/com/inventory/report/LapStokBarang.jasper";
                
                HashMap<String, Object> parameters = new HashMap<>();
               
                JasperPrint print = JasperFillManager.fillReport(reportPath, parameters, conn);
                //tampil panel
                jp.setLayout(new BorderLayout());
                jp.repaint();
                jp.add(new JRViewer(print));
                jp.revalidate();
            } catch (Exception e) {
                JOptionPane.showConfirmDialog(null, e.getMessage());
        }
    }

    @Override
    public void lapPemesananPerTransaksi(JPanel jp, String no) {
        try {
                String reportPath = "src/com/inventory/report/LapPesanPerTransaksi.jasper";
                
                HashMap<String, Object> parameters = new HashMap<>();
                parameters.put("no", no); // Menyimpan nomor pemesanan sebagai parameter

                JasperPrint print = JasperFillManager.fillReport(reportPath, parameters, conn);
                //tampil panel
                jp.setLayout(new BorderLayout());
                jp.repaint();
                jp.add(new JRViewer(print));
                jp.revalidate();
            } catch (Exception e) {
                JOptionPane.showConfirmDialog(null, e.getMessage());
        }
    }

    @Override
    public void lapPemesananPerPeriode(JPanel jp, String tgl1, String tgl2) {
        try {
                String reportPath = "src/com/inventory/report/LapPesanPerPeriode.jasper";
                
                HashMap<String, Object> parameters = new HashMap<>();
                parameters.put("tgl1", tgl1);
                parameters.put("tgl2", tgl2);

                JasperPrint print = JasperFillManager.fillReport(reportPath, parameters, conn);
                //tampil panel
                jp.setLayout(new BorderLayout());
                jp.repaint();
                jp.add(new JRViewer(print));
                jp.revalidate();
            } catch (Exception e) {
                JOptionPane.showConfirmDialog(null, e.getMessage());
        }
    }

    @Override
    public void lapPemesananPerBulan(JPanel jp, String dt1, int dt2) {
        try {
                String reportPath = "src/com/inventory/report/LapPesanPerPerbulan.jasper";
                
                HashMap<String, Object> parameters = new HashMap<>();
                parameters.put("dt1", dt1);
                parameters.put("dt2", dt2);

                JasperPrint print = JasperFillManager.fillReport(reportPath, parameters, conn);
                //tampil panel
                jp.setLayout(new BorderLayout());
                jp.repaint();
                jp.add(new JRViewer(print));
                jp.revalidate();
            } catch (Exception e) {
                JOptionPane.showConfirmDialog(null, e.getMessage());
        }
    }

    @Override
    public void lapPemesananPerDistributor(JPanel jp, String id) {
        try {
                String reportPath = "src/com/inventory/report/LapPesanPerDistributor.jasper";
                
                HashMap<String, Object> parameters = new HashMap<>();
                parameters.put("id", id);

                JasperPrint print = JasperFillManager.fillReport(reportPath, parameters, conn);
                //tampil panel
                jp.setLayout(new BorderLayout());
                jp.repaint();
                jp.add(new JRViewer(print));
                jp.revalidate();
            } catch (Exception e) {
                JOptionPane.showConfirmDialog(null, e.getMessage());
        }
    }

    @Override
    public void lapBarangMasukPerTransaksi(JPanel jp, String no) {
        try {
                String reportPath = "src/com/inventory/report/TransaksiBarangMasuk.jasper";
                
                HashMap<String, Object> parameters = new HashMap<>();
                parameters.put("no", no); // Menyimpan nomor pemesanan sebagai parameter

                JasperPrint print = JasperFillManager.fillReport(reportPath, parameters, conn);
                //tampil panel
                jp.setLayout(new BorderLayout());
                jp.repaint();
                jp.add(new JRViewer(print));
                jp.revalidate();
            } catch (Exception e) {
                JOptionPane.showConfirmDialog(null, e.getMessage());
        }
    }

    @Override
    public void lapBarangMasukPerPeriode(JPanel jp, String tgl1, String tgl2) {
        try {
                String reportPath = "src/com/inventory/report/LapMasukPerPeriode.jasper";
                
                HashMap<String, Object> parameters = new HashMap<>();
                parameters.put("tgl1", tgl1);
                parameters.put("tgl2", tgl2);

                JasperPrint print = JasperFillManager.fillReport(reportPath, parameters, conn);
                //tampil panel
                jp.setLayout(new BorderLayout());
                jp.repaint();
                jp.add(new JRViewer(print));
                jp.revalidate();
            } catch (Exception e) {
                JOptionPane.showConfirmDialog(null, e.getMessage());
        }
    }

    @Override
    public void lapBarangMasukPerBulan(JPanel jp, String dt1, int dt2) {
        try {
                String reportPath = "src/com/inventory/report/LapMasukPerPerbulan.jasper";
                
                HashMap<String, Object> parameters = new HashMap<>();
                parameters.put("dt1", dt1);
                parameters.put("dt2", dt2);

                JasperPrint print = JasperFillManager.fillReport(reportPath, parameters, conn);
                //tampil panel
                jp.setLayout(new BorderLayout());
                jp.repaint();
                jp.add(new JRViewer(print));
                jp.revalidate();
            } catch (Exception e) {
                JOptionPane.showConfirmDialog(null, e.getMessage());
        }
    }

    @Override
    public void lapBarangMasukPerDistributor(JPanel jp, String id) {
        try {
                String reportPath = "src/com/inventory/report/LapMasukPerDistributor.jasper";
                
                HashMap<String, Object> parameters = new HashMap<>();
                parameters.put("id", id);

                JasperPrint print = JasperFillManager.fillReport(reportPath, parameters, conn);
                //tampil panel
                jp.setLayout(new BorderLayout());
                jp.repaint();
                jp.add(new JRViewer(print));
                jp.revalidate();
            } catch (Exception e) {
                JOptionPane.showConfirmDialog(null, e.getMessage());
        }
    }

    @Override
    public void lapBarangKeluarPerTransaksi(JPanel jp, String no) {
        try {
                String reportPath = "src/com/inventory/report/TransaksiBarangKeluar.jasper";
                
                HashMap<String, Object> parameters = new HashMap<>();
                parameters.put("no", no); // Menyimpan nomor pemesanan sebagai parameter

                JasperPrint print = JasperFillManager.fillReport(reportPath, parameters, conn);
                //tampil panel
                jp.setLayout(new BorderLayout());
                jp.repaint();
                jp.add(new JRViewer(print));
                jp.revalidate();
            } catch (Exception e) {
                JOptionPane.showConfirmDialog(null, e.getMessage());
        }
    }

    @Override
    public void lapBarangKeluarPerPeriode(JPanel jp, String tgl1, String tgl2) {
        try {
                String reportPath = "src/com/inventory/report/LapKeluarPerPeriode.jasper";
                
                HashMap<String, Object> parameters = new HashMap<>();
                parameters.put("tgl1", tgl1);
                parameters.put("tgl2", tgl2);

                JasperPrint print = JasperFillManager.fillReport(reportPath, parameters, conn);
                //tampil panel
                jp.setLayout(new BorderLayout());
                jp.repaint();
                jp.add(new JRViewer(print));
                jp.revalidate();
            } catch (Exception e) {
                JOptionPane.showConfirmDialog(null, e.getMessage());
        }
    }

    @Override
    public void lapBarangKeluarPerBulan(JPanel jp, String dt1, int dt2) {
        try {
                String reportPath = "src/com/inventory/report/LapKeluarPerPerbulan.jasper";
                
                HashMap<String, Object> parameters = new HashMap<>();
                parameters.put("dt1", dt1);
                parameters.put("dt2", dt2);

                JasperPrint print = JasperFillManager.fillReport(reportPath, parameters, conn);
                //tampil panel
                jp.setLayout(new BorderLayout());
                jp.repaint();
                jp.add(new JRViewer(print));
                jp.revalidate();
            } catch (Exception e) {
                JOptionPane.showConfirmDialog(null, e.getMessage());
        }
    }

    
    
    
    
}
