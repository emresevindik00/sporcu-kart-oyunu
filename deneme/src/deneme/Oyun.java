/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deneme;

import java.util.ArrayList;
import java.util.Collections;
import javax.swing.JOptionPane;

/**
 *
 * @author msi
 */
public class Oyun extends javax.swing.JFrame {

    /**
     * Creates new form Oyun
     */
    public Oyun() {
        initComponents();
        jLabel4.setVisible(false);
        özellikLbl.setVisible(false);
        girişPaneli.setVisible(true);
        jButton1.setVisible(false);
        jPanel9.setVisible(false);
        jPanel10.setVisible(false);
        jPanel11.setVisible(false);
        jPanel1.setVisible(false);
        jPanel2.setVisible(false);
        jPanel3.setVisible(false);
        jPanel4.setVisible(false);
        jPanel5.setVisible(false);
        jPanel6.setVisible(false);
        jPanel7.setVisible(false);
        jPanel8.setVisible(false);
        setResizable(false);
    }
    Test t = new Test();
    Bilgisayar b = new Bilgisayar();
    Kullanıcı k = new Kullanıcı();
    
    public void kartlarıVer(){
        fLbl1.setText(this.t.futbolcuListesi.get(0).sporcuİsim);
        fLbl2.setText(this.t.futbolcuListesi.get(1).sporcuİsim);
        fLbl3.setText(this.t.futbolcuListesi.get(2).sporcuİsim);
        fLbl4.setText(this.t.futbolcuListesi.get(3).sporcuİsim);
        
        bLbl1.setText(this.t.basketbolcuListesi.get(0).sporcuİsim);
        bLbl2.setText(this.t.basketbolcuListesi.get(1).sporcuİsim);
        bLbl3.setText(this.t.basketbolcuListesi.get(2).sporcuİsim);
        bLbl4.setText(this.t.basketbolcuListesi.get(3).sporcuİsim);
        
        fPLbl1.setText(String.valueOf(this.t.futbolcuListesi.get(0).penaltı));
        fPLbl2.setText(String.valueOf(this.t.futbolcuListesi.get(1).penaltı));
        fPLbl3.setText(String.valueOf(this.t.futbolcuListesi.get(2).penaltı));
        fPLbl4.setText(String.valueOf(this.t.futbolcuListesi.get(3).penaltı));
        
        fSbLbl1.setText(String.valueOf(this.t.futbolcuListesi.get(0).serbestVuruş));
        fSbLbl2.setText(String.valueOf(this.t.futbolcuListesi.get(1).serbestVuruş));
        fSbLbl3.setText(String.valueOf(this.t.futbolcuListesi.get(2).serbestVuruş));
        fSbLbl4.setText(String.valueOf(this.t.futbolcuListesi.get(3).serbestVuruş));
        
        fKkkLbl1.setText(String.valueOf(this.t.futbolcuListesi.get(0).kaleciKarşıKarşıya));
        fKkkLbl2.setText(String.valueOf(this.t.futbolcuListesi.get(1).kaleciKarşıKarşıya));
        fKkkLbl3.setText(String.valueOf(this.t.futbolcuListesi.get(2).kaleciKarşıKarşıya));
        fKkkLbl4.setText(String.valueOf(this.t.futbolcuListesi.get(3).kaleciKarşıKarşıya));
        

        bİLbl1.setText(String.valueOf(this.t.basketbolcuListesi.get(0).ikilik));
        bİLbl2.setText(String.valueOf(this.t.basketbolcuListesi.get(1).ikilik));
        bİLbl3.setText(String.valueOf(this.t.basketbolcuListesi.get(2).ikilik));
        bİLbl4.setText(String.valueOf(this.t.basketbolcuListesi.get(3).ikilik));
        
        bSbLbl1.setText(String.valueOf(this.t.basketbolcuListesi.get(0).serbestAtış));
        bSbLbl2.setText(String.valueOf(this.t.basketbolcuListesi.get(1).serbestAtış));
        bSbLbl3.setText(String.valueOf(this.t.basketbolcuListesi.get(2).serbestAtış));
        bSbLbl4.setText(String.valueOf(this.t.basketbolcuListesi.get(3).serbestAtış));
       
        bÜLbl1.setText(String.valueOf(this.t.basketbolcuListesi.get(0).üçlük));
        bÜLbl2.setText(String.valueOf(this.t.basketbolcuListesi.get(1).üçlük));
        bÜLbl3.setText(String.valueOf(this.t.basketbolcuListesi.get(2).üçlük));
        bÜLbl4.setText(String.valueOf(this.t.basketbolcuListesi.get(3).üçlük));
        
        jPanel1.setVisible(true);
        jPanel2.setVisible(true);
        jPanel3.setVisible(true);
        jPanel4.setVisible(true);
        jPanel5.setVisible(true);
        jPanel6.setVisible(true);
        jPanel7.setVisible(true);
        jPanel8.setVisible(true);
        
        f1Btn.setEnabled(true);
        f2Btn.setEnabled(true);
        f3Btn.setEnabled(true);
        f4Btn.setEnabled(true);
        b1Btn.setEnabled(false);
        b2Btn.setEnabled(false);
        b3Btn.setEnabled(false);
        b4Btn.setEnabled(false);

        for (int i = 0; i < 4; i++) {
            this.t.futbolcuListesi.get(i).setKartKullanıldıMı(false);
            this.t.basketbolcuListesi.get(i).setKartKullanıldıMı(false);   
        }  
    }
    
    
    public void kontrolFutbolcu(){
        
        b1Btn.setEnabled(false);
        b2Btn.setEnabled(false);
        b3Btn.setEnabled(false);
        b4Btn.setEnabled(false);
        
        if(this.t.futbolcuListesi.get(0).kartKullanıldıMı == false){
            f1Btn.setEnabled(true);
        }
        if(this.t.futbolcuListesi.get(1).kartKullanıldıMı == false){
            f2Btn.setEnabled(true);
        }
        if(this.t.futbolcuListesi.get(2).kartKullanıldıMı == false){
            f3Btn.setEnabled(true);
        }
        if(this.t.futbolcuListesi.get(3).kartKullanıldıMı == false){
            f4Btn.setEnabled(true);
        }
    }
    
    public void kontrolBasketbolcu(){
        f1Btn.setEnabled(false);
        f2Btn.setEnabled(false);
        f3Btn.setEnabled(false);
        f4Btn.setEnabled(false);
        if(this.t.basketbolcuListesi.get(0).kartKullanıldıMı == false){
            b1Btn.setEnabled(true);
        }
        if(this.t.basketbolcuListesi.get(1).kartKullanıldıMı == false){
            b2Btn.setEnabled(true);
        }
        if(this.t.basketbolcuListesi.get(2).kartKullanıldıMı == false){
            b3Btn.setEnabled(true);
        }
        if(this.t.basketbolcuListesi.get(3).kartKullanıldıMı == false){
            b4Btn.setEnabled(true);
        }
    }
    
    public void kazanan(){
        int sayaç = 0;
        for (int i = 0; i < 8; i++) {
            if(this.t.basketbolcuListesi.get(i).kartKullanıldıMı==true && 
                    this.t.futbolcuListesi.get(i).kartKullanıldıMı==true
                    )
            {
                sayaç++;
            }
        }
            if(this.t.bilgisayar.getSkor() + this.t.kullanıcı.getSkor() == 80 || sayaç == 4){
                if(this.t.bilgisayar.getSkor() > this.t.kullanıcı.getSkor()){
                    JOptionPane.showMessageDialog(null,"Kazanan bilgisayar!");
                    int cevap = JOptionPane.showConfirmDialog(this, "Yeniden oynamak ister misiniz?",
                    "Confirm",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
                    
                    if(cevap == JOptionPane.YES_OPTION){
                        jPanel1.setVisible(false);
                        jPanel2.setVisible(false);
                        jPanel3.setVisible(false);
                        jPanel4.setVisible(false);
                        jPanel5.setVisible(false);
                        jPanel6.setVisible(false);
                        jPanel7.setVisible(false);
                        jPanel8.setVisible(false);
                        jLabel4.setVisible(false);
                        özellikLbl.setVisible(false);
                        jButton1.setEnabled(true);
                        girişPaneli.setVisible(true);
                        jButton1.setVisible(false);
                        jPanel9.setVisible(false);
                        jPanel10.setVisible(false);
                        jPanel11.setVisible(false);
                        this.t.bilgisayar.setSkor(0);
                        this.t.kullanıcı.setSkor(0);
                        bSkor.setText(String.valueOf(0));
                        kSkor.setText(String.valueOf(0));
                        bSkor.setText(String.valueOf(0));
                        kSkor.setText(String.valueOf(0));
                        kFsporcuAdiTxt.setText("-");
                        kFpenaltiTxt.setText("0");
                        kFsBTxt.setText("0");
                        kFkkkTxt.setText("0");
                        kartDenemeTxt12.setText("-");
                        kartDenemeTxt13.setText("0");
                        kartDenemeTxt14.setText("0");
                        kartDenemeTxt15.setText("0");
                        bBsporcuAdiTxt.setText("-");
                        bBikilikTxt.setText("0");
                        bBüçlükTxt.setText("0");
                        bBsATxt.setText("0");
                        kartDenemeTxt20.setText("-");
                        kartDenemeTxt21.setText("0");
                        kartDenemeTxt22.setText("0");
                        kartDenemeTxt23.setText("0");
                    }
                    else if(cevap == JOptionPane.NO_OPTION){
                        this.dispose();
                    }
                }
                else{
                    JOptionPane.showMessageDialog(null,"Kazanan oyuncu!");
                    int cevap = JOptionPane.showConfirmDialog(this, "Yeniden oynamak ister misiniz?",
                    "Confirm",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
                    
                    if(cevap == JOptionPane.YES_OPTION){
                        jPanel1.setVisible(false);
                        jPanel2.setVisible(false);
                        jPanel3.setVisible(false);
                        jPanel4.setVisible(false);
                        jPanel5.setVisible(false);
                        jPanel6.setVisible(false);
                        jPanel7.setVisible(false);
                        jPanel8.setVisible(false);
                        jLabel4.setVisible(false);
                        özellikLbl.setVisible(false);
                        jButton1.setEnabled(true);
                        girişPaneli.setVisible(true);
                        jButton1.setVisible(false);
                        jPanel9.setVisible(false);
                        jPanel10.setVisible(false);
                        jPanel11.setVisible(false);
                        this.t.bilgisayar.setSkor(0);
                        this.t.kullanıcı.setSkor(0);
                        bSkor.setText(String.valueOf(0));
                        kSkor.setText(String.valueOf(0));
                        kFsporcuAdiTxt.setText("-");
                        kFpenaltiTxt.setText("0");
                        kFsBTxt.setText("0");
                        kFkkkTxt.setText("0");
                        kartDenemeTxt12.setText("-");
                        kartDenemeTxt13.setText("0");
                        kartDenemeTxt14.setText("0");
                        kartDenemeTxt15.setText("0");
                        bBsporcuAdiTxt.setText("-");
                        bBikilikTxt.setText("0");
                        bBüçlükTxt.setText("0");
                        bBsATxt.setText("0");
                        kartDenemeTxt20.setText("-");
                        kartDenemeTxt21.setText("0");
                        kartDenemeTxt22.setText("0");
                        kartDenemeTxt23.setText("0");
                    }
                    else if(cevap == JOptionPane.NO_OPTION){
                        this.dispose();
                    }
                }
            }
        
    }
    

    
    public void puanlamaFutbolcu(){
        //Kaleciyle Karşı Karşıya Durumu1
        switch (this.t.futbolcuPozisyonSec()) {
            case 0:
                özellikLbl.setText("Kaleciyle Karşı Karşıya");
                if(Integer.parseInt(kFkkkTxt.getText()) > Integer.parseInt(kartDenemeTxt14.getText())){
                    this.t.kullanıcı.setSkor(this.t.kullanıcı.getSkor()+10);
                }
                else if(Integer.parseInt(kFkkkTxt.getText()) < Integer.parseInt(kartDenemeTxt14.getText())){
                    this.t.bilgisayar.setSkor(this.t.bilgisayar.getSkor()+10);
                }
                else if(Integer.parseInt(kFkkkTxt.getText()) == Integer.parseInt(kartDenemeTxt14.getText())){
                    
                }   break;
            case 1:
                özellikLbl.setText("Penaltı");
                if(Integer.parseInt(kFpenaltiTxt.getText()) > Integer.parseInt(kartDenemeTxt15.getText())){
                    this.t.kullanıcı.setSkor(this.t.kullanıcı.getSkor()+10);
                }
                else if(Integer.parseInt(kFpenaltiTxt.getText()) < Integer.parseInt(kartDenemeTxt15.getText())){
                    this.t.bilgisayar.setSkor(this.t.bilgisayar.getSkor()+10);
                }
                else if(Integer.parseInt(kFpenaltiTxt.getText()) == Integer.parseInt(kartDenemeTxt15.getText())){

                }   break;
            case 2:
                özellikLbl.setText("Serbest Vuruş");
                if(Integer.parseInt(kFsBTxt.getText()) > Integer.parseInt(kartDenemeTxt13.getText())){
                    this.t.kullanıcı.setSkor(this.t.kullanıcı.getSkor()+10);
                }
                else if(Integer.parseInt(kFsBTxt.getText()) < Integer.parseInt(kartDenemeTxt13.getText())){
                    this.t.bilgisayar.setSkor(this.t.bilgisayar.getSkor()+10);
                }
                else if(Integer.parseInt(kFsBTxt.getText()) == Integer.parseInt(kartDenemeTxt13.getText())){

                }   break;     
            default:
                break;
        }
    }

    //Basketbolcu
    public void puanlamaBasketbolcu(){
        //İkilik
        
        switch (this.t.basketbolcuPozisyonSec()) {
            case 0:
                özellikLbl.setText("İkilik");
                if(Integer.parseInt(bBikilikTxt.getText()) > Integer.parseInt(kartDenemeTxt23.getText())){
                    this.t.kullanıcı.setSkor(this.t.kullanıcı.getSkor()+10);
                    
                }
                else if(Integer.parseInt(bBikilikTxt.getText()) < Integer.parseInt(kartDenemeTxt23.getText())){
                    this.t.bilgisayar.setSkor(this.t.bilgisayar.getSkor()+10);
                }
                else if(Integer.parseInt(bBikilikTxt.getText()) == Integer.parseInt(kartDenemeTxt23.getText())){

                }   break;
            case 1:
                özellikLbl.setText("Üçlük!");
                if(Integer.parseInt(bBüçlükTxt.getText()) > Integer.parseInt(kartDenemeTxt21.getText())){
                    this.t.kullanıcı.setSkor(this.t.kullanıcı.getSkor()+10);
                }
                else if(Integer.parseInt(bBüçlükTxt.getText()) < Integer.parseInt(kartDenemeTxt21.getText())){
                    this.t.bilgisayar.setSkor(this.t.bilgisayar.getSkor()+10);
                }
                else if(Integer.parseInt(bBüçlükTxt.getText()) == Integer.parseInt(kartDenemeTxt21.getText())){

                }   break;
            case 2:
                özellikLbl.setText("Serbest Atış");
                if(Integer.parseInt(bBsATxt.getText()) > Integer.parseInt(kartDenemeTxt22.getText())){
                    this.t.kullanıcı.setSkor(this.t.kullanıcı.getSkor()+10);
                }
                else if(Integer.parseInt(bBsATxt.getText()) < Integer.parseInt(kartDenemeTxt22.getText())){
                    this.t.bilgisayar.setSkor(this.t.bilgisayar.getSkor()+10);
                }
                else if(Integer.parseInt(bBsATxt.getText()) == Integer.parseInt(kartDenemeTxt22.getText())){

                }   break;     
            default:
                break;
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        b2Btn = new javax.swing.JButton();
        bB25 = new javax.swing.JLabel();
        bSbLbl2 = new javax.swing.JLabel();
        bB22 = new javax.swing.JLabel();
        bÜLbl2 = new javax.swing.JLabel();
        bB24 = new javax.swing.JLabel();
        bİLbl2 = new javax.swing.JLabel();
        bB23 = new javax.swing.JLabel();
        bLbl2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        b1Btn = new javax.swing.JButton();
        bLbl1 = new javax.swing.JLabel();
        bİLbl1 = new javax.swing.JLabel();
        bB18 = new javax.swing.JLabel();
        bÜLbl1 = new javax.swing.JLabel();
        bSbLbl1 = new javax.swing.JLabel();
        bB19 = new javax.swing.JLabel();
        bB20 = new javax.swing.JLabel();
        bB21 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        bLbl3 = new javax.swing.JLabel();
        bİLbl3 = new javax.swing.JLabel();
        bB26 = new javax.swing.JLabel();
        bÜLbl3 = new javax.swing.JLabel();
        bSbLbl3 = new javax.swing.JLabel();
        bB27 = new javax.swing.JLabel();
        bB28 = new javax.swing.JLabel();
        bB29 = new javax.swing.JLabel();
        b3Btn = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        f2Btn = new javax.swing.JButton();
        fLbl2 = new javax.swing.JLabel();
        fPLbl2 = new javax.swing.JLabel();
        bB4 = new javax.swing.JLabel();
        fSbLbl2 = new javax.swing.JLabel();
        fKkkLbl2 = new javax.swing.JLabel();
        bB14 = new javax.swing.JLabel();
        bB15 = new javax.swing.JLabel();
        bB17 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        bB6 = new javax.swing.JLabel();
        bB7 = new javax.swing.JLabel();
        fLbl1 = new javax.swing.JLabel();
        fPLbl1 = new javax.swing.JLabel();
        fSbLbl1 = new javax.swing.JLabel();
        fKkkLbl1 = new javax.swing.JLabel();
        bB2 = new javax.swing.JLabel();
        f1Btn = new javax.swing.JButton();
        bB5 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        bB11 = new javax.swing.JLabel();
        bB12 = new javax.swing.JLabel();
        bB13 = new javax.swing.JLabel();
        f4Btn = new javax.swing.JButton();
        fLbl4 = new javax.swing.JLabel();
        fPLbl4 = new javax.swing.JLabel();
        bB16 = new javax.swing.JLabel();
        fSbLbl4 = new javax.swing.JLabel();
        fKkkLbl4 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        f3Btn = new javax.swing.JButton();
        fLbl3 = new javax.swing.JLabel();
        fPLbl3 = new javax.swing.JLabel();
        bB3 = new javax.swing.JLabel();
        fSbLbl3 = new javax.swing.JLabel();
        fKkkLbl3 = new javax.swing.JLabel();
        bB8 = new javax.swing.JLabel();
        bB9 = new javax.swing.JLabel();
        bB10 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        bLbl4 = new javax.swing.JLabel();
        bİLbl4 = new javax.swing.JLabel();
        bB34 = new javax.swing.JLabel();
        bÜLbl4 = new javax.swing.JLabel();
        bSbLbl4 = new javax.swing.JLabel();
        bB35 = new javax.swing.JLabel();
        bB36 = new javax.swing.JLabel();
        bB37 = new javax.swing.JLabel();
        b4Btn = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        bSkor = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        kSkor = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        kartDenemeTxt7 = new javax.swing.JLabel();
        kFsporcuAdiTxt = new javax.swing.JLabel();
        kartDenemeTxt12 = new javax.swing.JLabel();
        kartDenemeTxt13 = new javax.swing.JLabel();
        kartDenemeTxt14 = new javax.swing.JLabel();
        kartDenemeTxt15 = new javax.swing.JLabel();
        kartDenemeTxt = new javax.swing.JLabel();
        kartDenemeTxt1 = new javax.swing.JLabel();
        kartDenemeTxt2 = new javax.swing.JLabel();
        kartDenemeTxt3 = new javax.swing.JLabel();
        kartDenemeTxt4 = new javax.swing.JLabel();
        kartDenemeTxt5 = new javax.swing.JLabel();
        kartDenemeTxt6 = new javax.swing.JLabel();
        kartDenemeTxt34 = new javax.swing.JLabel();
        kartDenemeTxt35 = new javax.swing.JLabel();
        kFsBTxt = new javax.swing.JLabel();
        kFkkkTxt = new javax.swing.JLabel();
        kFpenaltiTxt = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        bBsporcuAdiTxt = new javax.swing.JLabel();
        bBüçlükTxt = new javax.swing.JLabel();
        bBsATxt = new javax.swing.JLabel();
        kartDenemeTxt20 = new javax.swing.JLabel();
        kartDenemeTxt21 = new javax.swing.JLabel();
        kartDenemeTxt22 = new javax.swing.JLabel();
        kartDenemeTxt23 = new javax.swing.JLabel();
        kartDenemeTxt25 = new javax.swing.JLabel();
        kartDenemeTxt26 = new javax.swing.JLabel();
        kartDenemeTxt27 = new javax.swing.JLabel();
        kartDenemeTxt28 = new javax.swing.JLabel();
        kartDenemeTxt29 = new javax.swing.JLabel();
        kartDenemeTxt30 = new javax.swing.JLabel();
        kartDenemeTxt31 = new javax.swing.JLabel();
        kartDenemeTxt32 = new javax.swing.JLabel();
        bBikilikTxt = new javax.swing.JLabel();
        kartDenemeTxt36 = new javax.swing.JLabel();
        kartDenemeTxt37 = new javax.swing.JLabel();
        girişPaneli = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        kullanıcıAdıTxt = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        özellikLbl = new javax.swing.JLabel();

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 153, 153));

        jButton1.setBackground(new java.awt.Color(199, 250, 246));
        jButton1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton1.setText("Kartları Dağıt");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 252, 153));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        b2Btn.setBackground(new java.awt.Color(0, 255, 0));
        b2Btn.setText("Oyna");
        b2Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b2BtnActionPerformed(evt);
            }
        });

        bB25.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        bB25.setText("Serbest Atış:");

        bSbLbl2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        bSbLbl2.setText("0");

        bB22.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        bB22.setText("Üçlük:");

        bÜLbl2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        bÜLbl2.setText("0");

        bB24.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        bB24.setText("İkilik:");

        bİLbl2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        bİLbl2.setText("0");

        bB23.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        bB23.setText("Sporcu Adı:");

        bLbl2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        bLbl2.setText("-");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(bB23)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(bLbl2, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(bB25)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(bSbLbl2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(bB22)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(bÜLbl2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(bB24)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(bİLbl2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(b2Btn, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bB23, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bLbl2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bB24, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bİLbl2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bB22, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bÜLbl2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bB25, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bSbLbl2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addComponent(b2Btn, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 252, 153));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        b1Btn.setBackground(new java.awt.Color(0, 255, 0));
        b1Btn.setText("Oyna");
        b1Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1BtnActionPerformed(evt);
            }
        });

        bLbl1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        bLbl1.setText("-");

        bİLbl1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        bİLbl1.setText("0");

        bB18.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        bB18.setText("Üçlük:");

        bÜLbl1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        bÜLbl1.setText("0");

        bSbLbl1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        bSbLbl1.setText("0");

        bB19.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        bB19.setText("Sporcu Adı:");

        bB20.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        bB20.setText("İkilik:");

        bB21.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        bB21.setText("Serbest Atış:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(bB18)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bÜLbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(bB20)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bİLbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(bB21)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(bSbLbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(bB19)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bLbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(b1Btn, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bB19, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bLbl1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bB20, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bİLbl1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bB18, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bÜLbl1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bB21, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bSbLbl1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(b1Btn, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel4.setBackground(new java.awt.Color(255, 252, 153));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        bLbl3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        bLbl3.setText("-");

        bİLbl3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        bİLbl3.setText("0");

        bB26.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        bB26.setText("Üçlük:");

        bÜLbl3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        bÜLbl3.setText("0");

        bSbLbl3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        bSbLbl3.setText("0");

        bB27.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        bB27.setText("Sporcu Adı:");

        bB28.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        bB28.setText("İkilik:");

        bB29.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        bB29.setText("Serbest Atış:");

        b3Btn.setBackground(new java.awt.Color(0, 255, 0));
        b3Btn.setText("Oyna");
        b3Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b3BtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(bB26)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bÜLbl3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(bB28)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bİLbl3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(bB29)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(bSbLbl3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(bB27)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(bLbl3, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(b3Btn, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bB27, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bLbl3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bB28, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bİLbl3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bB26, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bÜLbl3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bB29, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bSbLbl3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(b3Btn, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );

        jPanel5.setBackground(new java.awt.Color(198, 217, 171));
        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        f2Btn.setBackground(new java.awt.Color(0, 255, 0));
        f2Btn.setText("Oyna");
        f2Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                f2BtnActionPerformed(evt);
            }
        });

        fLbl2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        fLbl2.setText("-");

        fPLbl2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        fPLbl2.setText("0");

        bB4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        bB4.setText("Serbest Vuruş:");

        fSbLbl2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        fSbLbl2.setText("0");

        fKkkLbl2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        fKkkLbl2.setText("0");

        bB14.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        bB14.setText("Sporcu Adı:");

        bB15.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        bB15.setText("Penaltı:");

        bB17.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        bB17.setText("Kaleciyle Karşı Karşıya:");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(bB14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fLbl2, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(bB4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fSbLbl2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(bB15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fPLbl2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(f2Btn, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bB17))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fKkkLbl2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(0, 3, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bB14, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fLbl2, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bB15, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fPLbl2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bB4, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fSbLbl2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bB17, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fKkkLbl2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(f2Btn, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8))
        );

        jPanel6.setBackground(new java.awt.Color(198, 217, 171));
        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        bB6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        bB6.setText("Penaltı:");

        bB7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        bB7.setText("Kaleciyle Karşı Karşıya:");

        fLbl1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        fLbl1.setText("-");

        fPLbl1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        fPLbl1.setText("0");

        fSbLbl1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        fSbLbl1.setText("0");

        fKkkLbl1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        fKkkLbl1.setText("0");

        bB2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        bB2.setText("Serbest Vuruş:");

        f1Btn.setBackground(new java.awt.Color(0, 255, 0));
        f1Btn.setText("Oyna");
        f1Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                f1BtnActionPerformed(evt);
            }
        });

        bB5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        bB5.setText("Sporcu Adı:");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(bB5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fLbl1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(bB2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(fSbLbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(bB6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(fPLbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(bB7)
                                    .addGroup(jPanel6Layout.createSequentialGroup()
                                        .addGap(29, 29, 29)
                                        .addComponent(f1Btn, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(fKkkLbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bB5, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fLbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bB6, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fPLbl1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bB2, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fSbLbl1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bB7, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fKkkLbl1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(f1Btn, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5))
        );

        jPanel7.setBackground(new java.awt.Color(198, 217, 171));
        jPanel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        bB11.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        bB11.setText("Sporcu Adı:");

        bB12.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        bB12.setText("Penaltı:");

        bB13.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        bB13.setText("Kaleciyle Karşı Karşıya:");

        f4Btn.setBackground(new java.awt.Color(0, 255, 0));
        f4Btn.setText("Oyna");
        f4Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                f4BtnActionPerformed(evt);
            }
        });

        fLbl4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        fLbl4.setText("-");

        fPLbl4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        fPLbl4.setText("0");

        bB16.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        bB16.setText("Serbest Vuruş:");

        fSbLbl4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        fSbLbl4.setText("0");

        fKkkLbl4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        fKkkLbl4.setText("0");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(bB11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fLbl4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(bB16)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(fSbLbl4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(bB12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(fPLbl4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(f4Btn, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(bB13))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(fKkkLbl4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 4, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bB11, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fLbl4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bB12, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fPLbl4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bB16, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fSbLbl4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bB13, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fKkkLbl4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(f4Btn, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12))
        );

        jPanel8.setBackground(new java.awt.Color(198, 217, 171));
        jPanel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        f3Btn.setBackground(new java.awt.Color(0, 255, 0));
        f3Btn.setText("Oyna");
        f3Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                f3BtnActionPerformed(evt);
            }
        });

        fLbl3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        fLbl3.setText("-");

        fPLbl3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        fPLbl3.setText("0");

        bB3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        bB3.setText("Serbest Vuruş:");

        fSbLbl3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        fSbLbl3.setText("0");

        fKkkLbl3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        fKkkLbl3.setText("0");

        bB8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        bB8.setText("Sporcu Adı:");

        bB9.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        bB9.setText("Penaltı:");

        bB10.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        bB10.setText("Kaleciyle Karşı Karşıya:");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(bB8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(fLbl3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(bB3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fSbLbl3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(bB9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fPLbl3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bB10)
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(f3Btn, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fKkkLbl3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addGap(0, 10, Short.MAX_VALUE)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bB8, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fLbl3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bB9, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fPLbl3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bB3, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fSbLbl3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bB10, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fKkkLbl3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(f3Btn, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12))
        );

        jPanel3.setBackground(new java.awt.Color(255, 252, 153));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        bLbl4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        bLbl4.setText("-");

        bİLbl4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        bİLbl4.setText("0");

        bB34.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        bB34.setText("Üçlük:");

        bÜLbl4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        bÜLbl4.setText("0");

        bSbLbl4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        bSbLbl4.setText("0");

        bB35.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        bB35.setText("Sporcu Adı:");

        bB36.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        bB36.setText("İkilik:");

        bB37.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        bB37.setText("Serbest Atış:");

        b4Btn.setBackground(new java.awt.Color(0, 255, 0));
        b4Btn.setText("Oyna");
        b4Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b4BtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(bB36)
                                .addGap(18, 18, 18)
                                .addComponent(bİLbl4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(bB35))
                        .addGap(18, 18, 18)
                        .addComponent(bLbl4, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(bB34)
                        .addGap(18, 18, 18)
                        .addComponent(bÜLbl4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(bB37)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(b4Btn, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bSbLbl4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(bB35, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bLbl4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bB36, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bİLbl4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bB34, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bÜLbl4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bB37, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bSbLbl4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(b4Btn, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel9.setBackground(new java.awt.Color(234, 253, 207));
        jPanel9.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Skor Tablosu", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12), new java.awt.Color(0, 153, 51))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Bilgisayar:");

        bSkor.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        bSkor.setText("0");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Kullanıcı:");

        kSkor.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        kSkor.setText("0");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3))
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(kSkor, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(bSkor, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(bSkor, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(kSkor, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(76, Short.MAX_VALUE))
        );

        jPanel10.setBackground(new java.awt.Color(198, 217, 171));
        jPanel10.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Futbolcu Karşılaştırması", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14), new java.awt.Color(153, 0, 0))); // NOI18N

        kartDenemeTxt7.setText("Kaleciyle Karşı Karşıya:");

        kFsporcuAdiTxt.setText("-");

        kartDenemeTxt12.setText("-");

        kartDenemeTxt13.setText("0");

        kartDenemeTxt14.setText("0");

        kartDenemeTxt15.setText("0");

        kartDenemeTxt.setText("Penaltı:");

        kartDenemeTxt1.setText("Sporcu Adı:");

        kartDenemeTxt2.setText("Serbest Vuruş:");

        kartDenemeTxt3.setText("Kaleciyle Karşı Karşıya:");

        kartDenemeTxt4.setText("Penaltı:");

        kartDenemeTxt5.setText("Sporcu Adı:");

        kartDenemeTxt6.setText("Serbest Vuruş:");

        kartDenemeTxt34.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        kartDenemeTxt34.setText("Bilgisayar");

        kartDenemeTxt35.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        kartDenemeTxt35.setText("Kullanıcı");

        kFsBTxt.setText("0");

        kFkkkTxt.setText("0");

        kFpenaltiTxt.setText("0");

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                        .addComponent(kartDenemeTxt2, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(114, 114, 114))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(kartDenemeTxt35)
                                .addComponent(kartDenemeTxt3))
                            .addComponent(kartDenemeTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(kartDenemeTxt1, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(kFpenaltiTxt, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(kFsBTxt, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(kFkkkTxt, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(kFsporcuAdiTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(kartDenemeTxt6, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(kartDenemeTxt7)
                        .addComponent(kartDenemeTxt4, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(kartDenemeTxt5, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(kartDenemeTxt34, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(kartDenemeTxt12, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(kartDenemeTxt14, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(kartDenemeTxt13, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
                        .addComponent(kartDenemeTxt15, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(kartDenemeTxt34, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(72, 72, 72)
                        .addComponent(kartDenemeTxt6, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(kartDenemeTxt7, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(kartDenemeTxt35, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addGap(44, 44, 44)
                                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel10Layout.createSequentialGroup()
                                        .addComponent(kartDenemeTxt2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(28, 28, 28))
                                    .addGroup(jPanel10Layout.createSequentialGroup()
                                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(kFpenaltiTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(kartDenemeTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(kFsBTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(kFkkkTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(kartDenemeTxt3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(kartDenemeTxt1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(kFsporcuAdiTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(kartDenemeTxt12, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(kartDenemeTxt5, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(kartDenemeTxt15, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(kartDenemeTxt4, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(kartDenemeTxt13, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(kartDenemeTxt14, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel11.setBackground(new java.awt.Color(255, 252, 153));
        jPanel11.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Basketbolcu Karşılaştırması", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14), new java.awt.Color(153, 0, 0))); // NOI18N
        jPanel11.setPreferredSize(new java.awt.Dimension(100, 197));

        bBsporcuAdiTxt.setText("-");

        bBüçlükTxt.setText("0");

        bBsATxt.setText("0");

        kartDenemeTxt20.setText("-");

        kartDenemeTxt21.setText("0");

        kartDenemeTxt22.setText("0");

        kartDenemeTxt23.setText("0");

        kartDenemeTxt25.setText("İkilik:");

        kartDenemeTxt26.setText("Sporcu Adı:");

        kartDenemeTxt27.setText("Üçlük:");

        kartDenemeTxt28.setText("Serbest Atış:");

        kartDenemeTxt29.setText("İkilik:");

        kartDenemeTxt30.setText("Sporcu Adı:");

        kartDenemeTxt31.setText("Üçlük:");

        kartDenemeTxt32.setText("Serbest Atış:");
        kartDenemeTxt32.setToolTipText("");

        bBikilikTxt.setText("0");

        kartDenemeTxt36.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        kartDenemeTxt36.setText("Bilgisayar");

        kartDenemeTxt37.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        kartDenemeTxt37.setText("Kullanıcı");

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(kartDenemeTxt27, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(kartDenemeTxt25, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(kartDenemeTxt26, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(kartDenemeTxt28, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(kartDenemeTxt37)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(bBsATxt, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bBüçlükTxt, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bBikilikTxt, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(bBsporcuAdiTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(kartDenemeTxt36)
                    .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(kartDenemeTxt31, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(kartDenemeTxt29, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(kartDenemeTxt30, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(kartDenemeTxt32, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(kartDenemeTxt23, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(kartDenemeTxt21, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(kartDenemeTxt22, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(kartDenemeTxt20, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(kartDenemeTxt37, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(kartDenemeTxt36, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(kartDenemeTxt30, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(kartDenemeTxt20, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(kartDenemeTxt29, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(kartDenemeTxt23, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(kartDenemeTxt31, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(kartDenemeTxt21, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(kartDenemeTxt32, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(kartDenemeTxt22, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(kartDenemeTxt26, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(kartDenemeTxt25, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(kartDenemeTxt27, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(kartDenemeTxt28, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(bBsporcuAdiTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(bBikilikTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bBüçlükTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bBsATxt, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(20, 20, 20))
        );

        girişPaneli.setBackground(new java.awt.Color(199, 250, 246));
        girişPaneli.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Giriş", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 18), new java.awt.Color(51, 51, 51))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Kullanıcı Adınız:");

        jButton2.setBackground(new java.awt.Color(204, 255, 204));
        jButton2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton2.setText("Giriş");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout girişPaneliLayout = new javax.swing.GroupLayout(girişPaneli);
        girişPaneli.setLayout(girişPaneliLayout);
        girişPaneliLayout.setHorizontalGroup(
            girişPaneliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(girişPaneliLayout.createSequentialGroup()
                .addGroup(girişPaneliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(girişPaneliLayout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(kullanıcıAdıTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(girişPaneliLayout.createSequentialGroup()
                        .addGap(135, 135, 135)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(90, Short.MAX_VALUE))
        );
        girişPaneliLayout.setVerticalGroup(
            girişPaneliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(girişPaneliLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(girişPaneliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(kullanıcıAdıTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Seçilen Özellik:");

        özellikLbl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        özellikLbl.setText("-");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(67, 67, 67)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(girişPaneli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, 522, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(0, 59, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(275, 275, 275)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(özellikLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(girişPaneli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(özellikLbl, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 174, Short.MAX_VALUE))
                            .addComponent(jPanel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.t.kartlar();
        kartlarıVer();
        jButton1.setEnabled(false);
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void f1BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_f1BtnActionPerformed
        // TODO add your handling code here:
        kFsporcuAdiTxt.setText(fLbl1.getText());
        kFpenaltiTxt.setText(fPLbl1.getText());
        kFsBTxt.setText(fSbLbl1.getText());
        kFkkkTxt.setText(fKkkLbl1.getText());
        kartDenemeTxt12.setText(this.t.futbolcuListesi.get(4).sporcuİsim);
        kartDenemeTxt15.setText(String.valueOf(this.t.futbolcuListesi.get(4).penaltı));
        kartDenemeTxt13.setText(String.valueOf(this.t.futbolcuListesi.get(4).serbestVuruş));
        kartDenemeTxt14.setText(String.valueOf(this.t.futbolcuListesi.get(4).kaleciKarşıKarşıya));
        this.t.futbolcuListesi.get(0).setKartKullanıldıMı(true);
        f1Btn.setEnabled(false);
        //jPanel6.setVisible(false);
        
        puanlamaFutbolcu();
        kSkor.setText(String.valueOf(this.t.kullanıcı.getSkor()));
        bSkor.setText(String.valueOf(this.t.bilgisayar.getSkor()));
        if(this.t.futbolcuPozisyonSec()== 0 && Integer.parseInt(kFkkkTxt.getText()) == Integer.parseInt(kartDenemeTxt14.getText())){
               this.t.futbolcuListesi.get(0).setKartKullanıldıMı(false);
               this.t.futbolcuListesi.get(4).setKartKullanıldıMı(false);
                }  
        
        else if(this.t.futbolcuPozisyonSec() == 1 && Integer.parseInt(kFpenaltiTxt.getText()) == Integer.parseInt(kartDenemeTxt15.getText())){
            this.t.futbolcuListesi.get(0).setKartKullanıldıMı(false);
            this.t.futbolcuListesi.get(4).setKartKullanıldıMı(false);
        }
        
        else if(this.t.futbolcuPozisyonSec() == 2 && Integer.parseInt(kFsBTxt.getText()) == Integer.parseInt(kartDenemeTxt13.getText())){
            this.t.futbolcuListesi.get(0).setKartKullanıldıMı(false);
            this.t.futbolcuListesi.get(4).setKartKullanıldıMı(false);
        }
        
        kontrolBasketbolcu();
        kazanan();
        
    }//GEN-LAST:event_f1BtnActionPerformed

    private void f3BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_f3BtnActionPerformed
        // TODO add your handling code here:
        kFsporcuAdiTxt.setText(fLbl3.getText());
        kFpenaltiTxt.setText(fPLbl3.getText());
        kFsBTxt.setText(fSbLbl3.getText());
        kFkkkTxt.setText(fKkkLbl3.getText());
        kartDenemeTxt12.setText(this.t.futbolcuListesi.get(6).sporcuİsim);
        kartDenemeTxt15.setText(String.valueOf(this.t.futbolcuListesi.get(6).penaltı));
        kartDenemeTxt13.setText(String.valueOf(this.t.futbolcuListesi.get(6).serbestVuruş));
        kartDenemeTxt14.setText(String.valueOf(this.t.futbolcuListesi.get(6).kaleciKarşıKarşıya));
        this.t.futbolcuListesi.get(2).setKartKullanıldıMı(true);
        f3Btn.setEnabled(false);
        //jPanel8.setVisible(false);
        
        puanlamaFutbolcu();
        kSkor.setText(String.valueOf(this.t.kullanıcı.getSkor()));
        bSkor.setText(String.valueOf(this.t.bilgisayar.getSkor()));
        
        if(this.t.futbolcuPozisyonSec()== 0 &&Integer.parseInt(kFkkkTxt.getText()) == Integer.parseInt(kartDenemeTxt14.getText())){
               this.t.futbolcuListesi.get(2).setKartKullanıldıMı(false);
               this.t.futbolcuListesi.get(6).setKartKullanıldıMı(false);
                }  
        
        else if(this.t.futbolcuPozisyonSec() == 1 && Integer.parseInt(kFpenaltiTxt.getText()) == Integer.parseInt(kartDenemeTxt15.getText())){
            this.t.futbolcuListesi.get(2).setKartKullanıldıMı(false);
            this.t.futbolcuListesi.get(6).setKartKullanıldıMı(false);
        }
        
        else if(this.t.futbolcuPozisyonSec() == 2 && Integer.parseInt(kFsBTxt.getText()) == Integer.parseInt(kartDenemeTxt13.getText())){
            this.t.futbolcuListesi.get(2).setKartKullanıldıMı(false);
            this.t.futbolcuListesi.get(6).setKartKullanıldıMı(false);
        }
        kontrolBasketbolcu();
        kazanan();
    }//GEN-LAST:event_f3BtnActionPerformed

    private void f2BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_f2BtnActionPerformed
        // TODO add your handling code here:
        kFsporcuAdiTxt.setText(fLbl2.getText());
        kFpenaltiTxt.setText(fPLbl2.getText());
        kFsBTxt.setText(fSbLbl2.getText());
        kFkkkTxt.setText(fKkkLbl2.getText());
        kartDenemeTxt12.setText(this.t.futbolcuListesi.get(5).sporcuİsim);
        kartDenemeTxt15.setText(String.valueOf(this.t.futbolcuListesi.get(5).penaltı));
        kartDenemeTxt13.setText(String.valueOf(this.t.futbolcuListesi.get(5).serbestVuruş));
        kartDenemeTxt14.setText(String.valueOf(this.t.futbolcuListesi.get(5).kaleciKarşıKarşıya));
        this.t.futbolcuListesi.get(1).setKartKullanıldıMı(true);
        f2Btn.setEnabled(false);
        //jPanel5.setVisible(false);
        
        puanlamaFutbolcu();
        kSkor.setText(String.valueOf(this.t.kullanıcı.getSkor()));
        bSkor.setText(String.valueOf(this.t.bilgisayar.getSkor()));
        
        if(this.t.futbolcuPozisyonSec()== 0 &&Integer.parseInt(kFkkkTxt.getText()) == Integer.parseInt(kartDenemeTxt14.getText())){
               this.t.futbolcuListesi.get(1).setKartKullanıldıMı(false);
               this.t.futbolcuListesi.get(5).setKartKullanıldıMı(false);
                }  
        
        else if(this.t.futbolcuPozisyonSec() == 1 && Integer.parseInt(kFpenaltiTxt.getText()) == Integer.parseInt(kartDenemeTxt15.getText())){
            this.t.futbolcuListesi.get(1).setKartKullanıldıMı(false);
            this.t.futbolcuListesi.get(5).setKartKullanıldıMı(false);
        }
        
        else if(this.t.futbolcuPozisyonSec() == 2 && Integer.parseInt(kFsBTxt.getText()) == Integer.parseInt(kartDenemeTxt13.getText())){
            this.t.futbolcuListesi.get(1).setKartKullanıldıMı(false);
            this.t.futbolcuListesi.get(5).setKartKullanıldıMı(false);
        } 
        kontrolBasketbolcu();
        kazanan();
    }//GEN-LAST:event_f2BtnActionPerformed

    private void f4BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_f4BtnActionPerformed
        // TODO add your handling code here:
        kFsporcuAdiTxt.setText(fLbl4.getText());
        kFpenaltiTxt.setText(fPLbl4.getText());
        kFsBTxt.setText(fSbLbl4.getText());
        kFkkkTxt.setText(fKkkLbl4.getText());
        kartDenemeTxt12.setText(this.t.futbolcuListesi.get(7).sporcuİsim);
        kartDenemeTxt15.setText(String.valueOf(this.t.futbolcuListesi.get(7).penaltı));
        kartDenemeTxt13.setText(String.valueOf(this.t.futbolcuListesi.get(7).serbestVuruş));
        kartDenemeTxt14.setText(String.valueOf(this.t.futbolcuListesi.get(7).kaleciKarşıKarşıya));
        this.t.futbolcuListesi.get(3).setKartKullanıldıMı(true);
        f4Btn.setEnabled(false);
        //jPanel7.setVisible(false);
        
        puanlamaFutbolcu();
        kSkor.setText(String.valueOf(this.t.kullanıcı.getSkor()));
        bSkor.setText(String.valueOf(this.t.bilgisayar.getSkor()));
        if(this.t.futbolcuPozisyonSec()== 0 &&Integer.parseInt(kFkkkTxt.getText()) == Integer.parseInt(kartDenemeTxt14.getText())){
               this.t.futbolcuListesi.get(3).setKartKullanıldıMı(false);
               this.t.futbolcuListesi.get(7).setKartKullanıldıMı(false);
                }  
        
        else if(this.t.futbolcuPozisyonSec() == 1 && Integer.parseInt(kFpenaltiTxt.getText()) == Integer.parseInt(kartDenemeTxt15.getText())){
            this.t.futbolcuListesi.get(3).setKartKullanıldıMı(false);
            this.t.futbolcuListesi.get(7).setKartKullanıldıMı(false);
        }
        
        else if(this.t.futbolcuPozisyonSec() == 2 && Integer.parseInt(kFsBTxt.getText()) == Integer.parseInt(kartDenemeTxt13.getText())){
            this.t.futbolcuListesi.get(3).setKartKullanıldıMı(false);
            this.t.futbolcuListesi.get(7).setKartKullanıldıMı(false);
        } 
        kontrolBasketbolcu();
        
        kazanan();
        
    }//GEN-LAST:event_f4BtnActionPerformed

    private void b1BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b1BtnActionPerformed
        // TODO add your handling code here:
        bBsporcuAdiTxt.setText(bLbl1.getText());
        bBikilikTxt.setText(bİLbl1.getText());
        bBüçlükTxt.setText(bÜLbl1.getText());
        bBsATxt.setText(bSbLbl1.getText());
        kartDenemeTxt20.setText(this.t.basketbolcuListesi.get(4).sporcuİsim);
        kartDenemeTxt23.setText(String.valueOf(this.t.basketbolcuListesi.get(4).ikilik));
        kartDenemeTxt21.setText(String.valueOf(this.t.basketbolcuListesi.get(4).üçlük));
        kartDenemeTxt22.setText(String.valueOf(this.t.basketbolcuListesi.get(4).serbestAtış));
        this.t.basketbolcuListesi.get(0).setKartKullanıldıMı(true);
        b1Btn.setEnabled(false);
        //jPanel2.setVisible(false);
        
        puanlamaBasketbolcu();
        kSkor.setText(String.valueOf(this.t.kullanıcı.getSkor()));
        bSkor.setText(String.valueOf(this.t.bilgisayar.getSkor()));
        if(this.t.basketbolcuPozisyonSec()==1 && Integer.parseInt(bBüçlükTxt.getText()) == Integer.parseInt(kartDenemeTxt21.getText())){
                this.t.basketbolcuListesi.get(0).setKartKullanıldıMı(false);
                this.t.basketbolcuListesi.get(4).setKartKullanıldıMı(false);
        }
        else if(this.t.basketbolcuPozisyonSec()==0 && Integer.parseInt(bBikilikTxt.getText()) == Integer.parseInt(kartDenemeTxt23.getText())){
            this.t.basketbolcuListesi.get(0).setKartKullanıldıMı(false);
            this.t.basketbolcuListesi.get(4).setKartKullanıldıMı(false);
        }
        else if(this.t.basketbolcuPozisyonSec()==2 && Integer.parseInt(bBsATxt.getText()) == Integer.parseInt(kartDenemeTxt22.getText())){
            this.t.basketbolcuListesi.get(0).setKartKullanıldıMı(false);
            this.t.basketbolcuListesi.get(4).setKartKullanıldıMı(false);
        }
        kontrolFutbolcu();
        kazanan();
    }//GEN-LAST:event_b1BtnActionPerformed

    private void b4BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b4BtnActionPerformed
        // TODO add your handling code here:
        bBsporcuAdiTxt.setText(bLbl4.getText());
        bBikilikTxt.setText(bİLbl4.getText());
        bBüçlükTxt.setText(bÜLbl4.getText());
        bBsATxt.setText(bSbLbl4.getText());
        kartDenemeTxt20.setText(this.t.basketbolcuListesi.get(7).sporcuİsim);
        kartDenemeTxt23.setText(String.valueOf(this.t.basketbolcuListesi.get(7).ikilik));
        kartDenemeTxt21.setText(String.valueOf(this.t.basketbolcuListesi.get(7).üçlük));
        kartDenemeTxt22.setText(String.valueOf(this.t.basketbolcuListesi.get(7).serbestAtış));
        this.t.basketbolcuListesi.get(3).setKartKullanıldıMı(true);
        b4Btn.setEnabled(false);
        //jPanel3.setVisible(false);
        
        puanlamaBasketbolcu();
        kSkor.setText(String.valueOf(this.t.kullanıcı.getSkor()));
        bSkor.setText(String.valueOf(this.t.bilgisayar.getSkor()));
        if(this.t.basketbolcuPozisyonSec()==1 && Integer.parseInt(bBüçlükTxt.getText()) == Integer.parseInt(kartDenemeTxt21.getText())){
                this.t.basketbolcuListesi.get(3).setKartKullanıldıMı(false);
                this.t.basketbolcuListesi.get(7).setKartKullanıldıMı(false);
        }
        else if(this.t.basketbolcuPozisyonSec()==0 && Integer.parseInt(bBikilikTxt.getText()) == Integer.parseInt(kartDenemeTxt23.getText())){
            this.t.basketbolcuListesi.get(3).setKartKullanıldıMı(false);
            this.t.basketbolcuListesi.get(7).setKartKullanıldıMı(false);
        }
        else if(this.t.basketbolcuPozisyonSec()==2 && Integer.parseInt(bBsATxt.getText()) == Integer.parseInt(kartDenemeTxt22.getText())){
            this.t.basketbolcuListesi.get(3).setKartKullanıldıMı(false);
            this.t.basketbolcuListesi.get(7).setKartKullanıldıMı(false);
        }
        kontrolFutbolcu();
        kazanan();
    }//GEN-LAST:event_b4BtnActionPerformed

    private void b3BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b3BtnActionPerformed
        // TODO add your handling code here:
        bBsporcuAdiTxt.setText(bLbl3.getText());
        bBikilikTxt.setText(bİLbl3.getText());
        bBüçlükTxt.setText(bÜLbl3.getText());
        bBsATxt.setText(bSbLbl3.getText());
        kartDenemeTxt20.setText(this.t.basketbolcuListesi.get(6).sporcuİsim);
        kartDenemeTxt23.setText(String.valueOf(this.t.basketbolcuListesi.get(6).ikilik));
        kartDenemeTxt21.setText(String.valueOf(this.t.basketbolcuListesi.get(6).üçlük));
        kartDenemeTxt22.setText(String.valueOf(this.t.basketbolcuListesi.get(6).serbestAtış));
        this.t.basketbolcuListesi.get(2).setKartKullanıldıMı(true);
        b3Btn.setEnabled(false);
        //jPanel4.setVisible(false);
        
        puanlamaBasketbolcu();
        kSkor.setText(String.valueOf(this.t.kullanıcı.getSkor()));
        bSkor.setText(String.valueOf(this.t.bilgisayar.getSkor()));
        if(this.t.basketbolcuPozisyonSec()==1 && Integer.parseInt(bBüçlükTxt.getText()) == Integer.parseInt(kartDenemeTxt21.getText())){
                this.t.basketbolcuListesi.get(2).setKartKullanıldıMı(false);
                this.t.basketbolcuListesi.get(6).setKartKullanıldıMı(false);
        }
        else if(this.t.basketbolcuPozisyonSec()==0 && Integer.parseInt(bBikilikTxt.getText()) == Integer.parseInt(kartDenemeTxt23.getText())){
            this.t.basketbolcuListesi.get(2).setKartKullanıldıMı(false);
            this.t.basketbolcuListesi.get(6).setKartKullanıldıMı(false);
        }
        else if(this.t.basketbolcuPozisyonSec()==2 && Integer.parseInt(bBsATxt.getText()) == Integer.parseInt(kartDenemeTxt22.getText())){
            this.t.basketbolcuListesi.get(2).setKartKullanıldıMı(false);
            this.t.basketbolcuListesi.get(6).setKartKullanıldıMı(false);
        }
        kontrolFutbolcu();
        kazanan();
    }//GEN-LAST:event_b3BtnActionPerformed

    private void b2BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b2BtnActionPerformed
        // TODO add your handling code here:
        bBsporcuAdiTxt.setText(bLbl2.getText());
        bBikilikTxt.setText(bİLbl2.getText());
        bBüçlükTxt.setText(bÜLbl2.getText());
        bBsATxt.setText(bSbLbl2.getText());
        kartDenemeTxt20.setText(this.t.basketbolcuListesi.get(5).sporcuİsim);
        kartDenemeTxt23.setText(String.valueOf(this.t.basketbolcuListesi.get(5).ikilik));
        kartDenemeTxt21.setText(String.valueOf(this.t.basketbolcuListesi.get(5).üçlük));
        kartDenemeTxt22.setText(String.valueOf(this.t.basketbolcuListesi.get(5).serbestAtış));
        this.t.basketbolcuListesi.get(1).setKartKullanıldıMı(true);
        b2Btn.setEnabled(false);
        //jPanel1.setVisible(false);
        
        puanlamaBasketbolcu();
        kSkor.setText(String.valueOf(this.t.kullanıcı.getSkor()));
        bSkor.setText(String.valueOf(this.t.bilgisayar.getSkor()));
        if(this.t.basketbolcuPozisyonSec()==1 && Integer.parseInt(bBüçlükTxt.getText()) == Integer.parseInt(kartDenemeTxt21.getText())){
                this.t.basketbolcuListesi.get(1).setKartKullanıldıMı(false);
                this.t.basketbolcuListesi.get(5).setKartKullanıldıMı(false);
        }
        else if(this.t.basketbolcuPozisyonSec()==0 && Integer.parseInt(bBikilikTxt.getText()) == Integer.parseInt(kartDenemeTxt23.getText())){
            this.t.basketbolcuListesi.get(1).setKartKullanıldıMı(false);
            this.t.basketbolcuListesi.get(5).setKartKullanıldıMı(false);
        }
        else if(this.t.basketbolcuPozisyonSec()==2 && Integer.parseInt(bBsATxt.getText()) == Integer.parseInt(kartDenemeTxt22.getText())){
            this.t.basketbolcuListesi.get(1).setKartKullanıldıMı(false);
            this.t.basketbolcuListesi.get(5).setKartKullanıldıMı(false);
        }
        kontrolFutbolcu();
        kazanan();
    }//GEN-LAST:event_b2BtnActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        jLabel4.setVisible(true);
        özellikLbl.setVisible(true);
        girişPaneli.setVisible(false);
        jButton1.setVisible(true);
        jPanel9.setVisible(true);
        jPanel10.setVisible(true);
        jPanel11.setVisible(true);
        k.oyuncuAdı = kullanıcıAdıTxt.getText();
        jLabel3.setText(k.oyuncuAdı);
        kullanıcıAdıTxt.setText("");
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Oyun.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Oyun.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Oyun.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Oyun.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Oyun().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b1Btn;
    private javax.swing.JButton b2Btn;
    private javax.swing.JButton b3Btn;
    private javax.swing.JButton b4Btn;
    private javax.swing.JLabel bB10;
    private javax.swing.JLabel bB11;
    private javax.swing.JLabel bB12;
    private javax.swing.JLabel bB13;
    private javax.swing.JLabel bB14;
    private javax.swing.JLabel bB15;
    private javax.swing.JLabel bB16;
    private javax.swing.JLabel bB17;
    private javax.swing.JLabel bB18;
    private javax.swing.JLabel bB19;
    private javax.swing.JLabel bB2;
    private javax.swing.JLabel bB20;
    private javax.swing.JLabel bB21;
    private javax.swing.JLabel bB22;
    private javax.swing.JLabel bB23;
    private javax.swing.JLabel bB24;
    private javax.swing.JLabel bB25;
    private javax.swing.JLabel bB26;
    private javax.swing.JLabel bB27;
    private javax.swing.JLabel bB28;
    private javax.swing.JLabel bB29;
    private javax.swing.JLabel bB3;
    private javax.swing.JLabel bB34;
    private javax.swing.JLabel bB35;
    private javax.swing.JLabel bB36;
    private javax.swing.JLabel bB37;
    private javax.swing.JLabel bB4;
    private javax.swing.JLabel bB5;
    private javax.swing.JLabel bB6;
    private javax.swing.JLabel bB7;
    private javax.swing.JLabel bB8;
    private javax.swing.JLabel bB9;
    private javax.swing.JLabel bBikilikTxt;
    private javax.swing.JLabel bBsATxt;
    private javax.swing.JLabel bBsporcuAdiTxt;
    private javax.swing.JLabel bBüçlükTxt;
    private javax.swing.JLabel bLbl1;
    private javax.swing.JLabel bLbl2;
    private javax.swing.JLabel bLbl3;
    private javax.swing.JLabel bLbl4;
    private javax.swing.JLabel bSbLbl1;
    private javax.swing.JLabel bSbLbl2;
    private javax.swing.JLabel bSbLbl3;
    private javax.swing.JLabel bSbLbl4;
    private javax.swing.JLabel bSkor;
    private javax.swing.JLabel bÜLbl1;
    private javax.swing.JLabel bÜLbl2;
    private javax.swing.JLabel bÜLbl3;
    private javax.swing.JLabel bÜLbl4;
    private javax.swing.JLabel bİLbl1;
    private javax.swing.JLabel bİLbl2;
    private javax.swing.JLabel bİLbl3;
    private javax.swing.JLabel bİLbl4;
    private javax.swing.JButton f1Btn;
    private javax.swing.JButton f2Btn;
    private javax.swing.JButton f3Btn;
    private javax.swing.JButton f4Btn;
    private javax.swing.JLabel fKkkLbl1;
    private javax.swing.JLabel fKkkLbl2;
    private javax.swing.JLabel fKkkLbl3;
    private javax.swing.JLabel fKkkLbl4;
    private javax.swing.JLabel fLbl1;
    private javax.swing.JLabel fLbl2;
    private javax.swing.JLabel fLbl3;
    private javax.swing.JLabel fLbl4;
    private javax.swing.JLabel fPLbl1;
    private javax.swing.JLabel fPLbl2;
    private javax.swing.JLabel fPLbl3;
    private javax.swing.JLabel fPLbl4;
    private javax.swing.JLabel fSbLbl1;
    private javax.swing.JLabel fSbLbl2;
    private javax.swing.JLabel fSbLbl3;
    private javax.swing.JLabel fSbLbl4;
    private javax.swing.JPanel girişPaneli;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JLabel kFkkkTxt;
    private javax.swing.JLabel kFpenaltiTxt;
    private javax.swing.JLabel kFsBTxt;
    private javax.swing.JLabel kFsporcuAdiTxt;
    private javax.swing.JLabel kSkor;
    private javax.swing.JLabel kartDenemeTxt;
    private javax.swing.JLabel kartDenemeTxt1;
    private javax.swing.JLabel kartDenemeTxt12;
    private javax.swing.JLabel kartDenemeTxt13;
    private javax.swing.JLabel kartDenemeTxt14;
    private javax.swing.JLabel kartDenemeTxt15;
    private javax.swing.JLabel kartDenemeTxt2;
    private javax.swing.JLabel kartDenemeTxt20;
    private javax.swing.JLabel kartDenemeTxt21;
    private javax.swing.JLabel kartDenemeTxt22;
    private javax.swing.JLabel kartDenemeTxt23;
    private javax.swing.JLabel kartDenemeTxt25;
    private javax.swing.JLabel kartDenemeTxt26;
    private javax.swing.JLabel kartDenemeTxt27;
    private javax.swing.JLabel kartDenemeTxt28;
    private javax.swing.JLabel kartDenemeTxt29;
    private javax.swing.JLabel kartDenemeTxt3;
    private javax.swing.JLabel kartDenemeTxt30;
    private javax.swing.JLabel kartDenemeTxt31;
    private javax.swing.JLabel kartDenemeTxt32;
    private javax.swing.JLabel kartDenemeTxt34;
    private javax.swing.JLabel kartDenemeTxt35;
    private javax.swing.JLabel kartDenemeTxt36;
    private javax.swing.JLabel kartDenemeTxt37;
    private javax.swing.JLabel kartDenemeTxt4;
    private javax.swing.JLabel kartDenemeTxt5;
    private javax.swing.JLabel kartDenemeTxt6;
    private javax.swing.JLabel kartDenemeTxt7;
    private javax.swing.JTextField kullanıcıAdıTxt;
    private javax.swing.JLabel özellikLbl;
    // End of variables declaration//GEN-END:variables
}
