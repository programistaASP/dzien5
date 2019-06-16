package packageSamochód;

public class Kabriolet extends Samochod {
    protected boolean czyDachOtwartydach;


    public Kabriolet(String kolor, String marka, int rocznik, int predkosc) {
        super(kolor, marka, rocznik, predkosc);
     {
        super(predkosc, swiatla);
        this.czyDachOtwartydach = czyDachOtwartydach;
        super(kolor, marka, predkosc);
    }

    @Override
    public void przyspiesz() {
        if (this.predkosc < 170) {
            System.out.println("Twój samochod przyspieszył do:");
            this.predkosc = this.predkosc + 10;
            System.out.println(predkosc);
        } else {
            System.out.println("nie możesz przyspieszyć masz za słaby silnik");
        }
    }
}