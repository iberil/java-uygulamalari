/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package abstractclass;

/**
 *
 * @author irem beril
 */
public class Kare extends Sekil1{

    private int kenar;
    
    public Kare(String isim,int kenar) {
        super(isim);
        this.kenar=kenar;
    }

    @Override
    void alan_hesapla() {
        System.out.println(getIsim()+" şeklinin alanı: "+(kenar*kenar));   
    }
    
    public void cevre_hesapla()
    {
        System.out.println(getIsim()+" şeklinin çevresi: "+(4*kenar));
    }
    
}
