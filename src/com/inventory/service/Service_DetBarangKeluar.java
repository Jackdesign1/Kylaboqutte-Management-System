/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.inventory.service;

import java.util.List;
import com.inventory.model.Model_DetBarangKeluar;

/**
 *
 * @author Uhnuy Kozuki
 */
public interface Service_DetBarangKeluar {
    void tambahData (Model_DetBarangKeluar mod_detkeluar);
    void sumTotal (Model_DetBarangKeluar mod_detkeluar);
    void hapusSementara (Model_DetBarangKeluar mod_detkeluar);

    List<Model_DetBarangKeluar> getData(String id);
    List<Model_DetBarangKeluar> pencarian(String id);
    
    boolean validasiStok (Model_DetBarangKeluar mod_detkeluar);
    
}
