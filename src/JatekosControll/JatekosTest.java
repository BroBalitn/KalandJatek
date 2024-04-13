package JatekosControll;
import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;
import static org.junit.Assert.*;

public class JatekosTest {
    Jatekos j,jf;
    @Before
    public void setUp() throws Exception {
        j = new Jatekos(100,10,3,new ArrayList<>());
        jf = new Jatekos("src/jatekosfajlbol.txt");
    }

    @Test
    public void checkPlayerData(){
        int hp = 100;
        int ht = 10;
        int ero = 3;
        int hpf = 50;
        int htf = 20;
        int erof = 3;
        assertEquals(j.getHp(),hp);
        assertEquals(j.getHt(),ht);
        assertEquals(j.getEro(),ero);
        assertEquals(jf.getHp(),hpf);
        assertEquals(jf.getHt(),htf);
        assertEquals(jf.getEro(),erof);
    }
}