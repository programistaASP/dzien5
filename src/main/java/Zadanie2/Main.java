package Zadanie2;

public class Main {
    public static void Bohaterowie(String[] args) {
        SuperBohater bohater1 = new SuperBohater("Hulk", "zielony Atak");
        SuperBohater bohater2 = new SuperBohater("Capitan America", "Rzut Tarczą");

        bohater1 = bohater2;
        bohater1 = null;


        System.out.println(bohater1 = bohater2);
        System.out.println(bohater1 = null);
        System.out.println(bohater2 = null);



    }
}
