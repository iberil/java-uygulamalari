/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package faizhesaplamasi;

import java.util.Scanner;

/**
 *
 * @author irem beril
 */
public class Faizhesaplamasi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // kullanıcıdan ana para ve parasını kaç yıl vadeli yatırmak istediği bilgisini alıp 
        //her sene sonunda toplam miktarı ekrana yazdıran program
        //faiz oranı :%6dır
        Scanner scanner=new Scanner(System.in);
        System.out.println("Faize yatırılacak para tutarını giriniz:");
        int para=scanner.nextInt();
        System.out.println("paranızı kaç yıl vadeli yatırmak istiyorsunuz:");
        int  vade=scanner.nextInt();
        float toplam=(float)para;
        
        for(int i=1;i<vade+1;i++)
        {
            toplam=(float) (toplam+(toplam*0.06));
            System.out.println(i+". yılın sonuncda toplam para: "+(int)toplam);
        }
        
    }
    
}
