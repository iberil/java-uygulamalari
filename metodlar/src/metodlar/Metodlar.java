/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package metodlar;

import java.util.Scanner;

/**
 *
 * @author irem beril
 */
public class Metodlar {
    public static void selamlama()
    {
        System.out.println("Merhaba Hoşgeldin<3");
    }
    public static void faktoriyel()
    {
        Scanner scanner=new Scanner(System.in);
        System.out.println("faktöriyelini almak istediğiniz sayıyı giriniz: ");
        int sayi=scanner.nextInt();
        int fakt=1,i;
        for(i=1;i<=sayi;i++)
        {
            fakt*=i;
        }
        System.out.println(sayi+"!= "+fakt);
    }
    public static void ekrana_yazma(String isim)
    {
        System.out.println("Merhaba "+isim);
    }
    public static void main(String[] args) {
        // metodlar(fonksiyonlar)
        //her classın kendine ait metodu var
        
        //void tipinde olduğu için bir şey döndürmüyor parantezin içi boş
       // selamlama(); 
        //faktoriyel();
        Scanner scanner=new Scanner(System.in);
        System.out.println("isim giriniz: ");
        String isim=scanner.nextLine();
        ekrana_yazma(isim);
        
    }
    
}
