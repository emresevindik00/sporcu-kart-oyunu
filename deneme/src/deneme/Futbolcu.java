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
public class Futbolcu extends Sporcu{
    int penaltı;
    int serbestVuruş;
    int kaleciKarşıKarşıya;

    public Futbolcu(int penaltı, int serbestVuruş, int kaleciKarşıKarşıya, String sporcuİsim, String sporcuTakım) {
        super(sporcuİsim, sporcuTakım);
        this.penaltı = penaltı;
        this.serbestVuruş = serbestVuruş;
        this.kaleciKarşıKarşıya = kaleciKarşıKarşıya;
    }
    
    public Futbolcu(){
        
    }
    

    public int getPenaltı() {
        return penaltı;
    }

    public void setPenaltı(int penaltı) {
        this.penaltı = penaltı;
    }

    public int getSerbestAtış() {
        return serbestVuruş;
    }

    public void setSerbestAtış(int serbestVuruş) {
        this.serbestVuruş = serbestVuruş;
    }

    public int getKaleciKarşıKarşıya() {
        return kaleciKarşıKarşıya;
    }

    public void setKaleciKarşıKarşıya(int kaleciKarşıKarşıya) {
        this.kaleciKarşıKarşıya = kaleciKarşıKarşıya;
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
