package zadanie_ułamek;

public class Ulamek {
    private int licznik;
    private int mianownik;

    public Ulamek(int licznik, int mianownik) {
        this.licznik = licznik;
        this.mianownik = mianownik;
    }

    public static Ulamek dodaj( Ulamek drugi, Ulamek pierwszy) {
        int mianownik = pierwszy.mianownik + drugi.mianownik;
        int licznik = pierwszy.licznik + drugi.licznik;
        Ulamek wynikowy = new Ulamek(licznik, mianownik);
        return wynikowy;
    }
    public static Ulamek pomnoz(Ulamek pierwszy, Ulamek drugi) {
        int licznik = pierwszy.licznik * drugi.licznik;
        int mianownik = pierwszy.mianownik * drugi.mianownik;
        Ulamek wynikowy = new Ulamek(licznik, mianownik);
        return wynikowy;
    }
}
