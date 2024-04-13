package JatekosControll;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import static java.lang.Integer.*;

public class Jatekos extends Entitas {
    private ArrayList<Targy> itemek;
    public Jatekos(int hp, int ht, int ero, ArrayList<Targy> itemek) {
        super(hp, ht, ero);
        this.itemek = itemek;
    }

    public Jatekos(String fajlnev) throws FileNotFoundException {
        super(0,0,0);
        File jatekosdata = new File(fajlnev);
        Scanner jds = new Scanner(jatekosdata);
        String[] data = jds.nextLine().split(";");
        if(parseInt(data[0]) > 100 || parseInt(data[0]) < 31){
            this.setHp(100);
        }
        else{this.setHp(parseInt(data[0]));}
        if (parseInt(data[1]) > 90 || parseInt(data[1]) < 1){
            this.setHt(10);
        }
        else{this.setHt(parseInt(data[1]));}
        this.itemek = new ArrayList<>();
        itemek.add(new Targy(data[2],0,parseInt(data[3])));
        this.setEro(itemek.get(0).getMennyiseg());
        itemek.add(new Targy("Életital",1,parseInt(data[4])));
    }

    public  ArrayList<Targy> getItemek(){return itemek;}
}
