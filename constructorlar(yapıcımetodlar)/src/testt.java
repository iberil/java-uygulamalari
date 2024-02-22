/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
public class testt {
    public static void main(String[] args)
    {
        account hesap=new account();    
        
        //bunu daha kısa yolsan etme etmenin yolu constructor kullanmaktır
        /*hesap.setHesapno("123456789");
        hesap.setBakiye(100000.99);
        hesap.setEmail("iremberil2003@gmail.com");
        hesap.setIsim("İrem Beril");
        hesap.setTelno("987456321");
        
        System.out.println("bakiye: "+hesap.getBakiye());
        */
        account hesap2=new account("123456789",1000.0,"İrem Beril","iremberil2003@gmail.com","987456321");
        hesap2.parayatırma(500);
        hesap2.paraçekme(1300);
    }
    
}
