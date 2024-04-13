package StartBeallitasok;
import KepSett.*;
import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.event.WindowEvent;
import java.io.File;
import java.io.IOException;

public class WindowBeallitas {
    public void windowsett(JFrame window,int w,int h,String keputvonal,int winszint) throws IOException {
        window.setSize(w,h);
        if(winszint == 1) {window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);}
        else {window.dispatchEvent(new WindowEvent(window, WindowEvent.WINDOW_CLOSING));}
        window.setLocationRelativeTo(null);
        window.setContentPane(new KepBe(ImageIO.read(new File(keputvonal))));
        window.setTitle("A menet");
        window.setLayout(null);
    }
}
