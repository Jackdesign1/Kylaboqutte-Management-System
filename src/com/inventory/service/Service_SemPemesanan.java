/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.inventory.service;

import java.util.List;
import com.inventory.model.Model_SemPemesanan;

/**
 *
 * @author Uhnuy Kozuki
 */
public interface Service_SemPemesanan {
    void tambahData     (Model_SemPemesanan mod_pesan);
    void perbaruiData   (Model_SemPemesanan mod_pesan);
    void hapusData      (Model_SemPemesanan mod_pesan);
    
    List<Model_SemPemesanan> getData();
}
