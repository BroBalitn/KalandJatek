
import JatekosControll.Entitas;
import JatekosControll.HalalCheck;
import JatekosControll.Jatekos;
import JatekosControll.Targy;
import StartBeallitasok.*;
import TextBeallitasok.JPanelBeallitas;
import TextBeallitasok.JatekSzovegek;
import TextBeallitasok.ValasztasKezelo;
import javax.sound.sampled.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.ArrayList;

public class Main {
    static JFrame window;
    static Font Btipuscim;
    static Font Btipusszoveg;
    static Font Bstatszoveg;
    static Container container;
    static Jatekos p;
    static JPanel nyitocimp,stathpp,stathtp,backpackp,backpack1p,backpack2p,backpack3p,backpack4p,
            fegyverp,potip,potiusep,szovegp,valaszokp;
    static JLabel nyitocimt,hpt,htt,backpackt,backpack1t,backpack2t,backpack3t,backpack4t,fegyvert,potit;
    static JTextArea szovegt;
    static JButton potiuseb,valasz1,valasz2,valasz3,valasz4;
    static valaszKezelo vk;
    static String pozicio;
    static ValasztasKezelo VK;
    static JPanelBeallitas jpb;
    static int maxhp;
    static Harc h;
    static HalalCheck hc;
    public static void main(String[] args) throws IOException, LineUnavailableException,
            UnsupportedAudioFileException, FontFormatException {
        //ablak létrehozása
        window = new JFrame();
        WindowBeallitas wb = new WindowBeallitas();
        wb.windowsett(window,600,800,"src/jatekbg.png",1);
        //változók
        JatekSzovegek jsz = new JatekSzovegek();
        FontBeallitas fb = new FontBeallitas();
        Btipuscim = fb.fontCimSett();
        Btipusszoveg = fb.fontSzovegSett();
        Bstatszoveg = fb.statSzovegSett();
        jpb = new JPanelBeallitas();
        container = window.getContentPane();
        vk = new valaszKezelo();
        pozicio = "Startoldal";
        hc = new HalalCheck();
        //játékos létrehozása
        ArrayList<Targy> inventory = new ArrayList<>();
        inventory.add(new Targy("ököl",0,1));
        inventory.add(new Targy("Életital",1,2));
        p = new Jatekos(100,10,inventory.get(0).getMennyiseg(),inventory);
        maxhp = p.getHp();
        //cím felirat
        nyitocimp = new JPanel();
        nyitocimp.setBounds(320,20,255,50);
        nyitocimp.setBackground(Color.black);
        nyitocimt = jpb.szovegSett("A menet",Btipuscim);
        nyitocimp.add(nyitocimt);
        //élet kiírása
        stathpp = new JPanel();
        stathpp.setBounds(5,175,160,30);
        stathpp.setBackground(Color.darkGray);
        String hp = "Életerő: " + p.getHp();
        hpt = jpb.szovegSett(hp,Btipusszoveg);
        stathpp.add(hpt);
        //harci tapasztalat kiírása
        stathtp = new JPanel();
        stathtp.setBounds(5,210,160,30);
        stathtp.setBackground(Color.darkGray);
        String ht = "Harci tap: " + p.getHt();
        htt = jpb.szovegSett(ht,Bstatszoveg);
        stathtp.add(htt);
        //táska felirat
        backpackp = new JPanel();
        backpackp.setBounds(5,265,160,30);
        backpackp.setBackground(Color.darkGray);
        backpackt = jpb.szovegSett("Hátizsák:",Btipusszoveg);
        backpackp.add(backpackt);
        //inventory 1
        backpack1p = new JPanel();
        backpack1p.setBounds(5,300,160,30);
        backpack1p.setBackground(Color.darkGray);
        backpack1t = jpb.szovegSett("",Btipusszoveg);
        backpack1p.add(backpack1t);
        //inventory 2
        backpack2p = new JPanel();
        backpack2p.setBounds(5,335,160,30);
        backpack2p.setBackground(Color.darkGray);
        backpack2t = jpb.szovegSett("",Btipusszoveg);
        backpack2p.add(backpack2t);
        //inventory 3
        backpack3p = new JPanel();
        backpack3p.setBounds(5,370,160,30);
        backpack3p.setBackground(Color.darkGray);
        backpack3t = jpb.szovegSett("",Btipusszoveg);
        backpack3p.add(backpack3t);
        //inventory 4
        backpack4p = new JPanel();
        backpack4p.setBounds(5,405,160,30);
        backpack4p.setBackground(Color.darkGray);
        backpack4t = jpb.szovegSett("",Btipusszoveg);
        backpack4p.add(backpack4t);
        //fegyver kiírása
        fegyverp = new JPanel();
        fegyverp.setBounds(5,550,160,30);
        fegyverp.setBackground(Color.darkGray);
        String fegyver = p.getItemek().get(0).getNev() + ": " + p.getItemek().get(0).getMennyiseg();
        fegyvert = jpb.szovegSett(fegyver,Btipusszoveg);
        fegyverp.add(fegyvert);
        //életpotik kiírása
        potip = new JPanel();
        potip.setBounds(5,690,160,30);
        potip.setBackground(Color.darkGray);
        String poti = p.getItemek().get(1).getNev() + ": " + p.getItemek().get(1).getMennyiseg();
        potit = jpb.szovegSett(poti,Btipusszoveg);
        potip.add(potit);
        //poti használ gomb
        potiusep = new JPanel();
        potiusep.setBounds(5,615,160,40);
        potiusep.setBackground(Color.black);
        potiuseb = new JButton("ital ivás");
        potiuseb.setBackground(Color.black);
        potiuseb.setForeground(Color.white);
        potiuseb.setFont(Btipusszoveg);
        potiusep.add(potiuseb);
        potiuseb.addActionListener(e -> {
            if (p.getItemek().get(1).getMennyiseg() > 0){
                if(p.getHp() == maxhp){
                    return;
                } else if (p.getHp() <= maxhp - 30) {
                    p.setHp(p.getHp() + 30);
                    setData(p,hpt,potit);
                }else {
                    p.setHp(maxhp);
                    setData(p,hpt,potit);
                }
            }
        });
        //nyitószöveg kiírása
        szovegp = new JPanel();
        szovegp.setBounds(320,90,255,400);
        szovegp.setBackground(Color.black);
        szovegt = new JTextArea(jsz.nyitosz());
        szovegt.setBounds(320,90,255,400);
        szovegt.setBackground(Color.black);
        szovegt.setForeground(Color.white);
        szovegt.setFont(Btipusszoveg);
        szovegt.setLineWrap(true);
        szovegp.add(szovegt);
        //valaszopciok
        valaszokp = new JPanel();
        valaszokp.setBounds(330,480,230,250);
        valaszokp.setBackground(Color.black);
        valaszokp.setLayout(new GridLayout(4,1));
        valasz1 = new JButton("Indulás");
        valasz1.setBackground(Color.black);
        valasz1.setForeground(Color.white);
        valasz1.setFont(Btipusszoveg);
        valasz1.addActionListener(vk);
        valasz1.setActionCommand("v1");
        valaszokp.add(valasz1);
        valasz2 = new JButton("Tutorial");
        valasz2.setBackground(Color.black);
        valasz2.setForeground(Color.white);
        valasz2.setFont(Btipusszoveg);
        valasz2.addActionListener(vk);
        valasz2.setActionCommand("v2");
        valaszokp.add(valasz2);
        valasz3 = new JButton("Statok fájlból");
        valasz3.setBackground(Color.black);
        valasz3.setForeground(Color.white);
        valasz3.setFont(Btipusszoveg);
        valasz3.addActionListener(vk);
        valasz3.setActionCommand("v3");
        valaszokp.add(valasz3);
        valasz4 = new JButton("Statok fájlba");
        valasz4.setBackground(Color.black);
        valasz4.setForeground(Color.white);
        valasz4.setFont(Btipusszoveg);
        valasz4.addActionListener(vk);
        valasz4.setActionCommand("v4");
        valaszokp.add(valasz4);
        //feliratok megjelenítése az ablakon
        container.add(valaszokp);
        container.add(potiusep);
        container.add(backpack4p);
        container.add(backpack3p);
        container.add(backpack2p);
        container.add(backpack1p);
        container.add(backpackp);
        container.add(stathtp);
        container.add(stathpp);
        container.add(potip);
        container.add(fegyverp);
        container.add(nyitocimp);
        container.add(szovegp);
        //ablak megjelenítése, méretezés letiltása
        window.setResizable(false);
        window.setVisible(true);
        //zene lejátszása
        Zene z = new Zene();
        z.hatterZene();
    }

    public static void setData(Jatekos jatekos, JLabel hpt, JLabel potit){
        jatekos.getItemek().get(1).setMennyiseg(jatekos.getItemek().get(1).getMennyiseg() - 1);
        String hp = "Életerő: " + jatekos.getHp();
        hpt.setText(hp);
        String poti = jatekos.getItemek().get(1).getNev() + ": " + jatekos.getItemek().get(1).getMennyiseg();
        potit.setText(poti);
    }

    public static class valaszKezelo implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            String jatekosvalasztas = e.getActionCommand();
            VK = new ValasztasKezelo(pozicio,szovegt,valasz1,valasz2,valasz3,valasz4,Btipuscim,Btipusszoveg);
            h = new Harc();
            try {
                switch (pozicio) {
                    case "Startoldal" -> {
                        switch (jatekosvalasztas) {
                            case "v1" -> pozicio = VK.falu();
                            case "v2" -> VK.tutorial();
                            case "v3" -> {
                                p = VK.karakterfajlbol(p, hpt, htt, fegyvert, potit, pozicio, jatekosvalasztas);
                                maxhp = p.getHp();
                            }
                            case "v4" -> VK.karakterfajlba(p);
                        }
                    }
                    case "Falu" -> {
                        switch (jatekosvalasztas) {
                            case "v1" -> pozicio = VK.erdo();
                            case "v2" -> {
                                pozicio = VK.nagyihaza();
                                maxhp += 10;
                                p.setHp(p.getHp() + 10);
                                hpt.setText("Életerő: " + p.getHp());
                            }
                        }
                    }
                    case "nagyihaza" -> {
                        if (jatekosvalasztas.equals("v1")) {
                            pozicio = VK.erdo();
                        }
                    }
                    case "erdo" -> {
                        switch (jatekosvalasztas) {
                            case "v1" -> {
                                p = h.harc(p, new Entitas(5, 0, 3), hpt);
                                hc.haMegHal(p, window, "Megölt egy éhező bandita, elég rossz teljesítmény!");
                                p.getItemek().get(0).setNev("kés");
                                p.getItemek().get(0).setMennyiseg(3);
                                fegyvert.setText(p.getItemek().get(0).getNev() + ": " + p.getItemek().get(0).getMennyiseg());
                                pozicio = VK.erdohutan();
                            }
                            case "v2" -> {
                                p.setHp(p.getHp() - 10);
                                hc.haMegHal(p, window, "Mikor elrohantál, a bandita utánadszúrt, aminek köszönhetően " +
                                        "meghaltál.");
                                hpt.setText("Életerő: " + p.getHp());
                                pozicio = VK.erdohelfut();
                            }
                        }
                    }
                    case "erdohutan", "erdohelfut" -> {
                        if (jatekosvalasztas.equals("v1")) {
                            pozicio = VK.erdoelag();
                        }
                    }
                    case "erdoelag" -> {
                        switch (jatekosvalasztas) {
                            case "v1" -> pozicio = VK.erdobal();
                            case "v2" -> {
                                pozicio = VK.erdokozep();
                                p.setHt(p.getHt() + 5);
                                htt.setText("Harci tap: " + p.getHt());
                            }
                            case "v3" -> pozicio = VK.erdojobbra();
                            case "v4" -> {
                                p.setHp(0);
                                hc.haMegHal(p, window, "Úgy döntöttél lepihensz mielőtt továbblépsz, kis pihenés után mikor" +
                                        " kinyitod a szemed, egy banditára leszel figyelmes, aki azonnal elvágja a torkod.");
                            }
                        }
                    }
                    case "erdokozep" -> {
                        if (jatekosvalasztas.equals("v1")) {
                            pozicio = VK.delikapu();
                        }
                    }
                    case "erdojobbra" -> {
                        switch (jatekosvalasztas) {
                            case "v1" -> pozicio = VK.keletikapubeszel();
                            case "v2" -> {
                                p.setHp(0);
                                hc.haMegHal(p,window,"Megtámadtad az őröket, amit ők nem igazaán értékeltek. Azt " +
                                        "hitték ellenség vagy és az első támadásod kikerülve hasbaszúrtak.");
                            }
                        }
                    }
                    case "erdobal" -> {
                        if (jatekosvalasztas.equals("v1")) {
                            pozicio = VK.nyugatikapu();
                            p.getItemek().add(new Targy("csoki", 2, 23));
                            backpack1t.setText(p.getItemek().get(2).getNev());
                        }
                    }
                    case "nyugatikapu" -> {
                        switch (jatekosvalasztas) {
                            case "v1" -> pozicio = VK.nyugatikapubeszel();
                            case "v2" ->{
                                p.setHp(0);
                                hc.haMegHal(p,window,"Megtámadtad az őröket, amit ők nem igazaán értékeltek. Azt " +
                                        "hitték ellenség vagy és az első támadásod kikerülve hasbaszúrtak.");
                            }
                        }
                    }
                    case "nyugatikapubeszel" -> {
                        switch (jatekosvalasztas){
                            case "v1" -> {
                                pozicio = VK.odaadodacsokit();
                                p.getItemek().remove(2);
                                backpack1t.setText("");
                                p.getItemek().get(0).setMennyiseg(p.getItemek().get(0).getMennyiseg() + 1);
                                fegyvert.setText(p.getItemek().get(0).getNev() + ": " + p.getItemek().get(0).getMennyiseg());
                            }
                            case "v2" -> pozicio = VK.nemadododa();
                        }
                    }
                    case "delikapu" -> {
                        switch (jatekosvalasztas) {
                            case "v1" -> pozicio = VK.delikapubeszel();
                            case "v2" -> {
                                p.setHp(0);
                                hc.haMegHal(p,window,"Megtámadtad az őröket, amit ők nem igazaán értékeltek. Azt " +
                                        "hitték ellenség vagy és az első támadásod kikerülve hasbaszúrtak.");
                            }
                        }
                    }
                    case "delikapubeszel", "nemadododa", "odaadodacsokit", "keletikapubeszel" -> {
                        if (jatekosvalasztas.equals("v1")) {
                            pozicio = VK.barakk();
                        }
                    }
                    case "barakk" -> {
                        switch (jatekosvalasztas){
                            case "v1" -> {
                                pozicio = VK.barakkhutan();
                                h.harc(p,new Entitas(20,5,3),hpt);
                                hc.haMegHal(p,window,"A barbár levágja a kezeid, majd fejedbe vágja fejszéjét, a parancsnok" +
                                        "szomorúan rádnéz, majd behajítanak a többi közé.");
                                maxhp += 20;
                                p.setHp(p.getHp() + 20);
                                hpt.setText("Életerő: " + p.getHp());
                            }
                            case "v2" -> {
                                pozicio = VK.barakkelfut();
                                maxhp += 5;
                                p.setHp(p.getHp() + 5);
                                hpt.setText("Életerő: " + p.getHp());
                            }
                        }
                    }
                    case "barakkhutan","barakkelfut" -> {
                        if (jatekosvalasztas.equals("v1")) {
                            VK.demovege();
                        }
                    }
                }
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
        }
    }
}