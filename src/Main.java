public class Main {
    public static void main(String[] args) {
        Osoba osoba1= new Osoba("Anna", "Tokarzewksa", 1998, "Warszawa", "8732", "Zapustna", 8 );
        Adres adres1 = new Adres("Warszawa", "5844", "Owalna", 97);
        Osoba osoba2 = new Osoba ("Ola", "Kowalska", 1998, adres1);
        String osoba1String = osoba1.toString();
        String osoba2String = osoba2.toString();
        System.out.println(osoba1String);
        System.out.println(osoba2String);
    }
}
