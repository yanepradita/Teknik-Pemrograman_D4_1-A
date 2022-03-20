/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kelas;

import java.util.LinkedList;
/**
 *
 * @author yanep
 */
public class Association {
    public static void main(String[] args){
        //untuk membuat data mahasiswa
        LinkedList<Mahasiswa> mhs = new LinkedList<>();
        Kelas kelas = new Kelas ("D4-A", mhs);
        
        //Association satu ke banyak
        mhs.addFirst(new Mahasiswa("211524028", kelas));
        mhs.addFirst(new Mahasiswa("211524029", kelas));
        
        System.out.println("List mahasiswa " + kelas.getNamaKelas());
        System.out.println("*******************");
        for (Mahasiswa listMhs : kelas.getMahasiswa()){
            System.out.println(listMhs.getNim());
        }
    }
}
