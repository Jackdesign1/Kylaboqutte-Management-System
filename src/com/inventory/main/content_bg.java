package com.inventory.main;

import java.awt.BorderLayout;
import java.awt.Color;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PiePlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.category.BarRenderer;
import org.jfree.chart.renderer.category.LineAndShapeRenderer;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.data.statistics.HistogramDataset;
import org.jfree.chart.labels.StandardPieSectionLabelGenerator;
import com.inventory.dao.DAO_JenisBarang;
import com.inventory.dao.DAO_Barang;
import com.inventory.dao.DAO_BarangKeluar;
import com.inventory.dao.DAO_BarangMasuk;
import com.inventory.dao.DAO_DetBarangKeluar;
import com.inventory.dao.DAO_DetBarangMasuk;
import com.inventory.dao.DAO_DetPemesanan;
import com.inventory.dao.DAO_Pemesanan;
import com.inventory.model.Model_Barang;
import com.inventory.model.Model_BarangKeluar;
import com.inventory.model.Model_BarangMasuk;
import com.inventory.model.Model_DetBarangKeluar;
import com.inventory.model.Model_DetBarangMasuk;
import com.inventory.model.Model_DetPemesanan;
import com.inventory.model.Model_JenisBarang;
import com.inventory.model.Model_Pemesanan;
import com.inventory.service.Service_Barang;
import com.inventory.service.Service_BarangKeluar;
import com.inventory.service.Service_BarangMasuk;
import com.inventory.service.Service_DetBarangKeluar;
import com.inventory.service.Service_DetBarangMasuk;
import com.inventory.service.Service_DetPemesanan;
import com.inventory.service.Service_JenisBarang;
import com.inventory.service.Service_Pemesanan;
import java.sql.SQLException;
import java.util.Iterator;
import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.awt.Color;
import java.awt.Dimension;
import java.util.Random;
import java.text.DecimalFormat;
import org.jfree.chart.plot.RingPlot;



public class content_bg extends javax.swing.JPanel {
    private Service_Barang service_barang = new DAO_Barang();
    private Service_Pemesanan service_pemesanan = new DAO_Pemesanan();
    private Service_DetPemesanan service_detpemesanan = new DAO_DetPemesanan();
    private Service_BarangMasuk service_barangmasuk = new DAO_BarangMasuk();
    private Service_BarangKeluar service_barangkeluar = new DAO_BarangKeluar();
    
    public content_bg() {
        initComponents();
        showPieChart();
        showLineChart();
        showDonutChart();
        showBarChart();
    }
    
    public static Color generateRandomColor() {
        Random random = new Random();
        int red = random.nextInt(256);   // Menghasilkan nilai antara 0 dan 255
        int green = random.nextInt(256); // Menghasilkan nilai antara 0 dan 255
        int blue = random.nextInt(256);  // Menghasilkan nilai antara 0 dan 255
        return new Color(red, green, blue);
    }

    public void showPieChart() {
        Map<String, Integer> groupSums = new HashMap<>();
        for (Model_Barang barang : service_barang.getData()) {
            Model_JenisBarang jenis_barang = barang.getJns_barang();
            String jenis = jenis_barang.getNama_jenis();
            int value = barang.getStok();
                
            groupSums.put(jenis, groupSums.getOrDefault(jenis, 0) + value);
        }
        
        //create dataset
        DefaultPieDataset barDataset = new DefaultPieDataset();
        for (Map.Entry<String, Integer> entry : groupSums.entrySet()) {
            barDataset.setValue(entry.getKey(), entry.getValue());
        }

        //create chart
        JFreeChart piechart = ChartFactory.createPieChart("Persentase Barang Berdasarkan Jenis", barDataset, false, true, false);//explain

        PiePlot piePlot = (PiePlot) piechart.getPlot();
        piePlot.setBackgroundPaint(Color.WHITE);
        piePlot.setLabelGenerator(new StandardPieSectionLabelGenerator("{0} ({2})", new DecimalFormat("0"), new DecimalFormat("0.00%")));
        
        //changing pie chart blocks colors
        for (Map.Entry<String, Integer> entry : groupSums.entrySet()) {
            Color randomColor = generateRandomColor();
            piePlot.setSectionPaint(entry.getKey(), randomColor);
        }

        //create chartPanel to display chart(graph)
        ChartPanel barChartPanel = new ChartPanel(piechart);
        panelPieChart.removeAll();
        panelPieChart.add(barChartPanel, BorderLayout.CENTER);
        panelPieChart.validate();
    }
    
    public void showDonutChart() {
        Map<String, Double> groupSums = new HashMap<>();
        List<String> stringList = new ArrayList<>();
        for (Model_Pemesanan pemesanan : service_pemesanan.getData()) {
            stringList.add(pemesanan.getNo_pesan()) ;
        }
        
        for (String item : stringList) {      
            for (Model_DetPemesanan det_pemesanan : service_detpemesanan.getData(item)) {
            String jenis = det_pemesanan.getMod_barang().getNama_barang();
            Long value = det_pemesanan.getJml_pesan();
                
            groupSums.put(jenis, groupSums.getOrDefault(jenis, 0.00) + value);
            }
          
        }
        
        //create dataset
        DefaultPieDataset dataset = new DefaultPieDataset();
        for (Map.Entry<String, Double> entry : groupSums.entrySet()) {
            dataset.setValue(entry.getKey(), entry.getValue());
        }
        
        // Membuat donut chart
        JFreeChart donutchart = ChartFactory.createRingChart("Barang-Barang yang Dipesan", dataset, true, true, false);

        // Cast chart plot ke RingPlot agar dapat mengatur ketebalan cincin
        RingPlot plot = (RingPlot) donutchart.getPlot();
        plot.setBackgroundPaint(Color.WHITE);
        plot.setSectionDepth(0.3); // Ketebalan cincin (0.0 - 1.0)
        
        // Mengatur warna dari setiap bagian di donut chart      
        for (Map.Entry<String, Double> entry : groupSums.entrySet()) {
            Color randomColor = generateRandomColor();
            plot.setSectionPaint(entry.getKey(), randomColor);
        }
        
        // Menyesuaikan label plot
        plot.setLabelGenerator(null); // Agar tidak menampilkan label
        
        //create chartPanel to display chart(graph)
        ChartPanel barpChartPanel2 = new ChartPanel(donutchart);
        PanelShowHistogram.removeAll();
        PanelShowHistogram.add(barpChartPanel2, BorderLayout.CENTER);
        PanelShowHistogram.validate();
    }
    
    public void showBarChart() {
        int totalmasuk = 0;
        int totalkeluar = 0;
        for (Model_BarangMasuk barang_masuk : service_barangmasuk.getData()) {
            totalmasuk += barang_masuk.getTotal_masuk();
        }
        
        for (Model_BarangKeluar barang_keluar : service_barangkeluar.getData()) {
            totalkeluar += barang_keluar.getTotal_keluar();
        }
        
        
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        dataset.setValue(totalmasuk, "Amount", "Barang Masuk");
        dataset.setValue(totalkeluar, "Amount", "Barang Keluar");

        JFreeChart chart = ChartFactory.createBarChart("Total Barang Berdasarkan Status", "Status", "Rupiah",
                dataset, PlotOrientation.VERTICAL, false, true, false);

        CategoryPlot categoryPlot = chart.getCategoryPlot();
        categoryPlot.setBackgroundPaint(Color.WHITE);
        BarRenderer renderer = (BarRenderer) categoryPlot.getRenderer();
        Color clr3 = new Color(204, 0, 51);
        renderer.setSeriesPaint(0, clr3);

        ChartPanel barpChartPanel = new ChartPanel(chart);
        panelBarChart.removeAll();
        panelBarChart.add(barpChartPanel, BorderLayout.CENTER);
        panelBarChart.validate();

    }
    
    public void showLineChart() {
        //mengambil data dari database inventory
        List<Model_Pemesanan> data = service_pemesanan.getData();
        Map<String, Double> sumByMonth = sumValuesByMonth(data);

        DefaultCategoryDataset dataset = new DefaultCategoryDataset();      
        sumByMonth.entrySet().forEach(entry -> {
            dataset.setValue(entry.getValue(), "Amount", getMonthName(entry.getKey()));
        });

        //membuat chart - ubah judul dan keterangan lainnya disini
        JFreeChart linechart = ChartFactory.createLineChart("Total Pemesanan Bulanan", "Bulan", "Rupiah",
                dataset, PlotOrientation.VERTICAL, false, true, false);

        CategoryPlot lineCategoryPlot = linechart.getCategoryPlot();
        lineCategoryPlot.setBackgroundPaint(Color.white);

        //create render object to change the moficy the line properties like color
        LineAndShapeRenderer lineRenderer = (LineAndShapeRenderer) lineCategoryPlot.getRenderer();
        Color lineChartColor = new Color(204, 0, 51);
        lineRenderer.setSeriesPaint(0, lineChartColor);

        //create chartPanel to display chart(graph)
        ChartPanel lineChartPanel = new ChartPanel(linechart);
        panelLineChart.removeAll();
        panelLineChart.add(lineChartPanel, BorderLayout.CENTER);
        panelLineChart.validate();
    }

    private static Map<String, Double> sumValuesByMonth(List<Model_Pemesanan> data) {
        Map<String, Double> sumByMonth = new HashMap<>();

        for (Model_Pemesanan entry : data) {
            String month = getMonthFromDate(entry.getTgl_pesan());
            Long value = entry.getTotal_pesan();

            // Menambahkan nilai ke dalam map, jika bulan sudah ada, tambahkan dengan nilai yang baru
            sumByMonth.put(month, sumByMonth.getOrDefault(month, 0.00) + value);
        }

        return sumByMonth;
    }
    
    private static String getMonthFromDate(String date) {
        // Mendapatkan bulan dari tanggal (format: "yyyy-MM-dd")
        return date.substring(5, 7); // Ambil substring dari indeks 5 sampai 7 (bulan)
    }
    
    private static String getMonthName(String month) {
        // Mendapatkan nama bulan dari angka bulan
        switch (month) {
            case "01":
                return "Januari";
            case "02":
                return "Februari";
            case "03":
                return "Maret";
            case "04":
                return "April";
            case "05":
                return "Mei";
            case "06":
                return "Juni";
            case "07":
                return "Juli";
            case "08":
                return "Agustus";
            case "09":
                return "September";
            case "10":
                return "Oktober";
            case "11":
                return "November";
            case "12":
                return "Desember";
            default:
                return "Bulan tidak valid";
        }
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        panelLineChart = new javax.swing.JPanel();
        PanelShowHistogram = new javax.swing.JPanel();
        panelBarChart = new javax.swing.JPanel();
        panelPieChart = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setLayout(new java.awt.CardLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        panelLineChart.setBackground(new java.awt.Color(34, 51, 63));
        panelLineChart.setLayout(new java.awt.BorderLayout());

        PanelShowHistogram.setBackground(new java.awt.Color(34, 51, 63));
        PanelShowHistogram.setLayout(new java.awt.BorderLayout());

        panelBarChart.setBackground(new java.awt.Color(34, 51, 63));
        panelBarChart.setLayout(new java.awt.BorderLayout());

        panelPieChart.setBackground(new java.awt.Color(34, 51, 63));
        panelPieChart.setLayout(new java.awt.BorderLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\ASUS\\Downloads\\Frame 2.png")); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(0, 405, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(159, 159, 159)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelLineChart, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PanelShowHistogram, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(203, 203, 203)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelPieChart, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelBarChart, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(107, 107, 107)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(panelPieChart, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PanelShowHistogram, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelLineChart, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelBarChart, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(184, 184, 184))
        );

        add(jPanel1, "card2");
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelShowHistogram;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel panelBarChart;
    private javax.swing.JPanel panelLineChart;
    private javax.swing.JPanel panelPieChart;
    // End of variables declaration//GEN-END:variables

}
