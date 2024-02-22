/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bedenkitleındeksi;

import java.util.Scanner;

/**
 *
 * @author irem beril
 */
public class BedenKitleIndeksi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner scanner= new Scanner(System.in);
       
        System.out.println("İsim:");
        String ad= scanner.nextLine();
        
        System.out.println("Kilo(kg):");
        float kilo= scanner.nextFloat();
        
        System.out.println("Boy(m):");
        float boy= scanner.nextFloat();
        
        float indeks= kilo/(boy*boy);
        
        System.out.println("isim: "+ad+"\nvücut kitle indeksi: "+indeks);
        
    }
    
}
