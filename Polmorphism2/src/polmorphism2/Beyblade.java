/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package polmorphism2;

/**
 *
 * @author irem beril
 */
public class Beyblade {
    private String sahibi;
    private int donusHizi;
    private String saldiriGucu;
    
    public Beyblade(String sahibi,int donusHizi,String saldiriGucu)
    {
        this.donusHizi=donusHizi;
        this.sahibi=sahibi;
        this.saldiriGucu=saldiriGucu;
    }

    public String getSahibi() {
        return sahibi;
    }

    public void setSahibi(String sahibi) {
        this.sahibi = sahibi;
    }

    public int getDonusHizi() {
        return donusHizi;
    }

    public void setDonusHizi(int donusHizi) {
        this.donusHizi = donusHizi;
    }

    public String getSaldiriGucu() {
        return saldiriGucu;
    }

    public void setSaldiriGucu(String saldiriGucu) {
        this.saldiriGucu = saldiriGucu;
    }
    
    public void saldir()          
    {
        System.out.println(getSahibi()+""+saldiriGucu+""+donusHizi+" ile saldırıyor.");
    }
    public void bilgileriGoster()
    {
        System.out.println("Beyblade'in sahibi: "+sahibi);
        System.out.println("Saldırı Gücü: "+saldiriGucu);
        System.out.println("Dönüş Hızı: "+donusHizi);
    }
    
    
}
