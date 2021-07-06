/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deneme;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

/**
 *
 * @author msi
 */
public class Test{
    
    int max = 2;
    int min = 0;
    Random rastgele = new Random();
    
    ArrayList<Basketbolcu> basketbolcuListesi = new ArrayList<>();
    ArrayList<Futbolcu> futbolcuListesi = new ArrayList<>();
    

    Kullanıcı kullanıcı = new Kullanıcı();
    Bilgisayar bilgisayar = new Bilgisayar();
    Oyuncu oyuncu = new Oyuncu();

    public void kartlar(){
        

        //p sv kkk
        futbolcuListesi.add(new Futbolcu(70, 90, 97, "Messi", "Barcelona"));
        futbolcuListesi.add(new Futbolcu(70, 100, 98, "Ronaldo", "Juventus"));
        futbolcuListesi.add(new Futbolcu(70, 75, 70, "Ramos", "Real Madrid"));
        futbolcuListesi.add(new Futbolcu(70, 90, 90, "Neymar", "PSG"));
        futbolcuListesi.add(new Futbolcu(70, 85, 95, "Cavani", "Manchester United"));
        futbolcuListesi.add(new Futbolcu(70, 90, 95, "Ibrahimovic", "Milan"));
        futbolcuListesi.add(new Futbolcu(70, 85, 90, "Falcao", "Galatasaray"));
        futbolcuListesi.add(new Futbolcu(70, 85, 93, "Benzema", "Real Madrid"));
        System.out.println("--"+futbolcuListesi.get(4).getSporcuİsim());
        Collections.shuffle(futbolcuListesi);
        
        basketbolcuListesi.add(new Basketbolcu(100, 95, 98, "Lebron James", "Lakers"));
        basketbolcuListesi.add(new Basketbolcu(93, 95, 95, "Kevin Durant", "Lakers"));
        basketbolcuListesi.add(new Basketbolcu(100, 90, 95, "Dwayne Wade", "Lakers"));
        basketbolcuListesi.add(new Basketbolcu(90, 83, 92, "Anthony Davis", "Lakers"));
        basketbolcuListesi.add(new Basketbolcu(100, 95, 95, "Stephen Curry", "Lakers"));
        basketbolcuListesi.add(new Basketbolcu(80, 85, 90, "Dwight Howard", "Lakers"));
        basketbolcuListesi.add(new Basketbolcu(85, 90, 95, "Kyrie Irving", "Lakers"));
        basketbolcuListesi.add(new Basketbolcu(80, 90, 80, "Carmelo Anthony", "Lakers"));
        
        
        Collections.shuffle(basketbolcuListesi);
        
    }
        
    public void kartlarıDağıt(){
        int i;
        for (i = 0; i < 4; i++) {
            this.kullanıcı.kartSeç(this.basketbolcuListesi.get(i));
            System.out.println(i+" "+this.basketbolcuListesi.get(i).sporcuİsim);
        }
        
        for (i = 0; i < 4; i++) {
            this.kullanıcı.kartSeç(this.futbolcuListesi.get(i)); 
            System.out.println(i+" "+this.futbolcuListesi.get(i).sporcuİsim);
        }
        for (i = 4; i < 8; i++) {
            this.bilgisayar.kartSeç(this.basketbolcuListesi.get(i));
        }
        
        for (i = 4; i < 8; i++) {
            this.bilgisayar.kartSeç(this.futbolcuListesi.get(i));
        }
        
    }
    
    public int basketbolcuPozisyonSec(){
        int random1 = (int)(Math.random() * (max - min + 1) + min);
        if(random1 == 0){
            //System.out.println(random1+" random "+this.basketbolcuListesi.get(1).ikilik);
            return 0;
        }
        else if(random1 == 1){
            //System.out.println(random1+" random "+this.basketbolcuListesi.get(1).üçlük);
            return 1;
        }
        else if(random1 == 2){
            //System.out.println(random1+" random "+this.basketbolcuListesi.get(1).serbestAtış);
            return 2;
        }
        return -1;
    }
    
    
    public int futbolcuPozisyonSec(){
        int random = (int)(Math.random() * (max - min + 1) + min);
        if(random == 0){
            //System.out.println(random+" random "+this.futbolcuListesi.get(1).kaleciKarşıKarşıya);
            return 0;
        }
        else if(random == 1){
            //System.out.println(random+" random "+this.futbolcuListesi.get(1).penaltı);
            return 1;
        }
        else if(random == 2){
            //System.out.println(random+" random "+this.futbolcuListesi.get(1).serbestVuruş);
            return 2;
        }
        return -1;
    }
    
    

    public Kullanıcı getKullanıcı() {
        return kullanıcı;
    }

    public void setKullanıcı(Kullanıcı kullanıcı) {
        this.kullanıcı = kullanıcı;
    }

    public Bilgisayar getBilgisayar() {
        return bilgisayar;
    }

    public void setBilgisayar(Bilgisayar bilgisayar) {
        this.bilgisayar = bilgisayar;
    }
    
    
}
