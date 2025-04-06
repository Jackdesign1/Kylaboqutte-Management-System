/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.inventory.service;

import java.util.List;
import com.inventory.model.Model_DetBarangMasuk;

/**
 *
 * @author Uhnuy Kozuki
 */
public interface Service_DetBarangMasuk {
    void tambahData (Model_DetBarangMasuk mod_detmasuk);
    void sumTotal (Model_DetBarangMasuk mod_detmasuk);
    void hapusSementara (Model_DetBarangMasuk mod_detmasuk);

    List<Model_DetBarangMasuk> getData(String id);
}
