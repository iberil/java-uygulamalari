/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package trycatchblocks;

/**
 *
 * @author irem beril
 */
public class TryCatchblocks {

    public static void main(String[] args) {
        // try exception oluşturabilecek kod yazılır
        //catchexception durumunda yapılacak işlemler yazılır
        
        try{
            int a=30/0;  //arithmeticexception
        }
        catch(ArithmeticException e) //Exception yazarsak da çalışır aritmetik oradan türedi çünkü
        {
            System.out.println("bir sayı 0a bölünemez");
        }
        
        try{
            int[] a={1,2,3,4,5}; 
            System.out.println(a[6]);
        }
        catch(ArrayIndexOutOfBoundsException e) //
        {
            System.out.println("arrayın boyunu aştınız"); 
            e.printStackTrace();//hatanın neyden kaynaklandığını söylüyor java
        }
    }
    
}
