
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author irem beril
 */
public class Login {
    public boolean login(Hesap hesap)
    {
        Scanner scanner=new Scanner(System.in);
        String isim;
        String şifre;
        
        System.out.println("kullanıcı adı: ");
        isim=scanner.nextLine();
        
        System.out.println("şifre: ");
        şifre=scanner.nextLine();
        
        if(hesap.getIsim().equals(isim) && hesap.getŞifre().equals(şifre))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
}
