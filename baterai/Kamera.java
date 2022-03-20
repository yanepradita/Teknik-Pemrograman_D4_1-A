/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baterai;

/**
 *
 * @author yanep
 */
public class Kamera {
  private String merekKamera;
  private Baterai baterai;
  
  public Kamera(String merekKamera, Baterai baterai){
      this.merekKamera = merekKamera;
      this.baterai = baterai; 
  }
  public String getMerekKamera(){
      return merekKamera;
  }
  public void setMerekKamera(String merekKamera){
      this.merekKamera = merekKamera;
  }
  public Baterai getBaterai(){
      return baterai;
  }
  public void setBaterai(Baterai baterai){
      this.baterai = baterai; 
  }  
}
