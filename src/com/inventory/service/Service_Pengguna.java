/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.inventory.service;

import java.util.List;
import javax.swing.JLabel;
import javax.swing.JTable;
import com.inventory.model.Model_Pengguna;

/**
 *
 * @author Uhnuy Kozuki
 */
public interface Service_Pengguna {
    void tambahData     (Model_Pengguna mod_pengguna);
    void perbaruiData   (Model_Pengguna mod_pengguna);
    void hapusData      (Model_Pengguna mod_pengguna);
    
    List<Model_Pengguna> getData();
    List<Model_Pengguna> pencarian(String id);
    
    String nomor();
    boolean validateOldPassword(String username, String oldPassword);
    boolean changePassword(String username, String oldPassword, String newPassword);
    void tampilGambar(JLabel lb_gambar, String id);
    
    void exportToExcel(JTable table, String filePath);
}
