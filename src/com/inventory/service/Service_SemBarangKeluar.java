/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.inventory.service;

import java.util.List;
import com.inventory.model.Model_SemBarangKeluar;

/**
 *
 * @author Uhnuy Kozuki
 */
public interface Service_SemBarangKeluar {
    void tambahData     (Model_SemBarangKeluar mod_keluar);
    void perbaruiData   (Model_SemBarangKeluar mod_keluar);
    void hapusData      (Model_SemBarangKeluar mod_keluar);
    
    List<Model_SemBarangKeluar> getData();
}
