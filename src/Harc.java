import JatekosControll.Entitas;
import JatekosControll.Jatekos;

import javax.swing.*;
import java.util.Random;

public class Harc {
    public Jatekos harc(Jatekos jatekos, Entitas entitas, JLabel hpt){
        while (jatekos.getHp() > 0 && entitas.getHp() > 0){
            Random r = new Random();
            //játékkos támadása
            if (r.nextInt(101) > jatekos.getHt()){
                jatekos.setHp(jatekos.getHp() - entitas.getEro());
            }
            if (jatekos.getHp() <= 0){
                String hp = "Életerő: " + jatekos.getHp();
                hpt.setText(hp);
                return jatekos;
            }
            //ellenség támadása
            if (r.nextInt(101) > entitas.getHt()){
                entitas.setHp(entitas.getHp() - jatekos.getEro());
            }
        }
        String hp = "Életerő: " + jatekos.getHp();
        hpt.setText(hp);
        return jatekos;
    }
}
