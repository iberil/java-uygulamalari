/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package staticolmayanınnerclass;

import java.util.Scanner;

/**
 *
 * @author irem beril
 */
public class Matematik { 
    private /*static*/ double PI= Math.PI;
    
    public class Faktoriyel  //inner class
    { 
        public void faktoriyel(){   
        Scanner scanner=new Scanner(System.in);
        int fact=1;
        System.out.println("Bir sayı giriniz: ");
        int sayi=scanner.nextInt();
        
        for(int i=2;i<sayi+1;i++)
        {
            fact*=i;
        }  
            System.out.println("faktöriyel: "+fact);  
    }         
    }
    public class Asal
    {
        public boolean asalMi(int sayi)
        {
            int i=2;
            
            while(i<sayi)
            {
                if(sayi%i==0)
                {
                    return false;
                }
               i++;
            }
            return true;
        }
    }
    
    public class Alan{
        public class DaireAlan{
            public void daireAlan(int yaricap){
            //PI değişkeni private alanda olsa da matematik classı içinde olduğumuz için rahatlıkla erişebiliriz.
            System.out.println("Dairenin alanı:  "+(PI*yaricap*yaricap));   
        }    
        }
      /*  public void daireAlan(int yaricap){
            //PI değişkeni private alanda olsa da matematik classı içinde olduğumuz için rahatlıkla erişebiliriz.
            System.out.println("Dairenin alanı:  "+(PI*yaricap*yaricap));
            
        }
        */
    }
    
    public static class Alan1{
        public /*static*/ void daire_alan(int yaricap)
        {
            System.out.println("alanı: "+(Math.PI*yaricap*yaricap));  
        //static olmayan PI static bir classta çalışamıyor ondan math kütüphanesinden tanımladı PIyi
        //eğer private static double PI dersek kullanabiliriz
        }
        
        //static olmayanlarda matematik classından obje oluşturuyorduk matematik->alan
        //ancak staticte buna gerek olmuyor
        
    }
}
    
    

