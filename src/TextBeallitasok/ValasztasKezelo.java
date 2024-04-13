package TextBeallitasok;

import JatekosControll.Jatekos;
import StartBeallitasok.WindowBeallitas;
import javax.swing.*;
import java.awt.*;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class ValasztasKezelo {
    private JButton valasz1,valasz2,valasz3,valasz4;
    private String pozicio;
    private JTextArea szovegt;
    private static JatekSzovegek jsz;
    private static JPanelBeallitas jpb;
    private Font Btipuscim,Btipusszoveg,Btipustutszoveg;

    public ValasztasKezelo(String pozicio,JTextArea szovegt,JButton valasz1,
                           JButton valasz2,JButton valasz3,JButton valasz4,Font Btipuscim,Font Btipusszoveg){
        this.pozicio = pozicio;
        this.szovegt = szovegt;
        this.valasz1 = valasz1;
        this.valasz2 = valasz2;
        this.valasz3 = valasz3;
        this.valasz4 = valasz4;
        this.Btipuscim = Btipuscim;
        this.Btipusszoveg = Btipusszoveg;
        jsz = new JatekSzovegek();
        jpb = new JPanelBeallitas();
    }

    public String falu(){
        pozicio = "Falu";
        szovegt.setText(jsz.falusz());
        valasz1.setText("Elindulsz");
        valasz2.setText("Elbúcsúzol");
        valasz3.setText("");
        valasz4.setText("");
        return pozicio;
    }

    public String nagyihaza(){
        pozicio = "nagyihaza";
        szovegt.setText(jsz.nagyinal());
        valasz1.setText("Tovább");
        valasz2.setText("");
        valasz3.setText("");
        valasz4.setText("");
        return pozicio;
    }

    public String erdo(){
        pozicio = "erdo";
        szovegt.setText(jsz.erdo());
        valasz1.setText("Harcolsz");
        valasz2.setText("Elfutsz(-10hp)");
        valasz3.setText("");
        valasz4.setText("");
        return pozicio;
    }

    public String erdohutan(){
        pozicio = "erdohutan";
        szovegt.setText(jsz.erdohutan());
        valasz1.setText("Tovább");
        valasz2.setText("");
        valasz3.setText("");
        valasz4.setText("");
        return pozicio;
    }

    public String erdohelfut(){
        pozicio = "erdohelfut";
        szovegt.setText(jsz.erdohelfut());
        valasz1.setText("Tovább");
        valasz2.setText("");
        valasz3.setText("");
        valasz4.setText("");
        return pozicio;
    }

    public String erdoelag(){
        pozicio = "erdoelag";
        szovegt.setText(jsz.erdoelag());
        valasz1.setText("Balra mész");
        valasz2.setText("Középen mész");
        valasz3.setText("Jobbra mész");
        valasz4.setText("Megpihensz");
        return pozicio;
    }

    public String erdobal(){
        pozicio = "erdobal";
        szovegt.setText(jsz.erdobalra());
        valasz1.setText("Tovább");
        valasz2.setText("");
        valasz3.setText("");
        valasz4.setText("");
        return pozicio;
    }

    public String erdokozep(){
        pozicio = "erdokozep";
        szovegt.setText(jsz.erdokozep());
        valasz1.setText("Tovább");
        valasz2.setText("");
        valasz3.setText("");
        valasz4.setText("");
        return pozicio;
    }

    public String erdojobbra(){
        pozicio = "erdojobbra";
        szovegt.setText(jsz.erdojobbra());
        valasz1.setText("Beszélsz velük");
        valasz2.setText("Megtámadod");
        valasz3.setText("");
        valasz4.setText("");
        return pozicio;
    }

    public String nyugatikapu(){
        pozicio = "nyugatikapu";
        szovegt.setText(jsz.nyugatikapu());
        valasz1.setText("Beszélsz velük");
        valasz2.setText("Megtámadod");
        valasz3.setText("");
        valasz4.setText("");
        return pozicio;
    }

    public String nyugatikapubeszel(){
        pozicio = "nyugatikapubeszel";
        szovegt.setText(jsz.nyugatikapubeszel());
        valasz1.setText("Oda adod");
        valasz2.setText("Továbbmész");
        valasz3.setText("");
        valasz4.setText("");
        return pozicio;
    }

    public String odaadodacsokit(){
        pozicio = "odaadodacsokit";
        szovegt.setText(jsz.odaadodacsokit());
        valasz1.setText("Tovább");
        valasz2.setText("");
        valasz3.setText("");
        valasz4.setText("");
        return pozicio;
    }

    public String barakk(){
        pozicio = "barakk";
        szovegt.setText(jsz.barakk());
        valasz1.setText("Harcolsz");
        valasz2.setText("Elbújsz");
        valasz3.setText("");
        valasz4.setText("");
        return pozicio;
    }

    public String barakkhutan(){
        pozicio = "barakkhutan";
        szovegt.setText(jsz.barakkhutan());
        valasz1.setText("Tovább");
        valasz2.setText("");
        valasz3.setText("");
        valasz4.setText("");
        return pozicio;
    }

    public String barakkelfut(){
        pozicio = "barakkelfut";
        szovegt.setText(jsz.barakkelfut());
        valasz1.setText("Tovább");
        valasz2.setText("");
        valasz3.setText("");
        valasz4.setText("");
        return pozicio;
    }

    public String demovege(){
        pozicio = "demovege";
        szovegt.setText(jsz.demovege());
        valasz1.setText("");
        valasz2.setText("");
        valasz3.setText("");
        valasz4.setText("");
        return pozicio;
    }

    public String nemadododa(){
        pozicio = "nemadododa";
        szovegt.setText(jsz.nemadododa());
        valasz1.setText("Tovább");
        valasz2.setText("");
        valasz3.setText("");
        valasz4.setText("");
        return pozicio;
    }

    public String keletikapubeszel(){
        pozicio = "keletikapubeszel";
        szovegt.setText(jsz.keletikapubeszel());
        valasz1.setText("Tovább");
        valasz2.setText("");
        valasz3.setText("");
        valasz4.setText("");
        return pozicio;
    }

    public String delikapu(){
        pozicio = "delikapu";
        szovegt.setText(jsz.delikapu());
        valasz1.setText("Beszélsz velük");
        valasz2.setText("Megtámadod");
        valasz3.setText("");
        valasz4.setText("");
        return pozicio;
    }

    public String delikapubeszel(){
        pozicio = "delikapubeszel";
        szovegt.setText(jsz.delikapubeszel());
        valasz1.setText("Tovább");
        valasz2.setText("");
        valasz3.setText("");
        valasz4.setText("");
        return pozicio;
    }

    public void tutorial() throws IOException {
        Btipustutszoveg = Btipusszoveg;
        Btipustutszoveg = Btipustutszoveg.deriveFont(Font.PLAIN, 12);
        JFrame window = new JFrame();
        WindowBeallitas wb = new WindowBeallitas();
        wb.windowsett(window,600,400,"src/tutorialbg.png",2);
        Container container = window.getContentPane();
        JPanel jatekmenete = new JPanel();
        jatekmenete.setBounds(5,20,200,30);
        jatekmenete.setBackground(new Color(0,0,0,0));
        JLabel jatekml = new JLabel();
        jatekml = jpb.szovegSett("A játék alapjai:",Btipusszoveg);
        jatekmenete.add(jatekml);
        JPanel jatekleirasa = new JPanel();
        jatekleirasa.setBounds(5,60,570,160);
        jatekleirasa.setBackground(new Color(0,0,0,0));
        JTextArea jatekll = new JTextArea("A játékot 100 élettel kezded és 10 harci tapasztalattal, " +
                "ami a támadás elöli kitérés esélyét jelenti százalékban. A játék története a jobb oldali szövegrészen olvasható " +
                "majd a jobb lent felsorolt lehetőségekből lehet választani, merre tovább. A játékban a harcok autómatikusan zajlank " +
                "először a játékos majd az ellenség üt. A játékos ereje a fegyverétől függ (kezdetben ököl, 1 sebzéssel). " +
                "A játék ideje alatt bármikor ihatsz élet italt, ami 30 életet tölt vissza (ital ivása gomb).");
        jatekll.setBounds(5,60,570,160);
        jatekll.setBackground(new Color(0,0,0,0));
        jatekll.setForeground(Color.white);
        jatekll.setFont(Btipustutszoveg);
        jatekll.setLineWrap(true);
        jatekleirasa.add(jatekll);
        JPanel karakterfajlbolcim = new JPanel();
        karakterfajlbolcim.setBounds(5,230,360,30);
        karakterfajlbolcim.setBackground(new Color(0,0,0,0));
        JLabel karakterfajlbolt = new JLabel();
        karakterfajlbolt = jpb.szovegSett("Karakter beolvasása fájlból:",Btipusszoveg);
        karakterfajlbolcim.add(karakterfajlbolt);
        JPanel karakterfajlbolleiras = new JPanel();
        karakterfajlbolleiras.setBounds(5,270,570,80);
        karakterfajlbolleiras.setBackground(new Color(0,0,0,0));
        JTextArea karakterfajlbolleirta = new JTextArea("Ha saját statokkal akarsz karaktert kezdeni, akkor az src mappába adhatod " +
                "meg a karaktered adatait ';'-vel elválasztva a következő képpen: karaktered élete(max 100, min 31), harci " +
                "tapasztalata(max 90, min 1),kezdő fegyvered neve,kezdő fegyvered sebzése, életitalaid mennyisége.");
        karakterfajlbolleirta.setBounds(5,270,570,80);
        karakterfajlbolleirta.setBackground(new Color(0,0,0,0));
        karakterfajlbolleirta.setForeground(Color.white);
        karakterfajlbolleirta.setFont(Btipustutszoveg);
        karakterfajlbolleirta.setLineWrap(true);
        karakterfajlbolleiras.add(karakterfajlbolleirta);
        container.add(karakterfajlbolleiras);
        container.add(karakterfajlbolcim);
        container.add(jatekleirasa);
        container.add(jatekmenete);
        window.setResizable(false);
        window.setVisible(true);
    }

    public void karakterfajlba(Jatekos p) throws IOException {
        String datenow = new SimpleDateFormat("yyyyMMdd_hh").format(Calendar.getInstance().getTime());
        FileWriter f = new FileWriter("Karakter" + datenow + ".txt");
        f.write(p.getHp() + ";" + p.getHt() + ";" + p.getItemek().get(0).getNev() + ";" +
                p.getItemek().get(0).getMennyiseg() + ";" + p.getItemek().get(1).getMennyiseg());
        f.close();
    }

    public Jatekos karakterfajlbol(Jatekos p,JLabel hpt,JLabel htt,
                                   JLabel fegyvert, JLabel potit,String pozicio,String jatekosvalasztas) throws FileNotFoundException {
        if (pozicio.equals("Startoldal") && jatekosvalasztas.equals("v3")) {
            p = new Jatekos("src/jatekosfajlbol.txt");
            hpt.setText("Életerő: " + p.getHp());
            htt.setText("Harci tap: " + p.getHt());
            fegyvert.setText(p.getItemek().get(0).getNev() + ": " + p.getItemek().get(0).getMennyiseg());
            potit.setText(p.getItemek().get(1).getNev() + ": " + p.getItemek().get(1).getMennyiseg());
        }
        return p;
    }
}
