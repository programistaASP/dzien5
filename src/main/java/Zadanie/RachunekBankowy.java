package Zadanie;

public class RachunekBankowy {
    private long numerKonta;
    private double stanKonta;

    public long getNumerKonta() {
        return numerKonta;
    }

    public double getStanKonta() {
        return stanKonta;
    }

    public void setNumerKonta(long numerKonta) {
        this.numerKonta = numerKonta;
    }

    public RachunekBankowy(long numerKonta, int stanKonta) {
        this.numerKonta = numerKonta;
        this.stanKonta = stanKonta;
    }

    public void wykonajPrzelewPrzychodzacy(double kwotaWplacona) {
        this.stanKonta += kwotaWplacona;
    }
    protected void wykonajPrzelewWychodzacy(double kwotaPobrana) {
        this.stanKonta -= kwotaPobrana;

    }
}