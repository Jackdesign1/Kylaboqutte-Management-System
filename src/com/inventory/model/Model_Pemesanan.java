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
public class Model_Pemesanan {
    private String no_pesan;
    private String tgl_pesan;
    private Long total_pesan;
    private Model_Distributor mod_distributor;
    private Model_Pengguna mod_pengguna;

    public String getNo_pesan() {
        return no_pesan;
    }

    public void setNo_pesan(String no_pesan) {
        this.no_pesan = no_pesan;
    }

    public String getTgl_pesan() {
        return tgl_pesan;
    }

    public void setTgl_pesan(String tgl_pesan) {
        this.tgl_pesan = tgl_pesan;
    }

    public Long getTotal_pesan() {
        return total_pesan;
    }

    public void setTotal_pesan(Long total_pesan) {
        this.total_pesan = total_pesan;
    }

    public Model_Distributor getMod_distributor() {
        return mod_distributor;
    }

    public void setMod_distributor(Model_Distributor mod_distributor) {
        this.mod_distributor = mod_distributor;
    }

    public Model_Pengguna getMod_pengguna() {
        return mod_pengguna;
    }

    public void setMod_pengguna(Model_Pengguna mod_pengguna) {
        this.mod_pengguna = mod_pengguna;
    }

    

    
}
