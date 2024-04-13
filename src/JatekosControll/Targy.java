package JatekosControll;

public class Targy {
    private String nev;

    // használat => 0 = fegyver, 1 = ital, 2 = használható tárgy;
    // mennyiség => fegyver = sebzés, ital = mennyiség, tárgy = Id;
    private int hasznalat,mennyiseg;

    public Targy(String nev,int hasznalat, int mennyiseg){
        this.nev = nev;
        this.hasznalat = hasznalat;
        this.mennyiseg = mennyiseg;
    }

    public String getNev(){return nev;}
    public int getMennyiseg(){
        return mennyiseg;
    }
    public int getHasznalat() {
        return hasznalat;
    }
    public void setMennyiseg(int mennyiseg){this.mennyiseg = mennyiseg;}
    public void setNev(String nev){this.nev = nev;}
}
