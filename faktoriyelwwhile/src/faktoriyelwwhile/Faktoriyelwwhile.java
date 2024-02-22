/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package faktoriyelwwhile;

import java.util.Scanner;

/**
 *
 * @author irem beril
 */
public class Faktoriyelwwhile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("faktoriyelini almak istediğiniz sayıyı giriniz:");
        int sayi=scanner.nextInt();
        int i=1,faktoriyel=1;
        
       /* while(i<=sayi)
        {
            faktoriyel*=i;
            i++;
        }
        System.out.println(sayi+"!= "+faktoriyel);*/
        while(sayi>0)
        {
            faktoriyel*=sayi;
            sayi--;
        }
        System.out.println("faktoriyel: "+faktoriyel);
        
        
    }
    
}
