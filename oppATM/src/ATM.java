
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author irem beril
 */
public class ATM {
    public void calis(Hesap hesap)
    {
        Login login=new Login();
        Scanner scanner=new Scanner(System.in);
        
        System.out.println("***************************************************");
        System.out.println("Kullanıcı Girişi");
        
        //int giriş=3;
        
        while(true)
        {
            
            if(login.login(hesap))
            {
                System.out.println("giriş başarılı");
                break;
            }
            else
            {
                System.out.println("yanlış giriş yaptınız");
                break;
            }

        }
        
        System.out.println("**************************************************");
        String islemler= "1-Bakiye Görüntüle\n"
                        +"2-Para Yatırma\n"
                        +"3-Para Çekme\n"
                        +"4-Çıkış için 'q' ";
        
        System.out.println(islemler);
        System.out.println("**************************************************");
        
       while(true)
       {
           System.out.println("İşlem türü seçiniz: ");
           String secim=scanner.nextLine();
           
           if(secim.equals("1"))
           {
               System.out.println("bakiye: "+ hesap.getBakiye());
           }
           else if(secim.equals("2"))
           {
               System.out.println("para yaıracağınız miktarı giriniz: ");
               int miktar=scanner.nextInt();
               scanner.nextLine();
               hesap.parayatırma(miktar);
           }
           else if(secim.equals("3"))
           {
               System.out.println("çekeceğiniz tutarı giriniz:" );
               int miktar=scanner.nextInt();
               scanner.nextLine();
               hesap.paraçekme(miktar);           
           }
           else if(secim.equals("q"))
           {
               break;
           }
           else
           {
               System.out.println("hatalı seçim yaptınız...");
           }
               
       }
        
    }
}
