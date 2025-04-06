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
import com.inventory.model.Model_SemBarangMasuk;

/**
 *
 * @author Uhnuy Kozuki
 */
public class TableMod_SemBarangMasuk extends AbstractTableModel{
    
    private List<Model_SemBarangMasuk> list = new ArrayList<>();
    
    public void tambahData(Model_SemBarangMasuk mod_masuk){
        list.add(mod_masuk);
        fireTableRowsInserted(list.size() - 1, list.size() -1);
        JOptionPane.showMessageDialog(null, "Data Berhasil ditambahkan");
    }
    
    public void perbaruiData(int row, Model_SemBarangMasuk mod_masuk){
        list.add(row, mod_masuk);
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

    public void setData(List<Model_SemBarangMasuk> list){
        clear();
        this.list.addAll(list);
        fireTableDataChanged();
    }
    
    public void setData(int index, Model_SemBarangMasuk mod_masuk){
        list.set(index, mod_masuk);
        fireTableRowsUpdated(index, index);
    }
    
    public Model_SemBarangMasuk getData(int index){
        return list.get(index);
    }
    
    @Override
    public int getRowCount() {
        return list.size();
    }

    private final String[] columnNames = {"No", "Kode Barang", "Nama Barang", "Satuan", "Harga", "Stok", "Jumlah Masuk","Subtotal"};
    
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
                case 0: return list.get(rowIndex).getMod_barang().getKode_barang();
                case 1: return list.get(rowIndex).getMod_barang().getNama_barang();
                case 2: return list.get(rowIndex).getMod_barang().getSatuan();
                case 3: return list.get(rowIndex).getMod_barang().getHarga();
                case 4: return list.get(rowIndex).getMod_barang().getStok();
                case 5: return list.get(rowIndex).getMod_detmasuk().getJml_masuk();
                case 6: return list.get(rowIndex).getMod_detmasuk().getSubtotal_masuk();

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
