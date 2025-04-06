/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.inventory.service;

import java.util.List;
import com.inventory.model.Model_BarangKeluar;

/**
 *
 * @author Uhnuy Kozuki
 */
public interface Service_BarangKeluar {
    void tambahData     (Model_BarangKeluar mod_keluar);
    void hapusData      (Model_BarangKeluar mod_keluar);
    
    List<Model_BarangKeluar> getData();
    List<Model_BarangKeluar> pencarian(String id);
    String nomor();
}
