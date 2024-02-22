/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package çarpımtablosu2for;

import java.util.Scanner;

/**
 *
 * @author irem beril
 */
public class Çarpımtablosu2for {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // iç içe 2 for döngüsü ile çarpım tablosu yapma
        Scanner scanner=new Scanner(System.in);
        System.out.println("kaça kaçlık çarpım tablosu olacağını giriniz:");
        int sayi=scanner.nextInt();
        int i,j;
        
        for(i=1;i<=sayi;i++)
        {
            System.out.print("\n");
            for(j=1;j<sayi+1;j++)
            {
                System.out.print(j+" x "+i+"= "+(i*j)+"\t");
            }
        }
        
    }
    
}
