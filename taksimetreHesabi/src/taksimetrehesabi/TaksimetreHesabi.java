/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package taksimetrehesabi;

import java.util.Scanner;

/**
 *
 * @author irem beril
 */
public class TaksimetreHesabi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        
        System.out.println("gidilen kilometreyi giriniz: ");
        float km= scanner.nextFloat();
        
        float ucret= (float) (km*13.75);
        
        System.out.println("taksi ucreti: "+ucret);
                
    }
    
}
