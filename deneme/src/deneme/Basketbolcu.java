/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deneme;

/**
 *
 * @author msi
 */
public class Basketbolcu extends Sporcu{
    int ikilik; 
    int üçlük; 
    int serbestAtış;

    public Basketbolcu(int ikilik, int üçlük, int serbestAtış, String sporcuİsim, String sporcuTakım) {
        super(sporcuİsim, sporcuTakım);
        this.ikilik = ikilik;
        this.üçlük = üçlük;
        this.serbestAtış = serbestAtış;
    }
    
    public Basketbolcu(){
        
    }

    public int getIkilik() {
        return ikilik;
    }

    public void setIkilik(int ikilik) {
        this.ikilik = ikilik;
    }

    public int getÜçlük() {
        return üçlük;
    }

    public void setÜçlük(int üçlük) {
        this.üçlük = üçlük;
    }

    public int getSerbestAtış() {
        return serbestAtış;
    }

    public void setSerbestAtış(int serbestAtış) {
        this.serbestAtış = serbestAtış;
    }

    @Override
    public boolean isKartKullanıldıMı() {
        return kartKullanıldıMı;
    }

    @Override
    public void setKartKullanıldıMı(boolean kartKullanıldıMı) {
        this.kartKullanıldıMı = kartKullanıldıMı;
    }
    
    @Override
    public void sporcuPuanıGoster(){
        
    }
    
}
