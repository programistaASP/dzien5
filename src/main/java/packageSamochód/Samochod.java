package packageSamochód;

public class Samochod {
    protected String kolor;
    protected String marka;
    protected int rocznik;
    protected int predkosc;

    public Samochod(String kolor, String marka, int rocznik, int predkosc) {
        this.kolor = kolor;
        this.marka = marka;
        this.rocznik = rocznik;
        this.predkosc = predkosc;
    }

    public void przyspiesz() {
        if (this.predkosc < 110) {
            System.out.println("Twój samochod przyspieszył do:");
            this.predkosc = this.predkosc + 10;
            System.out.println(predkosc);
        } else {
            System.out.println("nie możesz przyspieszyć masz za słaby silnik");
        }
    }

}