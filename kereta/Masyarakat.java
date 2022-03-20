/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kereta;

/**
 *
 * @author yanep
 */
public class Masyarakat {
   private String NIK; 
   
   public Masyarakat(String NIK){
        this.NIK = NIK;      
   }
   public String getNIK(){
       return NIK;
   }
   public void setNIK(String NIK){
       this.NIK = NIK;
   }
   public void naikKereta(Kereta kereta){
       //terjadinya dependensi
       System.out.println("NIK "+ NIK + " naik Kereta " + "Jurusan " + kereta.getJurusanKereta());
   }
}
