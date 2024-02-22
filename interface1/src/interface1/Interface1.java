/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package interface1;

/**
 *
 * @author irem beril
 */
public class Interface1 {

    public static void main(String[] args) {
        BilgisayarMüh muhendis1= new BilgisayarMüh(false,false);
        muhendis1.adliSicilSorgula();
        muhendis1.askerlik_sorgula();
        System.out.println(muhendis1.mezuniyet_ortalamasi(3.11)); 
        
        String[] is ={"Vestel","Havelsan","Turksat"};
        
        muhendis1.isTecrubesi(is);
        
        System.out.println();
        
        MakineMüh muhendis2=new MakineMüh(true,false); 
        //Imühendis yazsaydık makinemüh'e özel tanımladığım referans metodu çalışamayacağından hata verecektir!!!
        //Ancak referans metodunu ((MakineMüh)muhendis2) şeklinde yazarsak hata ortadan kalkar
        
        muhendis2.adliSicilSorgula();
        muhendis2.askerlik_sorgula();
        System.out.println(muhendis2.mezuniyet_ortalamasi(3.05));
        
        String[] tecrübe= {"Arçelik","Ford","Medaş"};
        muhendis2.isTecrubesi(tecrübe);
        
        String[] referans={/*"İrem Beril"*/};
        muhendis2.referansGetir(referans);
        
    }
    
}
