/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

public class account {
    private String hesapno;
    private double bakiye;
    private String isim;
    private String email;
    private String telno;
    
    public account() //constructor
    {
        System.out.println("kendi yazdığımız constructorlar");
    }
    public account(String hesapno,double bakiye,String isim,String email,String telno)
    {
        this.bakiye=bakiye;
        this.email=email;
        this.hesapno=hesapno;
        this.isim=isim;
        this.telno=telno;
    }
    public void parayatırma(double miktar)
    {
        bakiye+=miktar;
        System.out.println("yeni bakiye: "+bakiye); 
    }
    public void paraçekme(double miktar)
    {
        if(miktar>1500)
        {
            System.out.println("en fazla 1500 tl çekebilirsiniz daha düşük bir miktar çekiniz.");
        }
        if(bakiye<miktar)
        {
            System.out.println("yetersiz bakiye...\tbakiye: "+bakiye);
        }
        else
        {
            bakiye-=miktar;
            System.out.println("yeni bakiye: "+bakiye);
        }
        
    }

    public String getHesapno() {
        return hesapno;
    }
    public void setHesapno(String hesapno) {
        this.hesapno = hesapno;
    }

    public double getBakiye() {
        return bakiye;
    }
    public void setBakiye(double bakiye) {
        this.bakiye = bakiye;
    }

    public String getIsim() {
        return isim;
    }
    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelno() {
        return telno;
    }
    public void setTelno(String telno) {
        this.telno = telno;
    }
    
    
}
