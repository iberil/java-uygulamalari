/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ıntheritance2;

/**
 *
 * @author irem beril
 */
public class Kopek extends Hayvan{
    private int disSayisi;
    public Kopek(String isim,int kilo,int boy,int bacakSayisi,int disSayisi)
    {
        super(isim,kilo,boy,bacakSayisi);
        this.disSayisi=disSayisi;
    }

    public int getDisSayisi() {
        return disSayisi;
    }

    public void setDisSayisi(int disSayisi) {
        this.disSayisi = disSayisi;
    }
    
    
    public void hareket(int hiz)
    {
        System.out.println("hayvan "+hiz+" km hız ile hareket ediyor");
    }
    public void kos(int hiz)
    {
        hareket(hiz);  //override oldu kendi classının(kopek) metodu çalışmış oldu //daha güvenli yazması
        //super.hareket(hiz);  //superclaasın metodunu kullandık override etsek bile superclassın metodu kullanılıyor burada
        System.out.println("köpek koşuyor...");
    }
    
}
