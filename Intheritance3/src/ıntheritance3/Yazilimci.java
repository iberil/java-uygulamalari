/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ıntheritance3;

/**
 *
 * @author irem beril
 */
public class Yazilimci extends Calisan{
    private String diller;
    public Yazilimci(String ad,String soyad,int id,String diller)
    {
        super(ad,soyad,id);
        this.diller=diller;
    }
    @Override
    public void bilgileriGoster()
    {
        super.bilgileriGoster();
        /*System.out.println("Çalışan Bilgileri: ");
        System.out.println("Ad: "+getAd());
        System.out.println("Soyad: "+getSoyad());
        System.out.println("Id: "+getId());
        */
        System.out.println("Yazılımcının bildiği diller: "+diller);
    }
}
