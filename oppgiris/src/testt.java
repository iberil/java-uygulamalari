/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author irem beril
 */
public class testt {
    public static void main(String[] args)
    {
        //diğer classtakileri kullanıp obje oluşturmak için referans almamız gerekiyor
    
            arabalar araba=new arabalar();
       /* public yaparsak kullanılır privatta hata verir
        araba.renk="kırmızı";
        araba.kapılar=2;
        araba.tekerlek=4;
        araba.model="porche";
        araba.motor="200v";
        
        System.out.println(araba.model);
       */ 
        araba.setmodel("ford");
        System.out.println("arabanın modeli: "+araba.getModel());
        araba.setKapılar(-4);
        
       /* arabalar araba2=null;
        araba3.setModel("ford");
      */  
    }
    
}
