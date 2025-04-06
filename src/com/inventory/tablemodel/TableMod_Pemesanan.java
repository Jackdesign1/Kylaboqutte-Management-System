/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.inventory.tablemodel;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.AbstractTableModel;
import com.inventory.model.Model_Pemesanan;

/**
 *
 * @author Uhnuy Kozuki
 */
public class TableMod_Pemesanan extends AbstractTableModel{
    
    private List<Model_Pemesanan> list = new ArrayList<>();
    
    public void tambahData(Model_Pemesanan mod_pesan){
        list.add(mod_pesan);
        fireTableRowsInserted(list.size() - 1, list.size() -1);
        JOptionPane.showMessageDialog(null, "Data Berhasil ditambahkan");
    }
    
    public void perbaruiData(int row, Model_Pemesanan mod_pesan){
        list.add(row, mod_pesan);
        fireTableDataChanged();
        JOptionPane.showMessageDialog(null, "Data Berhasil di perbarui");
    }
    
    public void hapusData(int index){
        list.remove(index);
        fireTableRowsDeleted(index, index);
        JOptionPane.showMessageDialog(null, "Data Berhasil di hapus");
    }
    
    public void clear(){
        list.clear();
        fireTableDataChanged();
    }

    public void setData(List<Model_Pemesanan> list){
        clear();
        this.list.addAll(list);
        fireTableDataChanged();
    }
    
    public void setData(int index, Model_Pemesanan mod_pesan){
        list.set(index, mod_pesan);
        fireTableRowsUpdated(index, index);
    }
    
    public Model_Pemesanan getData(int index){
        return list.get(index);
    }
    
    @Override
    public int getRowCount() {
        return list.size();
    }

    private final String[] columnNames = {"No", "No Pemesanan", "Tanggal", "Total Pemesanan", "ID Distributor", "ID Pengguna"};

    @Override
    public int getColumnCount() {
        return columnNames.length;
    }
    
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        if (columnIndex == 0) {
            return "    " + (rowIndex + 1);
        } else {
            switch (columnIndex - 1) {
                case 0: return list.get(rowIndex).getNo_pesan();
                case 1: return list.get(rowIndex).getTgl_pesan();
                case 2: return list.get(rowIndex).getTotal_pesan();
                case 3: return list.get(rowIndex).getMod_distributor().getId_distributor();
                case 4: return list.get(rowIndex).getMod_pengguna().getId_pengguna();

                default: return null;
            }
        }
    }
    
    @Override
    public String getColumnName(int column) {
        if (column == 0) {
            return "   " + columnNames[column];
        } else {
            return columnNames[column];
        }
    }
}
