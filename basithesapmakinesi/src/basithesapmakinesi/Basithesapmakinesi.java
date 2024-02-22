/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package basithesapmakinesi;

import java.util.Scanner;

/**
 *
 * @author irem beril
 */
public class Basithesapmakinesi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //switchcase kullanarak basit heap makinesi yapımı
        
        Scanner scanner= new Scanner(System.in);
        
       /* String islemler="1-Toplama İşlemi\n"
                        +"2-Çıkarma İşlemi\n"
                        +"3-Çarpma İşlemi\n"
                        +"4-Bölme İşlemi\n";     
        System.out.println(islemler);
        System.out.println("**************************************************");
        System.out.println("işlem seçiniz");
        int islem=scanner.nextInt();
        
        System.out.println("1. sayıyı giriniz:");
        int s1=scanner.nextInt();
        System.out.println("2. sayıyı giriniz:");
        int s2=scanner.nextInt();
        
        switch(islem){
            case 1:
                System.out.println("sonuç: "+(s1+s2));
                break;
            case 2:
                System.out.println("sonuç: "+(s1-s2));
                break;
            case 3:
                System.out.println("sonuç: "+(s1*s2));
                break;
            case 4:
                System.out.println("sonuç: "+((float)s1/s2));
                break;
            default:
                System.out.println("geçersiz işlem!!!");
                    
                
        }
        */
       
       //if else vers.
       String islemler="1-Toplama İşlemi\n"
                        +"2-Çıkarma İşlemi\n"
                        +"3-Çarpma İşlemi\n"
                        +"4-Bölme İşlemi\n";     
        System.out.println(islemler);
        System.out.println("**************************************************");
        System.out.println("işlem seçiniz");
        int islem=scanner.nextInt();
        
        System.out.println("1. sayıyı giriniz:");
        int s1=scanner.nextInt();
        System.out.println("2. sayıyı giriniz:");
        int s2=scanner.nextInt();
        
        if(islem==1)
        {
            System.out.println("sonuç: "+(s1+s2));
        }
        else if(islem==2)
        {
            System.out.println("sonuç: "+(s1-s2));
        }
        else if(islem==3)
        {
            System.out.println("sonuç: "+(s1*s2));
        }
        else if(islem==4)
        {
            System.out.println("sonuç: "+((float)s1/s2));
        }
        else
        {
            System.out.println("geçersiz işlem!!!");
        }
       
    }
    
}
