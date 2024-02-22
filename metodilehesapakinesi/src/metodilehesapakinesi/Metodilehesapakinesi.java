/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package metodilehesapakinesi;

import java.util.Scanner;

/**
 *             //sıkıntı varrr
 * @author irem beril
 */
public class Metodilehesapakinesi {

    public static void topla(int x,int y,int z)
    {
        System.out.println("sonuç: "+(x+y+z));
    }
    public static void topla(int a,int b)
    {
        System.out.println("sonuç: "+(a+b));
    }
    
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        
        int x = 0,y = 0,z = 0,a = 0,b = 0;
                    
        System.out.println("yapacağınız işlemi seçiniz: ");
                                 
        String işlemler= "1-toplama"
                        +"2-çıkarma"
                        +"3-çarpma"
                        +"4-bölme";
        System.out.println(işlemler);
        
        System.out.println("yapacağınız işlemin numarasını giriniz: ");
        int no=scanner.nextInt();
        
        System.out.println("işlem yapacağınız sayı adetini giriniz: ");
        int n=scanner.nextInt();
        
        System.out.println("sayıları giriniz: ");
        if(n==3)
        {
            x=scanner.nextInt();
            y=scanner.nextInt();
            z=scanner.nextInt();

            
        }
        else
        {
            a = scanner.nextInt();
            b=scanner.nextInt();
        }
        
        switch(no)
        {
            case 1 -> {
                topla(x,y,z);
                topla(a,b);
                break;
            }
        }
   
}
}