/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package barang;

/**
 *
 * @author Asus
 */
public class Barang {
    String kode_barang;
    String nama_barang;
    private int stok;
    
    
    public int getStok(){
       return this.stok;
    }
    public void setStok(int stok){
        this.stok = stok;
    }
    
    public Barang(String kode, String nama, int stk){
        kode_barang = kode;
        nama_barang = nama;
        stok = stk;
    }  

    void tambahStok(int i){
        stok += i;
}
    
}