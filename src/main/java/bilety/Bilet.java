package bilety;

public enum Bilet {
    Ulgowy_Godzinny(1.60d, 60),
    Ulgowy_Calodniowy(3.20d,1440),
    Normalny_Godzinny(3.20, 60),
    Normalny_Calodniowy(4.00, 1440),
    Brak_Biletu(0,0);

    private double cena;
    private int czas;

    Bilet(double cena, int czas) {
        this.cena = cena;
        this.czas = czas;
    }

    Bilet(double cena) {
        this.cena = cena;
    }
    public double pobierzCene() {
        return this.cena;
    }
    public int czasJazdy() {
        return  this.czas;
    }
    public void wyswietlDaneOBilecie(){

    }

    public static void main(String[] args){

        System.out.print(Ulgowy_Godzinny);
        System.out.print("    ");
        System.out.print("cena  " + Ulgowy_Godzinny.pobierzCene()+ " zł");
        System.out.print("    ");
        System.out.print("czas jazdy  " + Ulgowy_Godzinny.czasJazdy() + " minut");
        System.out.println();
        System.out.print(Ulgowy_Calodniowy);
        System.out.print("  ");
        System.out.print(" cena  " + Ulgowy_Calodniowy.pobierzCene() + " zł");
        System.out.print("   ");
        System.out.println("czas jazdy  " + Ulgowy_Calodniowy.czasJazdy() + " minuty");
        System.out.println();
        System.out.print(Normalny_Godzinny);
        System.out.print("    ");
        System.out.print("cena  " + Normalny_Godzinny.pobierzCene() + " zł");
        System.out.print("   ");
        System.out.print("czas jazdy  " + Normalny_Godzinny.czasJazdy()+ " minuty");
        System.out.println();
        System.out.print(Normalny_Calodniowy);
        System.out.print("  ");
        System.out.print("cena  " + Normalny_Calodniowy.pobierzCene()+ " zł");
        System.out.print("   ");
        System.out.println("czas jazdy  " + Normalny_Calodniowy.czasJazdy()+ " minuty");
        System.out.println();
        System.out.print(Brak_Biletu);
        System.out.print("   ");
        System.out.print("cena  " + Brak_Biletu.pobierzCene());
        System.out.print("   ");
        System.out.print("czas jazdy  " + Brak_Biletu.czasJazdy());
    }

}
