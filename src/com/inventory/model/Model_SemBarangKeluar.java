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
public class Model_SemBarangKeluar {
    private Model_Barang mod_barang;
    private Model_DetBarangKeluar mod_detkeluar;

    public Model_Barang getMod_barang() {
        return mod_barang;
    }

    public void setMod_barang(Model_Barang mod_barang) {
        this.mod_barang = mod_barang;
    }

    public Model_DetBarangKeluar getMod_detkeluar() {
        return mod_detkeluar;
    }

    public void setMod_detkeluar(Model_DetBarangKeluar mod_detkeluar) {
        this.mod_detkeluar = mod_detkeluar;
    }

    
}
