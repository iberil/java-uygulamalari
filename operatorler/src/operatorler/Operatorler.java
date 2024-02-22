/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package operatorler;

/**
 *
 * @author irem beril
 */
public class Operatorler {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* 
        karşılaştırma operatörleri
        == eşit mi
        != eşit değil mi
        >  büyük mü
        <  küçük mü
        >= büyük veya eşit mi
        <= küçük veya eşit mi
        */
        
        System.out.println(3!=3); //ekrana false değerini döndürür
        System.out.println(4>=3); //ekrana true değerini döndürür
        System.out.println("irem"!="beril"); //stringlerde sadece ==,!= karşılaştırmaları yapılıyor 
        
        /*
        Mantıksal operatörler
        && ve(and)
        || veya(or)
        !  değil(not) operatörü
        */
        
        System.out.println("**************************************************");
        System.out.println(3<4&&1!=8);
        System.out.println(!true);
        System.out.println(!(7-1==0));
        

    }
    
}
