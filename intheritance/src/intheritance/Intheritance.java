/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package intheritance;

/**
 *
 * @author irem beril
 */
public class Intheritance {

    public static void main(String[] args) {
        // Is-A ilişkisi blunuyor
        Yonetici yonetici1=new Yonetici("İrem Beril",50000,"Data Scientist",10); 
        yonetici1.bilgileriGoster(); //yonetici içinde override yaparsak metod içinde eklediğimiz ekstralar da ekrana yazılır
       // yonetici1.zamYap(200);
    }
    
    
}
