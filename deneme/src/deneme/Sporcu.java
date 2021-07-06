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
public class Sporcu {
    String sporcuİsim;
    String sporcuTakım;
    public boolean kartKullanıldıMı;

    public Sporcu(String sporcuİsim, String sporcuTakım) {
        this.sporcuİsim = sporcuİsim;
        this.sporcuTakım = sporcuTakım;
    }
    public Sporcu(){
        
    }

    public String getSporcuİsim() {
        return sporcuİsim;
    }

    public void setSporcuİsim(String sporcuİsim) {
        this.sporcuİsim = sporcuİsim;
    }

    public String getSporcuTakım() {
        return sporcuTakım;
    }

    public void setSporcuTakım(String sporcuTakım) {
        this.sporcuTakım = sporcuTakım;
    }
    
    public void sporcuPuanıGoster(){
        
    }

    public boolean isKartKullanıldıMı() {
        return kartKullanıldıMı;
    }

    public void setKartKullanıldıMı(boolean kartKullanıldıMı) {
        this.kartKullanıldıMı = kartKullanıldıMı;
    }
    
}
