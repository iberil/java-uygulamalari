/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package abstactörnek;

/**
 *
 * @author irem beril
 */
public class Daire extends Sekil{
    
    private int yaricap;
    
   public Daire(String isim,int yaricap)
   {
       super(isim);
       this.yaricap=yaricap;
   }
   
   @Override
   void alan_hesapla()
   {
       System.out.println(getIsim()+" şeklinin alanı: "+(yaricap*yaricap*Math.PI));
   }
    
}
