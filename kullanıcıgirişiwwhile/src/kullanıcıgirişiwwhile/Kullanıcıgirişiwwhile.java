/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package kullanıcıgirişiwwhile;

import java.util.Scanner;

/**
 *
 * @author irem beril
 */
public class Kullanıcıgirişiwwhile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // kullanıcı giriş ekranı yazma while döngüsü ile
        Scanner scanner=new Scanner(System.in);
        String kullanıcı_ad="irem";
        String kullanıcı_parola="1907";
        
        int giriş_hakkı=3;
        
        System.out.println("**************************************************");
        System.out.println("Kullanıcı Giriş Ekranı");
        System.out.println("**************************************************");
        while(true){
            System.out.println("Kullanıcı Adını Giriniz: ");
            String ad=scanner.nextLine();
            System.out.println("Kullanıcı ŞifresiniGiriniz: ");
            String şifre=scanner.nextLine();
            
            if(ad.equals(kullanıcı_ad)&&şifre.equals(kullanıcı_parola))
            {
                System.out.println("Hoşgeldiniz "+kullanıcı_ad);
                break;
            }
            else if(ad.equals(kullanıcı_ad)&&!şifre.equals(kullanıcı_parola))
            {
                System.out.println("parolanız hatalı!!!");
                giriş_hakkı-=1;
            }
            else if(!ad.equals(kullanıcı_ad)&&şifre.equals(kullanıcı_parola))
            {
                System.out.println("kullanıcı adınız hatalı!!!");
                giriş_hakkı-=1;
            }
            else
            {
                System.out.println("kullanıcı adınız ve parolanız hatalı!!!");
                giriş_hakkı-=1;
            }
            
            if(giriş_hakkı==0)
            {
                System.out.println("giriş hakkınız bitmiştir.Yarın tekrar deneyiniz.");
                break;
            }
            
        }
        
        
    }
    
}
