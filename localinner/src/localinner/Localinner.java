/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package localinner;

/**
 *
 * @author irem beril
 */
public class Localinner {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //main metodunun içinde yeni local class oluşturuyoruz
        
        class Alan{  //sadece main metodunda çalışır
            public void daire_alan(int yaricap)
            {
                System.out.println("Dairenin alani: "+(yaricap*yaricap*Math.PI));
            }
        }
        
        Alan alan= new Alan();
        alan.daire_alan(10);
    }
    
    /* public static void deneme()
     {
         Alan alan1= new Alan(); //hata verir çünkü local classlar metodlara özgüdür
     }
    */ 
}
