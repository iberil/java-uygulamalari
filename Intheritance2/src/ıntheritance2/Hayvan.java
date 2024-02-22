/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ıntheritance2;

/**
 *
 * @author irem beril
 */
public class Hayvan {  //superclass
    private String isim;
    private int kilo;
    private int boy;
    private int bacakSayisi;
    
    public Hayvan(String isim,int kilo,int boy,int bacakSayisi)
    {
        this.isim=isim;
        this.kilo=kilo;
        this.boy=boy;
        this.bacakSayisi=bacakSayisi;
    }
    
    public void hareket(int hiz)
    {
        System.out.println("hayvan "+hiz+" km hız ile hareket ediyor");
    }
}
