
public class Main {
    public static void main(String[] args)
    {
        ATM atm =new ATM();
        Hesap hesap=new Hesap("Irem Beril","123456",1000);
        atm.calis(hesap);
        System.out.println("programdan çıkılıyor...");
    }
    
}
