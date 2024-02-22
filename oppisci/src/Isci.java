/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author irem beril
 */
public class Isci {
    private String isim;
    private int maas;
        
    public Isci(String isim,int maas){
        this.isim=isim;
        this.maas=maas;
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
    
    
    public int vergi(int maas)
    {
        if(maas>=1000)
        {
            maas=(int)(maas*0.3);
        }
        return maas;
    }
    
}
