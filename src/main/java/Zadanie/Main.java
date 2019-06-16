package Zadanie;

import Zadanie.Bank;

public class Main {
    public static void main(String[] args) {


        RachunekBankowy kontoAndrzeja = new RachunekBankowy(123L, 1000);
        RachunekBankowy kontoBeaty = new RachunekBankowy(555L, 2000);

        RachunekBankowy[] rachunki = new RachunekBankowy[]{kontoAndrzeja,kontoBeaty};

        Bank pko = new Bank("PKO",rachunki);

        pko.wykonajPrzelew("123","555", 1000);

        System.out.println(kontoAndrzeja.getStanKonta());
        System.out.println(kontoBeaty.getStanKonta());

    }
}
