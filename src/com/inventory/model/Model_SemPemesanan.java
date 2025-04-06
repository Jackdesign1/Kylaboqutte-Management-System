/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.inventory.model;

/**
 *
 * @author Uhnuy Kozuki
 */
public class Model_SemPemesanan {
    private Model_Barang mod_barang;
    private Model_DetPemesanan mod_detpesan;
   
    public Model_Barang getMod_barang() {
        return mod_barang;
    }

    public void setMod_barang(Model_Barang mod_barang) {
        this.mod_barang = mod_barang;
    }

    public Model_DetPemesanan getMod_detpesan() {
        return mod_detpesan;
    }

    public void setMod_detpesan(Model_DetPemesanan mod_detpesan) {
        this.mod_detpesan = mod_detpesan;
    }

    
}
