/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.inventory.tablemodel;

import java.util.ArrayList;
import java.util.List;
import javax.swing.Icon;
import javax.swing.JOptionPane;
import javax.swing.table.AbstractTableModel;
import com.inventory.model.Model_JenisBarang;



public class TableMod_JenisBarang extends AbstractTableModel{
    
    Icon iconSukses = new javax.swing.ImageIcon(getClass().getResource("/com/inventory/img/icons8_checked_50px.png"));
    Icon iconDelete = new javax.swing.ImageIcon(getClass().getResource("/com/inventory/img/icons8_cancel_50px.png"));
    
    private List<Model_JenisBarang> list = new ArrayList<>();
    private final String[] columnNames = {"No", "Kode Jenis", "Nama Jenis"};
    
    public void tambahData(Model_JenisBarang mod_jenbar){
        list.add(mod_jenbar);
        fireTableRowsInserted(list.size() - 1, list.size() -1);
        //JOptionPane.showMessageDialog(null, "Data Berhasil ditambahkan");
        JOptionPane.showMessageDialog(null, "Data Berhasil ditambahkan", "Tambah Data", 0, iconSukses);
    }
    
    public void perbaruiData(int row, Model_JenisBarang mod_jenbar){
        list.add(row, mod_jenbar);
        fireTableDataChanged();
        JOptionPane.showMessageDialog(null, "Data Berhasil di perbarui");
    }
    
    public void hapusData(int index){
        list.remove(index);
        fireTableRowsDeleted(index, index);
        //JOptionPane.showMessageDialog(null, "Data Berhasil di hapus");
        JOptionPane.showMessageDialog(null, "Data Berhasil di hapus", "Hapus Data", 0, iconDelete);
    }
    
    public void clear(){
        list.clear();
        fireTableDataChanged();
    }

    public void setData(List<Model_JenisBarang> list){
        clear();
        this.list.addAll(list);
        fireTableDataChanged();
    }
    
    public void setData(int index, Model_JenisBarang mod_jenbar){
        list.set(index, mod_jenbar);
        fireTableRowsUpdated(index, index);
    }
    
    public Model_JenisBarang getData(int index){
        return list.get(index);
    }
    
    @Override
    public int getRowCount() {
        return list.size();
    }

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
                    case 0: return list.get(rowIndex).getKode_jenis();
                    case 1: return list.get(rowIndex).getNama_jenis();
                    default: return null;
                }
            }
        }
    
    @Override
    public String getColumnName(int column) {
        if (column == 0) {
            return "    " + columnNames[column];
        } else {
            return columnNames[column];
        }
    }
}
