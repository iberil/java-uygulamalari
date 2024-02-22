/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package nothesaplama;

import java.util.Scanner;

/**
 *
 * @author irem beril
 */
public class Nothesaplama {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //gelişmiş not hesaplama sistemi
        Scanner scanner=new Scanner(System.in);
        
        System.out.println("vize notunuzu giriniz:");
        int vize=scanner.nextInt();
        System.out.println("final notunuzu giriniz:");
        int finaln=scanner.nextInt();
        
        double not=(vize*0.4)+(finaln*0.6);
        
        if(not>=82)
        {
            System.out.println("AA");
        }
        else if(not>=74)
        {
            System.out.println("BA");
        }
        else if(not>=65)
        {
            System.out.println("BB");
        }
        else if(not>=58)
        {
                System.out.println("CB");
        }
        else if(not>=50)
        {
            System.out.println("CC");
        }
        else
        {
            System.out.println("kaldınız...");
        }
    }
    
}
