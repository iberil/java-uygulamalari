/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package metodlardareturn;

/**
 *
 * @author irem beril
 */
public class Metodlardareturn {
    
    public static int toplama(int a,int b,int c)
    {
        return a+b+c;
    }

    public static void main(String[] args) {
        
        //returnden sonra başka kod çalışmaz 
        System.out.println("sonuç: "+toplama(1,2,3));
    }
    
}
