/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author irem beril
 */
public class Hesap {
    private String isim;
    private String şifre;
    private int bakiye;

    public Hesap(String isim, String şifre, int bakiye) {
        this.isim = isim;
        this.şifre = şifre;
        this.bakiye = bakiye;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getŞifre() {
        return şifre;
    }

    public void setŞifre(String şifre) {
        this.şifre = şifre;
    }

    public int getBakiye() {
        return bakiye;
    }

    public void setBakiye(int bakiye) {
        this.bakiye = bakiye;
    }
    
    public void parayatırma(int miktar)
    {
        bakiye+=miktar;
        System.out.println("yeni bakiye: "+bakiye);
    }
    public void paraçekme(int miktar)
    {
        if(miktar>bakiye)
        {
            System.out.println("hesapta yeterli bakiye bulunamamdı bakiye: "+bakiye);
        }
        else
        {
            bakiye-=miktar;
            System.out.println("yeni bakiye: "+bakiye); 
                    
        }
    }
    
    
}
