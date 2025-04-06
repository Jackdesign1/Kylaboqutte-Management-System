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
public class Model_DetBarangKeluar {
    private Model_BarangKeluar mod_keluar;
    private Model_Barang mod_barang;
    private int jml_keluar;
    private Long subtotal_keluar;

    public Model_BarangKeluar getMod_keluar() {
        return mod_keluar;
    }

    public void setMod_keluar(Model_BarangKeluar mod_keluar) {
        this.mod_keluar = mod_keluar;
    }

    public Model_Barang getMod_barang() {
        return mod_barang;
    }

    public void setMod_barang(Model_Barang mod_barang) {
        this.mod_barang = mod_barang;
    }

    public int getJml_keluar() {
        return jml_keluar;
    }

    public void setJml_keluar(int jml_keluar) {
        this.jml_keluar = jml_keluar;
    }

    public Long getSubtotal_keluar() {
        return subtotal_keluar;
    }

    public void setSubtotal_keluar(Long subtotal_keluar) {
        this.subtotal_keluar = subtotal_keluar;
    }

    
}
