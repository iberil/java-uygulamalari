/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package anonimınner;

/**
 *
 * @author irem beril
 */
public class AnonimInner {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Iogrenci ogrenci=new Iogrenci(){
            @Override
            public void ders_calis() {
                System.out.println("ders çalışıyorum");
            }

            @Override
            public void derse_gir() {
                System.out.println("derse giriyorum");
            }
        };
        
        ogrenci.ders_calis();
        ogrenci.derse_gir();
        
        System.out.println("**************************************************");
        
        Aogrenci ogrenci1 = new Aogrenci("irem beril"){
            @Override
            void kayit_yaptir() {
                System.out.println("kayıt yapılıyor...."+getIsim());
            } 
        };
        
        ogrenci1.kayit_yaptir();
        ogrenci1.selamla();
    }
    public static abstract class Aogrenci{

        private String isim;

        public Aogrenci(String isim) {
            this.isim = isim;
        }

        public String getIsim() {
            return isim;
        }

        public void setIsim(String isim) {
            this.isim = isim;
        }
        
        abstract void kayit_yaptir();
        public void selamla(){
            System.out.println("selam");
        }
    }
    public interface Iogrenci{
         void ders_calis();
         void derse_gir();
    }
    
}
