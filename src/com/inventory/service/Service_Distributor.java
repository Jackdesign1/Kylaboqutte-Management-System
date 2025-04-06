package com.inventory.service;

import java.util.List;
import javax.swing.JTable;
import com.inventory.model.Model_Distributor;

public interface Service_Distributor {
    void tambahData     (Model_Distributor mod_dis);
    void perbaruiData   (Model_Distributor mod_dis);
    void hapusData      (Model_Distributor mod_dis);
    
    List<Model_Distributor> getData();
    List<Model_Distributor> getData(int startIndex, int entriesPerPage);
    List<Model_Distributor> pencarian(String id);
    
    String nomor();
    int getTotalEntries();
    void exportToExcel(JTable table, String filePath);
}
