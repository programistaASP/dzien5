package Zadanie3;
import java.util.Scanner;

public class GameMain {
    public static void main(String[] args) {
        System.out.println("podaj zakres:");
        Scanner scanner = new Scanner(System.in);
        int zakresOd = scanner.nextInt();
        int zakresDo = scanner.nextInt();
        Game gra1 = new Game(zakresOd, zakresDo);
        gra1.play();
    }
}



