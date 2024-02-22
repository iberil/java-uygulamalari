/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package intheritance;
public class Yonetici extends Calisan{   //subclass yani yan sınıf
    
    private int sorumluKisi; //ekstra özellik
    public Yonetici(String isim,int maas,String departman,int sorumluKisi)
    {
       // private 
        /*this.isim=isim;
        this.maas=maas;
        this.departman=departman;
        başka classtan private alanlara direkt erişilemez bundan dolayı this ile çağıramayız
        */
        super(isim,maas,departman);
        this.sorumluKisi=sorumluKisi;
    }
    @Override
    public void bilgileriGoster()
    {
        //System.out.println("İsim: "+getIsim()+"\nDepartman: "+getDepartman()+"\nMaaş: "+getMaas());
        super.bilgileriGoster();  //direkt miras aldığımız metodu buraya getirip override  da yapabiliriz sonuç aynı
        System.out.println("Sorumlu olduğu kişi sayısı: "+this.sorumluKisi);
        //yonetici içinde override yaparsak metod içinde eklediğimiz ekstralar da ekrana yazılır
    }
   
    public void zamYap(int miktar)
    {
        System.out.println("Çalışanlara "+miktar+" Tl zam yapıldı");
    }
}
