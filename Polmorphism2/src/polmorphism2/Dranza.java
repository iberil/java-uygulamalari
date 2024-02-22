/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package polmorphism2;

/**
 *
 * @author irem beril
 */
public class Dranza extends Beyblade {
    private String kutsalCanavar;

    public Dranza(String kutsalCanavar, String sahibi, int donusHizi, String saldiriGucu) {
        super(sahibi, donusHizi, saldiriGucu);
        this.kutsalCanavar = kutsalCanavar;
    }

    public String getKutsalCanavar() {
        return kutsalCanavar;
    }

    public void setKutsalCanavar(String kutsalCanavar) {
        this.kutsalCanavar = kutsalCanavar;
    }

    @Override
    public void bilgileriGoster() {
        super.bilgileriGoster(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
    
}
