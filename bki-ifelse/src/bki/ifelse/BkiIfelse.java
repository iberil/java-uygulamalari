/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bki.ifelse;

import static java.lang.Math.sqrt;
import java.util.Scanner;

/**
 *
 * @author irem beril
 */
public class BkiIfelse {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        beden kitle indeksi= kilo(kg)/boy(m)*boy(m)
        18.5    altında ise zayıf
        18.5-25 arasında ise normal
        25-30   arasında ise aşırı kilolu
        30+     üzerinde ise obez
        */
        
        Scanner scanner=new Scanner(System.in);
        
        System.out.println("vücut kitle indeksi için boy(m) ve kilonuzu(kg) giriniz");
        System.out.println("boy(m):");
        float boy=scanner.nextFloat();
        System.out.println("kilo(kg):");
        float kilo=scanner.nextFloat();
        
        float bki=kilo/(boy*boy);
        
        System.out.println("beden kitle indeksiniz: "+bki);
        if(bki<18.5)
        {
            System.out.println("zayıf");
        }
        else if(bki<25&&bki>=18.5)
        {
            System.out.println("normal");
        }
        else if(bki>=25&&bki<30)
        {System.out.println("aşırı kilolu");
        }
        else
        {
            System.out.println("obez");
        }
                
                
        
        
    }
    
}
