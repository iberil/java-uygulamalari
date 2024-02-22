/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package asalbulmetod;

import java.util.Scanner;

/**
 *
 * @author irem beril
 */
public class Asalbulmetod {
    public static boolean asal(int sayi)
    {
        for(int i=2;i<=sayi/2;i++)
        {
            if(sayi%i==0)
            {
                return false;
            }
           
        }
        return true;
    }

    public static void main(String[] args) {
        // 1den 1000e kadar olan fonksiyonları ekrana basan program
       
        int i;
        System.out.println("Asal Sayılar: ");
        for(i=2;i<1001;i++)
        {
            if(asal(i))  //true olanlar
            {
                System.out.println(" "+i);
            }
        }
    }
    
}
