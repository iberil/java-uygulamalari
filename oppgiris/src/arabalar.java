/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author irem beril
 */
public class arabalar {
    private String renk;
    private int kapılar;
    private int tekerlek;
    private String motor;
    private String model;
    
    public void setmodel(String model)
    {
        //yukarıda string model demek yerine  farklı bir isim yazsaydık this kullanmamıza gerek yoktu.
        this.setModel(model);
    }
    public String getModel()
    {
        return this.model;
    }
    public String getRenk() {
        return renk;
    }
    public void setRenk(String renk) {
        this.renk = renk;
    }
    public int getKapılar() {
        return kapılar;
    }
    public void setKapılar(int kapılar) {
        if(kapılar<0)
        {
            System.out.println("kapı sayısı 0dan küçük olamaz!");
        }
        else
        {
            this.kapılar=kapılar;
        }
    }
    public int getTekerlek() {
        return tekerlek;
    }
    public void setTekerlek(int tekerlek) {
        this.tekerlek = tekerlek;
    }
    public String getMotor() {
        return motor;
    }
    public void setMotor(String motor) {
        this.motor = motor;
    }
    public void setModel(String model) {
        this.model = model;
    }
    
}
