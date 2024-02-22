/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package intheritance;
public class Calisan { //superclass veya baseclass deniyor  //buradan miras alınacağı için
    
    private String isim;
    private int maas;
    private String departman;
    
    public Calisan(String isim,int maas,String departman)
    {
        this.isim=isim;
        this.maas=maas;
        this.departman=departman;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public int getMaas() {
        return maas;
    }

    public void setMaas(int maas) {
        this.maas = maas;
    }

    public String getDepartman() {
        return departman;
    }

    public void setDepartman(String departman) {
        this.departman = departman;
    }
    
    public void bilgileriGoster()
    {
        System.out.println("İsim: "+isim+"\nDepartman: "+departman+"\nMaaş: "+maas);
    }
    public void departmanDegistir(String yeni)
    {
        this.departman=yeni;
        System.out.println("Yeni Departmanı: "+departman);
    }
}
