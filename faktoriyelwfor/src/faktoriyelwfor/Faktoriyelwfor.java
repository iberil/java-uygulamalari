/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package faktoriyelwfor;

import java.util.Scanner;

/**
 *
 * @author irem beril
 */
public class Faktoriyelwfor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner scanner=new Scanner(System.in);
       
        System.out.println("faktoriyelini almak istediğiniz sayıyı giriniz: ");
        int sayi=scanner.nextInt();
        int i,faktoriyel = 1;
        
        /*for(i=sayi;i>0;i--)            //azalarak vers.
        {
            faktoriyel*=i;
        }
        System.out.println(sayi+"!= "+faktoriyel);
        */
        for(i=1;i<sayi+1;i++)          //artan vers.
        {
            faktoriyel*=i;
        }
        System.out.println(sayi+"!= "+faktoriyel);
        
    }
    
}
