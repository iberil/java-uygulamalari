/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package charboolen;

/**
 *
 * @author irem beril
 */
public class CharBoolen {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //char veri tipi karakterleri göstermek için kullanılır 2 bytelık yer kaplar 2^16 adet karakter vardır
        //boolean kosullu durumlarda kullanılır. true veya false değeri alır
        
        char a='A';
        char b='?';
        //char c='12'; char veri tipi içine sayi yazılamaz
        char c=100; //100e karşılık gelen bir karakter vardır
        System.out.println(c); //100 d harfine karsılık geliyormuş
      /*  char d=1000;
        System.out.println(d);
        char e=2000;
        System.out.println(e);*/
      //unicode numarasını kullanarak değişik sembol ya da harfleri bastırabiliriz
      /*char d='\u063c';
        System.out.println(d);*/
      boolean d=true;
      boolean e=false;
        System.out.println(d);
        System.out.println(e);
        
        //stringler ilkel olmayan veri tipleridir metodlari vardır
        String f="Hello";
        System.out.println(f+" World");
        
        String g="Cloud";
        int h=9; 
        String j=g+h; //h string ifadeye dönüştü
        System.out.println(j);
        
        char k='?'; 
        String l= "how i met your mother"+k;
        System.out.println(l);
        
        //bir suru string eklenecekse görüntü açısından daha iyi durması için yapılabilir
        String m="Eda "
                +"Erdem "
                +"Dündar";
        System.out.println(m);
        
        //1 tab bosluk bırakmak için
        String n="Eda\tErdem\tDündar";
        System.out.println(n);
        
        //bir alt satira geçmek için \n kullanılır
        
        
        
        
    }
    
}
