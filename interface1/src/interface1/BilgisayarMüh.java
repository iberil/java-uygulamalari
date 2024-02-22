/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interface1;


public class BilgisayarMüh implements Imühendis {
    private boolean askerlik;
    private boolean adliSicil;

    public BilgisayarMüh(boolean askerlik, boolean adliSicil) {
        this.askerlik = askerlik;
        this.adliSicil = adliSicil;
    }

    @Override
    public void askerlik_sorgula() {
        if(askerlik)
        {
            System.out.println("Askerlik yaptım");
        }
        else
        {
            System.out.println("Askerliği yapmadım");
        }
       // return;
    }

    @Override
    public String mezuniyet_ortalamasi(double derece) {
        return "Ortalama: "+derece;    
    }

    @Override
    public void adliSicilSorgula() {
        if(adliSicil)
        {
            System.out.println("Adli Sicil Kaydım Bulunuyor");
        }
        else
        {
            System.out.println("Adli Sicil Kaydım Bulunmuyor");
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
    
}
