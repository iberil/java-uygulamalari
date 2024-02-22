/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package abstactörnek;

import java.util.Scanner;

/**
 *
 * @author irem beril
 */
public class Abstactörnek {

    public static void main(String[] args) {
        
        Scanner scanner=new Scanner(System.in);
        
        String islemler="1-Karenin Alanı\n2-Dairenin Alanı\n3-Üçgenin Alanı\nÇıkış için q\n";
        String secim;
        
        while(true)
        {
            System.out.println(islemler);
            System.out.println("Yapacağınız işlemi seçiniz:");
            secim=scanner.nextLine();
            
            if(secim.equals("1"))
            {
                System.out.println("Karenin kenar uzunluğunu giriniz: ");
                int k_kenar=scanner.nextInt();
                     
                Kare kare1=new Kare("kare",k_kenar);
                kare1.alan_hesapla();
            }
            else if(secim.equals("2"))
            {
                System.out.println("Dairenin kenar uzunluğunu giriniz: ");
                int d_kenar=scanner.nextInt();
                Daire daire1= new Daire("daire",d_kenar);
                daire1.alan_hesapla();
            }
            else if(secim.equals("3"))
            {
                System.out.println("Ucgenin kenar uzunluklarını giriniz: ");
                int kenar1=scanner.nextInt();
                int kenar2=scanner.nextInt();
                int kenar3=scanner.nextInt();
                Ucgen ucgen1= new Ucgen("üçgen",kenar1,kenar2,kenar3);
                ucgen1.alan_hesapla();
            }
            else if(secim.equals("q"))
            {
                System.out.println("Çıkış yapılıyor...");
                break;
                        
            }          
            
        }
    }
    
}
