/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package abstactörnek;

/**
 *
 * @author irem beril
 */
public class Ucgen extends Sekil{
    
    private int a;
    private int b;
    private int c;
    
    public Ucgen (String isim,int a,int b,int c)
    {
        super(isim);
        this.a=a;
        this.b=b;
        this.c=c;
    }

    @Override
    void alan_hesapla() {
        double u=(a+b+c)/2.0;
        double alan=Math.sqrt( u*(u-a)*(u-b)*(u-c));
        System.out.println(getIsim()+" şeklinin alanı: "+alan);
    }
    
}
