/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ıntheritance3;

import java.util.Scanner;

/**
 *
 * @author irem beril
 */
public class Intheritance3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        
        String islemler= "1-Yazılımcı İşlemleri\n"
                        +"2-Yönetici İşlemleri\n"
                        +"Çıkış için 'q'";
        System.out.println("*****************************************************");
        System.out.println(islemler);
        System.out.println("*****************************************************");
        
        while(true)
        {
            System.out.println("İşlem seçiniz: ");
            String islem=scanner.nextLine();
            
            if(islem.equals("q"))
            {
                System.out.println("Programdan çıkılıyor...");
                break;          
            }
            else if(islem.equals("1"))
            {
                Yazilimci yazilimci=new Yazilimci("İrem Beril","Nacak",37,"C,Java");
                yazilimci.bilgileriGoster();
            }
            else if(islem.equals("2"))
            {
                Yonetici yonetici=new Yonetici("İrem","Beril",100,200);
                
                String yonetici_islem="1-Yönetici Bilgileri\n"
                                     +"2-Zam Bilgisi";
                System.out.println(yonetici_islem);
                while(true)
                {   
                    System.out.println("İşlemi seçiniz: ");
                    String yislem=scanner.nextLine();
                    if(yislem.equals("1"))
                    {
                        yonetici.bilgileriGoster();
                        break;
                    }
                    else if(yislem.equals("2"))
                    {
                        System.out.println("Zam talebinizi giriniz: ");
                        int zam=scanner.nextInt();
                        yonetici.zamYap(zam);
                        scanner.nextLine();
                        break;
                    }
                    else
                    {
                        System.out.println("gecersiz işlem....");
                        break;
                    }
                }
            }
            else
            {
                System.out.println("geçersiz işlem!!!");
            }
        }
    }
    
}
