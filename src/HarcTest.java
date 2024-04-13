import JatekosControll.Entitas;
import JatekosControll.Jatekos;
import org.junit.Before;
import org.junit.Test;

import javax.swing.*;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class HarcTest {
    Jatekos p;
    Entitas e;
    JLabel jl;
    Harc h;
    @Before
    public void setUp() throws Exception {
        p = new Jatekos(100,10,1,new ArrayList<>());
        e = new Entitas(5,5,2);
        jl = new JLabel();
        h = new Harc();
    }

    @Test
    public void testPlayerAttributes(){
        int pht = p.getHt();
        int pero = p.getEro();
        h.harc(p,e,jl);
        assertEquals(p.getHt(),pht);
        assertEquals(p.getEro(),pero);
    }
}