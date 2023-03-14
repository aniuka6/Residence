public class Osoba {

    String imie;
    String nazwisko;
    int rokUrodzenia;
    Adres adres;
    public Osoba(String imie, String nazwisko, final int rokUrodzenia, String miejscowosc, String kodPocztowy, String nazwaUlicy, int nrDomu) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.rokUrodzenia = rokUrodzenia;
        this.adres = new Adres(miejscowosc, kodPocztowy, nazwaUlicy, nrDomu);
    }
    public Osoba(String imie, String nazwisko, final int rokUrodzenia, Adres adres) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.rokUrodzenia = rokUrodzenia;
        this.adres = adres;

    }

    @Override
    public String toString() {
        return imie+ " " + nazwisko + " " + rokUrodzenia + " "+ adres;
    }

}
