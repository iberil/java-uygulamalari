/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interface1;

/**
 *
 * @author irem beril
 */
public class MakineMüh implements Imühendis {
    private boolean askerlik;
    private boolean adliSicil;

    public MakineMüh(boolean askerlik, boolean adliSicil) {
        this.askerlik = askerlik;
        this.adliSicil = adliSicil;
    }
   
    @Override
    public void askerlik_sorgula() {
        if(askerlik)
        {
            System.out.println("Askerlik Yaptım");
        }
        else
        {
            System.out.println("Askerlik Yapmadım");
        } 
    }

    @Override
    public String mezuniyet_ortalamasi(double derece) {
        
        return "Ortalama: "+derece;
    }

    @Override
    public void adliSicilSorgula() {
        if(adliSicil)
        {
            System.out.println("Adli Sicil Kaydı Bulunuyor");
        }
        else
        {
            System.out.println("Adli Sicil Kaydı Bulunmuyor");
        } 
    }

    @Override
    public void isTecrubesi(String[] array) {
        
        System.out.println("İş Tecrübeleri: ");
        for(int i=0;i<array.length;i++)
        {
            System.out.println(array[i]);
        }
        
    }
    
    public void referansGetir(String[] referans)
    {
        if(referans.length==0)
        {
            System.out.println("Referans bulunmuyor");
        }
        else
        {
            System.out.println("Referanslar: ");
            for(int i=0;i<referans.length;i++)
            {
                System.out.println(referans[i]);
            }
        }
    }
    
    
}
