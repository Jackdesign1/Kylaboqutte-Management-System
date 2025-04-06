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
import com.inventory.model.Model_Distributor;

/**
 *
 * @author Uhnuy Kozuki
 */
public class TableMod_Distributor extends AbstractTableModel{
    
    private List<Model_Distributor> list = new ArrayList<>();
    
    public void tambahData(Model_Distributor mod_dis){
        list.add(mod_dis);
        fireTableRowsInserted(list.size() - 1, list.size() -1);
        JOptionPane.showMessageDialog(null, "Data Berhasil ditambahkan");
    }
    
    public void perbaruiData(int row, Model_Distributor mod_dis){
        list.add(row, mod_dis);
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

    public void setData(List<Model_Distributor> list){
        clear();
        this.list.addAll(list);
        fireTableDataChanged();
    }
    
    public void setData(int index, Model_Distributor mod_dis){
        list.set(index, mod_dis);
        fireTableRowsUpdated(index, index);
    }
    
    public Model_Distributor getData(int index){
        return list.get(index);
    }
    
    private final String[] columnNames = {"No", "ID Distributor", "Nama Distributor", "Telepon", "Alamat"};
    
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
                    case 0: return list.get(rowIndex).getId_distributor();
                    case 1: return list.get(rowIndex).getNama_distributor();
                    case 2: return list.get(rowIndex).getTelp_distributor();
                    case 3: return list.get(rowIndex).getAlamat_distributor();

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
