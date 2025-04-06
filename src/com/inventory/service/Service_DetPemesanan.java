/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.inventory.service;

import java.util.List;
import com.inventory.model.Model_DetPemesanan;

/**
 *
 * @author Uhnuy Kozuki
 */
public interface Service_DetPemesanan {
    void tambahData (Model_DetPemesanan mod_detpesan);
    void sumTotal (Model_DetPemesanan mod_detpesan);
    void hapusSementara (Model_DetPemesanan mod_detpesan);

    List<Model_DetPemesanan> getData(String id);
    List<Model_DetPemesanan> getAllData();
    List<Model_DetPemesanan> pencarian(String id);
}
