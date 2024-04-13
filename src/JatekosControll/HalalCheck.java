package JatekosControll;

import StartBeallitasok.FontBeallitas;
import StartBeallitasok.WindowBeallitas;
import TextBeallitasok.JPanelBeallitas;
import javax.swing.*;
import java.awt.*;
import java.io.IOException;

public class HalalCheck {
    JPanelBeallitas jpb = new JPanelBeallitas();
    FontBeallitas fb = new FontBeallitas();
    public HalalCheck() throws IOException, FontFormatException {
    }

    public void haMegHal(Jatekos p,JFrame mw,String gotext) throws IOException {
        if(p.getHp() <= 0){
            mw.setEnabled(false);
            JFrame w = new JFrame();
            WindowBeallitas wb = new WindowBeallitas();
            wb.windowsett(w,600,400,"src/gameoverbg.png",1);
            Container container = w.getContentPane();
            JPanel gameoverp = new JPanel();
            gameoverp.setBounds(30,100,540,70);
            gameoverp.setBackground(new Color(0,0,0,0));
            JLabel gameovert = new JLabel();
            gameovert = jpb.szovegSett("Game Over",fb.fontCimSett());
            gameoverp.add(gameovert);
            JPanel indoklasp = new JPanel();
            indoklasp.setBounds(70,200,460,100);
            indoklasp.setBackground(new Color(0,0,0,0));
            JTextArea indoklast = new JTextArea(gotext);
            indoklast.setBounds(70,200,460,100);
            indoklast.setBackground(new Color(0,0,0,0));
            indoklast.setForeground(Color.white);
            indoklast.setLineWrap(true);
            indoklast.setFont(fb.fontSzovegSett());
            indoklasp.add(indoklast);
            container.add(indoklasp);
            container.add(gameoverp);
            w.setVisible(true);
            w.setResizable(false);
        }
    }
}
