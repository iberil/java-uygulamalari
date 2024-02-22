/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package staticolmayanınnerclass;

import java.util.Scanner;

/**
 *
 * @author irem beril
 */
public class StaticOlmayanInnerClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       // Faktoriyel faktoriyel;       Faktoriyel de matematik classının içinde olduğu için ilk etapta gözükmüyor
       Matematik.Faktoriyel faktoriyel= new Matematik().new Faktoriyel();
       Matematik.Asal asal=new Matematik().new Asal();
       Matematik.Alan alan=new Matematik().new Alan();
       Matematik.Alan.DaireAlan d_alan=new Matematik().new Alan().new DaireAlan();
       Matematik.Alan1 alan1= new Matematik.Alan1();  //static inner class
       
       alan1.daire_alan(10); //static inner class
       //Matematik.Alan1.daire_alan(20); //static class içindeki metodu da static yaparsak böyle yazabiliriz
       
       Scanner scanner=new Scanner(System.in);
       
        System.out.println("Bir adet sayı giriniz: ");
        int sayi=scanner.nextInt();
        
        if(asal.asalMi(sayi))
        {
            System.out.println(sayi+" sayısı asaldır.");
        }
        else
        {
            System.out.println("sayı asal değildir.");
        }
        
        faktoriyel.faktoriyel();
        //alan.daireAlan(3);
        d_alan.daireAlan(5);
            
    }
    
}
