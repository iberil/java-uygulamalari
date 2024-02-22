/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package throwörnek;

import java.util.Scanner;

/**
 *
 * @author irem beril
 */
public class Throwörnek {
    
    public static void mekan_kontrol(int yas)
    {
        if(yas<18)
        {
            throw new ArithmeticException();
        }
        else
        {
            System.out.println("iyi eğlenceler");
        }
    }

    public static void main(String[] args) {
        
        Scanner scanner=new Scanner(System.in);
        System.out.println("yaşınızı giriniz: ");
        int yas=scanner.nextInt();
        
        try
        {
            mekan_kontrol(yas);
        }
        catch(ArithmeticException e)
        {
            System.out.println("18den küçükler giremez...");
        }
                
        
    }
    
}
