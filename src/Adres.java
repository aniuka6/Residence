public class Adres {
    String miejscowosc;
    String kodPocztowy;
    String nazwaUlicy;
    int nrDomu;

    public Adres() {
    }

    public Adres(String miejscowosc, String kodPocztowy, String nazwaUlicy, int nrDomu) {
        this.miejscowosc = miejscowosc;
        this.kodPocztowy = kodPocztowy;
        this.nazwaUlicy = nazwaUlicy;
        this.nrDomu = nrDomu;
    }

    @Override
    public String toString() {
        return "Adres{" +
                "miejscowosc='" + miejscowosc + '\'' +
                ", kodPocztowy='" + kodPocztowy + '\'' +
                ", nazwaUlicy='" + nazwaUlicy + '\'' +
                ", nrDomu=" + nrDomu +
                '}';
    }

    public String getMiejscowosc() {
        return miejscowosc;
    }

    public void setMiejscowosc(String miejscowosc) {
        this.miejscowosc = miejscowosc;
    }

    public String getKodPocztowy() {
        return kodPocztowy;
    }

    public void setKodPocztowy(String kodPocztowy) {
        this.kodPocztowy = kodPocztowy;
    }

    public String getNazwaUlicy() {
        return nazwaUlicy;
    }

    public void setNazwaUlicy(String nazwaUlicy) {
        this.nazwaUlicy = nazwaUlicy;
    }

    public int getNrDomu() {
        return nrDomu;
    }

    public void setNrDomu(int nrDomu) {
        this.nrDomu = nrDomu;
    }
}
