/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hipotenus;

import java.util.Scanner;

/**
 *
 * @author irem beril
 */
public class Hipotenus {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("dik üçgenin kenar uzunluklarını giriniz:");
        int a= scanner.nextInt();
        int b=scanner.nextInt();
        double hipotenüs;
        hipotenüs = Math.sqrt(a*a+b*b);                  //sqrt double tipini çalıştırır 
        System.out.println("hipotenüs:"+hipotenüs);     //float ile yaparsak ='den sonra(float) yazmamız gerekir
        
        
                
        
        
       
    }
    
}
