/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.inventory.service;

import java.util.List;
import com.inventory.model.Model_SemBarangMasuk;

/**
 *
 * @author Uhnuy Kozuki
 */
public interface Service_SemBarangMasuk {
    void tambahData     (Model_SemBarangMasuk mod_masuk);
    void perbaruiData   (Model_SemBarangMasuk mod_masuk);
    void hapusData      (Model_SemBarangMasuk mod_masuk);
    
    List<Model_SemBarangMasuk> getData();
}
