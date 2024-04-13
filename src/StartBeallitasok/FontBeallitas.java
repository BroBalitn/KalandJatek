package StartBeallitasok;

import java.awt.*;
import java.io.File;
import java.io.IOException;

public class FontBeallitas {

    Font Btipuscim = Font.createFont(Font.TRUETYPE_FONT, new File("src/pixelfont.otf"));
    Font Btipusszoveg = Btipuscim;
    Font Bgameoverszoveg = Btipuscim;
    Font Bstatszoveg = Btipuscim;

    public FontBeallitas() throws IOException, FontFormatException {}

    public Font fontCimSett(){
        Btipuscim = Btipuscim.deriveFont(Font.PLAIN, 30);
        return Btipuscim;
    }

    public Font fontSzovegSett(){
        Btipusszoveg = Btipusszoveg.deriveFont(Font.PLAIN, 15);
        return Btipusszoveg;
    }

    public Font statSzovegSett(){
        Bstatszoveg = Bstatszoveg.deriveFont(Font.PLAIN,14);
        return Bstatszoveg;
    }
}
