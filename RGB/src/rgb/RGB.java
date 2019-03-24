/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rgb;

import java.util.Random;

/**
 *
 * @author Remigiusz
 */
public class RGB {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
        RGB_Klasa RGB_1=RGB_Kontroler.initRGB();
        RGB_Klasa RGB_2=RGB_Kontroler.initRGB();
        System.out.println(RGB_Kontroler.displayRGB(RGB_1));
        System.out.println(RGB_Kontroler.displayRGB(RGB_2));
        System.out.println("Kolor który został powstał po wymieszaniu dwóch powyżych");
        System.out.println(RGB_Kontroler.mix_RGB(RGB_1, RGB_2).toString());
        
        
        
    }
    
}


class RGB_Kontroler
{

    static RGB_Klasa initRGB()
    {
        Random r= new Random();
        
        return new RGB_Klasa(r.nextInt(256), r.nextInt(256), r.nextInt(256));
    }
    
    static String displayRGB(RGB_Klasa b_Klasa)
    {
    
     return b_Klasa.toString();
    }
    
     static RGB_Klasa mix_RGB(RGB_Klasa kolor_1,RGB_Klasa kolor_2)
     {
     
         int r=(kolor_1.getR_value()+kolor_2.getR_value())/2;
         int g=(kolor_1.getG_value()+kolor_2.getG_value())/2;
         int b=(kolor_1.getB_value()+kolor_2.getB_value())/2;
         
      return new RGB_Klasa(r, g, b);
     }
    
    
}

class RGB_Klasa
{

    public RGB_Klasa(int R_value, int G_value, int B_value) {
        this.R_value = R_value;
        this.G_value = G_value;
        this.B_value = B_value;
    }
   
  private int R_value;
  private int G_value;
  private int B_value;

    public int getR_value() {
        return R_value;
    }

    public void setR_value(int R_value) {
        this.R_value = R_value;
    }

    public int getG_value() {
        return G_value;
    }

    public void setG_value(int G_value) {
        this.G_value = G_value;
    }

    public int getB_value() {
        return B_value;
    }

    public void setB_value(int B_value) {
        this.B_value = B_value;
    }

    @Override
    public String toString() {
        return "[" + "R_value=" + R_value + ", G_value=" + G_value + ", B_value=" + B_value + ']';
    }
    
  
    
    
}