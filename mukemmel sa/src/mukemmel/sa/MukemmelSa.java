/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mukemmel.sa;

import java.util.Scanner;

/**
 *
 * @author irem beril
 */
public class MukemmelSa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner scanner=new Scanner(System.in);
        
        System.out.println("sayı giriniz:");
        int sayı=scanner.nextInt();
        int i,kontrol=0,toplam=0;
        
        for(i=1;i<sayı;i++)
        {
            if(sayı%i==0)
            {
                toplam+=i;

            }  
        }
        if(toplam==sayı)
        {
            kontrol=1;
        }
        else
        {
            kontrol=0;
        }
        switch(kontrol){
            case 0:
                System.out.println(sayı+" mükemmel değil");
                break;
            case 1:
                System.out.println(sayı+" mükemmeldir");
        }
        
        
    }
    
}
