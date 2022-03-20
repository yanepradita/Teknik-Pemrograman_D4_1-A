/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package baterai;

/**
 *
 * @author yanep
 */
public class Baterai {
    private String tipeBaterai;
    
    public Baterai(String tipeBaterai){ 
        this.tipeBaterai = tipeBaterai; 
    }
    public String getTipeBaterai(){
       return tipeBaterai; 
    }
    public void setTipeBaterai(String tipeBaterai){
        this.tipeBaterai = tipeBaterai;
    }   
}
