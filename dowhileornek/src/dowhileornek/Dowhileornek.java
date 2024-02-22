/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dowhileornek;

import java.util.Scanner;

/**
 *
 * @author irem beril
 */
public class Dowhileornek {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //girilen sayının rakamları toplamını bulan program
        Scanner scanner=new Scanner(System.in);
        int toplam=0;
        System.out.println("sayı giriniz: ");
        int sayi=scanner.nextInt();
        
        do{
            toplam+=sayi%10;
            sayi=sayi/10;
        }while(sayi>0);
        System.out.println("sayının rakamları toplamı: "+toplam);
        
    }
    
}
