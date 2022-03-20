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
public class ProgramStudi {
   private String namaProgramStudi;
   private LinkedList<Dosen> listDosen;
   
   public ProgramStudi(String namaProgramStudi){
       this.namaProgramStudi = namaProgramStudi;
   }
   public String getNamaProgramStudi(){
        return namaProgramStudi; 
   } 
   public void setNamaProgramStudi (String namaProgramStudi){
        this.namaProgramStudi = namaProgramStudi;
   }
   public LinkedList<Dosen> getListDosen(){
       return listDosen;
   }
   public void setListDosen(LinkedList<Dosen> listDosen){
       this.listDosen = listDosen;
   }  
}
