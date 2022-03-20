/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kereta;

/**
 *
 * @author yanep
 */
public class Dependency {
    public static void main(String[] args){
        Kereta kereta = new Kereta("Surabaya");
        Masyarakat masyarakat = new Masyarakat("32771012131415");
        
        masyarakat.naikKereta(kereta); 
    }  
}
