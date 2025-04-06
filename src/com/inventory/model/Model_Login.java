/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.inventory.model;

import java.sql.Blob;

/**
 *
 * @author Uhnuy Kozuki
 */
public class Model_Login {

    private String id_user;
    private String nama_pengguna;
    private String username;
    private String pass_user;
    private Blob gambar;
    private String level;

    public Blob getGambar() {
        return gambar;
    }

    public void setGambar(Blob gambar) {
        this.gambar = gambar;
    }
    
    public String getNama_pengguna() {
        return nama_pengguna;
    }

    public void setNama_pengguna(String nama_pengguna) {
        this.nama_pengguna = nama_pengguna;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }
          
    public String getId_user() {
        return id_user;
    }

    public void setId_user(String id_user) {
        this.id_user = id_user;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPass_user() {
        return pass_user;
    }

    public void setPass_user(String pass_user) {
        this.pass_user = pass_user;
    }
    
    
}
