public class PowierzchniaMieszkania {
    public static void main(String[] args) {
        // deklaracja zmiennych
        int pokoj1 = 3 * 4;
        int pokoj2 = 3 * 4;
        int kuchnia = 2 * 3;
        int lazienka = 2 * 2;
        int powierzchniaCalkowita = pokoj1 + pokoj2 + kuchnia + lazienka;
        int liczbaOsob = 4;
        double powierzchniaNaOsobe = (double) powierzchniaCalkowita / liczbaOsob;

        // wyświetlenie wyników
        System.out.println("Powierzchnia pokoju 1: " + pokoj1 + " m2");
        System.out.println("Powierzchnia pokoju 2: " + pokoj2 + " m2");
        System.out.println("Powierzchnia kuchni: " + kuchnia + " m2");
        System.out.println("Powierzchnia łazienki: " + lazienka + " m2");
        System.out.println("Powierzchnia całkowita mieszkania: " + powierzchniaCalkowita + " m2");
        System.out.println("Powierzchnia na jedną osobę: " + powierzchniaNaOsobe + " m2");
    }
}
