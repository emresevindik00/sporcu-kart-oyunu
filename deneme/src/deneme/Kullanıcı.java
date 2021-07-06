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
public class Kullanıcı extends Oyuncu{

    
    public Kullanıcı(int oyuncuID, String oyuncuAdı, int Skor) {
        super(oyuncuID, oyuncuAdı, Skor);
    }
    
    public Kullanıcı(){
        
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
    
}
