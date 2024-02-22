/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ıntheritance3;

/**
 *
 * @author irem beril
 */
public class Yonetici extends Calisan{
    private int sorumluKisi;
    public Yonetici(String ad, String soyad, int id,int sorumluKisi) 
    {
        super(ad, soyad, id);
        this.sorumluKisi=sorumluKisi;
    }

    @Override
    public void bilgileriGoster() {
        super.bilgileriGoster(); 
        System.out.println("Sorumlu olduğu kişi sayısı: "+sorumluKisi);
    }
    public void zamYap(int miktar)
    {
        System.out.println(getAd()+" maaşlara "+miktar+" tl zam yaptı.");
             
    }
    
}
