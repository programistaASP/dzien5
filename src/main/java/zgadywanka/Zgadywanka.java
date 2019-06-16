package zgadywanka;
import java.util.*;



public class Zgadywanka {

    public static void main(String[] args) {
        System.out.println("Program wylosuje liczbe z przedzialu 1-100... Odgadnij tą liczbę - masz 5 prób.");
        System.out.println("Zanim zaczniemy, podaj Twoje imie: ");
        Scanner skaner=new Scanner (System.in);
        String imie =skaner.nextLine();
        Random losowa = new Random();
        int l = losowa.nextInt(100)+1;

        //System.out.println(l);

        if (imie.length()-1=='a') System.out.println("Jestes kobieta");
        else System.out.println("Jestes mezczyzna");

        for (int proba=1; proba<=5; proba++)
        {
            System.out.println("Wprowadz liczbe: "+"Proba: "+proba);
            int i=skaner.nextInt();
            if (i==l)
            {
                System.out.println("Brawo, trafiles!");
                break;
            }
            else if (i>l) System.out.println ("Za duzo");
            else if (i<l) System.out.println ("Za malo");
            if (proba==5) System.out.println("Przegrales!");
        }
    }
}