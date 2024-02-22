/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package yurtdışıçıkışprogramı;

import java.util.Scanner;

/**
 *
 * @author irem beril
 */
public class Yolcu implements YurtdışıKurallari{
    private int harc;
    private boolean vizeDurumu;
    private boolean siyasiYasak;

    public Yolcu(int harc,boolean vizeDurumu,boolean siyasiYasak) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Yaırdığınız harç bedelini giriniz: ");
        this.harc=scanner.nextInt();
        scanner.nextLine();
        
        System.out.print("Siyasi yasağınız bulunuyor mu?");
        String cevap=scanner.nextLine();
 
        if(cevap.equals("evet"))
        {
            this.siyasiYasak=true;
        }
        else
        {
            this.siyasiYasak=false;
        }
        
        System.out.println("Vizeniz var mi?");
        String cevap2=scanner.nextLine();
        
        if(cevap2.equals("evet"))
        {
            this.vizeDurumu= true;
        }
        else
        {
            this.vizeDurumu=false;
        }
        
    }

    @Override
    public boolean yurtdisiHarci() {
        
    }

    @Override
    public boolean siyasiYasak() {

    }

    @Override
    public boolean vizeDurumu() {
        
    }
    
}
