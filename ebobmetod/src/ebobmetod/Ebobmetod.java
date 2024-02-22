/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ebobmetod;

import java.util.Scanner;

/**
 *
 * @author irem beril
 */
public class Ebobmetod {
    public static int ebob(int s1,int s2)
    {
        int i,ebob=1;
        for(i=1;i<=s1&&i<=s2;i++)
        {
            if(s1%i==0&&s2%i==0)
            {
                ebob=i;
            }
        }     
        return ebob;
    }
    public static void main(String[] args) {
        // kullanıcı tarafından girilen iki sayının ebobunu bulma
        
        Scanner scanner=new Scanner(System.in);
        System.out.println("ebobunu bulmak istediğiniz iki adet sayıyı giriniz: ");
        int s1=scanner.nextInt();
        int s2=scanner.nextInt();
        
        System.out.println("ebob: "+ebob(s1,s2));
        
        
    }
    
}
