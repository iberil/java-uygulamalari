
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author irem beril
 */
public class Main {
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        
        System.out.println("***************************************************");
        String idmanlar= "1-Burpee\n"
                    +"2-Pushup\n"
                    +"3-Situp\n"
                    +"4-Squat";
        System.out.println(idmanlar);
        System.out.println("*****************************************************");   
        
        System.out.println("idman programı oluşturunuz");
        
        System.out.println("burpee sayısı: ");
        int burpee=scanner.nextInt();
        System.out.println("pushup sayısı: ");
        int pushup=scanner.nextInt();
        System.out.println("situp sayısı: ");
        int situp=scanner.nextInt();
        System.out.println("squat sayısı: ");
        int squat=scanner.nextInt();
        
        Idman idman=new Idman(burpee,pushup,situp,squat);
        
        System.out.println("idman başlıyor");
        
        while(idman.bittiMi()==false)
        {
            System.out.println("hareket türü giriniz(burpee,pushup,situp,squat)");
            scanner.nextLine();
            String tur=scanner.nextLine();
            System.out.println("kaç adet yaptınız");
            int sayi=scanner.nextInt();
            
            idman.hareketYap(tur, sayi);
        }
        
                
    }
    
}
