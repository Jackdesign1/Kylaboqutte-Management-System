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
public class Model_DetBarangMasuk {
    private Model_BarangMasuk mod_masuk;
    private Model_Barang mod_barang;
    private int jml_masuk;
    private Long subtotal_masuk;

    public Model_BarangMasuk getMod_masuk() {
        return mod_masuk;
    }

    public void setMod_masuk(Model_BarangMasuk mod_masuk) {
        this.mod_masuk = mod_masuk;
    }

    public Model_Barang getMod_barang() {
        return mod_barang;
    }

    public void setMod_barang(Model_Barang mod_barang) {
        this.mod_barang = mod_barang;
    }

    public int getJml_masuk() {
        return jml_masuk;
    }

    public void setJml_masuk(int jml_masuk) {
        this.jml_masuk = jml_masuk;
    }

    public Long getSubtotal_masuk() {
        return subtotal_masuk;
    }

    public void setSubtotal_masuk(Long subtotal_masuk) {
        this.subtotal_masuk = subtotal_masuk;
    }

    

    
}
