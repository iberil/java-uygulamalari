/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package abstractclass;

/**
 *
 * @author irem beril
 */
public abstract class Sekil1 {
    private String isim;

    public Sekil1(String isim) {
        this.isim = isim;
    }
    
    public void ismini_soyle()
    {
        System.out.println("bu obje "+isim+" objesidir.");
    }
    
    abstract void alan_hesapla();  //alt classlar bunu istedikleri gibi yazmak zorundalar
    //kare ve dairenin alanları farklıhesaplandığı için ayrı ayrı metod yazmak yerine burada soyut bir metod oluşturuyoruz
    //kare ve dairenin ekstradan override etmesini önledik diyebiliriz
    
    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }
    
    
    
}
