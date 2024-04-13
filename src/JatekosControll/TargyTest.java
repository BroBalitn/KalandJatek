package JatekosControll;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class TargyTest {
    Targy testtargy;
    @Before
    public void setUp() throws Exception {
        testtargy = new Targy("istenkardja",0,200);
    }
    @Test
    public void targyTest(){
        String tnev = "istenkardja";
        int thsz = 0;
        int tmenny = 200;
        assertEquals(testtargy.getNev(),tnev);
        assertEquals(testtargy.getHasznalat(),thsz);
        assertEquals(testtargy.getMennyiseg(),tmenny);
    }
}