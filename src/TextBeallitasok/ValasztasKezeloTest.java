package TextBeallitasok;

import org.junit.Before;
import org.junit.Test;

import javax.swing.*;

import java.awt.*;

import static org.junit.Assert.*;

public class ValasztasKezeloTest {
    ValasztasKezelo vk;
    JTextArea jta = new JTextArea();
    JButton v1 = new JButton();
    JButton v2 = new JButton();
    JButton v3 = new JButton();
    JButton v4 = new JButton();
    Font Btipuscim,Btipusszoveg;
    @Before
    public void setUp() throws Exception {
        vk = new ValasztasKezelo("erdo",jta,v1,v2,v3,v4,Btipuscim,Btipusszoveg);
    }

    @Test
    public void testPosition(){
        assertEquals(vk.erdo(),"erdo");
        assertEquals(vk.falu(),"Falu");
        assertEquals(vk.erdohutan(),"erdohutan");
        assertEquals(vk.nagyihaza(),"nagyihaza");
    }
}