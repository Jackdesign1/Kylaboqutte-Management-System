/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.inventory.service;

import java.util.List;
import javax.swing.JTable;
import com.inventory.model.Model_Barang;

/**
 *
 * @author Uhnuy Kozuki
 */
public interface Service_Barang {
    void tambahData (Model_Barang mod_bar);
    void perbaruiData (Model_Barang mod_bar);
    void hapusData (Model_Barang mod_bar);
    
    List<Model_Barang> getData();
    List<Model_Barang> pencarian(String id);
    
    String nomor();
    void exportToExcel(JTable table, String filePath);
}
