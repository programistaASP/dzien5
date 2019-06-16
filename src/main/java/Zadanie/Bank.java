package Zadanie;

public class Bank {
    public String nazwaBanku;
    private RachunekBankowy [] rachunki;



    public Bank(String nazwaBanku, RachunekBankowy[] rachunki) {
        this.nazwaBanku = nazwaBanku;
        this.rachunki = rachunki;
    }

    public void wykonajPrzelew(String numerKontaZ, String numerKontaNa, double kwotaPrzelewu){
        for (RachunekBankowy pojedynczyRachunek: rachunki) {
            if(pojedynczyRachunek.getNumerKonta() == Long.parseLong(numerKontaZ)){
                pojedynczyRachunek.wykonajPrzelewWychodzacy(kwotaPrzelewu);
            }
            else if(pojedynczyRachunek.getNumerKonta() == Long.parseLong(numerKontaNa)){
                pojedynczyRachunek.wykonajPrzelewPrzychodzacy(kwotaPrzelewu);
            }
        }
    }


}