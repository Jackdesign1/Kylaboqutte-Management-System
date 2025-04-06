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
public class Model_DetPemesanan {
    private Model_Pemesanan mod_pesan;
    private Model_Barang mod_barang;
    private Long jml_pesan;
    private Long subtotal;
    private String status;

    public Model_Pemesanan getMod_pesan() {
        return mod_pesan;
    }

    public void setMod_pesan(Model_Pemesanan mod_pesan) {
        this.mod_pesan = mod_pesan;
    }

    public Model_Barang getMod_barang() {
        return mod_barang;
    }

    public void setMod_barang(Model_Barang mod_barang) {
        this.mod_barang = mod_barang;
    }

    public Long getJml_pesan() {
        return jml_pesan;
    }

    public void setJml_pesan(Long jml_pesan) {
        this.jml_pesan = jml_pesan;
    }

    public Long getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(Long subtotal) {
        this.subtotal = subtotal;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    
}
