/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package basitatmuygulamasi;

import java.util.Scanner;

/**
 *
 * @author irem beril
 */
public class Basitatmuygulamasi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //basit atm hesabı yapımı
        Scanner scanner=new Scanner(System.in);
        String işlemler="1-Bakiye Öğrenme\n"
                       +"2-Para Çekme\n"
                       +"3-Para Yatırma\n"
                       +"4-Çıkış(q)";
        System.out.println("**************************************************");
        System.out.println(işlemler);
        System.out.println("**************************************************");
        
        int bakiye=2000;
        while(true){
            System.out.println("işlem türü seçiniz");
            String işlem=scanner.nextLine();
            
            if(işlem.equals("q"))
            {
                System.out.println("hesaptan çıkış yapılıyor");
                break;
            }
            else if(işlem.equals("1"))
            {
                System.out.println("bakiye: "+bakiye);
            }
            else if(işlem.equals("2"))
            {
                System.out.println("çekilecek tutarı giriniz: ");
                int tutar=scanner.nextInt();
                scanner.nextLine();
                if(bakiye-tutar<0)
                {
                    System.out.println("yetersiz bakiye "+bakiye);
                }
                else
                {
                    bakiye-=tutar;
                    System.out.println("yeni bakiye: "+bakiye);
                }
            }
            else if(işlem.equals("3"))
            {
                System.out.println("yatırmak istediğiniz tutar giriniz:");
                int tutar=scanner.nextInt();
                scanner.nextLine();
                bakiye+=tutar;
                System.out.println("yeni bakiye: "+bakiye);
            }
            else
            {
                System.out.println("geçersiz işlem");
            }
                
            
        }
        
    }
    
}
