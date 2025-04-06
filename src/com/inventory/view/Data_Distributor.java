package com.inventory.view;

import com.formdev.flatlaf.FlatClientProperties;
import com.formdev.flatlaf.FlatLightLaf;
import com.inventory.dao.DAO_Distributor;
import java.awt.Color;
import java.awt.Insets;
import java.util.List;
import javax.swing.BorderFactory;
import javax.swing.table.TableColumnModel;
import com.inventory.model.Model_Distributor;
import com.inventory.service.Service_Distributor;
import com.inventory.tablemodel.TableMod_Distributor;

public class Data_Distributor extends javax.swing.JDialog {

    int xx, xy;
    // Deklarasi variabel
    private int currentPage = 1;
    private int entriesPerPage = 8;
    private int totalHalaman;
    private int totalPages;
    
    private Service_Distributor servis = new DAO_Distributor();
    private TableMod_Distributor tblModel = new TableMod_Distributor();
    public Model_Distributor model = new Model_Distributor();
    
    public Data_Distributor(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        
        tblData.setModel(tblModel);
        txtSearch.requestFocus();
        
        getTotalHalaman();
        loadData();
        setColumnWidth();
        setLayoutForm();
    }
    
    private void setLayoutForm(){
        txtSearch.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "Pencarian");
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

        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblData = new javax.swing.JTable();
        txtSearch = new javax.swing.JTextField();
        btnClose = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        btn_lastPage = new javax.swing.JButton();
        btn_next = new javax.swing.JButton();
        cbx_page = new javax.swing.JComboBox<>();
        btn_before = new javax.swing.JButton();
        btn_firstPage = new javax.swing.JButton();
        totalEntriesLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                formMouseDragged(evt);
            }
        });
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                formMousePressed(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jPanel4.setBackground(new java.awt.Color(175, 99, 154));

        jLabel3.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Data Distributor");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel3)
                .addContainerGap(16, Short.MAX_VALUE))
        );

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
        jScrollPane1.setViewportView(tblData);

        txtSearch.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        txtSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSearchKeyReleased(evt);
            }
        });

        btnClose.setText("X");
        btnClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseActionPerformed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/inventory/img/icons8_search_property_30px_1.png"))); // NOI18N

        btn_lastPage.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        btn_lastPage.setText("Last Page");
        btn_lastPage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_lastPageActionPerformed(evt);
            }
        });

        btn_next.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        btn_next.setText(">");
        btn_next.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_nextActionPerformed(evt);
            }
        });

        cbx_page.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        cbx_page.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "8", "16", "32", "64" }));
        cbx_page.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbx_pageActionPerformed(evt);
            }
        });

        btn_before.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        btn_before.setText("<");
        btn_before.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_beforeActionPerformed(evt);
            }
        });

        btn_firstPage.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        btn_firstPage.setText("First Page");
        btn_firstPage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_firstPageActionPerformed(evt);
            }
        });

        totalEntriesLabel.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        totalEntriesLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        totalEntriesLabel.setText("1");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 622, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(11, 11, 11)
                        .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 531, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnClose, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(totalEntriesLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(btn_firstPage)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_before)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbx_page, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_next)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_lastPage)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnClose, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtSearch, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(totalEntriesLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbx_page)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btn_before, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn_next, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn_firstPage, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn_lastPage, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        xx = evt.getX();
        xy = evt.getY();
    }//GEN-LAST:event_formMousePressed

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xx, y - xy);
    }//GEN-LAST:event_formMouseDragged

    private void tblDataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDataMouseClicked
        pilihData();
    }//GEN-LAST:event_tblDataMouseClicked

    private void txtSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyReleased
        pencarian();
    }//GEN-LAST:event_txtSearchKeyReleased

    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed
        dispose();
    }//GEN-LAST:event_btnCloseActionPerformed

    private void btn_lastPageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_lastPageActionPerformed
        currentPage = totalPages;
        loadData();
    }//GEN-LAST:event_btn_lastPageActionPerformed

    private void btn_nextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_nextActionPerformed
        if (currentPage < totalPages) {
            currentPage++;
            loadData();
        }
    }//GEN-LAST:event_btn_nextActionPerformed

    private void cbx_pageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbx_pageActionPerformed
        entriesPerPage = Integer.parseInt(cbx_page.getSelectedItem().toString());
        currentPage = 1;
        loadData();
    }//GEN-LAST:event_cbx_pageActionPerformed

    private void btn_beforeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_beforeActionPerformed
        if (currentPage > 1)
        {
            currentPage--;
            loadData();
        }
    }//GEN-LAST:event_btn_beforeActionPerformed

    private void btn_firstPageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_firstPageActionPerformed
        currentPage = 1;
        loadData();
    }//GEN-LAST:event_btn_firstPageActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        FlatLightLaf.setup();

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Data_Distributor dialog = new Data_Distributor(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClose;
    private javax.swing.JButton btn_before;
    private javax.swing.JButton btn_firstPage;
    private javax.swing.JButton btn_lastPage;
    private javax.swing.JButton btn_next;
    private javax.swing.JComboBox<String> cbx_page;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblData;
    private javax.swing.JLabel totalEntriesLabel;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables

    private void pencarian() {
        List<Model_Distributor> list = servis.pencarian(txtSearch.getText());
        tblModel.setData(list);
    }
    
    private void getTotalHalaman() {
        int totalEntries = servis.getTotalEntries(); // Mengambil totalEntries dari servis atau DAO yang sesuai
        setTotalHalaman(totalEntries); // Mengatur totalEntries ke dalam objek Pagination
    }
    
    // Method to set totalEntries value
    public void setTotalHalaman(int totalEntries) {
        this.totalHalaman = totalEntries;
    }

    private void loadData() {
        calculateTotalPages();
        //currentPageLabel.setText(String.valueOf(currentPage));
        //totalEntriesLabel.setText(String.valueOf(totalHalaman));
        totalEntriesLabel.setText(String.valueOf("Halaman "+currentPage+" of "+totalHalaman));
        
        
        int startIndex = (currentPage - 1) * entriesPerPage;
        List<Model_Distributor> list = servis.getData(startIndex, entriesPerPage);
        tblModel.setData(list);
        
    }
    
    // Method untuk menghitung dan mengatur jumlah total halaman
    private void calculateTotalPages() {
        totalPages = (int) Math.ceil((double) totalHalaman / entriesPerPage);
    }

    private void pilihData() {
        int row = tblData.getSelectedRow();

        model.setId_distributor(tblData.getModel().getValueAt(row, 1).toString());
        model.setNama_distributor(tblData.getModel().getValueAt(row, 2).toString());
        dispose();
    }

    
}
