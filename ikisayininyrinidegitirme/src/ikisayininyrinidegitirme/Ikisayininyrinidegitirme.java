/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ikisayininyrinidegitirme;

import java.util.Scanner;

/**
 *
 * @author irem beril
 */
public class Ikisayininyrinidegitirme {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int birinci_sayi;
        int ikinci_sayi;
        
        System.out.println("birinci sayiyi giriniz:");
        birinci_sayi= scanner.nextInt();
        
        System.out.println("ikinci sayiyi giriniz:");
        ikinci_sayi=scanner.nextInt();
        
        System.out.println("değişmeden önce\nbirinci sayi:"+birinci_sayi+"\tikinci sayi:"+ikinci_sayi);
        
        int gecici=birinci_sayi;
        birinci_sayi=ikinci_sayi;
        ikinci_sayi=gecici;
        
        System.out.println("değiştirdikten sonra\nbirinci sayi:"+birinci_sayi+"\tikinci sayi:"+ikinci_sayi);
        
        
     
    }
    
}
