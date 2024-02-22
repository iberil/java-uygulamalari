/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package armstrongsayitesti;

import java.util.Scanner;

/**
 *
 * @author irem beril
 */
public class Armstrongsayitesti {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // girilen sayının armstrong olup olmadığını bulan program
        
        Scanner scanner=new Scanner(System.in);
        System.out.println("sayı giriniz: ");
        int sayi=scanner.nextInt();
        System.out.println("sayının basamak sayısını giriniz:");
        int bs_sayi=scanner.nextInt();
        int toplam=0;
        int geçici=sayi;
        
        do{
           int basamak=geçici%10;
           geçici=geçici/10;
           
           toplam+=Math.pow(basamak,bs_sayi);     
        }while(geçici>0);
        
        if(sayi==toplam)
        {
            System.out.println(sayi+" sayısı armstrong sayıdır.");
        }
        else
        {
            System.out.println(sayi+" sayısı armstrong sayı değildir.");
        }
        
    }
    
}
