package com.inventory.tablemodel;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.AbstractTableModel;
import com.inventory.model.Model_SemBarangKeluar;

public class TableMod_SemBarangKeluar extends AbstractTableModel{
    
    private List<Model_SemBarangKeluar> list = new ArrayList<>();
    
    public void tambahData(Model_SemBarangKeluar mod_keluar){
        list.add(mod_keluar);
        fireTableRowsInserted(list.size() - 1, list.size() -1);
        JOptionPane.showMessageDialog(null, "Data Berhasil ditambahkan");
    }
    
    public void perbaruiData(int row, Model_SemBarangKeluar mod_keluar){
        list.add(row, mod_keluar);
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

    public void setData(List<Model_SemBarangKeluar> list){
        clear();
        this.list.addAll(list);
        fireTableDataChanged();
    }
    
    public void setData(int index, Model_SemBarangKeluar mod_keluar){
        list.set(index, mod_keluar);
        fireTableRowsUpdated(index, index);
    }
    
    public Model_SemBarangKeluar getData(int index){
        return list.get(index);
    }
    
    @Override
    public int getRowCount() {
        return list.size();
    }

    private final String[] columnNames = {"No", "Kode Barang","Nama Barang", "Satuan", "Harga", "Stok", "Jumlah Keluar", "Subtotal"};
    
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
                case 5: return list.get(rowIndex).getMod_detkeluar().getJml_keluar();
                case 6: return list.get(rowIndex).getMod_detkeluar().getSubtotal_keluar();

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
