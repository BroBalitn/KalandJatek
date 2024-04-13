package KepSett;

import javax.swing.*;
import java.awt.*;

public class KepBe extends JComponent {
    private Image k;
    public KepBe(Image k){
        this.k = k;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(k,0,0,this);
    }
}
