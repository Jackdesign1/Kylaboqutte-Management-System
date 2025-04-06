/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.inventory.service;

import java.util.List;
import javax.swing.JTable;
import com.inventory.model.Model_JenisBarang;

/**
 *
 * @author Uhnuy Kozuki
 */
public interface Service_JenisBarang {
    void tambahData     (Model_JenisBarang mod_jenbar);
    void perbaruiData   (Model_JenisBarang mod_jenbar);
    void hapusData      (Model_JenisBarang mod_jenbar);
    
    List<Model_JenisBarang> getData();
    List<Model_JenisBarang> pencarian(String id);
    
    String nomor();
    void exportToExcel(JTable table, String filePath);
    boolean validasiNamaJenisBarang(Model_JenisBarang mod_jenbar);
    
    List<Model_JenisBarang> getData(int startIndex, int entriesPerPage);
    int getTotalHalaman();
}
