/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deneme;

import java.util.ArrayList;

/**
 *
 * @author msi
 */
public class Oyuncu {
    
    int oyuncuID;
    String oyuncuAdı;
    int Skor = 0;
    ArrayList<Sporcu> kartListesi = new ArrayList<>();
    
    public Oyuncu(int oyuncuID, String oyuncuAdı, int Skor) {
        this.oyuncuID = oyuncuID;
        this.oyuncuAdı = oyuncuAdı;
        this.Skor = Skor;
    }
    
    public Oyuncu(){
        
    }

    public int getOyuncuID() {
        return oyuncuID;
    }

    public void setOyuncuID(int oyuncuID) {
        this.oyuncuID = oyuncuID;
    }

    public String getOyuncuAdı() {
        return oyuncuAdı;
    }

    public void setOyuncuAdı(String oyuncuAdı) {
        this.oyuncuAdı = oyuncuAdı;
    }

    public int getSkor() {
        return Skor;
    }

    public void setSkor(int Skor) {
        this.Skor = Skor;
    }
    
    
    public void kartSeç(Sporcu s){
        kartListesi.add(s);
    }

    public ArrayList<Sporcu> getKartListesi() {
        return kartListesi;
    }

    public void setKartListesi(ArrayList<Sporcu> kartListesi) {
        this.kartListesi = kartListesi;
    }
}
