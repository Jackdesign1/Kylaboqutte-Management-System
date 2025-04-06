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
import com.inventory.model.Model_Pengguna;

/**
 *
 * @author Uhnuy Kozuki
 */
public class TableMod_Pengguna extends AbstractTableModel {
    
    private List<Model_Pengguna> list = new ArrayList<>();
    
    public void tambahData(Model_Pengguna mod_pengguna){
        list.add(mod_pengguna);
        fireTableRowsInserted(list.size() - 1, list.size() -1);
        JOptionPane.showMessageDialog(null, "Data Berhasil ditambahkan");
    }
    
    public void perbaruiData(int row, Model_Pengguna mod_pengguna){
        list.add(row, mod_pengguna);
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

    public void setData(List<Model_Pengguna> list){
        clear();
        this.list.addAll(list);
        fireTableDataChanged();
    }
    
    public void setData(int index, Model_Pengguna mod_pengguna){
        list.set(index, mod_pengguna);
        fireTableRowsUpdated(index, index);
    }
    
    public Model_Pengguna getData(int index){
        return list.get(index);
    }
    
    @Override
    public int getRowCount() {
        return list.size();
    }

    private final String[] columnNames = {"No", "ID", "Nama", "Username", "Telepon", "Alamat", "Level"};
    
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
                    case 0: return list.get(rowIndex).getId_pengguna();
                    case 1: return list.get(rowIndex).getNama_pengguna();
                    case 2: return list.get(rowIndex).getUsername();
                    case 3: return list.get(rowIndex).getTelp_pengguna();
                    case 4: return list.get(rowIndex).getAlamat_pengguna();
                    case 5: return list.get(rowIndex).getLevel();
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
