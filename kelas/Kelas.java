/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package kelas;
import java.util.LinkedList;
/**
 *
 * @author yanep
 */
public class Kelas {
    private String namaKelas;
    private LinkedList<Mahasiswa> mahasiswa;
    
    public Kelas(String namaKelas, LinkedList<Mahasiswa> mahasiswa){
        this.namaKelas = namaKelas;
        this.mahasiswa = mahasiswa;
    }
    public String getNamaKelas(){
        return namaKelas; 
    } 
    public void setNamaKelas (String namaKelas){
        this.namaKelas = namaKelas;
    }
    public LinkedList<Mahasiswa> getMahasiswa(){
        return mahasiswa;
    }
    public void setMahasiswa(LinkedList<Mahasiswa> mahasiswa){
        this.mahasiswa = mahasiswa;
    }  
}
