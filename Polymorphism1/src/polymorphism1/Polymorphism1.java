/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package polymorphism1;

class Hayvan{
    private String isim;
    
    public Hayvan(String isim)
    {
        this.isim=isim;
    }

    public String getIsim() {
        return isim;
    }
    public void setIsim(String isim) {
        this.isim = isim;
    }
    public String konus(){
        return "Hayvan konuşuyor";
    }    
}
class Kedi extends Hayvan{
    public Kedi(String isim)
    {
        super(isim);
    }

    @Override
    public String konus() 
    {
        //return super.konus(); 
        return this.getIsim()+" miyavlıyor.";
    }      
}
class Kopek extends Hayvan{

    public Kopek(String isim) 
    {
        super(isim);
    }

    @Override
    public String konus() {
        return this.getIsim()+" havlıyor"; 
    }  
}
class Ari extends Hayvan{
    public Ari(String isim)
    {
        super(isim);
    }
    @Override
    public String konus(){
        return this.getIsim()+" vızıldıyor.";
    }
}
public class Polymorphism1 {
    public static void konustur(Hayvan hayvan)
    {
        System.out.println(hayvan.konus());
    }
    public static void main(String[] args) {
        /*Hayvan hayvan=new Hayvan("Lili");
        System.out.println(hayvan.konus());
        */
       /* Hayvan hayvan1=new Kedi("Lili");
        System.out.println(hayvan1.konus());  //hayvan referansı kedi referansı gibi davrandı
        
        Hayvan hayvan2=new Kopek("Taco");
        System.out.println(hayvan2.konus());
        */
       konustur(new Kedi("Lili"));
       konustur(new Kopek("Marla"));
       konustur(new Ari("Sina"));
    }
    
}
