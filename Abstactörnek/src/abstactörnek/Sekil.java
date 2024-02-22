/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package abstactörnek;

/**
 *
 * @author irem beril
 */
public abstract class Sekil {
    private String isim;
    
    public Sekil(String isim){
        this.isim=isim;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }
    
    
    abstract void alan_hesapla();
     
}
