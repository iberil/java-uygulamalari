/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package throwsornek;

import java.io.IOException;
import java.util.Scanner;

public class ThrowsOrnek {

    public static void mekan_kontrol(int yas) throws IOException //IOException checked exception olduğu için throws diye eklememiz gerekiyor
    {                                                           //ArithmeticException fln unchecked oşduğu için throwsa gerek yok.
        if(yas<18)
        {
            throw new IOException();
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
        catch(IOException e)
        {
            System.out.println("18den küçükler giremez...");
        }
                
        
    }
    }
    

