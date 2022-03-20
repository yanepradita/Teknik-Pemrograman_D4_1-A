/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kelas;

/**
 *
 * @author yanep
 */
public class Mahasiswa {
    private String nim;
    private Kelas kelas;
    
    public Mahasiswa(String nim, Kelas kelas){
        this.nim = nim;
        this.kelas = kelas;
    }
    public String getNim(){
        return nim;
    }
    
    public void setNim(String nim){
        this.nim = nim;
    }
    
    public Kelas getKelas(){
        return kelas;
    }
    
    public void setKelas(Kelas kelas){
    this.kelas = kelas;
    }
}
