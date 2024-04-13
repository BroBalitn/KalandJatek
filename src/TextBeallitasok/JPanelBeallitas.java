package TextBeallitasok;

import javax.swing.*;
import java.awt.*;

public class JPanelBeallitas {
    public JLabel szovegSett(String text, Font Btipus){
        JLabel textbase = new JLabel(text);
        textbase.setForeground(Color.white);
        textbase.setFont(Btipus);
        return textbase;
    }
}
