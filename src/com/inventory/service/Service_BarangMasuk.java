/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.inventory.service;

import java.util.List;
import com.inventory.model.Model_BarangMasuk;

/**
 *
 * @author Uhnuy Kozuki
 */
public interface Service_BarangMasuk {
    void tambahData     (Model_BarangMasuk mod_masuk);
    void perbaruiStatus (String kode_barang);
    void hapusData      (Model_BarangMasuk mod_masuk);
    
    List<Model_BarangMasuk> getData();
    List<Model_BarangMasuk> pencarian(String id);
    String nomor();
}
