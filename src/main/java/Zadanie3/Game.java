package Zadanie3;
import java.util.Random;
import java.util.Scanner;


public class Game {

    private int numer;
    public Game(int zakresOd, int zakresDo) {
        Random random = new Random();
        this.numer = random.nextInt(zakresDo - zakresOd + 1) + zakresOd;

    /*public Game() {
        Random random = new Random();
        this.numer = random.nextInt(100) + 1;*/
    }

    public void play() {

        System.out.println("Podaj Liczbę:");
        Scanner scanner = new Scanner(System.in);
        int wpisanaLiczba = scanner.nextInt();

        while (wpisanaLiczba != numer) {

            if (wpisanaLiczba < numer) {
                System.out.println("Liczba za mała, podaj inną liczbę");
            }

            if (wpisanaLiczba > numer) {
                System.out.println("Liczba za duża, podaj inną liczbę");
            }
            wpisanaLiczba = scanner.nextInt();
        }
        if (wpisanaLiczba == numer) {
            System.out.println("Gratulacje, wygrałaś!!!");

        }
    }
}