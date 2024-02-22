/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package metodoverloading;

/**
 *
 * @author irem beril
 */
public class Metodoverloading {
    public static void toplama(int a,int b)
    {
        System.out.println("sonuç: "+(a+b));
    }
    public static void toplama(int a,int b,int c)
    {
        System.out.println("sonuç: "+(a+b+c));
    }
    public static void skor(String isim,int puan)
    {
        System.out.println(isim+" adlı kullanıcının "+puan+" puanı vardır");
    }
    public static void skor(String isim)
    {
        System.out.println(isim+" adlı kullanıcının henüz puanı yoktur.");
    }
    public static void skor(int puan)
    {
        System.out.println("misafir kullanıcının "+puan+" puanı vardır.");
    }
    
    public static void main(String[] args) {
        //bir fonksiyonu iki farklı şekilde tanımlamak
        toplama(2,7,6);
        toplama(2,3);
        
        System.out.println("***************************************************");
        skor("irem",2000);
        skor("meri");
        skor(850);
    }
    
}
