/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package abstractclass;

/**
 *
 * @author irem beril
 */
public class AbstractClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Sekil1 sekil= new Sekil1();  hata veriyor abstract classlardan obje oluşturulamaz
        
        Sekil1 sekil;
        sekil= new Kare("d",4);  
        sekil.alan_hesapla();
    //    sekil. dediğimizde cevre hesaplama cıkmadı  sekil abstract bir referans olduğu için class içindeki ekstra metodu okuyamadı
        
        Kare kare= new Kare("kare",5);
        kare.alan_hesapla();
        kare.cevre_hesapla();
        
        System.out.println("\n");
        
        Daire daire= new Daire("daire",4);
        daire.alan_hesapla();
    }
    
}
