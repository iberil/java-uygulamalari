/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package makssayibulma;

import java.util.Scanner;

/**
 *
 * @author irem beril
 */
public class Makssayibulma {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        
        System.out.println("karşılaştırmak için 3 adet sayiyi giriniiz:");
        int s1=scanner.nextInt();
        int s2=scanner.nextInt();
        int s3=scanner.nextInt();
        int maks;
        
        if(s1<=s2 && s3<=s2)    //5 9 9 girdiğimde 5i en büyük göserdi = kullanmadığım için
        {
            maks=s2;
        }
        else if(s1<=s3&& s2<=s3)
        {
            maks=s3;
       
        }
        else
        {
            maks=s1;
        }
        System.out.println("maksimum sayı: "+maks);
            
    }
    
}
