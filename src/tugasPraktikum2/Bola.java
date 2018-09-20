/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasPraktikum2;
import java.lang.Math;
/**
 *
 * @author ASUS
 */
public class Bola {
    private double jarijari = 7;
    private double diameter;
    private double volume;
    private double luas;
    
    public void setJari(double jarijari){
        this.jarijari=jarijari;
    }
    public void showDiameter(){
        this.diameter=jarijari*2;
    }
    public void showLuas(){
        this.luas=4*Math.PI*jarijari*jarijari;
    }
   public void showVolume(){
       this.volume=(4*jarijari*jarijari*jarijari*Math.PI)/3;
   }
   public void cetak (){
       System.out.println("Jari-jari: "+jarijari+" cm");
       System.out.println("Diameter : " + diameter+" cm");
       System.out.println("Luas : "+luas+ " cm persegi");
       System.out.println("Volume : "+volume+" cm kubik");
   }
    
}
