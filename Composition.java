/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baterai;

/**
 *
 * @author yanep
 */
public class Composition {
    public static void main(String[] args){
        Kamera kamera = new Kamera("Sony a6300", new Baterai("Np-Fw50"));
        
        System.out.println(kamera.getMerekKamera());
        System.out.println(kamera.getBaterai().getTipeBaterai());
    }
}
