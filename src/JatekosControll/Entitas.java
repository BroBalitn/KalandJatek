package JatekosControll;

public class Entitas {
    //hp = életerő, ht = harci tapasztalat (esély a támadás kivédésére), ero = sebzés
    private int hp,ht,ero;
    public Entitas(int hp,int ht,int ero){
        this.hp = hp;
        this.ht = ht;
        this.ero = ero;
    }

    public int getHp() {return hp;}

    public int getHt() {
        return ht;
    }

    public int getEro() {return ero;}

    public void setHp(int hp){this.hp = hp;}
    public void setHt(int ht){this.ht = ht;}
    public void setEro(int ero){this.ero = ero;}
}
