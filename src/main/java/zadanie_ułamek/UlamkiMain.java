package zadanie_ułamek;

public class UlamkiMain {
    public static void main(String[] args) {
        Ulamek pierwszy = new Ulamek(5, 6);
        Ulamek drugi = new Ulamek(4,7);
        Ulamek trzeci = Ulamek.dodaj(pierwszy,drugi);
        Ulamek czwarty = Ulamek.pomnoz(pierwszy,drugi);
        System.out.println(trzeci);
        System.out.println(czwarty);
    }
}
