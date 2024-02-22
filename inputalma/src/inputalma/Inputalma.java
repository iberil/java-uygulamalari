/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package inputalma;

import java.util.Scanner;

/**
 *
 * @author irem beril
 */
public class Inputalma {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner (System.in);
       /* System.out.println("lütfen yaşınızı giriniz:");
        int yas;
        yas = scanner.nextInt(); 
        System.out.println("yasınız:"+yas);
      */                                    //hem yaş hem de metni almak için araya scanner.nextLine()eklemeliyiz
       /* System.out.println("lütfen metin giriniz:");    //çünkü enter yaptığımız için metin alma işlemini atlıyor
        String yazi= scanner.nextLine();
        System.out.println("metin: "+yazi);
       */
       
       //************************************************************************************************************
       
       /* System.out.println("yaşınızı giriniz:");
       if(scanner.hasNextInt())
       {
           int sayi= scanner.nextInt();
           System.out.println("yaşınız: "+sayi);
       }
       else
       {
           System.out.println("hatalı giriş yaptınız!!!\nLütfen bir sayi giriniz");
       }
        scanner.nextLine(); //dummy 
        
        System.out.println("isminizi giriniz:");    //önce line sonra int alırsak hata çıkmıyor
        String ad= scanner.nextLine();                //tüm sorun sonra line almak istemekle kaynaklı
        System.out.println("isim:"+ad);
       */
       
       //***************************************************************************************************
       
        System.out.println("sayıları giriniz:");
        
        int a= scanner.nextInt();
        int b= scanner.nextInt();
        int c= scanner.nextInt();
        
        System.out.println("a= "+a+" b= "+b+" c= "+c);    //sayıları girerken enter ya da space tuşuna basabilirsin
              
    }
    
}
