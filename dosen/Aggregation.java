/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dosen;
import java.util.LinkedList;
/**
 *
 * @author yanep
 */
public class Aggregation {
    public static void main(String[] args){
        //untuk membuat data dosen
        LinkedList<Dosen> listDosen = new LinkedList<>();
        ProgramStudi programStudi = new  ProgramStudi ("Teknik Informatika");
        
        //Association satu ke banyak
        listDosen.add(new Dosen("Jerome Polin"));
        listDosen.add(new Dosen("Maudy Ayunda"));
        listDosen.add(new Dosen("Angga Yunanda"));
         
        programStudi.setListDosen(listDosen);
        
        System.out.println("List Dosen " + programStudi.getNamaProgramStudi());
        System.out.println("===============================");
        for (Dosen lecture : listDosen){
            System.out.println(lecture.getNamaDosen());
        }
    }  
}
