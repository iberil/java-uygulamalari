/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ifelse;

import java.util.Scanner;

/**
 *
 * @author irem beril
 */
public class Ifelse {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int sayı;
        System.out.println("sayı giriniz:");
        sayı=scanner.nextInt();
        
        if(sayı%2==0)
        {
            System.out.println(sayı+" çift sayıdır");
        }
        else
        {
            System.out.println(sayı+" tek sayıdır");
        }
        
        System.out.println("***************************************************");
        
        int not;
        System.out.println("sınav notunu giriniz:");
        not= scanner.nextInt();
        
        if(not>81)
        {
            System.out.println("AA");
        }
        else if(not>73)
        {
            System.out.println("BA");
        }
        else if(not>64)
        {
            System.out.println("BB");
        }
        else if(not>57)
        {
            System.out.println("CB");
        }
        else if(not>49)
        {
            System.out.println("CC");
        }
        else
        {
            System.out.println("kaldınız");
        }

    }
    
}
