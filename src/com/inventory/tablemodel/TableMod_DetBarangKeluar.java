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
import com.inventory.model.Model_DetBarangKeluar;

/**
 *
 * @author Uhnuy Kozuki
 */
public class TableMod_DetBarangKeluar extends AbstractTableModel{

    private List<Model_DetBarangKeluar> list = new ArrayList<>();
    
    public void tambahData(Model_DetBarangKeluar mod_detkeluar){
        list.add(mod_detkeluar);
        fireTableRowsInserted(list.size() - 1, list.size() -1);
        JOptionPane.showMessageDialog(null, "Data Berhasil ditambahkan");
    }
    
    public void perbaruiData(int row, Model_DetBarangKeluar mod_detkeluar){
        list.add(row, mod_detkeluar);
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

    public void setData(List<Model_DetBarangKeluar> list){
        clear();
        this.list.addAll(list);
        fireTableDataChanged();
    }
    
    public void setData(int index, Model_DetBarangKeluar mod_detkeluar){
        list.set(index, mod_detkeluar);
        fireTableRowsUpdated(index, index);
    }
    
    public Model_DetBarangKeluar getData(int index){
        return list.get(index);
    }
    
    @Override
    public int getRowCount() {
        return list.size();
    }

    private final String[] columnNames = {"No", "No Keluar", "Kode Barang","Nama Barang", "Harga", "Jumlah Keluar", "Subtotal"};
    
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
                case 0: return list.get(rowIndex).getMod_keluar().getNo_keluar();
                case 1: return list.get(rowIndex).getMod_barang().getKode_barang();
                case 2: return list.get(rowIndex).getMod_barang().getNama_barang();
                case 3: return list.get(rowIndex).getMod_barang().getHarga();
                case 4: return list.get(rowIndex).getJml_keluar();
                case 5: return list.get(rowIndex).getSubtotal_keluar();

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
