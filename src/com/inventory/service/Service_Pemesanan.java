/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.inventory.service;

import java.util.List;
import com.inventory.model.Model_Pemesanan;

/**
 *
 * @author Uhnuy Kozuki
 */
public interface Service_Pemesanan {
    void tambahData     (Model_Pemesanan mod_pesan);
    void perbaruiData   (Model_Pemesanan mod_pesan);
    void hapusData      (Model_Pemesanan mod_pesan);
    
    List<Model_Pemesanan> getData();
    List<Model_Pemesanan> pencarian(String id);
    String nomor();
}
